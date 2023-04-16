package com.kuaishou.merchant.anim.KwaishopAnimationModule$g;
import la4.b;
import android.view.View;
import java.util.HashMap;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$g$a;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class KwaishopAnimationModule$g implements b	// class@0014e9
{
    public final View b;
    public final HashMap c;
    public final String d;
    public final String e;
    public final int f;
    public final Integer g;
    public final boolean h;

    public void KwaishopAnimationModule$g(View p0,HashMap p1,String p2,String p3,int p4,Integer p5,boolean p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$g.class, "1")) {
          return;
       }
       KwaishopAnimationModule$g tb = this.b;
       if (tb != null) {
          if (!tb.isAttachedToWindow()) {
             return;
          }else {
             k1.o(new KwaishopAnimationModule$g$a(this));
          }
       }
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
