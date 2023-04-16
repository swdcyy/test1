package com.kwai.dva.design.PluginInstallerUIHandler$c;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public abstract class PluginInstallerUIHandler$c	// class@000d07
{
    public boolean a;

    public void PluginInstallerUIHandler$c(){
       super();
       this.a = true;
    }
    public final void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerUIHandler$c.class, "4")) {
          return;
       }
       if (this.a != null) {
          this.b(p0);
       }
       return;
    }
    public abstract void b(Exception p0);
    public abstract void c(int p0);
    public abstract void d();
    public abstract void e();
    public final void f(int p0){
       PluginInstallerUIHandler$c uoc = PluginInstallerUIHandler$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (this.a != null) {
          this.c(p0);
       }
       return;
    }
    public final void g(boolean p0){
       this.a = p0;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$c.class, "1")) {
          return;
       }
       if (this.a != null) {
          this.d();
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$c.class, "3")) {
          return;
       }
       if (this.a != null) {
          this.e();
       }
       return;
    }
}
