package com.kwai.library.wolverine.entity.TypePerformance;
import java.io.Serializable;
import com.kwai.library.wolverine.entity.ElementType;
import com.kwai.library.wolverine.entity.TypeInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import trd.t;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class TypePerformance implements Serializable	// class@000abf
{
    public final ElementType b;
    public Integer lastScore;
    public final int score;
    public final String scoreReason;
    public final List typeInfoList;

    public void TypePerformance(ElementType p0,TypeInfo p1,int p2){
       a.p(p0, "type");
       a.p(p1, "typeInfo");
       super(p0, t.k(p1), p2, p1.getType());
    }
    public void TypePerformance(ElementType p0,List p1,int p2,String p3){
       a.p(p0, "type");
       a.p(p1, "typeInfoList");
       a.p(p3, "scoreReason");
       super();
       this.b = p0;
       this.typeInfoList = p1;
       this.score = p2;
       this.scoreReason = p3;
    }
    public static TypePerformance copy$default(TypePerformance p0,ElementType p1,List p2,int p3,String p4,int p5,Object p6){
       TypePerformance b;
       TypePerformance typeInfoList;
       TypePerformance score;
       TypePerformance scoreReason;
       if (p5 & 0x01) {
          b = p0.b;
       }
       if (p5 & 0x02) {
          typeInfoList = p0.typeInfoList;
       }
       if (p5 & 0x04) {
          score = p0.score;
       }
       if (p5 & 0x08) {
          scoreReason = p0.scoreReason;
       }
       return p0.copy(b, typeInfoList, score, scoreReason);
    }
    public final ElementType component1(){
       return this.b;
    }
    public final List component2(){
       return this.typeInfoList;
    }
    public final int component3(){
       return this.score;
    }
    public final String component4(){
       return this.scoreReason;
    }
    public final TypePerformance copy(ElementType p0,List p1,int p2,String p3){
       a.p(p0, "type");
       a.p(p1, "typeInfoList");
       a.p(p3, "scoreReason");
       return new TypePerformance(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof TypePerformance && (a.g(this.b, p0.b) && (a.g(this.typeInfoList, p0.typeInfoList) && (this.score == p0.score && a.g(this.scoreReason, p0.scoreReason)))))) {
          return true;
       }
       return false;
    }
    public final Integer getLastScore(){
       return this.lastScore;
    }
    public final int getScore(){
       return this.score;
    }
    public final String getScoreReason(){
       return this.scoreReason;
    }
    public final ElementType getType(){
       return this.b;
    }
    public final List getTypeInfoList(){
       return this.typeInfoList;
    }
    public int hashCode(){
       TypePerformance tb = this.b;
       int i = 0;
       int i1 = (tb != null)? tb.hashCode(): 0;
       i1 = i1 * 31;
       TypePerformance ttypeInfoLis = this.typeInfoList;
       int i2 = (ttypeInfoLis != null)? ttypeInfoLis.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.score) * 31;
       ttypeInfoLis = this.scoreReason;
       if (ttypeInfoLis != null) {
          i = ttypeInfoLis.hashCode();
       }
       return (i1 + i);
    }
    public final void setLastScore(Integer p0){
       this.lastScore = p0;
    }
    public String toString(){
       return "TypePerformance\(type="+this.b+", typeInfoList="+this.typeInfoList+", score="+this.score+", scoreReason="+this.scoreReason+"\)";
    }
}
