package com.kwai.component.photo.detail.core.log.vse.opt.VseOptCollectObj;
import java.lang.String;
import com.yxcorp.gifshow.log.model.StatMetaData;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.Arrays;
import java.lang.Number;
import org.json.JSONObject;
import java.lang.System;
import java.lang.StringBuilder;

public final class VseOptCollectObj	// class@000a2b
{
    public final int adType;
    public final long createTime;
    public final boolean isVideoType;
    public final String page2;
    public final String photoId;
    public final long playDuration;
    public final int plcBizType;
    public final String sessionId;
    public final StatMetaData statMetaData;
    public final String type;
    public final int vseOptVersion;
    public final byte[] vsePb;

    public void VseOptCollectObj(String p0,long p1,byte[] p2,long p3,String p4,String p5,String p6,boolean p7,int p8,int p9,int p10,StatMetaData p11){
       a.p(p0, "type");
       super();
       this.type = p0;
       this.createTime = p1;
       this.vsePb = p2;
       this.playDuration = p3;
       this.page2 = p4;
       this.photoId = p5;
       this.sessionId = p6;
       this.isVideoType = p7;
       this.adType = p8;
       this.plcBizType = p9;
       this.vseOptVersion = p10;
       this.statMetaData = p11;
    }
    public void VseOptCollectObj(String p0,long p1,byte[] p2,long p3,String p4,String p5,String p6,boolean p7,int p8,int p9,int p10,StatMetaData p11,int p12,u p13){
       int i = p12;
       boolean b = (i & 0x0080)? true: p7;
       int i1 = (i & 0x0100)? -1: p8;
       int i2 = (i & 0x0200)? -1: p9;
       int i3 = (i & 0x0400)? -1: p10;
       super(p0, p1, p2, p3, p4, p5, p6, b, i1, i2, i3, p11);
       return;
    }
    public static VseOptCollectObj copy$default(VseOptCollectObj p0,String p1,long p2,byte[] p3,long p4,String p5,String p6,String p7,boolean p8,int p9,int p10,int p11,StatMetaData p12,int p13,Object p14){
       VseOptCollectObj vseOptCollec = p0;
       int i = p13;
       VseOptCollectObj type = (i & 0x01)? vseOptCollec.type: p1;
       VseOptCollectObj createTime = (i & 0x02)? vseOptCollec.createTime: p2;
       VseOptCollectObj vsePb = (i & 0x04)? vseOptCollec.vsePb: p3;
       VseOptCollectObj playDuration = (i & 0x08)? vseOptCollec.playDuration: p4;
       VseOptCollectObj page2 = (i & 0x10)? vseOptCollec.page2: p5;
       VseOptCollectObj photoId = (i & 0x20)? vseOptCollec.photoId: p6;
       VseOptCollectObj sessionId = (i & 0x40)? vseOptCollec.sessionId: p7;
       VseOptCollectObj isVideoType = (i & 0x0080)? vseOptCollec.isVideoType: p8;
       VseOptCollectObj adType = (i & 0x0100)? vseOptCollec.adType: p9;
       VseOptCollectObj plcBizType = (i & 0x0200)? vseOptCollec.plcBizType: p10;
       VseOptCollectObj vseOptVersio = (i & 0x0400)? vseOptCollec.vseOptVersion: p11;
       VseOptCollectObj statMetaData = (i & 0x0800)? vseOptCollec.statMetaData: p12;
       return p0.copy(type, createTime, vsePb, playDuration, page2, photoId, sessionId, isVideoType, adType, plcBizType, vseOptVersio, statMetaData);
    }
    public final String component1(){
       return this.type;
    }
    public final int component10(){
       return this.plcBizType;
    }
    public final int component11(){
       return this.vseOptVersion;
    }
    public final StatMetaData component12(){
       return this.statMetaData;
    }
    public final long component2(){
       return this.createTime;
    }
    public final byte[] component3(){
       return this.vsePb;
    }
    public final long component4(){
       return this.playDuration;
    }
    public final String component5(){
       return this.page2;
    }
    public final String component6(){
       return this.photoId;
    }
    public final String component7(){
       return this.sessionId;
    }
    public final boolean component8(){
       return this.isVideoType;
    }
    public final int component9(){
       return this.adType;
    }
    public final VseOptCollectObj copy(String p0,long p1,byte[] p2,long p3,String p4,String p5,String p6,boolean p7,int p8,int p9,int p10,StatMetaData p11){
       object oobject = p0;
       VseOptCollectObj vseOptCollec = VseOptCollectObj.class;
       if (PatchProxy.isSupport(vseOptCollec)) {
          Object[] objArray = new Object[12];
          objArray[0] = oobject;
          objArray[1] = Long.valueOf(p1);
          objArray[2] = p2;
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          objArray[11] = p11;
          Object obj = PatchProxy.apply(objArray, this, vseOptCollec, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "type");
       vseOptCollec = new VseOptCollectObj(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return v16;
    }
    public boolean equals(Object p0){
       VseOptCollectObj vseOptCollec = VseOptCollectObj.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, vseOptCollec, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(vseOptCollec, class) ^ true) {
          return false;
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.component.photo.detail.core.log.vse.opt.VseOptCollectObj");
          if (a.g(this.type, p0.type) ^ true) {
             return false;
          }else if(this.createTime - p0.createTime){
             return false;
          }else {
             vseOptCollec = this.vsePb;
             if (vseOptCollec != null) {
                VseOptCollectObj vsePb = p0.vsePb;
                if (vsePb == null) {
                   return false;
                }else if(!Arrays.equals(vseOptCollec, vsePb)){
                   return false;
                }
             }else if(p0.vsePb != null){
                return false;
             }
             if (this.playDuration - p0.playDuration) {
                return false;
             }else if(a.g(this.page2, p0.page2) ^ true){
                return false;
             }else if(a.g(this.photoId, p0.photoId) ^ true){
                return false;
             }else if(a.g(this.sessionId, p0.sessionId) ^ true){
                return false;
             }else if(this.isVideoType != p0.isVideoType){
                return false;
             }else if(this.adType != p0.adType){
                return false;
             }else if(this.plcBizType != p0.plcBizType){
                return false;
             }else if(this.vseOptVersion != p0.vseOptVersion){
                return false;
             }else if(a.g(this.statMetaData, p0.statMetaData) ^ true){
                return false;
             }else {
                return true;
             }
          }
       }
    }
    public final int getAdType(){
       return this.adType;
    }
    public final long getCreateTime(){
       return this.createTime;
    }
    public final String getPage2(){
       return this.page2;
    }
    public final String getPhotoId(){
       return this.photoId;
    }
    public final long getPlayDuration(){
       return this.playDuration;
    }
    public final int getPlcBizType(){
       return this.plcBizType;
    }
    public final String getSessionId(){
       return this.sessionId;
    }
    public final StatMetaData getStatMetaData(){
       return this.statMetaData;
    }
    public final String getType(){
       return this.type;
    }
    public final int getVseOptVersion(){
       return this.vseOptVersion;
    }
    public final byte[] getVsePb(){
       return this.vsePb;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, VseOptCollectObj.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       VseOptCollectObj tcreateTime = this.createTime;
       long l = 32;
       int i = (((this.type).hashCode() * 31) + (int)(tcreateTime ^ (tcreateTime >> l))) * 31;
       tcreateTime = this.vsePb;
       int i1 = 0;
       int i2 = (tcreateTime != null)? Arrays.hashCode(tcreateTime): 0;
       VseOptCollectObj tplayDuratio = this.playDuration;
       i = (((i + i2) * 31) + (int)(tplayDuratio ^ (tplayDuratio >> l))) * 31;
       tcreateTime = this.page2;
       i2 = (tcreateTime != null)? tcreateTime.hashCode(): 0;
       i = (i + i2) * 31;
       tcreateTime = this.photoId;
       i2 = (tcreateTime != null)? tcreateTime.hashCode(): 0;
       i = (i + i2) * 31;
       tcreateTime = this.sessionId;
       i2 = (tcreateTime != null)? tcreateTime.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = (this.isVideoType != null)? 1231: 1237;
       i = (((((((i + i2) * 31) + this.adType) * 31) + this.plcBizType) * 31) + this.vseOptVersion) * 31;
       tcreateTime = this.statMetaData;
       if (tcreateTime != null) {
          i1 = tcreateTime.hashCode();
       }
       return (i + i1);
    }
    public final boolean isVideoType(){
       return this.isVideoType;
    }
    public final String toCustomEventVal(){
       JSONObject obj = PatchProxy.apply(null, this, VseOptCollectObj.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       obj.put("type", this.type);
       obj.put("createTime", this.createTime);
       obj.put("reportTimeDiff", (System.currentTimeMillis() - this.createTime));
       obj.put("playDuration", this.playDuration);
       obj.put("page2", this.page2);
       obj.put("photoId", this.photoId);
       obj.put("sessionId", this.sessionId);
       obj.put("isVideoType", this.isVideoType);
       obj.put("adType", this.adType);
       obj.put("plcBizType", this.plcBizType);
       obj.put("vseOptVersion", this.vseOptVersion);
       String str = obj.toString();
       a.o(str, "jsonObject.toString\(\)");
       return str;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VseOptCollectObj.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VseOptCollectObj\(type="+this.type+", createTime="+this.createTime+", vsePb="+Arrays.toString(this.vsePb)+", playDuration="+this.playDuration+", page2="+this.page2+", photoId="+this.photoId+", sessionId="+this.sessionId+", isVideoType="+this.isVideoType+", adType="+this.adType+", plcBizType="+this.plcBizType+", vseOptVersion="+this.vseOptVersion+", statMetaData="+this.statMetaData+"\)";
    }
}
