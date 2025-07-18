import java.nio.file.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardCopyOption;

public class FileManager {
    private static final String CURRENT_DIR = System.getProperty("user.dir");
    public static final String OUTPUT_PATH = CURRENT_DIR + java.io.File.separator + "output";
    
    /**
     * Gets the output path for generated files
     * @return The output path as a string
     */
    public static String getOutputPath() {
        return OUTPUT_PATH;
    }
    
    /**
     * Outputs the generated site files
     * @param folderName The name of the output folder
     * @param html The processed HTML content
     * @param css The processed CSS content
     * @param templateType The type of template ("fitLanding", "grad", or "port")
     * @return true if successful, false otherwise
     */
    public static boolean outputSite(String folderName, String html, String css, String templateType) {
        String outputPath = OUTPUT_PATH + java.io.File.separator + folderName;
        
        try {
            // Create the output directory
            Path outputDir = Paths.get(outputPath);
            Files.createDirectories(outputDir);
            
            // Write HTML file
            Path htmlFile = outputDir.resolve("index.html");
            Files.writeString(htmlFile, html, StandardCharsets.UTF_8);
            
            // Handle CSS file based on template type
            if ("fitLanding".equals(templateType)) {
                // For fitLanding template, create assets/css directory
                Path cssDir = outputDir.resolve("assets").resolve("css");
                Files.createDirectories(cssDir);
                Path cssFile = cssDir.resolve("style.css");
                Files.writeString(cssFile, css, StandardCharsets.UTF_8);
                
                // Update HTML to point to the correct CSS path
                html = html.replace("href='style.css'", "href='assets/css/style.css'")
                         .replace("href=\"style.css\"", "href=\"assets/css/style.css\"");
                Files.writeString(htmlFile, html, StandardCharsets.UTF_8);
            } else {
                // For grad and port templates, put CSS in root
                Path cssFile = outputDir.resolve("style.css");
                Files.writeString(cssFile, css, StandardCharsets.UTF_8);
            }
            
            return true;
        } catch (IOException e) {
            System.err.println("Error writing site files: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean sendFolder(String sourcePath, String targetPath) {
        try {
            Path source = Paths.get(sourcePath);
            Path target = Paths.get(targetPath);
            
            // Create target directory if it doesn't exist
            Files.createDirectories(target);
            
            // Walk the file tree and copy each file/directory
            Files.walk(source)
                 .forEach(file -> {
                     try {
                         Path targetFile = target.resolve(source.relativize(file));
                         if (Files.isDirectory(file)) {
                             Files.createDirectories(targetFile);
                         } else {
                             Files.copy(file, targetFile, StandardCopyOption.REPLACE_EXISTING);
                         }
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 });
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean outputTemplateFolder(String outputFolderName) {
        String sourcePath = CURRENT_DIR + java.io.File.separator + "templates" + java.io.File.separator + "gradTemp";
        String targetPath = OUTPUT_PATH + java.io.File.separator + outputFolderName;
        return sendFolder(sourcePath, targetPath);
    }
    
    public static boolean outputFitLandingFolder(String outputFolderName) {
        String sourcePath = CURRENT_DIR + java.io.File.separator + "templates" + java.io.File.separator + "fitLandingTemp";
        String targetPath = OUTPUT_PATH + java.io.File.separator + outputFolderName;
        return sendFolder(sourcePath, targetPath);
    }
}
