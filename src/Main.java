public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Page Generator!");
        System.out.println("Available templates:");
        System.out.println("1. Graduation Page");
        System.out.println("2. Portfolio");
        System.out.println("3. Fitness Landing Page");
        System.out.print("Choose a template (1-3): ");
        
        String choice = UserInputHandler.scanner.nextLine().trim();
        
        if ("1".equals(choice)) {
            generateGraduationPage();
        } else if ("2".equals(choice)) {
            generatePortfolio();
        } else if ("3".equals(choice)) {
            generateFitLanding();
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
        
        // Close scanner when done
        UserInputHandler.closeScanner();
    }
    
    private static void generateGraduationPage() {
        System.out.println("\n=== Graduation Page Generator ===");
        
        // Get user input
        String[] input = UserInputHandler.getGradHTMLInput();
        
        // Process templates with user input
        String html = TemplateManager.parseHTML(TemplateManager.GRADUATION, input);
        String css = TemplateManager.getGraduationCSS();
        
        // Output the static site
        if (html != null && css != null && FileManager.outputSite("graduation", html, css, "grad")) {
            System.out.println("\nGraduation page generated successfully!");
            System.out.println("Check the 'output/graduation' directory for the generated files.");
        } else {
            System.out.println("Failed to generate graduation page.");
        }
    }
    
    private static void generatePortfolio() {
        System.out.println("\n=== Portfolio Generator ===");
        
        // Get content and colors
        String[] content = UserInputHandler.getPortHTMLInput();
        String[] colors = UserInputHandler.getPortCSSInput();
        
        // Process templates with user input
        String html = TemplateManager.parseHTML(TemplateManager.PORTFOLIO, content);
        String css = TemplateManager.parsePortfolioCSS(colors);
        
        // Output the static site
        if (html != null && css != null && FileManager.outputSite("portfolio", html, css, "port")) {
            System.out.println("\nPortfolio generated successfully!");
            System.out.println("Check the 'output/portfolio' directory for the generated files.");
        } else {
            System.out.println("Failed to generate portfolio.");
        }
    }
    
    private static void generateFitLanding() {
        System.out.println("\n=== Fitness Landing Page Generator ===");
        
        // Get user input for content
        String[] content = UserInputHandler.getFitHTMLInput();
        
        // Select color scheme
        String[] colorScheme = UserInputHandler.selectColorScheme();
        
        // Select font scheme and get its index (1-based)
        String[] fontScheme = UserInputHandler.selectFontScheme();
        int selectedFontScheme = UserInputHandler.getFontSchemeIndex(fontScheme);
        
        // Add font scheme index to content array (as the last element)
        String[] contentWithFontScheme = new String[content.length + 1];
        System.arraycopy(content, 0, contentWithFontScheme, 0, content.length);
        // Add the font scheme index (1-based)
        contentWithFontScheme[content.length] = String.valueOf(selectedFontScheme);
        
        // Process templates with user input
        String html = TemplateManager.parseHTML(TemplateManager.FITLANDING, contentWithFontScheme);
        String css = TemplateManager.parseFitLandingCSS(colorScheme, fontScheme);
        
        // Output the static site with assets
        if (html != null && css != null) {
            // First, create the output directory
            String outputFolder = "fitness";
            if (FileManager.outputFitLandingFolder(outputFolder)) {
                // Then, overwrite the generated files with the processed ones
                if (FileManager.outputSite(outputFolder, html, css, "fitLanding")) {
                    System.out.println("\nFitness landing page generated successfully!");
                    System.out.println("Check the 'output/" + outputFolder + "' directory for the generated files.");
                    
                    // Print the path to the generated files
                    String outputPath = FileManager.getOutputPath() + java.io.File.separator + outputFolder;
                    System.out.println("Full path: " + new java.io.File(outputPath).getAbsolutePath());
                    return;
                }
            }
        }
        System.out.println("Failed to generate fitness landing page. Check the error messages above for details.");
    }
}