package com.kuaishou.merchant.anim.KwaishopAnimationModule$h;
import la4.b;
import com.kuaishou.merchant.anim.KwaishopAnimationModule;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import wr3.a;
import android.content.Context;
import java.util.List;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class KwaishopAnimationModule$h implements b	// class@0014ea
{
    public final KwaishopAnimationModule b;
    public final ArrayList c;

    public void KwaishopAnimationModule$h(KwaishopAnimationModule p0,ArrayList p1){
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
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$h.class, "1")) {
          return;
       }
       d.a(0x548e73dd).P9(this.b.reactContext, this.c);
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
