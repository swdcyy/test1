package com.kwai.feature.api.danmaku.model.DanmakuInputHint;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuInputHint implements Serializable	// class@000e7a
{
    public final String hintOfEn;
    public final String hintOfZh_hans;
    public final String hintOfZh_hant;

    public void DanmakuInputHint(String p0,String p1,String p2){
       super();
       this.hintOfEn = p0;
       this.hintOfZh_hans = p1;
       this.hintOfZh_hant = p2;
    }
    public static DanmakuInputHint copy$default(DanmakuInputHint p0,String p1,String p2,String p3,int p4,Object p5){
       DanmakuInputHint hintOfEn;
       DanmakuInputHint hintOfZh_han;
       DanmakuInputHint hintOfZh_han1;
       if (p4 & 0x01) {
          hintOfEn = p0.hintOfEn;
       }
       if (p4 & 0x02) {
          hintOfZh_han = p0.hintOfZh_hans;
       }
       if (p4 & 0x04) {
          hintOfZh_han1 = p0.hintOfZh_hant;
       }
       return p0.copy(hintOfEn, hintOfZh_han, hintOfZh_han1);
    }
    public final String component1(){
       return this.hintOfEn;
    }
    public final String component2(){
       return this.hintOfZh_hans;
    }
    public final String component3(){
       return this.hintOfZh_hant;
    }
    public final DanmakuInputHint copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DanmakuInputHint.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DanmakuInputHint(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuInputHint.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DanmakuInputHint && (a.g(this.hintOfEn, p0.hintOfEn) && (a.g(this.hintOfZh_hans, p0.hintOfZh_hans) && a.g(this.hintOfZh_hant, p0.hintOfZh_hant))))) {
          return true;
       }
       return false;
    }
    public final String getHintOfEn(){
       return this.hintOfEn;
    }
    public final String getHintOfZh_hans(){
       return this.hintOfZh_hans;
    }
    public final String getHintOfZh_hant(){
       return this.hintOfZh_hant;
    }
    public int hashCode(){
       DanmakuInputHint obj = PatchProxy.apply(null, this, DanmakuInputHint.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.hintOfEn;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DanmakuInputHint thintOfZh_ha = this.hintOfZh_hans;
       int i2 = (thintOfZh_ha != null)? thintOfZh_ha.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       thintOfZh_ha = this.hintOfZh_hant;
       if (thintOfZh_ha != null) {
          i = thintOfZh_ha.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuInputHint.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuInputHint\(hintOfEn="+this.hintOfEn+", hintOfZh_hans="+this.hintOfZh_hans+", hintOfZh_hant="+this.hintOfZh_hant+"\)";
    }
}
