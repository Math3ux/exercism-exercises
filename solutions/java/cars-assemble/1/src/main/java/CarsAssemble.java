public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double totally = 221 * speed;
        if (speed <= 4 && speed >=1){
            return totally;
        }else if(speed<=8 && speed>=5){
            return totally * 0.9;
        }else if (speed == 9){
            return totally * 0.8;
        }else {
            return totally * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double successRate;
        if (speed <= 4) {
            successRate = 1.0; // 100% success rate
        } else if (speed <= 8) {
            successRate = 0.9; // 90% success rate
        } else if (speed == 9) {
            successRate = 0.8; // 80% success rate
        } else {
            successRate = 0.77; // 77% success rate for speed 10
        }
        
        return (int)((3.68 * speed)*successRate);
    }
}
