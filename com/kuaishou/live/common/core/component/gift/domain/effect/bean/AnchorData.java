package com.kuaishou.live.common.core.component.gift.domain.effect.bean.AnchorData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AnchorData implements Serializable	// class@001199
{
    public final int anchorGender;
    public final String anchorId;
    public final String anchorName;

    public void AnchorData(String p0,String p1,int p2){
       a.p(p0, "anchorId");
       a.p(p1, "anchorName");
       super();
       this.anchorId = p0;
       this.anchorName = p1;
       this.anchorGender = p2;
    }
    public static AnchorData copy$default(AnchorData p0,String p1,String p2,int p3,int p4,Object p5){
       AnchorData anchorId;
       AnchorData anchorName;
       AnchorData anchorGender;
       if (p4 & 0x01) {
          anchorId = p0.anchorId;
       }
       if (p4 & 0x02) {
          anchorName = p0.anchorName;
       }
       if (p4 & 0x04) {
          anchorGender = p0.anchorGender;
       }
       return p0.copy(anchorId, anchorName, anchorGender);
    }
    public final String component1(){
       return this.anchorId;
    }
    public final String component2(){
       return this.anchorName;
    }
    public final int component3(){
       return this.anchorGender;
    }
    public final AnchorData copy(String p0,String p1,int p2){
       if (PatchProxy.isSupport(AnchorData.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, AnchorData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "anchorId");
       a.p(p1, "anchorName");
       return new AnchorData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AnchorData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AnchorData && (a.g(this.anchorId, p0.anchorId) && (a.g(this.anchorName, p0.anchorName) && this.anchorGender == p0.anchorGender)))) {
          return true;
       }
       return false;
    }
    public final int getAnchorGender(){
       return this.anchorGender;
    }
    public final String getAnchorId(){
       return this.anchorId;
    }
    public final String getAnchorName(){
       return this.anchorName;
    }
    public int hashCode(){
       AnchorData obj = PatchProxy.apply(null, this, AnchorData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.anchorId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       AnchorData tanchorName = this.anchorName;
       if (tanchorName != null) {
          i = tanchorName.hashCode();
       }
       return (((i1 + i) * 31) + this.anchorGender);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AnchorData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AnchorData\(anchorId="+this.anchorId+", anchorName="+this.anchorName+", anchorGender="+this.anchorGender+"\)";
    }
}
