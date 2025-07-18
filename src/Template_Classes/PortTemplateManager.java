package Template_Classes;

import java.nio.file.*;
import java.io.IOException;

public class PortTemplateManager {
    private static final String HTML_TEMPLATE_PATH = "templates/portTemp/index.html";
    private static final String CSS_TEMPLATE_PATH = "templates/portTemp/style.css";

    public static String parseHTML(String[] toInsert) {
        if (toInsert == null || toInsert.length < 17) {
            System.out.println("Error: Invalid input array");
            return null;
        }
        
        String html = readTemplate(HTML_TEMPLATE_PATH);
        if (html == null) {
            System.out.println("Error: Could not load HTML template");
            return null;
        }
        
        try {
            return html.replace("{{WEBTITLE001}}", toInsert[0])
                     .replace("{{INTRODUCTIONHEADER001}}", toInsert[1])
                     .replace("{{INTRODUCTIONHEADER002}}", toInsert[2])
                     .replace("{{SUBHEADERTITLE001}}", toInsert[3])
                     .replace("{{SUBHEADERDESC001}}", toInsert[4])
                     .replace("{{SUBHEADERTITLE002}}", toInsert[5])
                     .replace("{{SUBHEADERDESC002}}", toInsert[6])
                     .replace("{{SUBHEADERTITLE003}}", toInsert[7])
                     .replace("{{SUBHEADERDESC003}}", toInsert[8])
                     .replace("{{SUBHEADERTITLE004}}", toInsert[9])
                     .replace("{{PROJECTTITLE001}}", toInsert[10])
                     .replace("{{PROJECTTITLE002}}", toInsert[11])
                     .replace("{{PROJECTTITLE003}}", toInsert[12])
                     .replace("{{PROJECTTITLE004}}", toInsert[13])
                     .replace("{{PROJECTTITLE005}}", toInsert[14])
                     .replace("{{SUBHEADERTITLE005}}", toInsert[15])
                     .replace("{{SUBHEADERDESC005}}", toInsert[16]);
        } catch (Exception e) {
            System.out.println("Error processing HTML template: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public static String parseCSS(String[] colors) {
        if (colors == null || colors.length < 3) {
            System.out.println("Error: Invalid colors array");
            return null;
        }
        
        String css = readTemplate(CSS_TEMPLATE_PATH);
        if (css == null) {
            System.out.println("Error: Could not load CSS template");
            return null;
        }
        
        try {
            return css.replace("{{PRIMARYCOLOR001}}", colors[0])
                    .replace("{{SECONDARYCOLOR001}}", colors[1])
                    .replace("{{BACKGROUNDCOLOR001}}", colors[2]);
        } catch (Exception e) {
            System.out.println("Error processing CSS template: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    private static String readTemplate(String path) {
        try {
            return Files.readString(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
