package com.yxcorp.gifshow.relation.shake.d;
import erd.g;
import java.lang.Object;
import xbc.a;
import o56.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class d implements g	// class@0019d8
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       Application b = a.B;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(b, p0, a.class, "2")) {
       }else {
          try{
             SensorManager systemServic = b.getSystemService("sensor");
             p0.d = systemServic;
             if (systemServic != null) {
                Sensor defaultSenso = systemServic.getDefaultSensor(1);
                if (defaultSenso != null) {
                   p0.d.registerListener(p0, defaultSenso, 1);
                }
             }
          }catch(java.lang.Exception e4){
             Log.n("ShakeFriends", "Unexpected exception on start "+Log.f(e4));
          }
       }
    }
}
