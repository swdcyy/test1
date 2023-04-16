package com.kwai.video.player.KsMediaCodecInfo;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.TreeMap;
import java.util.Comparator;
import java.lang.Integer;
import java.util.Locale;
import android.media.MediaCodecInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo$CodecProfileLevel;
import java.lang.Math;

public class KsMediaCodecInfo	// class@000ad2
{
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank;
    public static int RANK_MAX = 1000;
    public static Map sKnownCodecList;

    public void KsMediaCodecInfo(){
       super();
       this.mRank = 0;
    }
    public static synchronized Map getKnownCodecList(){
       _monitor_enter(KsMediaCodecInfo.class);
       Map obj = PatchProxy.apply(null, null, KsMediaCodecInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KsMediaCodecInfo.class);
          return obj;
       }else {
          obj = KsMediaCodecInfo.sKnownCodecList;
          if (obj != null) {
             _monitor_exit(KsMediaCodecInfo.class);
             return obj;
          }else {
             TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
             KsMediaCodecInfo.sKnownCodecList = treeMap;
             treeMap.put("OMX.Nvidia.h264.decode", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", Integer.valueOf(300));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.Intel.hw_vd.h264", Integer.valueOf(801));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.qcom.video.decoder.avc", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.ittiam.video.decoder.avc", Integer.valueOf(0));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.SEC.avc.dec", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.SEC.AVC.Decoder", Integer.valueOf(799));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.SEC.avcdec", Integer.valueOf(798));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.SEC.avc.sw.dec", Integer.valueOf(200));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.Exynos.avc.dec", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.Exynos.AVC.Decoder", Integer.valueOf(799));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.k3.video.decoder.avc", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.rk.video_decoder.avc", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", Integer.valueOf(800));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", Integer.valueOf(200));
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.Action.Video.Decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.duos.h264.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.hantro.G1.video.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.hisi.video.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.LG.decoder.video.avc");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.MS.AVC.Decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.RENESAS.VIDEO.DECODER.H264");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.RTK.video.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.sprd.h264.decoder");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.vpu.video_decoder.avc");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.WMT.decoder.avc");
             KsMediaCodecInfo.sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
             KsMediaCodecInfo.sKnownCodecList.put("OMX.google.h264.decoder", Integer.valueOf(200));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.google.h264.lc.decoder", Integer.valueOf(200));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.k3.ffmpeg.decoder", Integer.valueOf(200));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.ffmpeg.video.decoder", Integer.valueOf(200));
             KsMediaCodecInfo.sKnownCodecList.put("OMX.sprd.soft.h264.decoder", Integer.valueOf(200));
             _monitor_exit(KsMediaCodecInfo.class);
             return KsMediaCodecInfo.sKnownCodecList;
          }
       }
    }
    public static String getLevelName(int p0){
       if (p0 == 1) {
          return "1";
       }
       if (p0 == 2) {
          return "1b";
       }
       switch (p0){
           case 4:
             return "11";
           case 8:
             return "12";
           case 16:
             return "13";
           case 32:
             return "2";
           case '@':
             return "21";
           case 128:
             return "22";
           case 256:
             return "3";
           case 512:
             return "31";
           case 1024:
             return "32";
           case 2048:
             return "4";
           case 4096:
             return "41";
           case 8192:
             return "42";
           case 0x4000:
             return "5";
           case 0x8000:
             return "51";
           case 0x10000:
             return "52";
           default:
             return "0";
       }
    }
    public static String getProfileLevelName(int p0,int p1){
       KsMediaCodecInfo ksMediaCodec = KsMediaCodecInfo.class;
       if (PatchProxy.isSupport(ksMediaCodec)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, ksMediaCodec, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{KsMediaCodecInfo.getProfileName(p0),KsMediaCodecInfo.getLevelName(p1),Integer.valueOf(p0),Integer.valueOf(p1)};
       return String.format(Locale.US, " %s Profile Level %s \(%d,%d\)", objArray);
    }
    public static String getProfileName(int p0){
       if (p0 == 1) {
          return "Baseline";
       }
       if (p0 == 2) {
          return "Main";
       }
       if (p0 == 4) {
          return "Extends";
       }
       if (p0 == 8) {
          return "High";
       }
       if (p0 == 16) {
          return "High10";
       }
       if (p0 == 32) {
          return "High422";
       }
       if (p0 != 64) {
          return "Unknown";
       }
       return "High444";
    }
    public static KsMediaCodecInfo setupCandidate(MediaCodecInfo p0,String p1){
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, KsMediaCodecInfo.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = p0.getName();
       if (TextUtils.isEmpty(obj1)) {
          return obj;
       }
       obj1 = obj1.toLowerCase(Locale.US);
       int i = 600;
       if (!obj1.startsWith("omx.") && !obj1.startsWith("c2.")) {
          i = 100;
       }else if(obj1.startsWith("omx.pv")){
          if (!obj1.startsWith("omx.google.") && !obj1.startsWith("c2.android.")) {
             if (!obj1.startsWith("omx.ffmpeg.") && (!obj1.startsWith("omx.k3.ffmpeg.") && !obj1.startsWith("omx.avcodec."))) {
                if (obj1.startsWith("omx.ittiam.")) {
                   i = 0;
                }else if(obj1.startsWith("omx.mtk.")){
                   i = 800;
                }else {
                   Integer integer = KsMediaCodecInfo.getKnownCodecList().get(obj1);
                   if (integer != null) {
                      i = integer.intValue();
                   }else if(p0.getCapabilitiesForType(p1) != null){
                   label_00a2 :
                      KsMediaCodecInfo ksMediaCodec = new KsMediaCodecInfo();
                      ksMediaCodec.mCodecInfo = p0;
                      ksMediaCodec.mRank = i;
                      ksMediaCodec.mMimeType = p1;
                      return ksMediaCodec;
                   }
                }
             }
          }
          i = 700;
          goto label_00a2 ;
       }
    label_0045 :
       i = 200;
       goto label_00a2 ;
    }
    public void dumpProfileLevels(String p0){
       int i1;
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaCodecInfo.class, "3")) {
          return;
       }
       MediaCodecInfo$CodecCapabilities capabilities = this.mCodecInfo.getCapabilitiesForType(p0);
       if (capabilities != null) {
          capabilities = capabilities.profileLevels;
          if (capabilities != null) {
             int len = capabilities.length;
             int i = 0;
             i1 = 0;
             i2 = 0;
             while (i < len) {
                object oobject = capabilities[i];
                if (oobject != null) {
                   i1 = Math.max(i1, oobject.profile);
                   i2 = Math.max(i2, oobject.level);
                }
                i = i + 1;
             }
             Object[] objArray = new Object[]{KsMediaCodecInfo.getProfileLevelName(i1, i2)};
             String.format(Locale.US, "%s", objArray);
             return;
          }
       }
       i1 = 0;
       i2 = 0;
       goto label_0034 ;
    }
}
