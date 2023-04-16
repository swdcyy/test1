package com.kwai.framework.krn.init.network.KdsUploadProgressListener$ProgressData;
import java.io.Serializable;
import java.lang.Object;

public final class KdsUploadProgressListener$ProgressData implements Serializable	// class@0015e0
{
    public final int current;
    public final int total;

    public void KdsUploadProgressListener$ProgressData(int p0,int p1){
       super();
       this.current = p0;
       this.total = p1;
    }
    public final int getCurrent(){
       return this.current;
    }
    public final int getTotal(){
       return this.total;
    }
}
