package com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import java.lang.Object;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$a;
import java.lang.Enum;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import ekd.j;
import java.util.ArrayList;
import java.lang.Boolean;
import java.lang.Integer;
import hba.a;
import java.lang.Double;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.common.collect.Lists;

public final class AudioAssetUtils	// class@001b63
{
    public static int a = 10000;
    public static int b = 30000;
    public static int c = 40000;

    public void AudioAssetUtils(){
       super();
    }
    public static int a(AudioAssetUtils$AssetIdType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AudioAssetUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = AudioAssetUtils$a.a[p0.ordinal()];
       if (i == 1) {
          return 1002;
       }
       if (i == 2) {
          return 1001;
       }
       if (i != 3) {
          if (i != 4) {
             if (i != 5) {
                return 0;
             }
             i = AudioAssetUtils.c;
             AudioAssetUtils.c = i + 1;
             return i;
          }else {
             i = AudioAssetUtils.b;
             AudioAssetUtils.b = i + 1;
             return i;
          }
       }else {
          i = AudioAssetUtils.a;
          AudioAssetUtils.a = i + 1;
          return i;
       }
    }
    public static List b(EditorSdk2V2$VideoEditorProject p0){
       Object obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, AudioAssetUtils.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       EditorSdk2V2$AudioAsset[] uAudioAssetA = p0.audioAssets().toNormalArray();
       if (j.h(uAudioAssetA)) {
          return obj;
       }
       obj1 = new ArrayList();
       int len = uAudioAssetA.length;
       int i = 0;
       while (i < len) {
          object oobject = uAudioAssetA[i];
          if (oobject.assetId() - 0x2710 >= 0 && oobject.assetId() - (long)AudioAssetUtils.a <= 0) {
             obj1.add(oobject);
          }
          i = i + 1;
       }
       return obj1;
    }
    public static EditorSdk2V2$AudioAsset c(boolean p0,EditorSdk2V2$VideoEditorProject p1){
       AudioAssetUtils uAudioAssetU = AudioAssetUtils.class;
       if (PatchProxy.isSupport(uAudioAssetU)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uAudioAssetU, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorSdk2V2$AudioAsset[] uAudioAssetA = p1.audioAssets().toNormalArray();
       if (uAudioAssetA != null && uAudioAssetA.length) {
          int len = uAudioAssetA.length;
          int i = 0;
          while (i < len) {
             object oobject = uAudioAssetA[i];
             if (oobject != null && (!p0 || (!oobject.assetId() - 1001 || (!p0 && !oobject.assetId() - 1002)))) {
                return oobject;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public static EditorSdk2V2$AudioAsset d(EditorSdk2V2$VideoEditorProject p0,int p1){
       ArrayList obj;
       AudioAssetUtils uAudioAssetU = AudioAssetUtils.class;
       if (PatchProxy.isSupport(uAudioAssetU)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uAudioAssetU, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorSdk2V2$AudioAsset[] uAudioAssetA = p0.audioAssets().toNormalArray();
       if (j.h(uAudioAssetA)) {
          return null;
       }else {
          obj = new ArrayList();
          int len = uAudioAssetA.length;
          int i = 0;
          while (i < len) {
             object oobject = uAudioAssetA[i];
             if (oobject.assetId() - 0x2710 >= 0 && oobject.assetId() - (long)AudioAssetUtils.a <= 0) {
                obj.add(oobject);
             }
             i = i + 1;
          }
          if (p1 >= obj.size() || p1 < 0) {
             return null;
          }else {
             return obj.get(p1);
          }
       }
    }
    public static double e(String p0,double p1,a p2,EditorSdk2V2$VideoEditorProject p3){
       Text obj;
       double d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AudioAssetUtils uAudioAssetU = AudioAssetUtils.class;
       if (PatchProxy.isSupport(uAudioAssetU)) {
          obj = PatchProxy.applyFourRefs(p0, Double.valueOf(p1), p2, p3, null, AudioAssetUtils.class, "13");
          if (obj != patchProxyRe) {
             return obj.doubleValue();
          }
       }
       int i = 1;
       int i1 = 3;
       int i2 = 0;
       boolean b = (p3.timeEffect() != null && p3.timeEffect().timeEffectType() == i1)? true: false;
       if (PatchProxy.isSupport(uAudioAssetU)) {
          Object[] objArray = new Object[]{p0,Double.valueOf(p1),p2,p3,Boolean.valueOf(b)};
          Object obj1 = PatchProxy.apply(objArray, null, uAudioAssetU, "14");
          if (obj1 != patchProxyRe) {
             d = obj1.doubleValue();
          }
       }
       double d1 = 0;
       if (b) {
          Iterator iterator = p2.z().iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                if (p0.equals(obj.getResult().getIdentifier())) {
                   p1 = EditorSdk2UtilsV2.getComputedDuration(p3) - (p1 + obj.getResult().getRange().getDuration());
                }
             }else {
                p1 = d1;
             }
          }
          return d;
       }
       d = p1;
       goto label_00a2 ;
    }
    public static boolean f(EditorSdk2V2$AudioAsset p0){
       boolean b1;
       AudioAssetUtils uAudioAssetU = AudioAssetUtils.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uAudioAssetU, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          if (!p0.isKuaiShanBgAudio()) {
             Object obj1 = PatchProxy.applyOneRefs(p0, null, uAudioAssetU, "7");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else if(!TextUtils.isEmpty(p0.templateAssetRefId())){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
             label_003d :
                b = false;
             }
          }
       }else {
          goto label_003d ;
       }
       return b;
    }
    public static boolean g(long p0){
       boolean b = (p0 - 0x2710 >= 0 && p0 - (long)AudioAssetUtils.a <= 0)? true: false;
       return b;
    }
    public static List h(EditorSdk2V2$VideoEditorProject p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, AudioAssetUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2V2$AudioAsset[] uAudioAssetA = p0.audioAssets().toNormalArray();
       if (j.h(uAudioAssetA)) {
          return Lists.b();
       }
       obj = new ArrayList();
       int len = uAudioAssetA.length;
       int i = 0;
       while (i < len) {
          object oobject = uAudioAssetA[i];
          if (oobject != null && (oobject.assetId() - 0x2710 < 0 || oobject.assetId() - (long)AudioAssetUtils.a > 0)) {
             obj.add(oobject);
          }
          i = i + 1;
       }
       return obj;
    }
}
