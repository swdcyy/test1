package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$b;
import p80.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import s66.a;
import com.kwai.yoda.Yoda;
import kotlin.jvm.internal.a;
import my7.g;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Boolean;

public final class KsWebViewInitModule$b implements a	// class@0019d5
{

    public void KsWebViewInitModule$b(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$b.class, "4")) {
          return;
       }
       a.d("kw_core_load_start", String.valueOf(System.currentTimeMillis()));
       Yoda yoda = Yoda.get();
       a.o(yoda, "Yoda.get\(\)");
       yoda.getKsWebViewInitListener().a();
       Iterator iterator = KsWebViewInitModule.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$b.class, "2")) {
          return;
       }
       a.d("kw_preload_end", String.valueOf(System.currentTimeMillis()));
       a.d("kw_preload_status", "true");
       Yoda yoda = Yoda.get();
       a.o(yoda, "Yoda.get\(\)");
       yoda.getKsWebViewInitListener().b();
       Iterator iterator = KsWebViewInitModule.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$b.class, "3")) {
          return;
       }
       a.d("kw_install_downloaded", String.valueOf(System.currentTimeMillis()));
       a.d("kw_install_download_status", "true");
       Yoda yoda = Yoda.get();
       a.o(yoda, "Yoda.get\(\)");
       yoda.getKsWebViewInitListener().c();
       Iterator iterator = KsWebViewInitModule.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().c();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$b.class, "1")) {
          return;
       }
       a.d("kw_preload_start", String.valueOf(System.currentTimeMillis()));
       Yoda yoda = Yoda.get();
       a.o(yoda, "Yoda.get\(\)");
       yoda.getKsWebViewInitListener().d();
       Iterator iterator = KsWebViewInitModule.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInitModule$b.class, "6")) {
          return;
       }
       a.p(p0, "error");
       a.d("kw_core_load_fail", String.valueOf(System.currentTimeMillis()));
       Yoda yoda = Yoda.get();
       a.o(yoda, "Yoda.get\(\)");
       yoda.getKsWebViewInitListener().e(p0);
       Iterator iterator = KsWebViewInitModule.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0);
       }
       return;
    }
    public void onCoreLoadFinished(boolean p0){
       KsWebViewInitModule$b uob = KsWebViewInitModule$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       a.d("kw_core_loaded", String.valueOf(System.currentTimeMillis()));
       a.d("kw_core_load_status", "true");
       Yoda yoda = Yoda.get();
       a.o(yoda, "Yoda.get\(\)");
       yoda.getKsWebViewInitListener().onCoreLoadFinished(p0);
       Iterator iterator = KsWebViewInitModule.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().onCoreLoadFinished(p0);
       }
       return;
    }
}
