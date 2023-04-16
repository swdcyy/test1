package com.yxcorp.gifshow.v3.editor.effectv2.data.HTTextParam;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HTTextParam	// class@000f4a
{
    public final double animeInRatio;
    public final double animeOutRatio;
    public final double textRangeRatio;
    public final float textRotate;
    public final float textScale;

    public void HTTextParam(){
       super(0, 0, 0, 0, 0, 31, null);
    }
    public void HTTextParam(double p0,double p1,double p2,float p3,float p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0x3fd3333333333333;
       }
       if (p5 & 0x02) {
          p1 = 0x3fd3333333333333;
       }
       if (p5 & 0x04) {
          p2 = 0x3fee666666666666;
       }
       if (p5 & 0x08) {
          p3 = 2.80f;
       }
       if (p5 & 0x10) {
          p4 = 0;
       }
       super();
       this.animeInRatio = p0;
       this.animeOutRatio = p1;
       this.textRangeRatio = p2;
       this.textScale = p3;
       this.textRotate = p4;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HTTextParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HTTextParam && (!Double.compare(this.animeInRatio, p0.animeInRatio) && (!Double.compare(this.animeOutRatio, p0.animeOutRatio) && (!Double.compare(this.textRangeRatio, p0.textRangeRatio) && (!Float.compare(this.textScale, p0.textScale) && !Float.compare(this.textRotate, p0.textRotate))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, HTTextParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.animeInRatio);
       long l1 = Double.doubleToLongBits(this.animeOutRatio);
       l1 = Double.doubleToLongBits(this.textRangeRatio);
       return (((((((((int)(l ^ (l >> 32)) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + Float.floatToIntBits(this.textScale)) * 31) + Float.floatToIntBits(this.textRotate));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HTTextParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HTTextParam\(animeInRatio="+this.animeInRatio+", animeOutRatio="+this.animeOutRatio+", textRangeRatio="+this.textRangeRatio+", textScale="+this.textScale+", textRotate="+this.textRotate+"\)";
    }
}
