package com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Long;
import java.util.List;
import java.util.HashMap;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MediaSceneConfig implements Serializable	// class@001402
{
    public final HashMap argsMap;
    public final HashMap assetContents;
    public final List audioAssets;
    public final String bottomColor;
    public final String cityName;
    public final boolean directPublish;
    public final boolean disableBackPublish;
    public final boolean disableMoment;
    public final boolean disableNext;
    public final ArrayList headUrlList;
    public final String momentButtonText;
    public final String musicId;
    public final int musicType;
    public final Long poiId;
    public String profileImage;
    public String publishContent;
    public final long replaceableTimestamp;
    public final boolean requireAlbum;
    public final boolean requirePreview;
    public final boolean returnOriginPage;
    public final int sceneType;
    public final String segmentIconTitle;
    public String tagText;
    public final String templateId;
    public final String topColor;
    public final int videoSceneType;

    public void MediaSceneConfig(String p0,String p1,ArrayList p2,Long p3,int p4,int p5,String p6,boolean p7,boolean p8,boolean p9,boolean p10,String p11,int p12,String p13,long p14,String p15,String p16,String p17,String p18,List p19,HashMap p20,boolean p21,HashMap p22,boolean p23,boolean p24,String p25){
       int i = this;
       Object obj = p11;
       Object obj1 = p19;
       Object obj2 = p20;
       Object obj3 = p22;
       a.p(p2, "headUrlList");
       a.p(p6, "templateId");
       a.p(obj, "musicId");
       a.p(obj1, "audioAssets");
       a.p(obj2, "assetContents");
       a.p(obj3, "argsMap");
       super();
       i.cityName = p0;
       i.profileImage = p1;
       i.headUrlList = p2;
       i.poiId = p3;
       i.sceneType = p4;
       i.videoSceneType = p5;
       i.templateId = p6;
       i.directPublish = p7;
       i.disableMoment = p8;
       i.disableNext = p9;
       i.disableBackPublish = p10;
       i.musicId = obj;
       i.musicType = p12;
       i.tagText = p13;
       i.replaceableTimestamp = p14;
       i.publishContent = p15;
       i.topColor = p16;
       i.bottomColor = p17;
       i.momentButtonText = p18;
       i.audioAssets = obj1;
       i.assetContents = obj2;
       i.returnOriginPage = p21;
       i.argsMap = obj3;
       i.requireAlbum = p23;
       i.requirePreview = p24;
       i.segmentIconTitle = p25;
    }
    public void MediaSceneConfig(String p0,String p1,ArrayList p2,Long p3,int p4,int p5,String p6,boolean p7,boolean p8,boolean p9,boolean p10,String p11,int p12,String p13,long p14,String p15,String p16,String p17,String p18,List p19,HashMap p20,boolean p21,HashMap p22,boolean p23,boolean p24,String p25,int p26,u p27){
       int i = p26;
       String str = (i & 0x01)? null: p0;
       String str1 = (i & 0x02)? null: p1;
       ArrayList uArrayList = (i & 0x04)? new ArrayList(): p2;
       Long longx = (i & 0x08)? null: p3;
       int i1 = (i & 0x10)? 100: p4;
       int i2 = (i & 0x20)? 0: p5;
       boolean b = (i & 0x0080)? false: p7;
       boolean b1 = (i & 0x0100)? false: p8;
       boolean b2 = (i & 0x0200)? false: p9;
       boolean b3 = (i & 0x0400)? false: p10;
       String str2 = "";
       String str3 = (i & 0x0800)? str2: p11;
       int i3 = (i & 0x1000)? 0: p12;
       String str4 = (i & 0x2000)? null: p13;
       long l = (i & 0x4000)? 0: p14;
       String str5 = (0x8000 & i)? str2: p15;
       String str6 = (0x10000 & i)? str2: p16;
       String str7 = (0x20000 & i)? str2: p17;
       String str8 = (0x40000 & i)? str2: p18;
       ArrayList uArrayList1 = (0x80000 & i)? new ArrayList(): p19;
       HashMap hashMap = (0x100000 & i)? new HashMap(): p20;
       boolean b4 = (0x200000 & i)? false: p21;
       HashMap hashMap1 = (0x400000 & i)? new HashMap(): p22;
       boolean b5 = (Float.MIN_NORMAL & i)? false: p23;
       boolean b6 = (0x1000000 & i)? false: p24;
       String str9 = (i & 0x2000000)? str2: p25;
       super(str, str1, uArrayList, longx, i1, i2, p6, b, b1, b2, b3, str3, i3, str4, l, str5, str6, str7, str8, uArrayList1, hashMap, b4, hashMap1, b5, b6, str9);
       return;
    }
    public static MediaSceneConfig copy$default(MediaSceneConfig p0,String p1,String p2,ArrayList p3,Long p4,int p5,int p6,String p7,boolean p8,boolean p9,boolean p10,boolean p11,String p12,int p13,String p14,long p15,String p16,String p17,String p18,String p19,List p20,HashMap p21,boolean p22,HashMap p23,boolean p24,boolean p25,String p26,int p27,Object p28){
       int i1;
       int i2;
       MediaSceneConfig mediaSceneCo = p0;
       int i = p27;
       MediaSceneConfig cityName = (i & 0x01)? mediaSceneCo.cityName: p1;
       MediaSceneConfig profileImage = (i & 0x02)? mediaSceneCo.profileImage: p2;
       MediaSceneConfig headUrlList = (i & 0x04)? mediaSceneCo.headUrlList: p3;
       MediaSceneConfig poiId = (i & 0x08)? mediaSceneCo.poiId: p4;
       MediaSceneConfig sceneType = (i & 0x10)? mediaSceneCo.sceneType: p5;
       MediaSceneConfig videoSceneTy = (i & 0x20)? mediaSceneCo.videoSceneType: p6;
       MediaSceneConfig templateId = (i & 0x40)? mediaSceneCo.templateId: p7;
       MediaSceneConfig directPublis = (i & 0x0080)? mediaSceneCo.directPublish: p8;
       MediaSceneConfig disableMomen = (i & 0x0100)? mediaSceneCo.disableMoment: p9;
       MediaSceneConfig disableNext = (i & 0x0200)? mediaSceneCo.disableNext: p10;
       MediaSceneConfig disableBackP = (i & 0x0400)? mediaSceneCo.disableBackPublish: p11;
       MediaSceneConfig musicId = (i & 0x0800)? mediaSceneCo.musicId: p12;
       MediaSceneConfig musicType = (i & 0x1000)? mediaSceneCo.musicType: p13;
       MediaSceneConfig tagText = (i & 0x2000)? mediaSceneCo.tagText: p14;
       MediaSceneConfig mediaSceneCo1 = tagText;
       MediaSceneConfig mediaSceneCo2 = musicType;
       musicType = (i & 0x4000)? mediaSceneCo.replaceableTimestamp: p15;
       MediaSceneConfig mediaSceneCo3 = musicType;
       musicType = (i & 0x8000)? mediaSceneCo.publishContent: p16;
       tagText = (0x10000 & i)? mediaSceneCo.topColor: p17;
       MediaSceneConfig mediaSceneCo4 = tagText;
       tagText = (i & 0x20000)? mediaSceneCo.bottomColor: p18;
       MediaSceneConfig mediaSceneCo5 = tagText;
       tagText = (i & 0x40000)? mediaSceneCo.momentButtonText: p19;
       MediaSceneConfig mediaSceneCo6 = tagText;
       tagText = (i & 0x80000)? mediaSceneCo.audioAssets: p20;
       MediaSceneConfig mediaSceneCo7 = tagText;
       tagText = (i & 0x100000)? mediaSceneCo.assetContents: p21;
       MediaSceneConfig mediaSceneCo8 = tagText;
       tagText = (i & 0x200000)? mediaSceneCo.returnOriginPage: p22;
       MediaSceneConfig mediaSceneCo9 = tagText;
       tagText = (i & 0x400000)? mediaSceneCo.argsMap: p23;
       MediaSceneConfig mediaSceneCo10 = tagText;
       tagText = (i & Float.MIN_NORMAL)? mediaSceneCo.requireAlbum: p24;
       MediaSceneConfig mediaSceneCo11 = tagText;
       tagText = (i & 0x1000000)? mediaSceneCo.requirePreview: p25;
       MediaSceneConfig segmentIconT = (i & 0x2000000)? mediaSceneCo.segmentIconTitle: p26;
       return p0.copy(cityName, profileImage, headUrlList, poiId, sceneType, videoSceneTy, templateId, directPublis, disableMomen, disableNext, disableBackP, musicId, mediaSceneCo2, mediaSceneCo1, mediaSceneCo3, musicType, mediaSceneCo4, mediaSceneCo5, mediaSceneCo6, mediaSceneCo7, mediaSceneCo8, mediaSceneCo9, mediaSceneCo10, mediaSceneCo11, tagText, segmentIconT);
    }
    public final String component1(){
       return this.cityName;
    }
    public final boolean component10(){
       return this.disableNext;
    }
    public final boolean component11(){
       return this.disableBackPublish;
    }
    public final String component12(){
       return this.musicId;
    }
    public final int component13(){
       return this.musicType;
    }
    public final String component14(){
       return this.tagText;
    }
    public final long component15(){
       return this.replaceableTimestamp;
    }
    public final String component16(){
       return this.publishContent;
    }
    public final String component17(){
       return this.topColor;
    }
    public final String component18(){
       return this.bottomColor;
    }
    public final String component19(){
       return this.momentButtonText;
    }
    public final String component2(){
       return this.profileImage;
    }
    public final List component20(){
       return this.audioAssets;
    }
    public final HashMap component21(){
       return this.assetContents;
    }
    public final boolean component22(){
       return this.returnOriginPage;
    }
    public final HashMap component23(){
       return this.argsMap;
    }
    public final boolean component24(){
       return this.requireAlbum;
    }
    public final boolean component25(){
       return this.requirePreview;
    }
    public final String component26(){
       return this.segmentIconTitle;
    }
    public final ArrayList component3(){
       return this.headUrlList;
    }
    public final Long component4(){
       return this.poiId;
    }
    public final int component5(){
       return this.sceneType;
    }
    public final int component6(){
       return this.videoSceneType;
    }
    public final String component7(){
       return this.templateId;
    }
    public final boolean component8(){
       return this.directPublish;
    }
    public final boolean component9(){
       return this.disableMoment;
    }
    public final MediaSceneConfig copy(String p0,String p1,ArrayList p2,Long p3,int p4,int p5,String p6,boolean p7,boolean p8,boolean p9,boolean p10,String p11,int p12,String p13,long p14,String p15,String p16,String p17,String p18,List p19,HashMap p20,boolean p21,HashMap p22,boolean p23,boolean p24,String p25){
       MediaSceneConfig obj;
       object oobject = p2;
       object oobject1 = p6;
       object oobject2 = p11;
       object oobject3 = p19;
       object oobject4 = p20;
       object oobject5 = p22;
       if (PatchProxy.isSupport(MediaSceneConfig.class)) {
          Object[] objArray = new Object[26];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = oobject1;
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = oobject2;
          objArray[12] = Integer.valueOf(p12);
          objArray[13] = p13;
          objArray[14] = Long.valueOf(p14);
          objArray[15] = p15;
          objArray[16] = p16;
          objArray[17] = p17;
          objArray[18] = p18;
          objArray[19] = oobject3;
          objArray[20] = oobject4;
          objArray[21] = Boolean.valueOf(p21);
          objArray[22] = oobject5;
          objArray[23] = Boolean.valueOf(p23);
          objArray[24] = Boolean.valueOf(p24);
          objArray[25] = p25;
          obj = PatchProxy.apply(objArray, this, MediaSceneConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "headUrlList");
       a.p(oobject1, "templateId");
       a.p(oobject2, "musicId");
       a.p(oobject3, "audioAssets");
       a.p(oobject4, "assetContents");
       a.p(oobject5, "argsMap");
       obj = new MediaSceneConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25);
       return v28;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaSceneConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MediaSceneConfig && (a.g(this.cityName, p0.cityName) && (a.g(this.profileImage, p0.profileImage) && (a.g(this.headUrlList, p0.headUrlList) && (a.g(this.poiId, p0.poiId) && (this.sceneType == p0.sceneType && (this.videoSceneType == p0.videoSceneType && (a.g(this.templateId, p0.templateId) && (this.directPublish == p0.directPublish && (this.disableMoment == p0.disableMoment && (this.disableNext == p0.disableNext && (this.disableBackPublish == p0.disableBackPublish && (a.g(this.musicId, p0.musicId) && (this.musicType == p0.musicType && (a.g(this.tagText, p0.tagText) && (!this.replaceableTimestamp - p0.replaceableTimestamp && (a.g(this.publishContent, p0.publishContent) && (a.g(this.topColor, p0.topColor) && (a.g(this.bottomColor, p0.bottomColor) && (a.g(this.momentButtonText, p0.momentButtonText) && (a.g(this.audioAssets, p0.audioAssets) && (a.g(this.assetContents, p0.assetContents) && (this.returnOriginPage == p0.returnOriginPage && (a.g(this.argsMap, p0.argsMap) && (this.requireAlbum == p0.requireAlbum && (this.requirePreview == p0.requirePreview && a.g@00b0cd(this.segmentIconTitle@0036e6, p0.segmentIconTitle@0036e6)))))))))))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final HashMap getArgsMap(){
       return this.argsMap;
    }
    public final HashMap getAssetContents(){
       return this.assetContents;
    }
    public final List getAudioAssets(){
       return this.audioAssets;
    }
    public final String getBottomColor(){
       return this.bottomColor;
    }
    public final String getCityName(){
       return this.cityName;
    }
    public final boolean getDirectPublish(){
       return this.directPublish;
    }
    public final boolean getDisableBackPublish(){
       return this.disableBackPublish;
    }
    public final boolean getDisableMoment(){
       return this.disableMoment;
    }
    public final boolean getDisableNext(){
       return this.disableNext;
    }
    public final ArrayList getHeadUrlList(){
       return this.headUrlList;
    }
    public final String getMomentButtonText(){
       return this.momentButtonText;
    }
    public final String getMusicId(){
       return this.musicId;
    }
    public final int getMusicType(){
       return this.musicType;
    }
    public final Long getPoiId(){
       return this.poiId;
    }
    public final String getProfileImage(){
       return this.profileImage;
    }
    public final String getPublishContent(){
       return this.publishContent;
    }
    public final long getReplaceableTimestamp(){
       return this.replaceableTimestamp;
    }
    public final boolean getRequireAlbum(){
       return this.requireAlbum;
    }
    public final boolean getRequirePreview(){
       return this.requirePreview;
    }
    public final boolean getReturnOriginPage(){
       return this.returnOriginPage;
    }
    public final int getSceneType(){
       return this.sceneType;
    }
    public final String getSegmentIconTitle(){
       return this.segmentIconTitle;
    }
    public final String getTagText(){
       return this.tagText;
    }
    public final String getTemplateId(){
       return this.templateId;
    }
    public final String getTopColor(){
       return this.topColor;
    }
    public final int getVideoSceneType(){
       return this.videoSceneType;
    }
    public int hashCode(){
       MediaSceneConfig obj = PatchProxy.apply(null, this, MediaSceneConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cityName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MediaSceneConfig tprofileImag = this.profileImage;
       int i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.headUrlList;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.poiId;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + this.sceneType) * 31) + this.videoSceneType) * 31;
       tprofileImag = this.templateId;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.directPublish;
       int i3 = 1;
       if (tprofileImag != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tprofileImag = this.disableMoment;
       if (tprofileImag != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tprofileImag = this.disableNext;
       if (tprofileImag != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tprofileImag = this.disableBackPublish;
       if (tprofileImag != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tprofileImag = this.musicId;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.musicType) * 31;
       tprofileImag = this.tagText;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       MediaSceneConfig treplaceable = this.replaceableTimestamp;
       i1 = (((i1 + i2) * 31) + (int)(treplaceable ^ (treplaceable >> 32))) * 31;
       tprofileImag = this.publishContent;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.topColor;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.bottomColor;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.momentButtonText;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.audioAssets;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.assetContents;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.returnOriginPage;
       if (tprofileImag != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tprofileImag = this.argsMap;
       i2 = (tprofileImag != null)? tprofileImag.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileImag = this.requireAlbum;
       if (tprofileImag != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tprofileImag = this.requirePreview;
       if (tprofileImag == null) {
          i3 = tprofileImag;
       }
       i1 = (i1 + i3) * 31;
       tprofileImag = this.segmentIconTitle;
       if (tprofileImag != null) {
          i = tprofileImag.hashCode();
       }
       return (i1 + i);
    }
    public final void setProfileImage(String p0){
       this.profileImage = p0;
    }
    public final void setPublishContent(String p0){
       this.publishContent = p0;
    }
    public final void setTagText(String p0){
       this.tagText = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MediaSceneConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "cityName = "+this.cityName+", profileImage = "+this.profileImage+", sceneType = "+this.sceneType+", poiId = "+this.poiId+", templateId = "+this.templateId+", musicId = "+this.musicId+", musicType = "+this.musicType+", "+"tagText = "+this.tagText+", requireAlbum="+this.requireAlbum+", requirePreview="+this.requirePreview;
    }
}
