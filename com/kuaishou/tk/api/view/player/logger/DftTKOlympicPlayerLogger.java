package com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger;
import xx4.a;
import com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger$a;
import nsd.u;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger$attachBusinessLog$1;
import msd.a;
import org.json.JSONObject;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger$onLogVes$1;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.cache.AcCallBackInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.tk.api.view.player.logger.DftTKOlympicPlayerLogger$safeRun$1;
import com.kuaishou.tk.api.view.player.TKPlayerRunSafeThread;

public final class DftTKOlympicPlayerLogger implements a	// class@000fbb
{
    public JSONObject a;
    public ClientEvent$UrlPackage b;
    public final l c;
    public static final DftTKOlympicPlayerLogger$a d;

    static {
       DftTKOlympicPlayerLogger.d = new DftTKOlympicPlayerLogger$a(null);
    }
    public void DftTKOlympicPlayerLogger(l p0){
       a.p(p0, "logCatcher");
       super();
       this.c = p0;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DftTKOlympicPlayerLogger.class, "1")) {
          return;
       }
       a.p(p0, "logJson");
       this.f(new DftTKOlympicPlayerLogger$attachBusinessLog$1(this, p0));
       return;
    }
    public JSONObject b(){
       return this.a;
    }
    public void c(KwaiPlayerResultQos p0,long p1,String p2,String p3,int p4){
       DftTKOlympicPlayerLogger uDftTKOlympi = DftTKOlympicPlayerLogger.class;
       if (PatchProxy.isSupport(uDftTKOlympi)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uDftTKOlympi, "4")) {
             return;
          }
       }
       a.p(p2, "bizType");
       a.p(p3, "uri");
       if (p0 != null && this.a != null) {
          DftTKOlympicPlayerLogger$onLogVes$1 oonLogVes$1 = new DftTKOlympicPlayerLogger$onLogVes$1(this, p0, p1, p2, p3, p4);
          this.f(uDftTKOlympi);
       }
       return;
    }
    public void d(IKwaiMediaPlayer p0,AcCallBackInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DftTKOlympicPlayerLogger.class, "3")) {
          return;
       }
       a.p(p1, "info");
       return;
    }
    public void e(ClientEvent$UrlPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DftTKOlympicPlayerLogger.class, "2")) {
          return;
       }
       if (p0 == null) {
          p0 = u1.k();
          if (p0 == null) {
             p0 = new ClientEvent$UrlPackage();
          }
       }
       this.b = p0;
       return;
    }
    public final void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DftTKOlympicPlayerLogger.class, "10")) {
          return;
       }
       TKPlayerRunSafeThread.b(new DftTKOlympicPlayerLogger$safeRun$1(p0), this.c);
       return;
    }
}
