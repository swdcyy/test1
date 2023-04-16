package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView$ChoiceTag;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PinocchioLevelView$ChoiceTag implements Serializable	// class@0018ed
{
    public final int tagId;
    public final String tagName;

    public void PinocchioLevelView$ChoiceTag(int p0,String p1){
       super();
       this.tagId = p0;
       this.tagName = p1;
    }
    public static PinocchioLevelView$ChoiceTag copy$default(PinocchioLevelView$ChoiceTag p0,int p1,String p2,int p3,Object p4){
       PinocchioLevelView$ChoiceTag tagId;
       PinocchioLevelView$ChoiceTag tagName;
       if (p3 & 0x01) {
          tagId = p0.tagId;
       }
       if (p3 & 0x02) {
          tagName = p0.tagName;
       }
       return p0.copy(tagId, tagName);
    }
    public final int component1(){
       return this.tagId;
    }
    public final String component2(){
       return this.tagName;
    }
    public final PinocchioLevelView$ChoiceTag copy(int p0,String p1){
       if (PatchProxy.isSupport(PinocchioLevelView$ChoiceTag.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, PinocchioLevelView$ChoiceTag.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PinocchioLevelView$ChoiceTag(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PinocchioLevelView$ChoiceTag.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PinocchioLevelView$ChoiceTag && (this.tagId == p0.tagId && a.g(this.tagName, p0.tagName)))) {
          return true;
       }
       return false;
    }
    public final int getTagId(){
       return this.tagId;
    }
    public final String getTagName(){
       return this.tagName;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PinocchioLevelView$ChoiceTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.tagId * 31;
       PinocchioLevelView$ChoiceTag ttagName = this.tagName;
       int i1 = (ttagName != null)? ttagName.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PinocchioLevelView$ChoiceTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChoiceTag\(tagId="+this.tagId+", tagName="+this.tagName+"\)";
    }
}
