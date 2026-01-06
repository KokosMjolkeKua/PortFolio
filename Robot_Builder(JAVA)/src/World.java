public class World {
    private boolean isRaining;
    private int day;  // 0 = Monday, 6 = Sunday

    public World(int day, boolean isRaining) {
        setDay(day);
        this.isRaining = isRaining;

        System.out.println("Today is " + getDayName(this.day) +
                " (" + this.day + ") and the weather is " + (isRaining ? "raining." : "clear."));
    }

    // Setter med validering
    public void setDay(int day) {
        if (day >= 0 && day <= 6) {
            this.day = day;
        } else {
            System.out.println("Invalid day: " + day + ". Defaulting to Monday (0).");
            this.day = 0;
        }
    }

    public int getDay() {
        return day;
    }

    public boolean getIsRaining() {
        return this.isRaining;
    }

    public void setIsRaining(boolean isRaining) {
        this.isRaining = isRaining;
    }

    public boolean isSunday() {
        return this.day == 6;
    }

    public String getDayName(int day) {
        return switch (day % 7) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Unknown"; // Bør aldri nås på grunn av %7, men sikkerhetsnett
        };
    }

    // Overload som bruker interne verdier
    public String getCurrentDayName() {
        return getDayName(this.day);
    }
}
