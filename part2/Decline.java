package pavithra.part2;

public class Decline {
    public int declineStocks(int compCount,boolean[] value,int decline){
        System.out.println("Total no of companies whose stock price declined today :");
        for(int  i=1;i<=compCount;i++){
            if(value[i] == false){
                decline++;
            }
        }
        return decline;
    }
}
