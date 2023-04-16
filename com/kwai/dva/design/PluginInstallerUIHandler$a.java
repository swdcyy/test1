package com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler$a$a;
import nsd.u;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import com.kwai.dva.design.PluginInstallerUIHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vi5.a$a;
import vi5.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import com.kwai.dva.design.PluginInstallerUIHandler$d$a;
import vi5.c;
import java.util.Objects;
import vi5.j;
import yi5.a;

public final class PluginInstallerUIHandler$a	// class@000d05
{
    public final WeakReference a;
    public PluginInstallerUIHandler$d b;
    public c c;
    public a d;
    public a e;
    public long f;
    public j g;
    public static final PluginInstallerUIHandler$a$a h;

    static {
       PluginInstallerUIHandler$a.h = new PluginInstallerUIHandler$a$a(null);
    }
    public void PluginInstallerUIHandler$a(Activity p0){
       a.p(p0, "activity");
       super();
       this.f = 100;
       this.a = new WeakReference(p0);
    }
    public final PluginInstallerUIHandler a(){
       a uoa;
       PluginInstallerUIHandler$d uod;
       c p0;
       Object[] objArray1;
       Object[] objArray = null;
       PluginInstallerUIHandler$a obj = PatchProxy.apply(objArray, this, PluginInstallerUIHandler$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          uoa = new a$a().a();
       }
       PluginInstallerUIHandler$a uoa1 = uoa;
       obj = this.b;
       if (obj == null) {
          uod = PluginInstallerUIHandler$d.a.a();
       }
       PluginInstallerUIHandler$a uoa2 = uod;
       obj = this.c;
       if (obj == null) {
          p0 = c.P0;
       }
       PluginInstallerUIHandler$a uoa3 = p0;
       obj = this.e;
       if (obj == null) {
          uoa = PluginInstallerUIHandler.C;
          if (uoa == null) {
             a.S("sUIReporter");
             objArray1 = objArray;
          label_0040 :
             Objects.requireNonNull(this.g, "converter can\'t be null.");
             PluginInstallerUIHandler$a tg = this.g;
             a.m(tg);
             a.o(uoa3, "ui");
             PluginInstallerUIHandler pluginInstal = new PluginInstallerUIHandler(this.a, tg, uoa2, uoa3, uoa1, objArray1, this.f, null);
             return uoa;
          }
       }
       objArray1 = uoa;
       goto label_0040 ;
    }
    public final PluginInstallerUIHandler$a b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginInstallerUIHandler$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "configInfo");
       this.d = p0;
       return this;
    }
    public final PluginInstallerUIHandler$a c(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginInstallerUIHandler$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "installerUI");
       this.c = p0;
       return this;
    }
    public final PluginInstallerUIHandler$a d(PluginInstallerUIHandler$d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginInstallerUIHandler$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "installerListener");
       this.b = p0;
       return this;
    }
    public final PluginInstallerUIHandler$a e(long p0){
       this.f = p0;
       return this;
    }
    public final PluginInstallerUIHandler$a f(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginInstallerUIHandler$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "converter");
       this.g = p0;
       return this;
    }
}
