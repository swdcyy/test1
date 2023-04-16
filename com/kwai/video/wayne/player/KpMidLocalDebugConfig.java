package com.kwai.video.wayne.player.KpMidLocalDebugConfig;
import com.kwai.video.wayne.player.InjectInitor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.wayne.player.util.LocalDebugConfigPreference;
import java.lang.Boolean;
import java.lang.Integer;

public class KpMidLocalDebugConfig	// class@000ca6
{

    static {
       InjectInitor.getInstance().initRun();
    }
    public void KpMidLocalDebugConfig(){
       super();
    }
    public static int getKwaivppBits(){
       Object obj = PatchProxy.apply(null, null, KpMidLocalDebugConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LocalDebugConfigPreference.getInt("key_kwaivpp_bits", 0);
    }
    public static int getLiveNormalNativeCacheSwitch(){
       Object obj = PatchProxy.apply(null, null, KpMidLocalDebugConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LocalDebugConfigPreference.getInt("live_normal_native_cache_switch", 0);
    }
    public static int getVodHwDecode(){
       Object obj = PatchProxy.apply(null, null, KpMidLocalDebugConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LocalDebugConfigPreference.getInt("vod_hw_decode", 0);
    }
    public static int getVodP2spSwitch(){
       Object obj = PatchProxy.apply(null, null, KpMidLocalDebugConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LocalDebugConfigPreference.getInt("vod_p2sp_switch", 0);
    }
    public static boolean isEnableKwaivppHwDecodeOes(){
       Object obj = PatchProxy.apply(null, null, KpMidLocalDebugConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LocalDebugConfigPreference.getBoolean("key_enable_kwaivpp_hw_decode_oes", true);
    }
    public static void setEnableHodorDebugInfo(boolean p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, kpMidLocalDe, "5")) {
          return;
       }
       LocalDebugConfigPreference.putBoolean("key_enable_hodor_info", p0);
       return;
    }
    public static void setEnableKwaivppDecodeOes(boolean p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, kpMidLocalDe, "10")) {
          return;
       }
       LocalDebugConfigPreference.putBoolean("key_enable_kwaivpp_hw_decode_oes", p0);
       return;
    }
    public static void setEnableSlidePrefetchDebugInfo(boolean p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, kpMidLocalDe, "7")) {
          return;
       }
       LocalDebugConfigPreference.putBoolean("key_enable_slide_prefetch_debug", p0);
       return;
    }
    public static void setEnableVideoInfo(boolean p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, kpMidLocalDe, "6")) {
          return;
       }
       LocalDebugConfigPreference.putBoolean("key_enable_video_info", p0);
       return;
    }
    public static void setKwaivppBits(int p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, kpMidLocalDe, "12")) {
          return;
       }
       LocalDebugConfigPreference.putInt("key_kwaivpp_bits", p0);
       return;
    }
    public static void setLiveNormalNativeCacheSwitch(int p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, kpMidLocalDe, "8")) {
          return;
       }
       LocalDebugConfigPreference.putInt("live_normal_native_cache_switch", p0);
       return;
    }
    public static void setVodHwDecode(int p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, kpMidLocalDe, "1")) {
          return;
       }
       LocalDebugConfigPreference.putInt("vod_hw_decode", p0);
       return;
    }
    public static void setVodP2spSwitch(int p0){
       KpMidLocalDebugConfig kpMidLocalDe = KpMidLocalDebugConfig.class;
       if (PatchProxy.isSupport(kpMidLocalDe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, kpMidLocalDe, "3")) {
          return;
       }
       LocalDebugConfigPreference.putInt("vod_p2sp_switch", p0);
       return;
    }
}
