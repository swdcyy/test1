package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView$ViewData;
import java.io.Serializable;
import java.lang.String;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView$OperationData;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PinocchioLevelView$ViewData implements Serializable	// class@0018f0
{
    public final String content;
    public final PinocchioLevelView$OperationData operationData;
    public final String researchId;
    public final long showMills;
    public final int sourceType;
    public final String title;

    public void PinocchioLevelView$ViewData(String p0,String p1,long p2,String p3,int p4,PinocchioLevelView$OperationData p5){
       super();
       this.title = p0;
       this.content = p1;
       this.showMills = p2;
       this.researchId = p3;
       this.sourceType = p4;
       this.operationData = p5;
    }
    public void PinocchioLevelView$ViewData(String p0,String p1,long p2,String p3,int p4,PinocchioLevelView$OperationData p5,int p6,u p7){
       String str = (p6 & 0x08)? "none": p3;
       int i = (p6 & 0x10)? -1: p4;
       super(p0, p1, p2, str, i, p5);
       return;
    }
    public static PinocchioLevelView$ViewData copy$default(PinocchioLevelView$ViewData p0,String p1,String p2,long p3,String p4,int p5,PinocchioLevelView$OperationData p6,int p7,Object p8){
       PinocchioLevelView$ViewData title;
       PinocchioLevelView$ViewData content;
       PinocchioLevelView$ViewData showMills;
       PinocchioLevelView$ViewData researchId;
       PinocchioLevelView$ViewData sourceType;
       PinocchioLevelView$ViewData operationDat;
       if (p7 & 0x01) {
          title = p0.title;
       }
       if (p7 & 0x02) {
          content = p0.content;
       }
       p8 = content;
       if (p7 & 0x04) {
          showMills = p0.showMills;
       }
       PinocchioLevelView$ViewData viewData = showMills;
       if (p7 & 0x08) {
          researchId = p0.researchId;
       }
       PinocchioLevelView$ViewData viewData1 = researchId;
       if (p7 & 0x10) {
          sourceType = p0.sourceType;
       }
       PinocchioLevelView$ViewData viewData2 = sourceType;
       if (p7 & 0x20) {
          operationDat = p0.operationData;
       }
       return p0.copy(title, p8, viewData, viewData1, viewData2, operationDat);
    }
    public final String component1(){
       return this.title;
    }
    public final String component2(){
       return this.content;
    }
    public final long component3(){
       return this.showMills;
    }
    public final String component4(){
       return this.researchId;
    }
    public final int component5(){
       return this.sourceType;
    }
    public final PinocchioLevelView$OperationData component6(){
       return this.operationData;
    }
    public final PinocchioLevelView$ViewData copy(String p0,String p1,long p2,String p3,int p4,PinocchioLevelView$OperationData p5){
       Object obj;
       if (PatchProxy.isSupport(PinocchioLevelView$ViewData.class)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,Integer.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, this, PinocchioLevelView$ViewData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       PinocchioLevelView$ViewData viewData = new PinocchioLevelView$ViewData(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PinocchioLevelView$ViewData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PinocchioLevelView$ViewData && (a.g(this.title, p0.title) && (a.g(this.content, p0.content) && (!this.showMills - p0.showMills && (a.g(this.researchId, p0.researchId) && (this.sourceType == p0.sourceType && a.g(this.operationData, p0.operationData)))))))) {
          return true;
       }
       return false;
    }
    public final String getContent(){
       return this.content;
    }
    public final PinocchioLevelView$OperationData getOperationData(){
       return this.operationData;
    }
    public final String getResearchId(){
       return this.researchId;
    }
    public final long getShowMills(){
       return this.showMills;
    }
    public final int getSourceType(){
       return this.sourceType;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       PinocchioLevelView$ViewData obj = PatchProxy.apply(null, this, PinocchioLevelView$ViewData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PinocchioLevelView$ViewData tcontent = this.content;
       int i2 = (tcontent != null)? tcontent.hashCode(): 0;
       tcontent = this.showMills;
       i1 = (((i1 + i2) * 31) + (int)(tcontent ^ (tcontent >> 32))) * 31;
       tcontent = this.researchId;
       i2 = (tcontent != null)? tcontent.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.sourceType) * 31;
       tcontent = this.operationData;
       if (tcontent != null) {
          i = tcontent.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PinocchioLevelView$ViewData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ViewData\(title="+this.title+", content="+this.content+", showMills="+this.showMills+", researchId="+this.researchId+", sourceType="+this.sourceType+", operationData="+this.operationData+"\)";
    }
}
