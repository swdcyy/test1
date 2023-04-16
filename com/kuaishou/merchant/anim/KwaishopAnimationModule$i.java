package com.kuaishou.merchant.anim.KwaishopAnimationModule$i;
import la4.b;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$i$a;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class KwaishopAnimationModule$i implements b	// class@0014ec
{
    public final double b;

    public void KwaishopAnimationModule$i(double p0){
       this.b = p0;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$i.class, "1")) {
          return;
       }
       k1.o(new KwaishopAnimationModule$i$a(this));
       return;
    }
    public void e(){
       a.a(this);
    }
    public void f(boolean p0){
       h.d(this, p0);
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       a.c(this);
    }
    public void p(){
       h.c(this);
    }
}
