package pavithra.Stockers;

public class Ascending {
    public void ascendingArrange(int compCount,double temp,double[] stockPrice) {
        System.out.println("Stock prices in ascending order are : "); 
        for(int i = 1;i<= compCount;i++){
            for(int j=i+1;j<=compCount;j++){
                if(stockPrice[i]>stockPrice[j]){
                    temp = stockPrice[i];
                    stockPrice[i] = stockPrice[j];
                    stockPrice[j] = temp;
                }
            }
            System.out.println(stockPrice[i]);
        }             
    }
}
