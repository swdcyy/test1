package com.hpplay.sdk.source.process.LelinkSourceSdkImp$2;
import com.hpplay.sdk.source.process.c$a;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp;
import java.lang.Object;
import com.hpplay.sdk.source.h;
import java.lang.StringBuilder;
import java.lang.String;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.process.c;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;

public class LelinkSourceSdkImp$2 implements c$a	// class@00068b
{
    public final LelinkSourceSdkImp a;

    public void LelinkSourceSdkImp$2(LelinkSourceSdkImp p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(h p0){
       LelinkSourceSdkImp$2 ta = this.a;
       ta.isBind = true;
       ta.bindCount = 0;
       a.f("LelinkSourceSDK", "sdk bind successful "+this.a.isBind);
       ta = this.a;
       ta.mSdkInterface = p0;
       ta.mServiceConnection.a(ta.mIBrowseListener);
       LelinkSourceSdkImp$2 ta1 = this.a;
       ta1.mServiceConnection.a(ta1.mConnectListener);
       ta1 = this.a;
       ta1.mServiceConnection.a(ta1.mPlayerListener);
    }
    public void onServiceDisconnected(){
       a.f("LelinkSourceSDK", "sdk bind failed "+this.a.bindCount);
       this.a.retryBind();
    }
}
