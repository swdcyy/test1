package com.kwai.feature.api.feed.tag.plugin.b;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import jp5.a;
import java.lang.Object;
import java.lang.Exception;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class b implements PluginInstallerUIHandler$d	// class@000f73
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void a(Exception p0){
       h.f(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.success();
       return;
    }
    public void e(){
       h.e(this);
    }
    public void f(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!p0) {
          this.b.a();
       }
       return;
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       h.g(this);
    }
    public void p(){
       h.c(this);
    }
}
