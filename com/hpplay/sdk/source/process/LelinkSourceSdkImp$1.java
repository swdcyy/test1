package com.hpplay.sdk.source.process.LelinkSourceSdkImp$1;
import java.lang.Runnable;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp;
import android.content.Context;
import java.lang.String;
import com.hpplay.sdk.source.api.IBindSdkListener;
import java.lang.Object;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.process.c;
import com.hpplay.sdk.source.process.c$a;
import com.hpplay.sdk.source.browse.api.AuthListener;

public class LelinkSourceSdkImp$1 implements Runnable	// class@00068a
{
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final IBindSdkListener g;
    public final LelinkSourceSdkImp h;

    public void LelinkSourceSdkImp$1(LelinkSourceSdkImp p0,Context p1,String p2,String p3,String p4,String p5,String p6,IBindSdkListener p7){
       this.h = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       super();
    }
    public void run(){
       a.f("LelinkSourceSDK", "----- sdk process  ----");
       LelinkSourceSdkImp$1 th = this.h;
       c uoc = new c(this.a, this.b, this.c, this.d, this.e, this.f, th.bindStatusListener);
       th.mServiceConnection = v9;
       this.h.mServiceConnection.a(this.g);
       th = this.h;
       LelinkSourceSdkImp mAuthListene = th.mAuthListener;
       if (mAuthListene != null) {
          th.mServiceConnection.a(mAuthListene);
       }
       this.h.mServiceConnection.a();
       return;
    }
}
