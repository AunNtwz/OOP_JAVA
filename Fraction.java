public class Fraction {
    public int topN;
    public int btmN;
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN + f.topN;
        } else{
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
    public String toFloat(){
        return (double) topN / btmN + "";
    }
    public String toFraction(){
        return topN+"/"+btmN;
    }
}
