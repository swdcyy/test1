package lm1.j;
import java.lang.Object;

public class j	// class@002fa7
{
    public int afterSendSampleRate;
    public boolean onlyLogAfterSendGiftFailed;
    public int preSendSampleRate;
    public int sampleRateRegion;
    public int sendingSampleRate;
    public String[] uidWhiteList;
    public static final j a;

    static {
       j oj = new j(10, 100, 100, 100, false);
       j.a = v6;
    }
    public void j(){
       super();
    }
    public void j(int p0,int p1,int p2,int p3,boolean p4){
       super();
       this.preSendSampleRate = p0;
       this.sendingSampleRate = p1;
       this.afterSendSampleRate = p2;
       this.sampleRateRegion = p3;
       this.onlyLogAfterSendGiftFailed = p4;
    }
    public int a(){
       return this.sampleRateRegion;
    }
}
