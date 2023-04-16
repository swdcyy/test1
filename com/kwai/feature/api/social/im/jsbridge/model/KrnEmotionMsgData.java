package com.kwai.feature.api.social.im.jsbridge.model.KrnEmotionMsgData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KrnEmotionMsgData implements Serializable	// class@0010f0
{
    public final String emotionId;
    public final String packageId;
    public final int scene;
    public final String targetId;
    public final int targetType;

    public void KrnEmotionMsgData(int p0,String p1,String p2,String p3,int p4){
       super();
       this.targetType = p0;
       this.targetId = p1;
       this.packageId = p2;
       this.emotionId = p3;
       this.scene = p4;
    }
    public void KrnEmotionMsgData(int p0,String p1,String p2,String p3,int p4,int p5,u p6){
       int i = (p5 & 0x01)? 0: p0;
       int i1 = (p5 & 0x10)? 0: p4;
       super(i, p1, p2, p3, i1);
       return;
    }
    public static KrnEmotionMsgData copy$default(KrnEmotionMsgData p0,int p1,String p2,String p3,String p4,int p5,int p6,Object p7){
       KrnEmotionMsgData targetType;
       KrnEmotionMsgData targetId;
       KrnEmotionMsgData packageId;
       KrnEmotionMsgData emotionId;
       KrnEmotionMsgData scene;
       if (p6 & 0x01) {
          targetType = p0.targetType;
       }
       if (p6 & 0x02) {
          targetId = p0.targetId;
       }
       p7 = targetId;
       if (p6 & 0x04) {
          packageId = p0.packageId;
       }
       KrnEmotionMsgData krnEmotionMs = packageId;
       if (p6 & 0x08) {
          emotionId = p0.emotionId;
       }
       KrnEmotionMsgData krnEmotionMs1 = emotionId;
       if (p6 & 0x10) {
          scene = p0.scene;
       }
       return p0.copy(targetType, p7, krnEmotionMs, krnEmotionMs1, scene);
    }
    public final int component1(){
       return this.targetType;
    }
    public final String component2(){
       return this.targetId;
    }
    public final String component3(){
       return this.packageId;
    }
    public final String component4(){
       return this.emotionId;
    }
    public final int component5(){
       return this.scene;
    }
    public final KrnEmotionMsgData copy(int p0,String p1,String p2,String p3,int p4){
       Object obj;
       if (PatchProxy.isSupport(KrnEmotionMsgData.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, KrnEmotionMsgData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KrnEmotionMsgData krnEmotionMs = new KrnEmotionMsgData(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnEmotionMsgData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnEmotionMsgData && (this.targetType == p0.targetType && (a.g(this.targetId, p0.targetId) && (a.g(this.packageId, p0.packageId) && (a.g(this.emotionId, p0.emotionId) && this.scene == p0.scene)))))) {
          return true;
       }
       return false;
    }
    public final String getEmotionId(){
       return this.emotionId;
    }
    public final String getPackageId(){
       return this.packageId;
    }
    public final int getScene(){
       return this.scene;
    }
    public final String getTargetId(){
       return this.targetId;
    }
    public final int getTargetType(){
       return this.targetType;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KrnEmotionMsgData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.targetType * 31;
       KrnEmotionMsgData ttargetId = this.targetId;
       int i1 = 0;
       int i2 = (ttargetId != null)? ttargetId.hashCode(): 0;
       i = (i + i2) * 31;
       ttargetId = this.packageId;
       i2 = (ttargetId != null)? ttargetId.hashCode(): 0;
       i = (i + i2) * 31;
       ttargetId = this.emotionId;
       if (ttargetId != null) {
          i1 = ttargetId.hashCode();
       }
       return (((i + i1) * 31) + this.scene);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnEmotionMsgData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnEmotionMsgData\(targetType="+this.targetType+", targetId="+this.targetId+", packageId="+this.packageId+", emotionId="+this.emotionId+", scene="+this.scene+"\)";
    }
}
