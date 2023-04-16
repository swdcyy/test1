package com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$a;
import java.lang.Object;

public final class KdsMemoryWarningSampler$a	// class@0008ea
{
    public final boolean enable;
    public final double sampleRatio;
    public final double warningFreeMemoryRatio;

    public void KdsMemoryWarningSampler$a(boolean p0,double p1,double p2){
       super();
       this.enable = p0;
       this.sampleRatio = p1;
       this.warningFreeMemoryRatio = p2;
    }
    public final double a(){
       return this.warningFreeMemoryRatio;
    }
}
