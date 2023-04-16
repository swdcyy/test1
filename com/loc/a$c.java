package com.loc.a$c;
import android.os.Handler;
import com.loc.a;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import java.lang.String;
import java.lang.Throwable;
import android.os.Parcelable;
import com.amap.api.fence.GeoFence;

public final class a$c extends Handler	// class@00135d
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a$c(a p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       Bundle data = p0.getData();
       switch (p0.what){
           case 1000:
             this.a.i(data);
          label_0033 :
             return;
             break;
           case 1001:
             this.a.b(data.getParcelable("geoFence"));
             return;
           case 1002:
             this.a.c(data.getInt("location_errorcode"));
             return;
           default:
             goto label_0033 ;
       }
    }
}
