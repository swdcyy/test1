package com.kwai.framework.init.a;
import bl0.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import android.app.Activity;
import b76.a;
import wkd.b;
import a76.d;
import com.kwai.framework.activitycontext.ActivityContext;

public abstract class a extends c	// class@000b64
{
    public boolean o;
    public static boolean p;

    public void a(){
       super();
       this.o = false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (this.getClass() == p0.getClass()) {
          b = true;
       }
       return b;
    }
    public abstract int f0();
    public boolean g0(){
       return a.p;
    }
    public void h0(){
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getClass().hashCode();
    }
    public void i0(){
    }
    public void j0(Activity p0){
    }
    public void k0(a p0){
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       int i = -2118755940;
       if (b.a(i).r(this.getClass(), "onForeground").booleanValue() && ActivityContext.g().h()) {
          this.i0();
       }
       if (b.a(i).r(this.getClass(), "onLaunchFinish").booleanValue()) {
          this.k0(a.a);
       }
       return;
    }
    public abstract void n();
}
