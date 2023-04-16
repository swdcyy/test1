package iq1.c;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@00297c
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;

    public void c(float p0,float p1,float p2,float p3,float p4,int p5,float p6,int p7,int p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public void c(float p0,float p1,float p2,float p3,float p4,int p5,float p6,int p7,int p8,int p9,u p10){
       float f = (p9 & 0x10)? 0: p4;
       int i = (p9 & 0x20)? Integer.MAX_VALUE: p5;
       float f1 = (p9 & 0x40)? 0x3f800000: p6;
       super(p0, p1, p2, p3, f, i, f1, p7, p8);
       return;
    }
    public final float a(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (!Float.compare(this.a, p0.a) && (!Float.compare(this.b, p0.b) && (!Float.compare(this.c, p0.c) && (!Float.compare(this.d, p0.d) && (!Float.compare(this.e, p0.e) && (this.f == p0.f && (!Float.compare(this.g, p0.g) && (this.h == p0.h && this.i == p0.i)))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h) * 31) + this.i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiLineAnimationLayoutInfo\(leftRatio="+this.a+", topRatio="+this.b+", widthRatio="+this.c+", heightRatio="+this.d+", animationWidthRatio="+this.e+", animationMaxWidthInRatioMode="+this.f+", animationWhRatio="+this.g+", animationWidthPx="+this.h+", animationHeightPx="+this.i+"\)";
    }
}
