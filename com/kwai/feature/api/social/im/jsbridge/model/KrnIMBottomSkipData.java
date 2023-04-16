package com.kwai.feature.api.social.im.jsbridge.model.KrnIMBottomSkipData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KrnIMBottomSkipData implements Serializable	// class@0010f5
{
    public final String clickElementPackageInfo;
    public final int offsetY;
    public final String showElementPackageInfo;
    public final String subBiz;
    public final String targetId;
    public final int targetType;
    public final String text;

    public void KrnIMBottomSkipData(String p0,int p1,String p2,String p3,int p4,String p5,String p6){
       a.p(p0, "subBiz");
       super();
       this.subBiz = p0;
       this.targetType = p1;
       this.targetId = p2;
       this.text = p3;
       this.offsetY = p4;
       this.showElementPackageInfo = p5;
       this.clickElementPackageInfo = p6;
    }
    public void KrnIMBottomSkipData(String p0,int p1,String p2,String p3,int p4,String p5,String p6,int p7,u p8){
       String str = (p7 & 0x01)? "0": p0;
       int i = (p7 & 0x02)? 0: p1;
       int i1 = (p7 & 0x10)? 0: p4;
       super(str, i, p2, p3, i1, p5, p6);
       return;
    }
    public static KrnIMBottomSkipData copy$default(KrnIMBottomSkipData p0,String p1,int p2,String p3,String p4,int p5,String p6,String p7,int p8,Object p9){
       KrnIMBottomSkipData subBiz;
       KrnIMBottomSkipData targetType;
       KrnIMBottomSkipData targetId;
       KrnIMBottomSkipData text;
       KrnIMBottomSkipData offsetY;
       KrnIMBottomSkipData showElementP;
       KrnIMBottomSkipData clickElement;
       if (p8 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p8 & 0x02) {
          targetType = p0.targetType;
       }
       p9 = targetType;
       if (p8 & 0x04) {
          targetId = p0.targetId;
       }
       KrnIMBottomSkipData krnIMBottomS = targetId;
       if (p8 & 0x08) {
          text = p0.text;
       }
       KrnIMBottomSkipData krnIMBottomS1 = text;
       if (p8 & 0x10) {
          offsetY = p0.offsetY;
       }
       KrnIMBottomSkipData krnIMBottomS2 = offsetY;
       if (p8 & 0x20) {
          showElementP = p0.showElementPackageInfo;
       }
       KrnIMBottomSkipData krnIMBottomS3 = showElementP;
       if (p8 & 0x40) {
          clickElement = p0.clickElementPackageInfo;
       }
       return p0.copy(subBiz, p9, krnIMBottomS, krnIMBottomS1, krnIMBottomS2, krnIMBottomS3, clickElement);
    }
    public final String component1(){
       return this.subBiz;
    }
    public final int component2(){
       return this.targetType;
    }
    public final String component3(){
       return this.targetId;
    }
    public final String component4(){
       return this.text;
    }
    public final int component5(){
       return this.offsetY;
    }
    public final String component6(){
       return this.showElementPackageInfo;
    }
    public final String component7(){
       return this.clickElementPackageInfo;
    }
    public final KrnIMBottomSkipData copy(String p0,int p1,String p2,String p3,int p4,String p5,String p6){
       KrnIMBottomSkipData obj;
       object oobject = p0;
       if (PatchProxy.isSupport(KrnIMBottomSkipData.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),p2,p3,Integer.valueOf(p4),p5,p6};
          obj = PatchProxy.apply(objArray, this, KrnIMBottomSkipData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "subBiz");
       obj = new KrnIMBottomSkipData(p0, p1, p2, p3, p4, p5, p6);
       return v9;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnIMBottomSkipData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnIMBottomSkipData && (a.g(this.subBiz, p0.subBiz) && (this.targetType == p0.targetType && (a.g(this.targetId, p0.targetId) && (a.g(this.text, p0.text) && (this.offsetY == p0.offsetY && (a.g(this.showElementPackageInfo, p0.showElementPackageInfo) && a.g(this.clickElementPackageInfo, p0.clickElementPackageInfo))))))))) {
          return true;
       }
       return false;
    }
    public final String getClickElementPackageInfo(){
       return this.clickElementPackageInfo;
    }
    public final int getOffsetY(){
       return this.offsetY;
    }
    public final String getShowElementPackageInfo(){
       return this.showElementPackageInfo;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final String getTargetId(){
       return this.targetId;
    }
    public final int getTargetType(){
       return this.targetType;
    }
    public final String getText(){
       return this.text;
    }
    public int hashCode(){
       KrnIMBottomSkipData obj = PatchProxy.apply(null, this, KrnIMBottomSkipData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.targetType) * 31;
       KrnIMBottomSkipData ttargetId = this.targetId;
       int i2 = (ttargetId != null)? ttargetId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttargetId = this.text;
       i2 = (ttargetId != null)? ttargetId.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.offsetY) * 31;
       ttargetId = this.showElementPackageInfo;
       i2 = (ttargetId != null)? ttargetId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttargetId = this.clickElementPackageInfo;
       if (ttargetId != null) {
          i = ttargetId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnIMBottomSkipData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnIMBottomSkipData\(subBiz="+this.subBiz+", targetType="+this.targetType+", targetId="+this.targetId+", text="+this.text+", offsetY="+this.offsetY+", showElementPackageInfo="+this.showElementPackageInfo+", clickElementPackageInfo="+this.clickElementPackageInfo+"\)";
    }
}
