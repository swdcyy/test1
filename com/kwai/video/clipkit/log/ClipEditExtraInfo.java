package com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import org.json.JSONArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.MutableTimeline;
import com.kwai.video.minecraft.MinecraftUtils;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateClip;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.RationalTime;
import org.json.JSONObject;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import org.json.JSONException;
import java.lang.Double;
import java.lang.Number;
import java.util.Locale;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Math;
import java.util.Set;
import java.util.Map$Entry;

public class ClipEditExtraInfo	// class@001a8a
{
    public HashMap appMap;
    public JSONArray assetInfoArray;
    public String externalAssetId;
    public boolean hasFacemagicEffect;
    public boolean hasInsertFrameAlgorithm;
    public boolean hasOnlineEffect;
    public String page;
    public String templateBusiness;
    public int templateGrade;
    public int templateHeight;
    public String templateId;
    public String templateName;
    public double templateScore;
    public double templateScoreVersion;
    public int templateType;
    public int templateWidth;

    public void ClipEditExtraInfo(){
       super();
       this.appMap = new HashMap();
    }
    public static JSONArray addTemplateJsonObject(EditorSdk2V2$VideoEditorProject p0){
       JSONArray obj = PatchProxy.applyOneRefs(p0, null, ClipEditExtraInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONArray();
       if (p0 == null || (p0.trackAssets() != null && p0.trackAssetsSize())) {
          if (!MinecraftUtils.IsClearMainTrack(p0.getTemplateTimeline())) {
             Minecraft$TemplateClip templateClip = EditorSdk2UtilsV2.getTemplateClipFromTimeline(p0.getTemplateTimeline());
             if (templateClip != null) {
                ClipEditExtraInfo.getAssetInfoArrayFromTemplateClip(obj, templateClip);
             }
          }else {
             ImmutableArray immutableArr = p0.getTemplateTimeline().mutableReplaceableClips();
             if (immutableArr != null && immutableArr.isNotEmpty()) {
                ClipEditExtraInfo.getAssetInfoFromMutableReplaceableClips(obj, immutableArr);
             }
          }
       }
       return obj;
    }
    public static void getAssetInfoArrayFromTemplateClip(JSONArray p0,Minecraft$TemplateClip p1){
       Iterator iterator;
       Minecraft$KSAVClip kSAVClip;
       double d;
       JSONObject jSONObject;
       double d1;
       Object obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, null, ClipEditExtraInfo.class, "5")) {
          return;
       }
       ArrayList arrayList = p1.replaceableClips().getArrayList();
       if (arrayList != null && !arrayList.isEmpty()) {
          iterator = arrayList.iterator();
          while (iterator.hasNext()) {
             kSAVClip = iterator.next();
             if (kSAVClip != null && (p1.templateType() != 1 || !ClipKitUtils.replaceableClipIsOpeingOrEnding(obj1, kSAVClip.aeRefId()))) {
                if (kSAVClip.sourceRange() != null) {
                   d = kSAVClip.sourceRange().startTime().toSeconds() + kSAVClip.sourceRange().duration().toSeconds();
                   if (!d) {
                   }
                }
                if (!EditorSdk2UtilsV2.avClipProbedFileDuration(kSAVClip)) {
                }else {
                   jSONObject = new JSONObject();
                   try{
                      ClipEditLogger.getAssetInfoFromTrackAsset(kSAVClip, jSONObject);
                      if (!kSAVClip.isReplaceable() && (p1.templateType() == 3 || ClipKitUtils.replaceableClipFromAssetInfoOrSegmentInfo(obj1, kSAVClip.aeRefId()))) {
                         jSONObject.put("mediaType", "userMedia");
                      label_00a8 :
                         if (kSAVClip.sourceRange() != null) {
                            jSONObject.put("sourceRangeStartTime", kSAVClip.sourceRange().startTime().toSeconds());
                            d1 = kSAVClip.sourceRange().startTime().toSeconds() + kSAVClip.sourceRange().duration().toSeconds();
                            jSONObject.put("sourceRangeEndTime", d1);
                         }
                         Minecraft$Range timeRangeFro = ClipKitUtils.getTimeRangeFromAVClip(obj1, kSAVClip.clipId());
                         if (timeRangeFro != null) {
                            jSONObject.put("displayRangeStartTime", timeRangeFro.start());
                            d1 = timeRangeFro.start() + timeRangeFro.duration();
                            jSONObject.put("displayRangeEndTime", d1);
                         }
                      }else {
                         jSONObject.put("mediaType", "sourceMedia");
                         goto label_00a8 ;
                      }
                   }catch(org.json.JSONException e0){
                      KSClipLog.e("ClipEditExtraInfo", "mediaType and timeRange put JSON error "+e0);
                      e0.printStackTrace();
                   }
                }
             }
             obj.put(jSONObject);
          }
       }
       arrayList = p1.irreplaceableClips().getArrayList();
       if (arrayList != null && !arrayList.isEmpty()) {
          iterator = arrayList.iterator();
          while (iterator.hasNext()) {
             kSAVClip = iterator.next();
             if (kSAVClip != null && !p1.templateType()) {
                if (kSAVClip.sourceRange() != null) {
                   d = kSAVClip.sourceRange().startTime().toSeconds() + kSAVClip.sourceRange().duration().toSeconds();
                   if (!d) {
                   }
                }
                if (!EditorSdk2UtilsV2.avClipProbedFileDuration(kSAVClip)) {
                }else {
                   jSONObject = new JSONObject();
                   try{
                      ClipEditLogger.getAssetInfoFromTrackAsset(kSAVClip, jSONObject);
                      jSONObject.put("mediaType", "backgroundMedia");
                      if (kSAVClip.sourceRange() != null) {
                         jSONObject.put("sourceRangeStartTime", 0);
                         jSONObject.put("sourceRangeEndTime", kSAVClip.sourceRange().duration().toSeconds());
                         jSONObject.put("displayRangeStartTime", 0);
                         jSONObject.put("displayRangeEndTime", kSAVClip.sourceRange().duration().toSeconds());
                      }
                   }catch(org.json.JSONException e0){
                      KSClipLog.e("ClipEditExtraInfo", "mediaType and timeRange put error");
                      e0.printStackTrace();
                   }
                }
             }
             obj.put(jSONObject);
          }
       }
       return;
    }
    public static void getAssetInfoFromMutableReplaceableClips(JSONArray p0,ImmutableArray p1){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditExtraInfo.class, "4")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Minecraft$KSAVClip kSAVClip = iterator.next();
          if (kSAVClip != null) {
             boolean b = false;
             if (kSAVClip.sourceRange() != null) {
                double d = kSAVClip.sourceRange().startTime().toSeconds() + kSAVClip.sourceRange().duration().toSeconds();
                if (!d - b) {
                }
             }
             if (!EditorSdk2UtilsV2.avClipProbedFileDuration(kSAVClip) - b) {
             }else {
                jSONObject = new JSONObject();
                try{
                   ClipEditLogger.getAssetInfoFromTrackAsset(kSAVClip, jSONObject);
                   String str = "mediaType";
                   if (kSAVClip.isReplaceable()) {
                      jSONObject.put(str, "userMedia");
                   label_0067 :
                      if (kSAVClip.sourceRange() != null) {
                         jSONObject.put("sourceRangeStartTime", kSAVClip.sourceRange().startTime().toSeconds());
                         double d1 = kSAVClip.sourceRange().startTime().toSeconds() + kSAVClip.sourceRange().duration().toSeconds();
                         jSONObject.put("sourceRangeEndTime", d1);
                      }
                   }else {
                      jSONObject.put(str, "sourceMedia");
                      goto label_0067 ;
                   }
                }catch(org.json.JSONException e0){
                   KSClipLog.e("ClipEditExtraInfo", "mediaType and timeRange put error");
                   e0.printStackTrace();
                }
             }
          }
          p0.put(jSONObject);
       }
       return;
    }
    public final double getScaledDoubleValue(double p0){
       ClipEditExtraInfo uClipEditExt = ClipEditExtraInfo.class;
       if (PatchProxy.isSupport(uClipEditExt)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, uClipEditExt, "1");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       Object[] objArray = new Object[]{Double.valueOf(p0)};
       Double uDouble = Double.valueOf(Double.parseDouble(String.format(Locale.US, "%.4f", objArray)));
       if (uDouble.isInfinite()) {
          return 1000001.00f;
       }else if(uDouble.isNaN()){
          return 0x3fb9999b4718c345;
       }else {
          return uDouble.doubleValue();
       }
    }
    public JSONObject toJsonObject(){
       JSONObject obj = PatchProxy.apply(null, this, ClipEditExtraInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       if (this.templateType > null) {
          JSONObject jSONObject = new JSONObject();
          jSONObject.putOpt("template_type", Integer.valueOf(this.templateType));
          jSONObject.putOpt("template_id", this.templateId);
          jSONObject.putOpt("template_width", Integer.valueOf(this.templateWidth));
          jSONObject.putOpt("template_height", Integer.valueOf(this.templateHeight));
          jSONObject.putOpt("template_has_online_effect", Boolean.valueOf(this.hasOnlineEffect));
          jSONObject.putOpt("template_has_facemagic_effect", Boolean.valueOf(this.hasFacemagicEffect));
          jSONObject.putOpt("template_has_insert_frame_algorithm", Boolean.valueOf(this.hasInsertFrameAlgorithm));
          jSONObject.putOpt("template_score", Double.valueOf(this.getScaledDoubleValue(this.templateScore)));
          jSONObject.putOpt("template_score_version", Double.valueOf(this.getScaledDoubleValue(this.templateScoreVersion)));
          jSONObject.putOpt("template_name", this.templateName);
          jSONObject.putOpt("template_business", this.templateBusiness);
          jSONObject.putOpt("template_grade", Integer.valueOf(this.templateGrade));
          ClipEditExtraInfo tassetInfoAr = this.assetInfoArray;
          if (tassetInfoAr != null && tassetInfoAr.length() > 0) {
             int i = Integer.MAX_VALUE;
             int i1 = Integer.MAX_VALUE;
             int i2 = 0;
             int i3 = 0;
             int i4 = 0;
             while (i2 < this.assetInfoArray.length()) {
                JSONObject jSONObject1 = this.assetInfoArray.getJSONObject(i2);
                if (("userMedia").equals(jSONObject1.optString("mediaType")) || 1 == this.templateType) {
                   int i5 = -1;
                   int i6 = jSONObject1.optInt("width", i5);
                   int i7 = jSONObject1.optInt("height", i5);
                   i3 = Math.max(i3, i6);
                   i4 = Math.max(i4, i7);
                   i = Math.min(i, i6);
                   i1 = Math.min(i1, i7);
                }
                i2 = i2 + 1;
             }
             JSONObject jSONObject2 = new JSONObject();
             jSONObject2.putOpt("max_width", Integer.valueOf(i3));
             jSONObject2.putOpt("max_height", Integer.valueOf(i4));
             jSONObject2.putOpt("min_width", Integer.valueOf(i));
             jSONObject2.putOpt("min_height", Integer.valueOf(i1));
             jSONObject2.putOpt("asset_infos", this.assetInfoArray);
             jSONObject.putOpt("template_asset_info", jSONObject2);
          }
          obj.putOpt("template_info", jSONObject);
       }
       obj.putOpt("externalAssetId", this.externalAssetId);
       obj.putOpt("page", this.page);
       ClipEditExtraInfo tappMap = this.appMap;
       if (tappMap != null) {
          Iterator iterator = tappMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             obj.putOpt(key, uEntry.getValue());
          }
       }
       return obj;
    }
}
