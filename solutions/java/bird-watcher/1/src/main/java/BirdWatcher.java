
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] count = new int[] {0, 2, 5, 3, 7, 8, 4};
        return count;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int valueToday = birdsPerDay[birdsPerDay.length - 1];
        birdsPerDay[birdsPerDay.length - 1] = valueToday+1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdsN: birdsPerDay){
            if(birdsN==0){
                return true; 
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for(int i=0; i < numberOfDays; i++){
            if(i==7){
             return count;   
            }
            count += this.birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int birdsN: birdsPerDay){
            if(birdsN>=5){
                count++; 
            }
        }
        return count;
    }
}
