package com.facebook.drawee.generic.RoundingParams;
import java.lang.Object;
import com.facebook.drawee.generic.RoundingParams$RoundingMethod;
import java.lang.Class;
import java.lang.Float;
import java.util.Arrays;
import java.lang.Enum;
import ab.e;

public class RoundingParams	// class@00108f
{
    public RoundingParams$RoundingMethod a;
    public boolean b;
    public float[] c;
    public int d;
    public float e;
    public int f;
    public float g;
    public boolean h;
    public boolean i;

    public void RoundingParams(){
       super();
       this.a = RoundingParams$RoundingMethod.BITMAP_ONLY;
       this.b = false;
       this.c = null;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.i = false;
    }
    public static RoundingParams a(){
       RoundingParams roundingPara = new RoundingParams();
       roundingPara.q(true);
       return roundingPara;
    }
    public static RoundingParams b(float p0,float p1,float p2,float p3){
       RoundingParams roundingPara = new RoundingParams();
       roundingPara.m(p0, p1, p2, p3);
       return roundingPara;
    }
    public static RoundingParams c(float p0){
       RoundingParams roundingPara = new RoundingParams();
       roundingPara.n(p0);
       return roundingPara;
    }
    public int d(){
       return this.f;
    }
    public float[] e(){
       return this.c;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || RoundingParams.class != p0.getClass()) {
          return b;
       }
       if (this.b != p0.b) {
          return b;
       }
       if (this.d != p0.d) {
          return b;
       }
       if (Float.compare(p0.e, this.e)) {
          return b;
       }
       if (this.f != p0.f) {
          return b;
       }
       if (Float.compare(p0.g, this.g)) {
          return b;
       }
       if (this.a != p0.a) {
          return b;
       }
       if (this.h != p0.h) {
          return b;
       }
       if (this.i != p0.i) {
          return b;
       }
       return Arrays.equals(this.c, p0.c);
    }
    public final float[] f(){
       if (this.c == null) {
          float[] uofloatArray = new float[8];
          this.c = uofloatArray;
       }
       return this.c;
    }
    public int g(){
       return this.d;
    }
    public boolean h(){
       return this.b;
    }
    public int hashCode(){
       RoundingParams ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       RoundingParams tc = this.c;
       int i2 = (tc != null)? Arrays.hashCode(tc): 0;
       i1 = (((i1 + i2) * 31) + this.d) * 31;
       tc = this.e;
       int i3 = 0;
       i2 = (tc - i3)? Float.floatToIntBits(tc): 0;
       i1 = (((i1 + i2) * 31) + this.f) * 31;
       tc = this.g;
       if (tc - i3) {
          i = Float.floatToIntBits(tc);
       }
       return (((((i1 + i) * 31) + this.h) * 31) + this.i);
    }
    public RoundingParams$RoundingMethod i(){
       return this.a;
    }
    public RoundingParams j(int p0,float p1){
       boolean b = (p1 >= 0)? true: false;
       e.b(b, "the border width cannot be < 0");
       this.e = p1;
       this.f = p0;
       return this;
    }
    public RoundingParams k(int p0){
       this.f = p0;
       return this;
    }
    public RoundingParams l(float p0){
       boolean b = (p0 >= 0)? true: false;
       e.b(b, "the border width cannot be < 0");
       this.e = p0;
       return this;
    }
    public RoundingParams m(float p0,float p1,float p2,float p3){
       float[] uofloatArray = this.f();
       uofloatArray[1] = p0;
       uofloatArray[0] = p0;
       uofloatArray[3] = p1;
       uofloatArray[2] = p1;
       uofloatArray[5] = p2;
       uofloatArray[4] = p2;
       uofloatArray[7] = p3;
       uofloatArray[6] = p3;
       return this;
    }
    public RoundingParams n(float p0){
       Arrays.fill(this.f(), p0);
       return this;
    }
    public RoundingParams o(int p0){
       this.d = p0;
       this.a = RoundingParams$RoundingMethod.OVERLAY_COLOR;
       return this;
    }
    public RoundingParams p(float p0){
       boolean b = (p0 >= 0)? true: false;
       e.b(b, "the padding cannot be < 0");
       this.g = p0;
       return this;
    }
    public RoundingParams q(boolean p0){
       this.b = p0;
       return this;
    }
    public RoundingParams r(RoundingParams$RoundingMethod p0){
       this.a = p0;
       return this;
    }
    public RoundingParams s(boolean p0){
       this.h = p0;
       return this;
    }
}
