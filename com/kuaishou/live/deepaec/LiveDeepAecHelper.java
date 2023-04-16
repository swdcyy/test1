package com.kuaishou.live.deepaec.LiveDeepAecHelper;
import z1.k;
import xp5.i;
import k2b.e0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.deepaec.LiveDeepAecHelper$deepAecLibLoadTaskListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.deepaec.LiveDeepAecHelper$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.c;
import q00.b;
import fy2.b;
import java.lang.System;
import java.lang.Long;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.install.b;
import fy2.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;

public final class LiveDeepAecHelper	// class@001aea
{
    public boolean a;
    public Long b;
    public c c;
    public final p d;
    public final k e;
    public final i f;
    public final e0 g;
    public final String h;
    public final String i;

    public void LiveDeepAecHelper(k p0,i p1,e0 p2,String p3,String p4){
       a.p(p0, "commonEngineSupplier");
       a.p(p1, "liveLogPackageProvider");
       a.p(p2, "logPage");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.d = s.c(new LiveDeepAecHelper$deepAecLibLoadTaskListener$2(this));
    }
    public final LiveDeepAecHelper$a a(){
       Object obj = PatchProxy.apply(null, this, LiveDeepAecHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveDeepAecHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LiveResourceFileUtil.n(LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_DEEP_AEC_MODEL);
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, LiveDeepAecHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Dva.instance().isLoaded("tflite") && Dva.instance().isLoaded("ks_audio_process_so"))? true: false;
       return b;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveDeepAecHelper.class, "6")) {
          return;
       }
       LiveDeepAecHelper tc = this.c;
       if (tc != null) {
          tc.n(this.a());
       }
       return;
    }
    public final void e(boolean p0){
       LiveDeepAecHelper liveDeepAecH = LiveDeepAecHelper.class;
       if (PatchProxy.isSupport(liveDeepAecH) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveDeepAecH, "2")) {
          return;
       }
       if (p0) {
          this.a = true;
          this.f();
       }else {
          this.a = false;
          b uob = this.e.get();
          if (uob != null) {
             uob.q();
          }
          LiveDeepAecHelper tb = this.b;
          if (tb != null) {
             b.a.a(this.f, this.g, tb, Long.valueOf(System.currentTimeMillis()), this.h, this.i, 10);
             this.b = null;
          }
          b.P(LiveLogTag.LIVE_ARYA.appendTag("LiveDeepAecHelper"), "disable deep aec");
       }
       return;
    }
    public final void f(){
       LiveLogTag lIVE_ARYA;
       LiveDeepAecHelper liveDeepAecH = LiveDeepAecHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveDeepAecH, "3")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (!this.c()) {
          lIVE_ARYA = LiveLogTag.LIVE_ARYA;
          lIVE_ARYA.appendTag("LiveDeepAecHelper");
          b.P(lIVE_ARYA, "try enable deep aec fail, so lib not ready");
          if (!PatchProxy.applyVoid(objArray, this, liveDeepAecH, "5") && !this.c()) {
             this.d();
             lIVE_ARYA.appendTag("LiveDeepAecHelper");
             b.P(lIVE_ARYA, "start load deep aec lib");
             PluginDownloadExtension.k.s("ks_audio_process_so", 20);
             Dva uDva = Dva.instance();
             a.o(uDva, "Dva.instance\(\)");
             c uoc = uDva.getPluginInstallManager().j("ks_audio_process_so");
             this.c = uoc;
             if (uoc != null) {
                uoc.a(this.a());
             }
          }
          return;
       }else if(!this.b()){
          lIVE_ARYA = LiveLogTag.LIVE_ARYA;
          lIVE_ARYA.appendTag("LiveDeepAecHelper");
          b.P(lIVE_ARYA, "try enable deep aec fail, deep aec model not ready");
          if (!PatchProxy.applyVoid(objArray, this, liveDeepAecH, "8") && !this.b()) {
             lIVE_ARYA.appendTag("LiveDeepAecHelper");
             b.P(lIVE_ARYA, "start load deep aec model");
             LiveResourceFileUtil$LiveResourceFileType lIVE_ARYA_DE = LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_DEEP_AEC_MODEL;
             lIVE_ARYA_DE.setLiveResourceDownloadListener(new a(this));
             LiveResourceFileUtil.h(lIVE_ARYA_DE);
          }
          return;
       }else {
          b uob = this.e.get();
          if (uob != null) {
             LiveResourceFileUtil$LiveResourceFileType mFilePathInf = LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_DEEP_AEC_MODEL.mFilePathInfo;
             a.o(mFilePathInf, "LiveResourceFileType.LIV¡­P_AEC_MODEL.mFilePathInfo");
             uob.w(mFilePathInf.b());
          }
          uob = this.e.get();
          if (uob != null) {
             uob.C();
          }
          this.b = Long.valueOf(System.currentTimeMillis());
          b.a.a(this.f, this.g, null, null, this.h, this.i, 1);
          b.P(LiveLogTag.LIVE_ARYA.appendTag("LiveDeepAecHelper"), "try enable deep aec success");
          return;
       }
    }
}
