package Template_Classes;

import java.nio.file.*;
import java.io.IOException;

public class GradTemplateManager {
    private static final String HTML_TEMPLATE_PATH = "templates/gradTemp/index.html";
    private static final String CSS_TEMPLATE_PATH = "templates/gradTemp/style.css";

    public static String parseHTML(String[] toInsert) {
        if (toInsert == null || toInsert.length < 15) {
            System.out.println("Error: Invalid input array");
            return null;
        }
        
        String html = readTemplate(HTML_TEMPLATE_PATH);
        if (html == null) {
            System.out.println("Error: Could not load HTML template");
            return null;
        }
        
        try {
            return html.replace("{{HEADERTITLE001}}", toInsert[0])
                     .replace("{{HEADERTITLE002}}", toInsert[1])
                     .replace("{{DATE001}}", toInsert[2])
                     .replace("{{EVENTDESC001}}", toInsert[3])
                     .replace("{{CONTACTDESC001}}", toInsert[4])
                     .replace("{{ITENIARYTITLE001}}", toInsert[5])
                     .replace("{{ITENIARYDESC001}}", toInsert[6])
                     .replace("{{ITENIARYTITLE002}}", toInsert[7])
                     .replace("{{ITENIARYDESC002}}", toInsert[8])
                     .replace("{{ITENIARYTITLE003}}", toInsert[9])
                     .replace("{{ITENIARYDESC003}}", toInsert[10])
                     .replace("{{ITENIARYTITLE004}}", toInsert[11])
                     .replace("{{ITENIARYDESC004}}", toInsert[12])
                     .replace("{{ITENIARYTITLE005}}", toInsert[13])
                     .replace("{{ITENIARYDESC005}}", toInsert[14]);
        } catch (Exception e) {
            System.out.println("Error processing HTML template: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public static String getCSS() {
        return readTemplate(CSS_TEMPLATE_PATH);
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
