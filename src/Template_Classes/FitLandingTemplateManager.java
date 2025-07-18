package Template_Classes;

import java.nio.file.*;
import java.io.IOException;

public class FitLandingTemplateManager {
    private static final String HTML_TEMPLATE_PATH = System.getProperty("user.dir") + 
            java.io.File.separator + "templates" + 
            java.io.File.separator + "fitLandingTemp" + 
            java.io.File.separator + "index.html";
            
    private static final String CSS_TEMPLATE_PATH = System.getProperty("user.dir") + 
            java.io.File.separator + "templates" + 
            java.io.File.separator + "fitLandingTemp" + 
            java.io.File.separator + "assets" + 
            java.io.File.separator + "css" + 
            java.io.File.separator + "style.css";

    // Google Fonts URLs for each font scheme
    private static final String[] GOOGLE_FONTS_LINKS = {
        // Montserrat & Playfair Display
        "https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700&family=Playfair+Display:wght@600&display=swap",
        // Poppins & Merriweather
        "https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&family=Merriweather:wght@400;700&display=swap",
        // Open Sans & Roboto Slab
        "https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500;600;700&family=Roboto+Slab:wght@400;500;600&display=swap",
        // Raleway & Lora
        "https://fonts.googleapis.com/css2?family=Raleway:wght@400;500;600;700&family=Lora:wght@400;500;600&display=swap"
    };
    
    public static String parseHTML(String[] data) {
        if (data == null || data.length < 75) {  // 74 placeholders + 1 for font scheme
            System.out.println("Error: Invalid input array");
            return null;
        }
        
        // Get font scheme index (default to 0 if not provided)
        int fontSchemeIndex = 0;
        if (data.length > 74) {
            try {
                fontSchemeIndex = Integer.parseInt(data[74].trim()) - 1;
                if (fontSchemeIndex < 0 || fontSchemeIndex >= GOOGLE_FONTS_LINKS.length) {
                    fontSchemeIndex = 0;
                }
            } catch (NumberFormatException e) {
                fontSchemeIndex = 0;
            }
        }
        
        String html = readTemplate(HTML_TEMPLATE_PATH);
        if (html == null) {
            System.out.println("Error: Could not load HTML template");
            return null;
        }
        
        try {
            // Set the Google Fonts link first
            String googleFontsLink = GOOGLE_FONTS_LINKS[fontSchemeIndex];
            html = html.replace("{{GOOGLE_FONTS_LINK}}", googleFontsLink);
            
            // Browser and Header
            html = html.replace("{{BROWSERTITLE001}}", data[0]);
            html = html.replace("{{HEADERTITLE001}}", data[1]);
            
            // Hero Section
            html = html.replace("{{HEROSUBHEADER001}}", data[2]);
            html = html.replace("{{HEROTITLE001}}", data[3]);
            html = html.replace("{{HEROSUBHEADER002}}", data[4]);
            
            // Services Section
            html = html.replace("{{SERVICE001}}", data[5]);
            html = html.replace("{{SERVICE001DESC001}}", data[6]);
            html = html.replace("{{SERVICE002}}", data[7]);
            html = html.replace("{{SERVICE002DESC001}}", data[8]);
            html = html.replace("{{SERVICE003}}", data[9]);
            html = html.replace("{{SERVICE003DESC001}}", data[10]);
            
            // About Section
            html = html.replace("{{INSTRUCTORYEARCOUNT001}}", data[11]);
            html = html.replace("{{INSTRUCTORSECTIONHEADER001}}", data[12]);
            html = html.replace("{{INSTRUCTORABOUT001}}", data[13]);
            html = html.replace("{{INSTRUCTORABOUT002}}", data[14]);
            
            // Courses Section Header
            html = html.replace("{{NUMCOURSESOFFERED001}}", data[15]);
            html = html.replace("{{COURSESECTIONHEADER001}}", data[16]);
            
            // Course 1
            html = html.replace("{{COURSEPRICE001}}", data[17]);
            html = html.replace("{{COURSEAUTHOR001}}", data[18]);
            html = html.replace("{{COURSETITLE001}}", data[19]);
            html = html.replace("{{COURSEDURATION001}}", data[20]);
            html = html.replace("{{COURSELECTURECOUNT001}}", data[21]);
            
            // Course 2
            html = html.replace("{{COURSEPRICE002}}", data[22]);
            html = html.replace("{{COURSEAUTHOR002}}", data[23]);
            html = html.replace("{{COURSETITLE002}}", data[24]);
            html = html.replace("{{COURSEDURATION002}}", data[25]);
            html = html.replace("{{COURSELECTURECOUNT002}}", data[26]);
            
            // Course 3
            html = html.replace("{{COURSEPRICE003}}", data[27]);
            html = html.replace("{{COURSEAUTHOR003}}", data[28]);
            html = html.replace("{{COURSETITLE003}}", data[29]);
            html = html.replace("{{COURSEDURATION003}}", data[30]);
            html = html.replace("{{COURSELECTURECOUNT003}}", data[31]);
            
            // Course 4
            html = html.replace("{{COURSEPRICE004}}", data[32]);
            html = html.replace("{{COURSEAUTHOR004}}", data[33]);
            html = html.replace("{{COURSETITLE004}}", data[34]);
            html = html.replace("{{COURSEDURATION004}}", data[35]);
            html = html.replace("{{COURSELECTURECOUNT004}}", data[36]);
            
            // Course 5
            html = html.replace("{{COURSEPRICE005}}", data[37]);
            html = html.replace("{{COURSEAUTHOR005}}", data[38]);
            html = html.replace("{{COURSETITLE005}}", data[39]);
            html = html.replace("{{COURSEDURATION005}}", data[40]);
            html = html.replace("{{COURSELECTURECOUNT005}}", data[41]);
            
            // Course 6
            html = html.replace("{{COURSEPRICE006}}", data[42]);
            html = html.replace("{{COURSEAUTHOR006}}", data[43]);
            html = html.replace("{{COURSETITLE006}}", data[44]);
            html = html.replace("{{COURSEDURATION006}}", data[45]);
            html = html.replace("{{COURSELECTURECOUNT006}}", data[46]);
            
            // Blog Section
            html = html.replace("{{BLOGSUBHEADING001}}", data[47]);
            html = html.replace("{{BLOGTITLE001}}", data[48]);
            
            // Blog Post 1
            html = html.replace("{{BLOGDATE001}}", data[49]);
            html = html.replace("{{BLOGMONTH001}}", data[50]);
            html = html.replace("{{BLOGAUTHOR001}}", data[51]);
            html = html.replace("{{BLOGLIKECOUNT001}}", data[52]);
            html = html.replace("{{BLOGSHARECOUNT001}}", data[53]);
            html = html.replace("{{BLOGTEXT001}}", data[54]);
            
            // Blog Post 2
            html = html.replace("{{BLOGDATE002}}", data[55]);
            html = html.replace("{{BLOGMONTH002}}", data[56]);
            html = html.replace("{{BLOGAUTHOR002}}", data[57]);
            html = html.replace("{{BLOGLIKECOUNT002}}", data[58]);
            html = html.replace("{{BLOGSHARECOUNT002}}", data[59]);
            html = html.replace("{{BLOGTEXT002}}", data[60]);
            
            // Blog Post 3
            html = html.replace("{{BLOGDATE003}}", data[61]);
            html = html.replace("{{BLOGMONTH003}}", data[62]);
            html = html.replace("{{BLOGAUTHOR003}}", data[63]);
            html = html.replace("{{BLOGLIKECOUNT003}}", data[64]);
            html = html.replace("{{BLOGSHARECOUNT003}}", data[65]);
            html = html.replace("{{BLOGTEXT003}}", data[66]);
            
            // Make sure all blog title placeholders are replaced
            html = html.replace("{{BLOGTITLE001}}", data[48]); // Blog title for all posts
            html = html.replace("{{BLOGTITLE002}}", data[48]); // Blog title for all posts
            html = html.replace("{{BLOGTITLE003}}", data[48]); // Blog title for all posts
            
            // App Section
            html = html.replace("{{APPSECTIONSUBHEADER001}}", data[67]);
            html = html.replace("{{APPSECTIONTITLE001}}", data[68]);
            
            // Footer
            html = html.replace("{{FOOTERNEWSLETTERTEXT001}}", data[69]);
            html = html.replace("{{OPENINGHOURS001}}", data[70]);
            html = html.replace("{{OPENINGHOURS002}}", data[71]);
            html = html.replace("{{OPENINGHOURS003}}", data[72]);
            html = html.replace("{{FOOTERLOCATION001}}", data[73]);
            
            return html;
            
        } catch (Exception e) {
            System.out.println("Error processing HTML template: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public static String parseCSS(String[] colors, String[] fonts) {
        System.out.println("Starting CSS parsing...");
        
        if (colors == null || colors.length < 5 || fonts == null || fonts.length < 2) {
            System.out.println("Error: Invalid input arrays");
            System.out.println("Colors: " + (colors == null ? "null" : colors.length));
            System.out.println("Fonts: " + (fonts == null ? "null" : fonts.length));
            return null;
        }
        
        System.out.println("Reading CSS template from: " + CSS_TEMPLATE_PATH);
        String css = readTemplate(CSS_TEMPLATE_PATH);
        
        if (css == null) {
            System.out.println("Error: Could not load CSS template");
            return null;
        }
        
        try {
            System.out.println("Replacing color and font placeholders...");
            System.out.println("Primary Color 1: " + colors[0]);
            System.out.println("Primary Color 2: " + colors[1]);
            System.out.println("Primary Color 3: " + colors[2]);
            System.out.println("Primary Color 4: " + colors[3]);
            System.out.println("Secondary Color: " + colors[4]);
            System.out.println("Primary Font: " + fonts[0]);
            System.out.println("Secondary Font: " + fonts[1]);
            
            // Replace all occurrences of each placeholder
            css = css.replace("{{PRIMARYCOLOR001}}", colors[0]);
            css = css.replace("{{PRIMARYCOLOR002}}", colors[1]);
            css = css.replace("{{PRIMARYCOLOR003}}", colors[2]);
            css = css.replace("{{PRIMARYCOLOR004}}", colors[3]);
            css = css.replace("{{SECONDARYCOLOR001}}", colors[4]);
            css = css.replace("{{FONTFAMILY001}}", fonts[0]);
            css = css.replace("{{FONTFAMILY002}}", fonts[1]);
            
            // Debug: Check if replacements were made
            if (css.contains("{{PRIMARYCOLOR001}}")) {
                System.out.println("Warning: Some placeholders were not replaced!");
            }
            
            return css;
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