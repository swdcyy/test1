package com.kuaishou.merchant.anim.KwaishopAnimationModule$j;
import la4.b;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$j$a;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class KwaishopAnimationModule$j implements b	// class@0014ee
{
    public final ArrayList b;
    public final double c;

    public void KwaishopAnimationModule$j(ArrayList p0,double p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$j.class, "1")) {
          return;
       }
       k1.o(new KwaishopAnimationModule$j$a(this));
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
