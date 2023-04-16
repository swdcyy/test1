package com.yxcorp.gifshow.growth.kpop.ext.model.VideoConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kpop.ext.model.VideoConfig$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class VideoConfig implements Serializable	// class@001411
{
    public final String action2VideoFinish;
    public final String action2VideoStart;
    public final List coverUrl;
    public final boolean enableSkip;
    public final String page2;
    public final boolean useHardwareDecoding;
    public final int videoHeight;
    public final String videoUrl;
    public final int videoWidth;
    public static final VideoConfig$a Companion;
    public static final long serialVersionUID;

    static {
       VideoConfig.Companion = new VideoConfig$a(null);
    }
    public void VideoConfig(){
       super(null, null, 0, 0, false, false, null, null, null, 511, null);
    }
    public void VideoConfig(String p0){
       super(p0, null, 0, 0, false, false, null, null, null, 510, null);
    }
    public void VideoConfig(String p0,List p1){
       super(p0, p1, 0, 0, false, false, null, null, null, 508, null);
    }
    public void VideoConfig(String p0,List p1,int p2){
       super(p0, p1, p2, 0, false, false, null, null, null, 504, null);
    }
    public void VideoConfig(String p0,List p1,int p2,int p3){
       super(p0, p1, p2, p3, false, false, null, null, null, 496, null);
    }
    public void VideoConfig(String p0,List p1,int p2,int p3,boolean p4){
       super(p0, p1, p2, p3, p4, false, null, null, null, 480, null);
    }
    public void VideoConfig(String p0,List p1,int p2,int p3,boolean p4,boolean p5){
       super(p0, p1, p2, p3, p4, p5, null, null, null, 448, null);
    }
    public void VideoConfig(String p0,List p1,int p2,int p3,boolean p4,boolean p5,String p6){
       super(p0, p1, p2, p3, p4, p5, p6, null, null, 384, null);
    }
    public void VideoConfig(String p0,List p1,int p2,int p3,boolean p4,boolean p5,String p6,String p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7, null, 256, null);
    }
    public void VideoConfig(String p0,List p1,int p2,int p3,boolean p4,boolean p5,String p6,String p7,String p8){
       a.p(p0, "videoUrl");
       a.p(p1, "coverUrl");
       a.p(p6, "page2");
       a.p(p7, "action2VideoStart");
       a.p(p8, "action2VideoFinish");
       super();
       this.videoUrl = p0;
       this.coverUrl = p1;
       this.videoWidth = p2;
       this.videoHeight = p3;
       this.useHardwareDecoding = p4;
       this.enableSkip = p5;
       this.page2 = p6;
       this.action2VideoStart = p7;
       this.action2VideoFinish = p8;
    }
    public void VideoConfig(String p0,List p1,int p2,int p3,boolean p4,boolean p5,String p6,String p7,String p8,int p9,u p10){
       int i = p9;
       String str = "";
       String str1 = (i & 0x01)? str: p0;
       List list = (i & 0x02)? CollectionsKt__CollectionsKt.E(): p1;
       int i1 = 0;
       int i2 = (i & 0x04)? 0: p2;
       int i3 = (i & 0x08)? 0: p3;
       int i4 = (i & 0x10)? 1: p4;
       if (!(i & 0x20)) {
          i1 = p5;
       }
       String str2 = (i & 0x40)? str: p6;
       String str3 = (i & 0x0080)? str: p7;
       if (!(i & 0x0100)) {
          str = p8;
       }
       super(str1, list, i2, i3, i4, i1, str2, str3, str);
       return;
    }
    public static VideoConfig copy$default(VideoConfig p0,String p1,List p2,int p3,int p4,boolean p5,boolean p6,String p7,String p8,String p9,int p10,Object p11){
       VideoConfig videoConfig = p0;
       int i = p10;
       VideoConfig videoUrl = (i & 0x01)? videoConfig.videoUrl: p1;
       VideoConfig coverUrl = (i & 0x02)? videoConfig.coverUrl: p2;
       VideoConfig videoWidth = (i & 0x04)? videoConfig.videoWidth: p3;
       VideoConfig videoHeight = (i & 0x08)? videoConfig.videoHeight: p4;
       VideoConfig useHardwareD = (i & 0x10)? videoConfig.useHardwareDecoding: p5;
       VideoConfig enableSkip = (i & 0x20)? videoConfig.enableSkip: p6;
       VideoConfig page2 = (i & 0x40)? videoConfig.page2: p7;
       VideoConfig action2Video = (i & 0x0080)? videoConfig.action2VideoStart: p8;
       VideoConfig action2Video1 = (i & 0x0100)? videoConfig.action2VideoFinish: p9;
       return p0.copy(videoUrl, coverUrl, videoWidth, videoHeight, useHardwareD, enableSkip, page2, action2Video, action2Video1);
    }
    public final String component1(){
       return this.videoUrl;
    }
    public final List component2(){
       return this.coverUrl;
    }
    public final int component3(){
       return this.videoWidth;
    }
    public final int component4(){
       return this.videoHeight;
    }
    public final boolean component5(){
       return this.useHardwareDecoding;
    }
    public final boolean component6(){
       return this.enableSkip;
    }
    public final String component7(){
       return this.page2;
    }
    public final String component8(){
       return this.action2VideoStart;
    }
    public final String component9(){
       return this.action2VideoFinish;
    }
    public final VideoConfig copy(String p0,List p1,int p2,int p3,boolean p4,boolean p5,String p6,String p7,String p8){
       VideoConfig obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p6;
       object oobject3 = p7;
       object oobject4 = p8;
       if (PatchProxy.isSupport(VideoConfig.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = oobject2;
          objArray[7] = oobject3;
          objArray[8] = oobject4;
          obj = PatchProxy.apply(objArray, this, VideoConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "videoUrl");
       a.p(p1, "coverUrl");
       a.p(oobject2, "page2");
       a.p(oobject3, "action2VideoStart");
       a.p(oobject4, "action2VideoFinish");
       obj = new VideoConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof VideoConfig && (a.g(this.videoUrl, p0.videoUrl) && (a.g(this.coverUrl, p0.coverUrl) && (this.videoWidth == p0.videoWidth && (this.videoHeight == p0.videoHeight && (this.useHardwareDecoding == p0.useHardwareDecoding && (this.enableSkip == p0.enableSkip && (a.g(this.page2, p0.page2) && (a.g(this.action2VideoStart, p0.action2VideoStart) && a.g(this.action2VideoFinish, p0.action2VideoFinish))))))))))) {
          return true;
       }
       return false;
    }
    public final String getAction2VideoFinish(){
       return this.action2VideoFinish;
    }
    public final String getAction2VideoStart(){
       return this.action2VideoStart;
    }
    public final List getCoverUrl(){
       return this.coverUrl;
    }
    public final boolean getEnableSkip(){
       return this.enableSkip;
    }
    public final String getPage2(){
       return this.page2;
    }
    public final boolean getUseHardwareDecoding(){
       return this.useHardwareDecoding;
    }
    public final int getVideoHeight(){
       return this.videoHeight;
    }
    public final String getVideoUrl(){
       return this.videoUrl;
    }
    public final int getVideoWidth(){
       return this.videoWidth;
    }
    public int hashCode(){
       VideoConfig obj = PatchProxy.apply(null, this, VideoConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.videoUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       VideoConfig tcoverUrl = this.coverUrl;
       int i2 = (tcoverUrl != null)? tcoverUrl.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31;
       tcoverUrl = this.useHardwareDecoding;
       int i3 = 1;
       if (tcoverUrl != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tcoverUrl = this.enableSkip;
       if (tcoverUrl == null) {
          i3 = tcoverUrl;
       }
       i1 = (i1 + i3) * 31;
       tcoverUrl = this.page2;
       i2 = (tcoverUrl != null)? tcoverUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcoverUrl = this.action2VideoStart;
       i2 = (tcoverUrl != null)? tcoverUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcoverUrl = this.action2VideoFinish;
       if (tcoverUrl != null) {
          i = tcoverUrl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VideoConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoConfig\(videoUrl="+this.videoUrl+", coverUrl="+this.coverUrl+", videoWidth="+this.videoWidth+", videoHeight="+this.videoHeight+", useHardwareDecoding="+this.useHardwareDecoding+", enableSkip="+this.enableSkip+", page2="+this.page2+", action2VideoStart="+this.action2VideoStart+", action2VideoFinish="+this.action2VideoFinish+"\)";
    }
}
