package com.yxcorp.gifshow.media.util.g$a;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.aicut.ui.loading.a;
import android.content.Context;
import com.kwai.ksvideorendersdk.EditorSDKSoLoader$Handler;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Object;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import android.util.Pair;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.media.model.WatermarkEncodeConfig;
import com.yxcorp.gifshow.media.util.g;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AdaptiveX264Config;

public class g$a	// class@001d24
{
    public static final int a;

    static {
       EditorSdk2Utils.initJni(a.b(), a.a, null);
    }
    public void g$a(){
       super();
    }
    public static EditorSdk2$ExportOptions a(EncodeConfig p0,Pair p1){
       EditorSdk2$ExportOptions obj = PatchProxy.applyTwoRefs(p0, p1, null, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = EditorSdk2Utils.createDefaultExportOptions();
       obj.setX264Params(p0.getX264Params());
       obj.setWidth(p1.first.intValue());
       obj.setHeight(p1.second.intValue());
       obj.setVideoFrameRate(EditorSdk2Utils.createRational((int)g.d().o(), 1));
       String audioProfile = p0.getAudioProfile();
       if (!TextUtils.isEmpty(audioProfile)) {
          obj.setAudioProfile(audioProfile);
       }
       int audioBitrate = p0.getAudioBitrate();
       if (audioBitrate > 0) {
          obj.setAudioBitrate((long)audioBitrate);
       }
       audioBitrate = p0.getAudioCutoff();
       if (audioBitrate >= 0) {
          obj.setAudioCutoff(audioBitrate);
       }
       obj.setAndroidExportTryEnablePbo(p0.getTryUsePbo());
       obj.setEnableAdaptiveX264Params(p0.getEnableAdaptiveX264Params());
       obj.setAdaptiveX264Config(new EditorSdk2$AdaptiveX264Config());
       obj.adaptiveX264Config().setInterThreshold(p0.getInterThreshold());
       obj.adaptiveX264Config().setExtraX264Params(p0.getExtraX264Params());
       return obj;
    }
}
