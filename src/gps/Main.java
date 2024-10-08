package gps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main{

    public static void main(String[] args) throws FileNotFoundException, IOException{


    // read csv but only certain columns
        Reader reader = new FileReader("googleplaystore.txt");
        BufferedReader br = new BufferedReader(reader);
        String[] line;
        String currentLine;
        //above was lines needed for reading per line

        ArrayList<String> colAppName = new ArrayList<>();
        ArrayList<String> colAppCat = new ArrayList<>();
        ArrayList<String> colAppRat = new ArrayList<>();

        while ((currentLine = br.readLine()) !=null){

            line = currentLine.split(";");
            colAppName.add(line[0]);
            colAppCat.add(line[1]);
            colAppRat.add(line[2]);

        }
        // System.out.printf("the imported size of entries is %d\n", colAppName.size());
        // System.out.printf("book 1487 is %s %s %s\n", colAppName.get(1488), colAppCat.get(1488), colAppRat.get(1488));

        reader.close();
        br.close();

        // for(int i =0; i < colAppName.size(); i++){

        //     System.out.printf("Book Name: %s\n", colAppName.get(i));
        // }

        //now to remove NaN values...

        for (int i = 0; i < colAppName.size(); i++){

            if (colAppRat.get(i).trim().equals("NaN")){
                colAppRat.remove(i);
                colAppName.remove(i);
                colAppCat.remove(i);
                i--; //this is needed as item has been removed from list

            }
        }

        // System.out.printf("the new size of entries is %d\n", colAppName.size());


        //check values, rmb i should start from 1 as we want to skip the col headers
        // System.out.printf("colAppName[0] is %s\n", colAppName.get(0));
        colAppName.remove(0);
        // System.out.printf("after removing colHeader, colAppName[0] is %s\n", colAppName.get(0));
        // System.out.printf("colAppCat[0] is %s\n", colAppCat.get(0));
        colAppCat.remove(0);
        // System.out.printf("after removing colHeader, colAppCat[0] is %s\n", colAppCat.get(0));
        // System.out.printf("colAppRat[0] is %s\n", colAppRat.get(0));
        colAppRat.remove(0);
        // System.out.printf("after removing colHeader, colAppRat[0] is %s\n", colAppRat.get(0));

        //for evaluation of values - convert to dbl
        ArrayList<Double> colAppRatD = new ArrayList<>();

        for (int i = 0; i < colAppRat.size(); i++){

            Double temp = Double.parseDouble(colAppRat.get(i).trim());
            colAppRatD.add(temp);
            // System.out.printf("%s\n", colAppRatD.get(i));

        }

        //get unique set of app cats
        HashSet<String> uniqueAppCat = new HashSet<String>(colAppCat);
        ArrayList<String> uniAppCArray = new ArrayList<>(uniqueAppCat);
    
        for(int i = 0; i < uniAppCArray.size(); i++){
            System.out.printf("CAT:  %d: %s\n", i, uniAppCArray.get(i));

        }

        //adding all corrected info to a main list
        ArrayList<AppInfo> mainAppList = new ArrayList<AppInfo>();

        for(int i = 0; i < colAppName.size(); i++){

            AppInfo appEntry = new AppInfo(colAppName.get(i), colAppCat.get(i), colAppRatD.get(i));

            mainAppList.add(appEntry);

        }
        

    


    //split into cats arrays
    ArrayList<AppInfo> cat00ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat01ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat02ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat03ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat04ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat05ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat06ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat07ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat08ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat09ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat10ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat11ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat12ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat13ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat14ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat15ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat16ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat17ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat18ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat19ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat20ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat21ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat22ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat23ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat24ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat25ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat26ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat27ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat28ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat29ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat30ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat31ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat32ArrayList = new ArrayList<AppInfo>();
    ArrayList<AppInfo> cat33ArrayList = new ArrayList<AppInfo>();
    
    
    for(int i = 0; i < mainAppList.size(); i++){
        //cycles all books
        AppInfo appEval = mainAppList.get(i);
        
        //evaluating by cat
        if (appEval.getAppCat().equals(uniAppCArray.get(0))){
            cat00ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(1))){
            cat01ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(2))){
            cat02ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(3))){
            cat03ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(4))){
            cat04ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(5))){
            cat05ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(6))){
            cat06ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(7))){
            cat07ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(8))){
            cat08ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(9))){
            cat09ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(10))){
            cat10ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(11))){
            cat11ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(12))){
            cat12ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(13))){
            cat13ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(14))){
            cat14ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(15))){
            cat15ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(16))){
            cat16ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(17))){
            cat17ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(18))){
            cat18ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(19))){
            cat19ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(20))){
            cat20ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(21))){
            cat21ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(22))){
            cat22ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(23))){
            cat23ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(24))){
            cat24ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(25))){
            cat25ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(26))){
            cat26ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(27))){
            cat27ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(28))){
            cat28ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(29))){
            cat29ArrayList.add(appEval);
        } 
        if (appEval.getAppCat().equals(uniAppCArray.get(30))){
            cat30ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(31))){
            cat31ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(32))){
            cat32ArrayList.add(appEval);
        } 

        if (appEval.getAppCat().equals(uniAppCArray.get(33))){
            cat33ArrayList.add(appEval);
        } 
    }


    //evaluate all cats
    EvalMethods evalCat0 = new EvalMethods(cat00ArrayList);
    EvalMethods evalCat1 = new EvalMethods(cat01ArrayList);
    EvalMethods evalCat2 = new EvalMethods(cat02ArrayList);
    EvalMethods evalCat3 = new EvalMethods(cat03ArrayList);
    EvalMethods evalCat4 = new EvalMethods(cat04ArrayList);
    EvalMethods evalCat5 = new EvalMethods(cat05ArrayList);
    EvalMethods evalCat6 = new EvalMethods(cat06ArrayList);
    EvalMethods evalCat7 = new EvalMethods(cat07ArrayList);
    EvalMethods evalCat8 = new EvalMethods(cat08ArrayList);
    EvalMethods evalCat9 = new EvalMethods(cat09ArrayList);
    EvalMethods evalCat10 = new EvalMethods(cat10ArrayList);
    EvalMethods evalCat11 = new EvalMethods(cat11ArrayList);
    EvalMethods evalCat12 = new EvalMethods(cat12ArrayList);
    EvalMethods evalCat13 = new EvalMethods(cat13ArrayList);
    EvalMethods evalCat14 = new EvalMethods(cat14ArrayList);
    EvalMethods evalCat15 = new EvalMethods(cat15ArrayList);
    EvalMethods evalCat16 = new EvalMethods(cat16ArrayList);
    EvalMethods evalCat17 = new EvalMethods(cat17ArrayList);
    EvalMethods evalCat18 = new EvalMethods(cat18ArrayList);
    EvalMethods evalCat19 = new EvalMethods(cat19ArrayList);
    EvalMethods evalCat20 = new EvalMethods(cat20ArrayList);
    EvalMethods evalCat21 = new EvalMethods(cat21ArrayList);
    EvalMethods evalCat22 = new EvalMethods(cat22ArrayList);
    EvalMethods evalCat23 = new EvalMethods(cat23ArrayList);
    EvalMethods evalCat24 = new EvalMethods(cat24ArrayList);
    EvalMethods evalCat25 = new EvalMethods(cat25ArrayList);
    EvalMethods evalCat26 = new EvalMethods(cat26ArrayList);
    EvalMethods evalCat27 = new EvalMethods(cat27ArrayList);
    EvalMethods evalCat28 = new EvalMethods(cat28ArrayList);
    EvalMethods evalCat29 = new EvalMethods(cat29ArrayList);
    EvalMethods evalCat30 = new EvalMethods(cat30ArrayList);
    EvalMethods evalCat31 = new EvalMethods(cat31ArrayList);
    EvalMethods evalCat32 = new EvalMethods(cat32ArrayList);
    EvalMethods evalCat33 = new EvalMethods(cat33ArrayList);
    evalCat0.getResult();
    evalCat1.getResult();
    evalCat2.getResult();
    evalCat3.getResult();
    evalCat4.getResult();
    evalCat5.getResult();
    evalCat6.getResult();
    evalCat7.getResult();
    evalCat8.getResult();
    evalCat9.getResult();
    evalCat10.getResult();
    evalCat11.getResult();
    evalCat12.getResult();
    evalCat13.getResult();
    evalCat14.getResult();
    evalCat15.getResult();
    evalCat16.getResult();
    evalCat17.getResult();
    evalCat18.getResult();
    evalCat19.getResult();
    evalCat20.getResult();
    evalCat21.getResult();
    evalCat22.getResult();
    evalCat23.getResult();
    evalCat24.getResult();
    evalCat25.getResult();
    evalCat26.getResult();
    evalCat27.getResult();
    evalCat28.getResult();
    evalCat29.getResult();
    evalCat30.getResult();
    evalCat31.getResult();
    evalCat32.getResult();
    evalCat33.getResult();









        } // end of psvm

        
    } // end of  class main










