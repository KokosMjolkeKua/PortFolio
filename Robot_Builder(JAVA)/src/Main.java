public class Main {
    public static void main(String[] args) {

        World thisWorld = new World(4879, true);
        World futureWorld = new World(98765, false);

        Robot botOne = new Robot("QBERT", 45, 450, "B-bot");
        Robot botTwo = new Robot("EVA", 37, 980, "Brava-Bot");
        Robot botThree = new Robot("DANCY-Tron 4000", 65, 1430, "B-bot");

        Robot[] bots = {botOne, botTwo, botThree};

        for (Robot bot : bots){
            bot.reportStatus();
            bot.canWalkToThePark(thisWorld);
            bot.canDanceAtClub(thisWorld);
            bot.clean();
            bot.chargeBattery();
            bot.reportStatus();

            bot.canWalkToThePark(futureWorld);
            bot.canDanceAtClub(futureWorld);
            bot.clean();
            bot.chargeBattery();
            bot.reportStatus();
        }
    }
}