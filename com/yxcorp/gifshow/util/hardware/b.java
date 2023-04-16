package com.yxcorp.gifshow.util.hardware.b;
import erd.g;
import java.lang.Object;
import crd.b;
import android.app.Application;
import o56.a;
import java.lang.String;
import android.media.AudioManager;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import java.lang.Boolean;

public final class b implements g	// class@001d43
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0 = a.b().getSystemService("audio");
       boolean b = HeadsetPlugMonitor.a();
       HeadsetPlugMonitor.a = Boolean.valueOf(b);
       if (p0 != null) {
          boolean b1 = (b || p0.isWiredHeadsetOn())? true: false;
          HeadsetPlugMonitor.a = Boolean.valueOf(b1);
       }
       return;
    }
}
