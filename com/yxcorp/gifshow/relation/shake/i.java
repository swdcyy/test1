package com.yxcorp.gifshow.relation.shake.i;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import java.lang.String;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xbc.c;
import java.util.Objects;
import xbc.a;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.shake.g;
import erd.r;
import com.yxcorp.gifshow.relation.shake.e;
import erd.o;
import com.yxcorp.gifshow.relation.shake.h;
import com.yxcorp.gifshow.relation.shake.f;
import com.yxcorp.gifshow.relation.shake.d;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;

public class i implements ActivityContext$b	// class@001310
{

    public void i(){
       super();
    }
    public static boolean b(String p0){
       int i = (Build$VERSION.SDK_INT < 23 && RomUtils.w())? 1: 0;
       return (i ^ 1);
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "2")) {
          return;
       }
       a a = c.a;
       if (a != null) {
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, a.class, "3")) {
             a d = a.d;
             if (d != null) {
                try{
                   d.unregisterListener(a);
                }catch(java.lang.Exception e0){
                   Log.n("ShakeFriends", "Unexpected exception on stop "+Log.f(e0));
                }
             }
          }
       }
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       t.just("").subscribeOn(d.c).filter(g.b).map(e.b).filter(h.b).map(f.b).observeOn(d.a).subscribe(d.b, e.b);
       return;
    }
}
