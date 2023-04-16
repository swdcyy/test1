package com.kuaishou.merchant.anim.KwaishopAnimationModule$e$a;
import la4.b;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$e;
import android.view.View;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$e$a$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$e$a$b;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class KwaishopAnimationModule$e$a implements b	// class@0014e5
{
    public final KwaishopAnimationModule$e b;
    public final View c;

    public void KwaishopAnimationModule$e$a(KwaishopAnimationModule$e p0,View p1){
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
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$e$a.class, "1")) {
          return;
       }
       KwaishopAnimationModule$e$a tc = this.c;
       if (tc != null) {
          if (!tc.isAttachedToWindow()) {
             return;
          }else if(this.b.c != null){
             k1.o(new KwaishopAnimationModule$e$a$a(this));
          }else {
             k1.o(new KwaishopAnimationModule$e$a$b(this));
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
