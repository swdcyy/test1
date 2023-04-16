package bib.g;
import java.lang.Runnable;
import bib.k;
import android.content.Context;
import java.lang.Object;
import java.util.Objects;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import bib.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import com.kwai.camerasdk.Daenerys;
import android.app.Application;
import o56.a;
import com.kwai.camerasdk.models.DaenerysConfig;
import com.kwai.camerasdk.models.DaenerysConfig$b;
import com.kwai.camerasdk.DaenerysConfigBuilder;
import com.kwai.camerasdk.models.Business;
import com.kwai.camerasdk.models.GLSyncTestResult;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.Boolean;
import com.kwai.camerasdk.log.Log;
import com.kwai.camerasdk.stats.StatsHolder;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import bib.h;
import com.kwai.camerasdk.stats.StatsListener;
import com.kwai.camerasdk.models.DaenerysCaptureConfig;
import java.lang.Number;
import com.kwai.social.startup.reminder.model.CallVideoResolution;
import java.lang.Math;
import com.kwai.camerasdk.models.DaenerysCaptureConfig$b;
import com.kwai.camerasdk.models.CameraApiVersion;
import bib.i;
import com.kwai.camerasdk.videoCapture.CameraController$g;
import com.kwai.camerasdk.videoCapture.CameraController;
import b65.b;
import bib.j;
import com.kwai.camerasdk.models.DataExtractType;
import com.kwai.camerasdk.models.GlProcessorGroup;
import l65.a;
import dib.e;
import lw5.b;

public final class g implements Runnable	// class@0003d5
{
    public final k b;
    public final Context c;

    public void g(k p0,Context p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int b;
       int i2;
       int i3;
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       IMConfigUtil iMConfigUtil = IMConfigUtil.class;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(tc, tb, k.class, str)) {
       }else {
          c.g("IMRTCVideoWrapper", "init");
          Application uApplication = a.b();
          DaenerysConfig uDaenerysCon = PatchProxy.apply(null, null, uob, "2");
          if (uDaenerysCon != patchProxyRe) {
          }else {
             DaenerysConfig$b uob2 = DaenerysConfigBuilder.defaultBuilder();
             uob2.H(true);
             uob2.g(true);
             uob2.w(true);
             uob2.d(b.a);
             uob2.s(GLSyncTestResult.kGLSyncTestPassed);
             uDaenerysCon = uob2.build();
          }
          Daenerys uDaenerys = new Daenerys(uApplication, uDaenerysCon);
          tb.b = uDaenerys;
          Daenerys uDaenerys1 = Daenerys.class;
          if (!PatchProxy.isSupport(uDaenerys1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, uDaenerys, uDaenerys1, "64")) {
             if (uDaenerys.k != null) {
                Log.i("Daenerys", "set is IM Video Call business failed");
             }else {
                uDaenerys.nativeSetIsImVideoCallBusiness(uDaenerys.c, true);
             }
          }
          StatsHolder statsHolder = tb.b.q();
          CallVideoResolution obj = PatchProxy.apply(null, null, iMConfigUtil, "31");
          int i = 0;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             IMConfigInfo iMConfigInfo = IMConfigUtil.i.r();
             iMConfigInfo = (iMConfigInfo != null)? iMConfigInfo.mEnableImRtcCameraPerfReport: false;
          }
          statsHolder.enablePerSecondUploadJsonStats(b);
          tb.b.M(new h(tb));
          GeneratedMessageLite generatedMes = PatchProxy.apply(null, null, uob, str);
          if (generatedMes != patchProxyRe) {
          }else {
             CallVideoResolution obj1 = PatchProxy.apply(null, null, uob, "4");
             int i1 = 720;
             if (obj1 != patchProxyRe) {
                i1 = obj1.intValue();
             }else {
                obj1 = IMConfigUtil.m();
                String str1 = (obj1 == null)? 720: obj1.mWidth;
                if (str1 > null) {
                   i1 = str1;
                }
             }
             obj1 = PatchProxy.apply(null, null, uob, "5");
             b = 1280;
             if (obj1 != patchProxyRe) {
                b = obj1.intValue();
             }else {
                obj1 = IMConfigUtil.m();
                i2 = (obj1 == null)? 1280: obj1.mHeight;
                if (i2 > null) {
                   obj = i2;
                }
             }
             i2 = Math.max(i1, b);
             DaenerysCaptureConfig$b uob1 = DaenerysConfigBuilder.defaultCaptureConfigBuilder();
             uob1.a(CameraApiVersion.kAndroidCameraAuto);
             uob1.F(i1);
             uob1.D(b);
             Object obj2 = PatchProxy.apply(null, null, uob, "6");
             if (obj2 != patchProxyRe) {
                i3 = obj2.intValue();
             }else {
                IMConfigInfo obj3 = PatchProxy.apply(null, null, iMConfigUtil, "29");
                if (obj3 != patchProxyRe) {
                   i = obj3.intValue();
                }else {
                   obj3 = IMConfigUtil.i.r();
                   if (obj3 != null) {
                      i = obj3.mCallVideoFps;
                   }
                }
                if (i > null) {
                   i3 = i;
                }else {
                   i3 = 15;
                }
             }
             uob1.H(i3);
             uob1.E(i2);
             uob1.n(true);
             generatedMes = uob1.build();
          }
          CameraController uCameraContr = b.a(tc, generatedMes, new i(tb));
          tb.c = uCameraContr;
          tb.b.A(uCameraContr);
          j oj = new j(tb, DataExtractType.kDataExtractTypeI420);
          tb.d = oj;
          tb.b.b(oj, GlProcessorGroup.kMainGroup);
          tb.e = new e(tc, tb.b);
          tb.g.init();
       }
       return;
    }
}
