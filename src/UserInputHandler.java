import java.util.Scanner;

public class UserInputHandler {
    
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * Predefined color schemes for the fitness landing page
     * Each scheme contains 5 colors: [primary, primary-light, primary-lighter, primary-dark, secondary]
     */
    private static final String[][] COLOR_SCHEMES = {
        // Beach-side (Teal and Beige)
        {"#69b9d8", "#a2d2e2", "#f1f7f8", "#5093b4", "#f1e7da"},
        // Navy Blue
        {"#4b4bc3", "#707ff5", "#a195f9", "#1e1e76", "#8bafd0"},
        // Royal Purple and Pastel Pink
        {"hsla(270, 50%, 40%, 0.6)", "hsla(270, 50%, 50%, 0.1)", "hsl(270, 50%, 40%)", "hsl(270, 50%, 30%)", "hsl(281, 69.20%, 84.70%)"},
        // Burgundy & Peach
        {"hsla(350, 70%, 35%, 0.6)", "hsla(350, 70%, 45%, 0.1)", "hsl(350, 70%, 35%)", "hsl(350, 70%, 25%)", "#FFDAB9"}
    };

    /**
     * Predefined font schemes for the fitness landing page
     * Each scheme contains 2 fonts: [primary, secondary]
     */
    private static final String[][] FONT_SCHEMES = {
        {"'Montserrat', sans-serif", "'Playfair Display', serif"},
        {"'Poppins', sans-serif", "'Merriweather', serif"},
        {"'Open Sans', sans-serif", "'Roboto Slab', serif"},
        {"'Raleway', sans-serif", "'Lora', serif"}
    };
    
    /* Default values for blank inputs */
    private static final String[] DEFAULT_FIT_DATA = {
        
        /* ===== HEADER ===== */

        "FitLand - Fitness & Health",
        "FITLAND",
        
        /* ===== HERO ===== */

        "WELCOME TO OUR GYM",
        "Transform Your Body Shape With Proper Workout.",
        "Achieve your fitness goals with our professional trainers and state-of-the-art equipment.",
        
        /* ===== SERVICES ===== */

        "Personal Training",
        "Customized workout plans tailored to your goals.",
        "Group Classes",
        "Fun and energetic group workouts for all fitness levels.",
        "Nutrition Plans",
        "Personalized nutrition guidance to complement your training.",
        
        /* ===== ABOUT ===== */

        "10+",
        "MEET OUR CERTIFIED TRAINERS",
        "Our team of certified trainers is dedicated to helping you achieve your fitness goals.",
        "With years of experience in the fitness industry, we provide personalized training programs.",
        
        /* ===== COURSES ===== */

        "6",
        "POPULAR FITNESS PROGRAMS",
        "$99", "John Doe", "Beginner's Workout", "4 Weeks", "12",
        "$49", "Jane Smith", "Advanced Training", "8 Weeks", "24",
        "$99", "Mike Johnson", "Weight Loss Program", "12 Weeks", "36",
        "$29", "Sarah Williams", "Yoga & Flexibility", "6 Weeks", "18",
        "$79", "David Brown", "Bodybuilding", "10 Weeks", "30",
        "$89", "Emily Davis", "Cardio Blast", "4 Weeks", "12",
        
        /* ===== BLOG ===== */

        "LATEST ARTICLES",
        "Our Recent News",
        
        /* ===== BLOG POST 1 ===== */

        "Beginner's Guide to Fitness",
        "24", "Feb", "Admin", "15 Likes", "3 Shares",
        "Discover the best workout routines for beginners to kickstart your fitness journey...",
        
        /* ===== BLOG POST 2 ===== */

        "Nutrition for Athletes",
        "15", "Mar", "Trainer", "28 Likes", "7 Shares",
        "Nutrition plays a vital role in achieving your fitness goals. Learn how to...",
        
        /* ===== BLOG POST 3 ===== */

        "The Importance of Rest Days",
        "05", "Apr", "Expert", "42 Likes", "12 Shares",
        "The importance of rest and recovery in your fitness routine cannot be overstated...",
        
        /* ===== APP SHOWCASE ===== */

        "DOWNLOAD OUR APP",
        "Available On Your Favorite Store",
        
        /* ===== FOOTER ===== */

        "Subscribe to our newsletter to receive updates on our latest offers and news.",
        "Monday - Friday: 6:00 AM - 10:00 PM",
        "Saturday: 8:00 AM - 8:00 PM",
        "Sunday: 9:00 AM - 5:00 PM",
        "123 Fitness St, Health District, 10001, New York, USA"
    };
    
    public static String[] getGradHTMLInput() {
        String[] toInsert = new String[15];
        
        // Header Section
        System.out.println("\n=== Header Information ===");
        System.out.print("Enter school name/primary title: ");
        toInsert[0] = scanner.nextLine();
        System.out.print("Enter secondary title/graduation year: ");
        toInsert[1] = scanner.nextLine();
        
        // Event Information
        System.out.println("\n=== Event Information ===");
        System.out.print("Enter event date and time (e.g., 'Monday June 30th at 9am'): ");
        toInsert[2] = scanner.nextLine();
        System.out.print("Enter event description (a short paragraph about the event): ");
        toInsert[3] = scanner.nextLine();
        
        // Contact Section
        System.out.println("\n=== Contact Information ===");
        System.out.print("Enter contact description (a short message about keeping in touch): ");
        toInsert[4] = scanner.nextLine();
        
        // Itinerary Section
        System.out.println("\n=== Itinerary Information ===");
        
        // Itinerary Item 1
        System.out.println("\n--- Itinerary Item 1 ---");
        System.out.print("Enter title (e.g., 'Registration & Welcome Coffee'): ");
        toInsert[5] = scanner.nextLine();
        System.out.print("Enter description: ");
        toInsert[6] = scanner.nextLine();
        
        // Itinerary Item 2
        System.out.println("\n--- Itinerary Item 2 ---");
        System.out.print("Enter title (e.g., 'Opening Ceremony'): ");
        toInsert[7] = scanner.nextLine();
        System.out.print("Enter description: ");
        toInsert[8] = scanner.nextLine();
        
        // Itinerary Item 3
        System.out.println("\n--- Itinerary Item 3 ---");
        System.out.print("Enter title (e.g., 'Graduation Ceremony'): ");
        toInsert[9] = scanner.nextLine();
        System.out.print("Enter description: ");
        toInsert[10] = scanner.nextLine();
        
        // Itinerary Item 4
        System.out.println("\n--- Itinerary Item 4 ---");
        System.out.print("Enter title (e.g., 'Lunch Reception'): ");
        toInsert[11] = scanner.nextLine();
        System.out.print("Enter description: ");
        toInsert[12] = scanner.nextLine();
        
        // Itinerary Item 5
        System.out.println("\n--- Itinerary Item 5 ---");
        System.out.print("Enter title (e.g., 'Graduate Photo Session'): ");
        toInsert[13] = scanner.nextLine();
        System.out.print("Enter description: ");
        toInsert[14] = scanner.nextLine();
        
        return toInsert;
    }

    public static String[] getPortHTMLInput() {
        String[] toInsert = new String[18];
        
        // Header Section
        System.out.println("\n=== Basic Information ===");
        System.out.print("Enter website title (appears in browser tab): ");
        toInsert[0] = scanner.nextLine(); // WEBTITLE001
        
        System.out.print("Enter your name/title (appears in header): ");
        toInsert[1] = scanner.nextLine(); // INTRODUCTIONHEADER001
        
        System.out.print("Enter your tagline/short bio: ");
        toInsert[2] = scanner.nextLine(); // INTRODUCTIONHEADER002
        
        // About Section
        System.out.println("\n=== About Section ===");
        System.out.print("Enter 'About' section title: ");
        toInsert[3] = scanner.nextLine(); // SUBHEADERTITLE001
        
        System.out.print("Enter your about description: ");
        toInsert[4] = scanner.nextLine(); // SUBHEADERDESC001
        
        // Experience Section
        System.out.println("\n=== Experience Section ===");
        System.out.print("Enter 'Experience' section title: ");
        toInsert[5] = scanner.nextLine(); // SUBHEADERTITLE002
        
        System.out.print("Enter your experience details: ");
        toInsert[6] = scanner.nextLine(); // SUBHEADERDESC002
        
        // Skills Section
        System.out.println("\n=== Skills Section ===");
        System.out.print("Enter 'Skills' section title: ");
        toInsert[7] = scanner.nextLine(); // SUBHEADERTITLE003
        
        System.out.print("Enter your skills (comma separated): ");
        toInsert[8] = scanner.nextLine(); // SUBHEADERDESC003
        
        // Projects Section
        System.out.println("\n=== Projects Section ===");
        System.out.print("Enter 'Projects' section title: ");
        toInsert[9] = scanner.nextLine(); // SUBHEADERTITLE004
        
        System.out.println("\nEnter project names (press Enter after each, leave empty to skip):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Project " + (i+1) + " name: ");
            String project = scanner.nextLine();
            toInsert[10 + i] = project.isEmpty() ? "Project " + (i+1) : project; // PROJECTTITLE001-005
        }
        
        // Contact Section
        System.out.println("\n=== Contact Section ===");
        System.out.print("Enter 'Contact' section title: ");
        toInsert[15] = scanner.nextLine(); // SUBHEADERTITLE005
        
        System.out.print("Enter your contact information: ");
        toInsert[16] = scanner.nextLine(); // SUBHEADERDESC005
        
        return toInsert;
    }

    public static String[] getPortCSSInput() {
        String[] colors = new String[3]; // primary, secondary, background
        
        System.out.println("\n=== Color Theme Selection ===");
        System.out.println("1. Use a predefined color theme");
        System.out.println("2. Enter custom colors");
        System.out.print("Choose an option (1-2): ");
        
        String choice = scanner.nextLine().trim();
        
        if (choice.equals("1")) {
            // Predefined color themes
            System.out.println("\nAvailable color themes:");
            System.out.println("1. Ocean Blue (Blue, Light Blue, White)");
            System.out.println("2. Forest Green (Green, Light Green, Beige)");
            System.out.println("3. Sunset (Orange, Pink, Light Yellow)");
            System.out.println("4. Midnight (Dark Blue, Purple, Dark Gray)");
            System.out.println("5. Monochrome (Black, Dark Gray, Light Gray)");
            System.out.print("\nSelect a theme (1-5): ");
            
            String themeChoice = scanner.nextLine().trim();
            switch (themeChoice) {

                /* could be completely overhauled with my palette generator app in a later version */
                
                case "1": // Ocean Blue
                    colors[0] = "#0077b6"; // Primary
                    colors[1] = "#48cae4";  // Secondary
                    colors[2] = "#ffffff";  // Background
                    break;
                case "2": // Forest Green
                    colors[0] = "#2d6a4f";
                    colors[1] = "#40916c";
                    colors[2] = "#f8f9fa";
                    break;
                case "3": // Sunset
                    colors[0] = "#ff7b00";
                    colors[1] = "#ff4d6d";
                    colors[2] = "#fff3b0";
                    break;
                case "4": // Midnight
                    colors[0] = "#3a0ca3";
                    colors[1] = "#7209b7";
                    colors[2] = "#4a4e69";
                    break;
                case "5": // Monochrome
                    colors[0] = "#212529";
                    colors[1] = "#495057";
                    colors[2] = "#f8f9fa";
                    break;
                default:
                    System.out.println("Invalid choice, using default Ocean Blue theme.");
                    colors[0] = "#0077b6";
                    colors[1] = "#48cae4";
                    colors[2] = "#ffffff";
            }
            
            System.out.println("\nSelected theme colors:");
            System.out.println("Primary: " + colors[0]);
            System.out.println("Secondary: " + colors[1]);
            System.out.println("Background: " + colors[2]);
            
        } else if (choice.equals("2")) {
            // Custom colors
            System.out.println("\nEnter custom colors (use hex codes like #RRGGBB or color names):");
            
            System.out.print("Primary color (for headings, links): ");
            colors[0] = validateColor(scanner.nextLine());
            
            System.out.print("Secondary color (for text): ");
            colors[1] = validateColor(scanner.nextLine());
            
            System.out.print("Background color: ");
            colors[2] = validateColor(scanner.nextLine());
            
            System.out.println("\nYour custom colors:");
            System.out.println("Primary: " + colors[0]);
            System.out.println("Secondary: " + colors[1]);
            System.out.println("Background: " + colors[2]);
            
        } else {
            System.out.println("Invalid choice, using default colors.");
            colors[0] = "#000000";
            colors[1] = "#333333";
            colors[2] = "#ffffff";
        }
        
        return colors;
    }
    
    private static String validateColor(String color) {
        // Basic validation for hex color codes
        if (color.startsWith("#")) {
            // Check if it's a valid hex color (3 or 6 digits)
            if (!color.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")) {
                System.out.println("  Invalid hex color, using default #000000");
                return "#000000";
            }
            return color;
        }
        /* If it's a named color, just return it (browser will handle validation) 
        (we trust the user on this one there are like hundreds of named colors lol) */
        return color;
    }

    public static String[] getFitHTMLInput() {
        String[] toInsert = new String[77];
        
        System.out.println("Enter the following information (press Enter to use default values):\n");
        
        /* ===== HEADER ====== */
        
        System.out.println("=== Header Section ===");
        System.out.print("Browser Title: ");
        toInsert[0] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[0]);
        
        System.out.print("Header Title: ");
        toInsert[1] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[1]);
        
        /* ===== HERO ====== */
        
        System.out.println("\n=== Hero Section ===");
        System.out.print("Hero Subheader: ");
        toInsert[2] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[2]);
        
        System.out.print("Hero Title: ");
        toInsert[3] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[3]);
        
        System.out.print("Hero Description: ");
        toInsert[4] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[4]);
        
        /* ===== SERVICES ====== */
        
        System.out.println("\n=== Services Section ===");
        System.out.println("Service 1:");
        System.out.print("  Title: ");
        toInsert[5] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[5]);
        System.out.print("  Description: ");
        toInsert[6] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[6]);
        
        System.out.println("\nService 2:");
        System.out.print("  Title: ");
        toInsert[7] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[7]);
        System.out.print("  Description: ");
        toInsert[8] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[8]);
        
        System.out.println("\nService 3:");
        System.out.print("  Title: ");
        toInsert[9] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[9]);
        System.out.print("  Description: ");
        toInsert[10] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[10]);
        
        /* ===== ABOUT ===== */
        
        System.out.println("\n=== About Section ===");
        System.out.print("Years of Experience: ");
        toInsert[11] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[11]);
        
        System.out.print("Section Header: ");
        toInsert[12] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[12]);
        
        System.out.print("About Paragraph 1: ");
        toInsert[13] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[13]);
        
        System.out.print("About Paragraph 2: ");
        toInsert[14] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[14]);
        
        /* ===== COURSES ===== */
        
        System.out.println("\n=== Courses Section ===");
        System.out.print("Number of Courses: ");
        toInsert[15] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[15]);
        
        System.out.print("Section Header: ");
        toInsert[16] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[16]);
        
        /* ===== COURSE DATA ===== */
        String[] courseFields = {"Price", "Instructor", "Title", "Duration", "Lecture Count"};
        for (int i = 0; i < 6; i++) {
            System.out.println("\nCourse " + (i+1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("  " + courseFields[j] + ": ");
                if (j == 0) { // Price field
                    toInsert[17 + (i*5) + j] = getPriceInput(DEFAULT_FIT_DATA[17 + (i*5) + j]);
                } else {
                    toInsert[17 + (i*5) + j] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[17 + (i*5) + j]);
                }
            }
        }
        
        /* ===== BLOG ===== */
        
        System.out.println("\n=== Blog Section ===");
        System.out.print("Blog Subheading: ");
        toInsert[47] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[47]);
        
        System.out.print("Blog Section Title: ");
        toInsert[48] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[48]);
        
        /* ===== BLOG DATA ===== */
        String[] blogFields = {"Title", "Date", "Month", "Author", "Like Count", "Share Count", "Preview Text"};
        // For Each Blog Post
        for (int i = 0; i < 3; i++) {
            System.out.println("\nBlog Post " + (i+1) + ":");
            // First get the post title (new field)
            System.out.print("  " + blogFields[0] + ": ");
            toInsert[49 + (i*7)] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[49 + (i*7)]);
            // Then get the rest of the data
            for (int j = 1; j < blogFields.length; j++) {
                System.out.print("  " + blogFields[j] + ": ");
                toInsert[49 + (i*7) + j] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[49 + (i*7) + j]);
            }
        }
        
        /* ===== APP SHOWCASE ===== */

        System.out.println("\n=== App Section ===");
        System.out.print("Section Subheader: ");
        toInsert[70] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[70]);
        
        System.out.print("Section Title: ");
        toInsert[71] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[71]);
        
        /* ===== FOOTER ===== */
        
        System.out.println("\n=== Footer Section ===");
        System.out.print("Newsletter Text: ");
        toInsert[72] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[72]);
        
        System.out.print("Opening Hours Line 1: ");
        toInsert[73] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[73]);
        
        System.out.print("Opening Hours Line 2: ");
        toInsert[74] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[74]);
        
        System.out.print("Opening Hours Line 3: ");
        toInsert[75] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[75]);
        
        System.out.print("Location: ");
        toInsert[76] = getDefaultIfEmpty(scanner.nextLine(), DEFAULT_FIT_DATA[76]);
        
        System.out.println("\n=== Fitness Landing Page Input Complete ===");
        return toInsert;
    }
    
    private static String getDefaultIfEmpty(String input, String defaultValue) {
        return input.trim().isEmpty() ? defaultValue : sanitize(input.trim());
    }
    
    private static String getPriceInput(String defaultValue) {
        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                return defaultValue;
            }
            if (input.length() > 3) {
                System.out.print("  Price must be 3 characters or less. Please try again: ");
            } else {
                return sanitize(input);
            }
        }
    }

    /**
     * Gets the 1-based index of the selected font scheme
     * @param fontScheme The font scheme to find
     * @return 1-based index of the font scheme, or 1 if not found
     */
    /**
     * Gets the 1-based index of the selected font scheme
     * @param fontScheme The font scheme to find (should be an array of two strings)
     * @return 1-based index of the font scheme, or 1 if not found or invalid input
     */
    public static int getFontSchemeIndex(String[] fontScheme) {
        try {
            // Check for null or invalid input
            if (fontScheme == null || fontScheme.length < 2 || fontScheme[0] == null || fontScheme[1] == null) {
                System.out.println("Warning: Invalid font scheme provided. Using default font scheme.");
                return 1; // Default to first scheme
            }
            
            // Try to find the font scheme
            for (int i = 0; i < FONT_SCHEMES.length; i++) {
                if (FONT_SCHEMES[i][0].equals(fontScheme[0]) && 
                    FONT_SCHEMES[i][1].equals(fontScheme[1])) {
                    return i + 1; // Return 1-based index
                }
            }
        } catch (Exception e) {
            System.out.println("Error processing font scheme: " + e.getMessage());
        }
        
        System.out.println("Warning: Font scheme not found. Using default font scheme.");
        return 1; // Default to first scheme if not found or error occurred
    }
    
    /**
     * Displays available color schemes and lets the user select one
     * @return The selected color scheme as an array of colors
     */
    public static String[] selectColorScheme() {
        System.out.println("\n=== Select a Color Scheme ===");
        System.out.println("1. Beach-side (Teal and Beige)");
        System.out.println("2. Navy Blue");
        System.out.println("3. Royal Purple & Pastel Pink");
        System.out.println("4. Burgundy & Peach");
        
        int choice = getIntInput("Enter your choice (1-4): ", 1, 4);
        return COLOR_SCHEMES[choice - 1];
    }
    
    /**
     * Displays available font schemes and lets the user select one
     * @return The selected font scheme as an array of fonts
     */
    public static String[] selectFontScheme() {
        System.out.println("\n=== Select a Font Scheme ===");
        System.out.println("1. Montserrat & Playfair Display");
        System.out.println("2. Poppins & Merriweather");
        System.out.println("3. Open Sans & Roboto Slab");
        System.out.println("4. Raleway & Lora");
        
        int choice = getIntInput("Enter your choice (1-4): ", 1, 4);
        return FONT_SCHEMES[choice - 1];
    }
    
    /**
     * Helper method to get a valid integer input within a range (options)
     */
    private static int getIntInput(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.println("Please enter a number between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    /**
     * Sanitizes the input string by replacing special characters with their HTML entities
     * @param input The input string to sanitize
     * @return The sanitized string with HTML special characters escaped
     */
    public static String sanitize(String input) {
        if (input == null) return "";
        return input
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;")
            .replace("'", "&#39;")
            .replace("(", "&#40;")
            .replace(")", "&#41;")
            .replace("{", "&#123;")
            .replace("}", "&#125;")
            .replace("[", "&#91;")
            .replace("]", "&#93;");
    }
    
    public static void closeScanner() {
        scanner.close();
    }
}
