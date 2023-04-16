package com.kuaishou.merchant.anim.KwaishopAnimationModule$d;
import la4.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$d$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$d$b;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class KwaishopAnimationModule$d implements b	// class@0014e2
{
    public final View b;
    public final String c;
    public final String d;

    public void KwaishopAnimationModule$d(View p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$d.class, "1")) {
          return;
       }
       if (!this.b.isAttachedToWindow()) {
          return;
       }
       if (this.c != null) {
          k1.o(new KwaishopAnimationModule$d$a(this));
       }else {
          k1.o(new KwaishopAnimationModule$d$b(this));
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
