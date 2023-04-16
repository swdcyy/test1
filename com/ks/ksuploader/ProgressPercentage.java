package com.ks.ksuploader.ProgressPercentage;
import java.lang.Object;

public class ProgressPercentage	// class@00076a
{
    public int estimatedRemainingTimeMs;
    public double percent;

    public void ProgressPercentage(){
       super();
       this.percent = 0;
       this.estimatedRemainingTimeMs = -1;
    }
    public void ProgressPercentage(double p0,int p1){
       super();
       this.percent = 0;
       this.estimatedRemainingTimeMs = -1;
       this.percent = p0;
       this.estimatedRemainingTimeMs = p1;
    }
}
