package com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader;
import com.kwai.plugin.dva.install.remote.download.b;
import java.lang.Object;
import com.kwai.plugin.dva.install.remote.download.a;
import java.lang.String;
import com.kwai.plugin.dva.install.remote.download.c$a;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader$suspendPreDownload$2;
import msd.p;
import ftd.l0;
import csd.b;
import qrd.l1;
import com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader$suspendDownload$2;
import kotlin.jvm.internal.a;
import kotlin.NotImplementedError;

public final class DefaultCoroutineDownloader implements b	// class@001370
{
    public final a a;

    public void DefaultCoroutineDownloader(){
       super();
       this.a = new a();
    }
    public Object a(String p0,int p1,String p2,String p3,String p4,c$a p5,c p6){
       Object obj;
       object oobject = p6;
       DefaultCoroutineDownloader uDefaultCoro = DefaultCoroutineDownloader.class;
       if (PatchProxy.isSupport(uDefaultCoro)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5,oobject};
          obj = PatchProxy.apply(objArray, this, uDefaultCoro, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       DefaultCoroutineDownloader$suspendPreDownload$2 osuspendPreD = new DefaultCoroutineDownloader$suspendPreDownload$2(this, p0, p1, p2, p3, p4, p5, null);
       Object obj1 = l0.g(obj, oobject);
       if (obj1 == b.h()) {
          return obj1;
       }else {
          return l1.a;
       }
    }
    public Object b(String p0,int p1,String p2,String p3,String p4,c$a p5,c p6){
       Object obj;
       object oobject = p6;
       DefaultCoroutineDownloader uDefaultCoro = DefaultCoroutineDownloader.class;
       if (PatchProxy.isSupport(uDefaultCoro)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5,oobject};
          obj = PatchProxy.apply(objArray, this, uDefaultCoro, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       DefaultCoroutineDownloader$suspendDownload$2 osuspendDown = new DefaultCoroutineDownloader$suspendDownload$2(this, p0, p1, p2, p3, p4, p5, null);
       Object obj1 = l0.g(obj, oobject);
       if (obj1 == b.h()) {
          return obj1;
       }else {
          return l1.a;
       }
    }
    public void c(String p0,int p1,String p2,String p3,String p4,c$a p5){
       if (PatchProxy.isSupport(DefaultCoroutineDownloader.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, DefaultCoroutineDownloader.class, "3")) {
             return;
          }
       }
       a.p(p0, "pluginId");
       a.p(p2, "url");
       a.p(p3, "dist");
       throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
    public void d(String p0,int p1,String p2,String p3,String p4,c$a p5){
       if (PatchProxy.isSupport(DefaultCoroutineDownloader.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, DefaultCoroutineDownloader.class, "4")) {
             return;
          }
       }
       a.p(p0, "pluginId");
       a.p(p2, "url");
       a.p(p3, "dist");
       throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
