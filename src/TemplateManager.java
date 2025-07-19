import Template_Classes.FitLandingTemplateManager;
import Template_Classes.GradTemplateManager;
import Template_Classes.PortTemplateManager;

/**
 * TemplateManager acts as a higher order operator for template-related operations.
 * It delegates to the appropriate template manager based on the template type.
 */
public class TemplateManager {

    /* ===== Template type CONSTANTS ===== */

    public static final String GRADUATION = "graduation";
    public static final String PORTFOLIO = "portfolio";
    public static final String FITLANDING = "fitlanding";
    
    /* ============================================================ */
    /* ===================== PARSING FUNCTIONS ===================== */
    /* === Delegates to specific template Classes based on type === */

    public static String parseHTML(String templateType, String[] inputs) {
        if (templateType == null || inputs == null) {
            System.out.println("Error: Template type or inputs cannot be null");
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
    public static String parseCSS(String templateType, String[] inputs) {
        if (templateType == null || inputs == null) {
            System.out.println("Error: Template type or inputs cannot be null");
            return null;
        }
        
        return switch (templateType.toLowerCase()) {
            case PORTFOLIO -> PortTemplateManager.parseCSS(inputs);
            default -> {
                System.out.println("Error: Unknown template type: " + templateType);
                yield null;
            }
        };
    }
    public static String parseCSS(String templateType, String[] inputs, String[] fonts) {
        if (templateType == null || inputs == null || fonts == null) {
            System.out.println("Error: parameters cant be null cannot be null");
            return null;
        }
        return switch (templateType.toLowerCase()) {
            case FITLANDING -> FitLandingTemplateManager.parseCSS(inputs, fonts);
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

}