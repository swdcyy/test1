package com.kuaishou.android.security.base.util.h;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import oe6.g;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class h	// class@000f1f
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;

    public void h(Context p0){
       super();
       SharedPreferences sharedPrefer = o.c(p0, "kseuscfg", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public void a(float p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oh, "3")) {
          return;
       }
       this.b.putFloat("sgmaineusam", p0);
       g.b(this.b);
       return;
    }
    public void a(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "1")) {
          return;
       }
       this.b.putBoolean("sgmaineusw", p0);
       g.b(this.b);
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("sgmaineusw", false);
    }
    public float b(){
       Object obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.a.getFloat("sgmaineusam", 0);
    }
}
