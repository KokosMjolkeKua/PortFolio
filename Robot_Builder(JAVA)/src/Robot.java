public class Robot {
    private String name;
    private double batteryLevel;
    private int distanceToPark;
    private String botType;


    public Robot(String name, double batteryLevel, int distanceToPark, String botType) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distanceToPark = distanceToPark;
        this.botType = botType;
    }

    public void reportStatus(){
        System.out.println("\nBot-name: " + name + "\nBot-type: " + botType +
                "\nBattery-level: " + batteryLevel);
    }

    public boolean canWalkToThePark(World world) {
        if (!(world.getDay() == 6)){
            System.out.println("\n" + name + " cannot go to the park today because it is a sunday.");
            return false;
        }
        if (world.getIsRaining()){
            System.out.println("\n" + name + " cannot go to the park today because it is raining.");
            return false;
        }

        int batteryRequired = distanceToPark / 100;
        if (batteryLevel < batteryRequired){
            System.out.println("\n" + name + " does not have enough battery to go to the park.");
            return false;
        }

        batteryLevel -= batteryRequired;
        System.out.println("\n" + name + " went to the park and used " + batteryRequired + "% battery.");
        return true;
    }

    public boolean canDanceAtClub(World world){
        if (!(world.getDay() == 1) && botType.equals("B-bot") && batteryLevel >= 50){
            batteryLevel -= 50;
            System.out.println(name + " danced at the club and used 50% battery.");
            return true;
        } else {
            System.out.println(name + " cannot dance at the dance-club.");
            return false;
        }
    }

    public void chargeBattery(){
        System.out.println(name + " is charging battery...");
        batteryLevel = 100;
    }

    public void clean(){
        if (batteryLevel >= 15){
            batteryLevel -= 15;
            System.out.println(name + " cleaned the area and used 15% battery.");
        } else {
            System.out.println(name + " does not have enough battery to clean.");
        }
    }

}
