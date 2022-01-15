package pavithra.part2;

public class Rise {
    public int risingStocks(int compCount,boolean[] value,int rise){
        System.out.println("Total no of companies whose stock price rose today : ");
        for(int  i=1;i<=compCount;i++){
            if(value[i] == true){
                rise++;
            }
        }
        return rise;
    }
}
