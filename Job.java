public class Job{
    private double dph;
    private String title;

    public Job(String t, double p){
        title = t;
        dph = p;
    }  
 
 
    public void setDPH(double p){
        dph = p;
    }
 
 
    public double getDPH(){
        return dph;
    }
 
 
    public void setTitle(String t){
        title = t;
    }
 
 
    public String getTitle(){
        return title;
    }
 
 }
 