package com.yxcorp.gifshow.profile.model.ProfilePostRecoPostParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfilePostRecoPostParams implements Serializable	// class@0013ae
{
    public final boolean allowJumpToolbox;
    public final String bizParams;
    public final String bottomColor;
    public final boolean requireAlbum;
    public final boolean requirePreview;
    public final boolean returnOriginPage;
    public final long templateId;
    public final String topColor;
    public final boolean useCommonInterface;
    public final int videoSceneType;

    public void ProfilePostRecoPostParams(long p0,int p1,boolean p2,boolean p3,String p4,String p5,boolean p6,String p7,boolean p8,boolean p9){
       a.p(p4, "topColor");
       a.p(p5, "bottomColor");
       super();
       this.templateId = p0;
       this.videoSceneType = p1;
       this.requirePreview = p2;
       this.requireAlbum = p3;
       this.topColor = p4;
       this.bottomColor = p5;
       this.returnOriginPage = p6;
       this.bizParams = p7;
       this.useCommonInterface = p8;
       this.allowJumpToolbox = p9;
    }
    public static ProfilePostRecoPostParams copy$default(ProfilePostRecoPostParams p0,long p1,int p2,boolean p3,boolean p4,String p5,String p6,boolean p7,String p8,boolean p9,boolean p10,int p11,Object p12){
       ProfilePostRecoPostParams profilePostR = p0;
       int i = p11;
       ProfilePostRecoPostParams templateId = (i & 0x01)? profilePostR.templateId: p1;
       ProfilePostRecoPostParams videoSceneTy = (i & 0x02)? profilePostR.videoSceneType: p2;
       ProfilePostRecoPostParams requirePrevi = (i & 0x04)? profilePostR.requirePreview: p3;
       ProfilePostRecoPostParams requireAlbum = (i & 0x08)? profilePostR.requireAlbum: p4;
       ProfilePostRecoPostParams topColor = (i & 0x10)? profilePostR.topColor: p5;
       ProfilePostRecoPostParams bottomColor = (i & 0x20)? profilePostR.bottomColor: p6;
       ProfilePostRecoPostParams returnOrigin = (i & 0x40)? profilePostR.returnOriginPage: p7;
       ProfilePostRecoPostParams bizParams = (i & 0x0080)? profilePostR.bizParams: p8;
       ProfilePostRecoPostParams useCommonInt = (i & 0x0100)? profilePostR.useCommonInterface: p9;
       ProfilePostRecoPostParams allowJumpToo = (i & 0x0200)? profilePostR.allowJumpToolbox: p10;
       return p0.copy(templateId, videoSceneTy, requirePrevi, requireAlbum, topColor, bottomColor, returnOrigin, bizParams, useCommonInt, allowJumpToo);
    }
    public final long component1(){
       return this.templateId;
    }
    public final boolean component10(){
       return this.allowJumpToolbox;
    }
    public final int component2(){
       return this.videoSceneType;
    }
    public final boolean component3(){
       return this.requirePreview;
    }
    public final boolean component4(){
       return this.requireAlbum;
    }
    public final String component5(){
       return this.topColor;
    }
    public final String component6(){
       return this.bottomColor;
    }
    public final boolean component7(){
       return this.returnOriginPage;
    }
    public final String component8(){
       return this.bizParams;
    }
    public final boolean component9(){
       return this.useCommonInterface;
    }
    public final ProfilePostRecoPostParams copy(long p0,int p1,boolean p2,boolean p3,String p4,String p5,boolean p6,String p7,boolean p8,boolean p9){
       ProfilePostRecoPostParams obj;
       object oobject = p4;
       object oobject1 = p5;
       if (PatchProxy.isSupport(ProfilePostRecoPostParams.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = Long.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = oobject;
          objArray[5] = oobject1;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          obj = PatchProxy.apply(objArray, this, ProfilePostRecoPostParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "topColor");
       a.p(oobject1, "bottomColor");
       obj = new ProfilePostRecoPostParams(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return v13;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePostRecoPostParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfilePostRecoPostParams && (!this.templateId - p0.templateId && (this.videoSceneType == p0.videoSceneType && (this.requirePreview == p0.requirePreview && (this.requireAlbum == p0.requireAlbum && (a.g(this.topColor, p0.topColor) && (a.g(this.bottomColor, p0.bottomColor) && (this.returnOriginPage == p0.returnOriginPage && (a.g(this.bizParams, p0.bizParams) && (this.useCommonInterface == p0.useCommonInterface && this.allowJumpToolbox == p0.allowJumpToolbox))))))))))) {
          return true;
       }
       return false;
    }
    public final boolean getAllowJumpToolbox(){
       return this.allowJumpToolbox;
    }
    public final String getBizParams(){
       return this.bizParams;
    }
    public final String getBottomColor(){
       return this.bottomColor;
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
    public final long getTemplateId(){
       return this.templateId;
    }
    public final String getTopColor(){
       return this.topColor;
    }
    public final boolean getUseCommonInterface(){
       return this.useCommonInterface;
    }
    public final int getVideoSceneType(){
       return this.videoSceneType;
    }
    public int hashCode(){
       int i2;
       ProfilePostRecoPostParams obj = PatchProxy.apply(null, this, ProfilePostRecoPostParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.templateId;
       int i = (((int)(obj ^ (obj >> 32)) * 31) + this.videoSceneType) * 31;
       obj = this.requirePreview;
       int i1 = 1;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.requireAlbum;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.topColor;
       int i3 = 0;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.bottomColor;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.returnOriginPage;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.bizParams;
       if (obj != null) {
          i3 = obj.hashCode();
       }
       i = (i + i3) * 31;
       obj = this.useCommonInterface;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.allowJumpToolbox;
       if (obj == null) {
          i1 = obj;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfilePostRecoPostParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfilePostRecoPostParams\(templateId="+this.templateId+", videoSceneType="+this.videoSceneType+", requirePreview="+this.requirePreview+", requireAlbum="+this.requireAlbum+", topColor="+this.topColor+", bottomColor="+this.bottomColor+", returnOriginPage="+this.returnOriginPage+", bizParams="+this.bizParams+", useCommonInterface="+this.useCommonInterface+", allowJumpToolbox="+this.allowJumpToolbox+"\)";
    }
}
