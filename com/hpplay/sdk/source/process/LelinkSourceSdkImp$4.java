package com.hpplay.sdk.source.process.LelinkSourceSdkImp$4;
import java.lang.Runnable;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp;
import java.lang.Object;
import com.hpplay.sdk.source.process.c;

public class LelinkSourceSdkImp$4 implements Runnable	// class@00068d
{
    public final LelinkSourceSdkImp a;

    public void LelinkSourceSdkImp$4(LelinkSourceSdkImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       LelinkSourceSdkImp mServiceConn = this.a.mServiceConnection;
       if (mServiceConn != null) {
          mServiceConn.a();
       }
       LelinkSourceSdkImp$4 ta = this.a;
       ta.bindCount = ta.bindCount + 1;
       ta.isBind = false;
       return;
    }
}
