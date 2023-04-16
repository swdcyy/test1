package com.kuaishou.android.security.base.util.i;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import oe6.g;
import com.kwai.robust.PatchProxyResult;

public class i	// class@000f20
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;

    public void i(Context p0){
       super();
       SharedPreferences sharedPrefer = o.c(p0, "ksspcfp", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public void a(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "3")) {
          return;
       }
       this.b.putBoolean("ipr", p0);
       g.b(this.b);
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("ipr", false);
    }
    public void b(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "1")) {
          return;
       }
       this.b.putBoolean("ipsw", p0);
       g.b(this.b);
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("ipsw", true);
    }
    public void c(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "5")) {
          return;
       }
       this.b.putBoolean("spsw", p0);
       g.b(this.b);
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("spsw", true);
    }
}
