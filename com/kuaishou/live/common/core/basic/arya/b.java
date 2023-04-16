package com.kuaishou.live.common.core.basic.arya.b;
import java.lang.Object;
import i91.e;
import com.kuaishou.live.common.core.basic.arya.b$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.plugin.dva.Dva;
import w51.a;
import com.yxcorp.utility.SystemUtil;
import xf6.l;
import android.content.Context;
import brd.t;
import i91.b;
import io.reactivex.g;
import t45.d;
import brd.z;
import i91.d;
import erd.g;
import i91.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.lang.Throwable;
import com.kuaishou.live.common.core.basic.arya.a;
import com.kwai.video.krtc.AryaInitConfig$AryaSoLoader;
import com.kwai.video.krtc.AryaInitConfig;

public class b	// class@000e74
{
    public boolean a;

    public void b(){
       super();
    }
    public void b(e p0){
       super();
    }
    public static b b(){
       return b$a.a;
    }
    public boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.g();
       Object obj1 = PatchProxy.apply(null, this, uob, "11");
       b = (obj1 != patchProxyRe)? obj1.booleanValue(): Dva.instance().isLoaded("krtc_so");
       return b;
    }
    public String c(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, a.class, "102");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(SystemUtil.K() && l.c("key_enable__delete_arya_so", false)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return "MockSoLoadFailed";
       }else {
          return "krtc_so";
       }
    }
    public synchronized t d(boolean p0,boolean p1,Context p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.e(p0, p1, p2, this.c());
    }
    public synchronized final t e(boolean p0,boolean p1,Context p2,String p3){
       b obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, p3, this, b.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.a()) {
          return t.just(Boolean.TRUE);
       }else {
          obj = new b(this, p0, p2, p3, p1);
          return t.create(v6).subscribeOn(d.c).observeOn(d.a).doOnSubscribe(new d(p0, p3)).doOnError(new c(p3));
       }
    }
    public boolean f(){
       boolean b;
       String obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.Z(LiveLogTag.LIVE_ARYA_SO_LOAD, "loadAryaEnvSync begin");
       if (this.a()) {
          return true;
       }
       obj = this.c();
       PluginDownloadExtension k = PluginDownloadExtension.k;
       k.s(obj, 40);
       k.a(obj);
       Dva.instance().getPluginInstallManager().j(obj).c();
       b = Dva.instance().isLoaded(obj);
       b.d0(LiveLogTag.LIVE_ARYA_SO_LOAD, "loadAryaEnvSync success", "pluginName", obj, "result", Boolean.valueOf(b));
       return b;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       AryaInitConfig.setSoLoader(a.a);
       b.Z(LiveLogTag.LIVE_ARYA_SO_LOAD, "setSoLoader");
       this.a = true;
       return;
    }
}
