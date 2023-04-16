package com.kuaishou.growth.pendant.model.ShrinkDoubleParams;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.ShrinkDoubleParams$a;
import nsd.u;
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

public final class ShrinkDoubleParams implements Serializable	// class@00068a
{
    public final String absorbDoubleStatusText;
    public final int clickDoubleAnimCircles;
    public final String coinAnimResUrl;
    public final String doubleStatusImageUrl;
    public final String undoubleStatusImageUrl;
    public static final ShrinkDoubleParams$a Companion;
    public static final long serialVersionUID;

    static {
       ShrinkDoubleParams.Companion = new ShrinkDoubleParams$a(null);
    }
    public void ShrinkDoubleParams(){
       super(0, null, null, null, null, 31, null);
    }
    public void ShrinkDoubleParams(int p0){
       super(p0, null, null, null, null, 30, null);
    }
    public void ShrinkDoubleParams(int p0,String p1){
       super(p0, p1, null, null, null, 28, null);
    }
    public void ShrinkDoubleParams(int p0,String p1,String p2){
       super(p0, p1, p2, null, null, 24, null);
    }
    public void ShrinkDoubleParams(int p0,String p1,String p2,String p3){
       super(p0, p1, p2, p3, null, 16, null);
    }
    public void ShrinkDoubleParams(int p0,String p1,String p2,String p3,String p4){
       a.p(p1, "coinAnimResUrl");
       a.p(p2, "undoubleStatusImageUrl");
       a.p(p3, "doubleStatusImageUrl");
       a.p(p4, "absorbDoubleStatusText");
       super();
       this.clickDoubleAnimCircles = p0;
       this.coinAnimResUrl = p1;
       this.undoubleStatusImageUrl = p2;
       this.doubleStatusImageUrl = p3;
       this.absorbDoubleStatusText = p4;
    }
    public void ShrinkDoubleParams(int p0,String p1,String p2,String p3,String p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = -1;
       }
       String str = "";
       String str1 = (p5 & 0x02)? str: p1;
       String str2 = (p5 & 0x04)? str: p2;
       String str3 = (p5 & 0x08)? str: p3;
       if (!(p5 & 0x10)) {
          str = p4;
       }
       super(p0, str1, str2, str3, str);
       return;
    }
    public static ShrinkDoubleParams copy$default(ShrinkDoubleParams p0,int p1,String p2,String p3,String p4,String p5,int p6,Object p7){
       ShrinkDoubleParams clickDoubleA;
       ShrinkDoubleParams coinAnimResU;
       ShrinkDoubleParams undoubleStat;
       ShrinkDoubleParams doubleStatus;
       ShrinkDoubleParams absorbDouble;
       if (p6 & 0x01) {
          clickDoubleA = p0.clickDoubleAnimCircles;
       }
       if (p6 & 0x02) {
          coinAnimResU = p0.coinAnimResUrl;
       }
       p7 = coinAnimResU;
       if (p6 & 0x04) {
          undoubleStat = p0.undoubleStatusImageUrl;
       }
       ShrinkDoubleParams shrinkDouble = undoubleStat;
       if (p6 & 0x08) {
          doubleStatus = p0.doubleStatusImageUrl;
       }
       ShrinkDoubleParams shrinkDouble1 = doubleStatus;
       if (p6 & 0x10) {
          absorbDouble = p0.absorbDoubleStatusText;
       }
       return p0.copy(clickDoubleA, p7, shrinkDouble, shrinkDouble1, absorbDouble);
    }
    public final int component1(){
       return this.clickDoubleAnimCircles;
    }
    public final String component2(){
       return this.coinAnimResUrl;
    }
    public final String component3(){
       return this.undoubleStatusImageUrl;
    }
    public final String component4(){
       return this.doubleStatusImageUrl;
    }
    public final String component5(){
       return this.absorbDoubleStatusText;
    }
    public final ShrinkDoubleParams copy(int p0,String p1,String p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(ShrinkDoubleParams.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, ShrinkDoubleParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "coinAnimResUrl");
       a.p(p2, "undoubleStatusImageUrl");
       a.p(p3, "doubleStatusImageUrl");
       a.p(p4, "absorbDoubleStatusText");
       ShrinkDoubleParams shrinkDouble = new ShrinkDoubleParams(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShrinkDoubleParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ShrinkDoubleParams && (this.clickDoubleAnimCircles == p0.clickDoubleAnimCircles && (a.g(this.coinAnimResUrl, p0.coinAnimResUrl) && (a.g(this.undoubleStatusImageUrl, p0.undoubleStatusImageUrl) && (a.g(this.doubleStatusImageUrl, p0.doubleStatusImageUrl) && a.g(this.absorbDoubleStatusText, p0.absorbDoubleStatusText))))))) {
          return true;
       }
       return false;
    }
    public final String getAbsorbDoubleStatusText(){
       return this.absorbDoubleStatusText;
    }
    public final int getClickDoubleAnimCircles(){
       return this.clickDoubleAnimCircles;
    }
    public final String getCoinAnimResUrl(){
       return this.coinAnimResUrl;
    }
    public final String getDoubleStatusImageUrl(){
       return this.doubleStatusImageUrl;
    }
    public final String getUndoubleStatusImageUrl(){
       return this.undoubleStatusImageUrl;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ShrinkDoubleParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.clickDoubleAnimCircles * 31;
       ShrinkDoubleParams tcoinAnimRes = this.coinAnimResUrl;
       int i1 = 0;
       int i2 = (tcoinAnimRes != null)? tcoinAnimRes.hashCode(): 0;
       i = (i + i2) * 31;
       tcoinAnimRes = this.undoubleStatusImageUrl;
       i2 = (tcoinAnimRes != null)? tcoinAnimRes.hashCode(): 0;
       i = (i + i2) * 31;
       tcoinAnimRes = this.doubleStatusImageUrl;
       i2 = (tcoinAnimRes != null)? tcoinAnimRes.hashCode(): 0;
       i = (i + i2) * 31;
       tcoinAnimRes = this.absorbDoubleStatusText;
       if (tcoinAnimRes != null) {
          i1 = tcoinAnimRes.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShrinkDoubleParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShrinkDoubleParams\(clickDoubleAnimCircles="+this.clickDoubleAnimCircles+", coinAnimResUrl="+this.coinAnimResUrl+", undoubleStatusImageUrl="+this.undoubleStatusImageUrl+", doubleStatusImageUrl="+this.doubleStatusImageUrl+", absorbDoubleStatusText="+this.absorbDoubleStatusText+"\)";
    }
}
