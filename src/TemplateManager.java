import Template_Classes.FitLandingTemplateManager;
import Template_Classes.GradTemplateManager;
import Template_Classes.PortTemplateManager;

/**
 * TemplateManager acts as a higher order operator for template-related operations.
 * It delegates to the appropriate template manager based on the template type.
 */
public class TemplateManager {
    // Template type constants
    public static final String GRADUATION = "graduation";
    public static final String PORTFOLIO = "portfolio";
    public static final String FITLANDING = "fitlanding";
    
    /**
     * Parses the HTML template with the provided inputs
     * @param templateType Type of template (GRADUATION or PORTFOLIO)
     * @param inputs Array of input strings to replace placeholders
     * @return Processed HTML as string, or null on error
     */
    public static String parseHTML(String templateType, String[] inputs) {
        if (templateType == null || inputs == null) {
            System.out.println("Error: Template type and inputs cannot be null");
            return null;
        }
        
        return switch (templateType.toLowerCase()) {
            case GRADUATION -> GradTemplateManager.parseHTML(inputs);
            case PORTFOLIO -> PortTemplateManager.parseHTML(inputs);
            case FITLANDING -> FitLandingTemplateManager.parseHTML(inputs);
            default -> {
                System.out.println("Error: Unknown template type: " + templateType);
                yield null;
            }
        };
    }
    
    /**
     * Parses the CSS template with the provided colors (for portfolio template)
     * @param colors Array of color values [primary, secondary, background]
     * @return Processed CSS as string, or null on error
     */
    // too add logic when we have more templates that deal with css like what we did with HTML, for now this is fine
    public static String parsePortfolioCSS(String[] colors) {
        return PortTemplateManager.parseCSS(colors);
    }
    
    /**
     * Gets the default CSS for graduation template (no customizability... YET)
     * @return CSS as string, or null on error
     */
    public static String getGraduationCSS() {
        return GradTemplateManager.getCSS();
    }

    /**
     * Parses the CSS template with the provided colors and fonts for the fitness landing page
     * @param colors Array of color values [primary, primary-light, primary-lighter, primary-dark, secondary]
     * @param fonts Array of font values [primary-font, secondary-font]
     * @return Processed CSS as string, or null on error
     */
    public static String parseFitLandingCSS(String[] colors, String[] fonts) {
        if (colors == null || colors.length < 5 || fonts == null || fonts.length < 2) {
            System.out.println("Error: Invalid input arrays for CSS generation");
            return null;
        }
        return FitLandingTemplateManager.parseCSS(colors, fonts);
    }
}