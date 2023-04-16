package com.kuaishou.live.basic.ability.LiveToastAbility$Params;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveToastAbility$Params	// class@000c98
{
    public final Integer durationType;
    public final String text;

    public void LiveToastAbility$Params(String p0,Integer p1){
       super();
       this.text = p0;
       this.durationType = p1;
    }
    public static LiveToastAbility$Params copy$default(LiveToastAbility$Params p0,String p1,Integer p2,int p3,Object p4){
       LiveToastAbility$Params text;
       LiveToastAbility$Params durationType;
       if (p3 & 0x01) {
          text = p0.text;
       }
       if (p3 & 0x02) {
          durationType = p0.durationType;
       }
       return p0.copy(text, durationType);
    }
    public final String component1(){
       return this.text;
    }
    public final Integer component2(){
       return this.durationType;
    }
    public final LiveToastAbility$Params copy(String p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveToastAbility$Params.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveToastAbility$Params(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveToastAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveToastAbility$Params && (a.g(this.text, p0.text) && a.g(this.durationType, p0.durationType)))) {
          return true;
       }
       return false;
    }
    public final Integer getDurationType(){
       return this.durationType;
    }
    public final String getText(){
       return this.text;
    }
    public int hashCode(){
       LiveToastAbility$Params obj = PatchProxy.apply(null, this, LiveToastAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.text;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveToastAbility$Params tdurationTyp = this.durationType;
       if (tdurationTyp != null) {
          i = tdurationTyp.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveToastAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(text="+this.text+", durationType="+this.durationType+"\)";
    }
}
