package com.yxcorp.gifshow.camerasdk.j$g;
import zi9.f$a;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import com.kwai.video.westeros.WesterosPlugin;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi9.q1;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.devicepersona.config.DevicePersonaConfig;
import com.kwai.video.devicepersona.config.DeviceConfigManager;
import com.kwai.video.devicepersona.strategy.DeviceStrategyConfigs;
import java.lang.StringBuilder;
import com.kwai.video.westeros.mmuplugin.MmuPlugin;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import qi9.d1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.westeros.v2.ycnn.YcnnSoLoader;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin;
import com.kwai.video.westeros.v2.ykitplugin.YKitSoLoader;
import com.kwai.video.westeros.v2.yar.YarPlugin;
import com.kwai.video.westeros.aiedit.AIEditPlugin;
import com.yxcorp.gifshow.camerasdk.r;
import qi9.c2;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$uploadStatsCallBack;
import qi9.b2;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$postReportCallback;
import qi9.x1;
import com.kwai.video.westeros.mmuplugin.MmuPlugin$UploadStatsCallBack;
import qi9.y1;
import com.kwai.video.westeros.mmuplugin.MmuPlugin$postReportCallback;
import qi9.w1;
import com.kwai.video.westeros.aiedit.AIEditPlugin$uploadStatsCallBack;
import qi9.a2;
import com.kwai.video.westeros.v2.yar.YarPlugin$uploadStatsCallBack;
import qi9.z1;
import com.kwai.video.westeros.v2.yar.YarPlugin$postReportCallback;
import qi9.e2;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin$uploadStatsCallBack;
import qi9.d2;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin$postReportCallback;
import com.kwai.video.westeros.Westeros;
import com.kwai.video.westeros.veplugin.VEPlugin;
import qi9.k0;
import java.lang.Runnable;
import ekd.k1;
import qi9.l0;
import qi9.m0;

public class j$g implements f$a	// class@001020
{
    public final j a;

    public void j$g(j p0){
       this.a = p0;
       super();
    }
    public void a(WesterosPlugin p0){
       String str2;
       Object[] objArray2;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, j$g.class, str)) {
          return;
       }
       j$g ta = this.a;
       j a = ta.a;
       if (a != null && ta.z == null) {
          int i = 0;
          Object[] objArray = new Object[i];
          q1.C().w("CameraSDK", "plugin loaded plugin", objArray);
          ta = this.a;
          Objects.requireNonNull(ta);
          j oj = PatchProxy.apply(null, ta, j.class, str);
          if (oj != PatchProxyResult.class) {
          }else if(ta.D0 == null){
             DevicePersonaConfig config = DeviceConfigManager.getInstance().getConfig();
             if (config != null) {
                DeviceStrategyConfigs deviceStrate = config.getDeviceStrategyConfigs();
                if (deviceStrate != null && ta.E0 == null) {
                   ta.E0 = deviceStrate.getYKitStrategyConfigsToJson();
                }
             }
             ta.D0 = config;
          }
          oj = ta.D0;
          if (oj != null) {
             if (oj.getDeviceStrategyConfigs() != null) {
                Object[] objArray1 = new Object[i];
                q1.C().w("CameraSDK", "[DevicePersona]YkitStrategyConfigs:"+this.a.E0, objArray1);
             }else {
                objArray = new Object[i];
                q1.C().t("CameraSDK", "[DevicePersona]do not get DeviceStrategyConfigs", objArray);
             }
          }else {
             objArray = new Object[i];
             q1.C().t("CameraSDK", "[DevicePersona]do not get DevicePersonaConfig", objArray);
          }
          v0 = p0 instanceof MmuPlugin;
          if (ta) {
             if (this.a.E0 != null) {
                p0.setDevicePortraitInfo(this.a.E0);
             }
          }else {
             String str1 = "setVP ";
             if (p0 instanceof YcnnPlugin) {
                YcnnPlugin ycnnPlugin1 = p0;
                ycnnPlugin1.setAttrLocalPath(MagicEmojiResourceHelper.l());
                if (this.a.E0 != null) {
                   ycnnPlugin1.setDevicePortraitInfo(this.a.E0);
                }
                str2 = d1.a();
                objArray2 = new Object[i];
                q1.C().s("CameraSDK", str1+(TextUtils.x(str2) ^ 0x01), objArray2);
                if (!TextUtils.x(str2)) {
                   ycnnPlugin1.setVisionPortraitInfo(str2, null);
                }
                if (this.a.A != null) {
                   return;
                }else {
                   YcnnSoLoader.loadYcnnExtraSo();
                }
             }else if(p0 instanceof YKitPlugin){
                YKitPlugin yKitPlugin1 = p0;
                yKitPlugin1.setAttrLocalPath(MagicEmojiResourceHelper.l());
                if (this.a.E0 != null) {
                   yKitPlugin1.setDevicePortraitInfo(this.a.E0);
                }
                str2 = d1.a();
                objArray2 = new Object[i];
                q1.C().s("CameraSDK", str1+(TextUtils.x(str2) ^ 0x01), objArray2);
                if (!TextUtils.x(str2)) {
                   yKitPlugin1.setVisionPortraitInfo(str2, null);
                }
                if (this.a.A != null) {
                   return;
                }else {
                   YKitSoLoader.loadYKitExtraSo();
                }
             }else if(p0 instanceof YarPlugin){
                if (this.a.E0 != null) {
                   p0.setDevicePortraitInfo(this.a.E0);
                }
             }else if(p0 instanceof AIEditPlugin && this.a.E0 != null){
                p0.setDevicePortraitInfo(this.a.E0);
             }
          }
          j z0 = this.a.z0;
          Objects.requireNonNull(z0);
          if (!PatchProxy.applyVoidOneRefs(p0, z0, r.class, str)) {
             if (p0 instanceof YcnnPlugin) {
                YcnnPlugin ycnnPlugin = p0;
                ycnnPlugin.setUploadStatsCallBack(new c2(z0), z0.a);
                ycnnPlugin.setPostReportCallBack(new b2(z0, p0));
             }else if(ta){
                MmuPlugin mmuPlugin = p0;
                mmuPlugin.setUploadStatsCallBack(new x1(z0), z0.a);
                mmuPlugin.setPostReportCallBack(new y1(z0, p0));
             }else if(p0 instanceof AIEditPlugin){
                p0.setUploadStatsCallBack(new w1(z0), z0.a);
             }else if(p0 instanceof YarPlugin){
                YarPlugin yarPlugin = p0;
                yarPlugin.setUploadStatsCallBack(new a2(z0), z0.a);
                yarPlugin.setPostReportCallBack(new z1(z0, p0));
             }else if(p0 instanceof YKitPlugin){
                YKitPlugin yKitPlugin = p0;
                yKitPlugin.setUploadStatsCallBack(new e2(z0), z0.a);
                yKitPlugin.setPostReportCallBack(new d2(z0, p0));
             }
          }
          if (this.a.A != null) {
             return;
          }else {
             a.applyPlugin(p0);
             if (p0 instanceof VEPlugin) {
                j t0 = this.a.t0;
                if (t0 != null) {
                   t0.a(p0);
                }
             }
             k1.o(new k0(this));
             if (p0 instanceof YcnnPlugin) {
                k1.o(new l0(this));
             }
             if (!this.a.isRecording() && p0.getClass() == YKitPlugin.class) {
                k1.o(new m0(this));
             }
          }
       }
    label_0245 :
       return;
    }
}
