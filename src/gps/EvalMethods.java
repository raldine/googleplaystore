package gps;

import java.util.ArrayList;

public class EvalMethods {
    private ArrayList<AppInfo> list;
    private String appListCat;
    private double ratingAcc = 0;
    private double highCatRating = 0;
    private double lowCatRating = 5;
    private double avgCatRat;
    int catCount = 0;
    private AppInfo highestApp = new AppInfo("null", "null", 0);
    private AppInfo lowestApp = new AppInfo("null", "null", 0);

    public EvalMethods(ArrayList<AppInfo> list){
    
    this.highestApp = new AppInfo("null", "null", 0);
    this.lowestApp = new AppInfo("null", "null", 0);
    this.ratingAcc = 0;
    this.catCount = 0;
    this.highCatRating = 0;
    this.lowCatRating = 5;
    this.appListCat = list.get(0).getAppCat();

    


        for(int i = 0; i < list.size(); i++){
        
            AppInfo appEval = list.get(i);
            this.catCount++;
            this.ratingAcc+= appEval.getRatingD();

            
            if (appEval.getRatingD() > this.highCatRating){
                this.highCatRating = appEval.getRatingD();
                this.highestApp.setAppName(appEval.getAppName());
                this.highestApp.setAppCat(appEval.getAppCat());
                this.highestApp.setRatingD(appEval.getRatingD());

            }

            if (appEval.getRatingD() < this.lowCatRating){
                this.lowCatRating = appEval.getRatingD();
                this.lowestApp.setAppName(appEval.getAppName());
                this.lowestApp.setAppCat(appEval.getAppCat());
                this.lowestApp.setRatingD(appEval.getRatingD());
            }  

    }
    this.avgCatRat = this.ratingAcc/this.catCount;

    }

    



    public double getHighCatRating() {
        return highCatRating;
    }





    public double getLowCatRating() {
        return lowCatRating;
    }





    public double getAvgCatRat() {
        return avgCatRat;
    }





    public AppInfo getHighestApp() {
        return highestApp;
    }





    public AppInfo getLowestApp() {
        return lowestApp;
    }





    public void getResult(){
        System.out.printf("CAT: %s\n", this.appListCat);
        System.out.printf("Highest rated app is %s, at %f\n", this.highestApp.getAppName(), this.highestApp.getRatingD());
        System.out.printf("Lowest rated app is %s, at %f\n",this.lowestApp.getAppName(), this.lowestApp.getRatingD());
        System.out.printf("The avg app rating for this cat: %f\n", this.avgCatRat);
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

    }









    
}
