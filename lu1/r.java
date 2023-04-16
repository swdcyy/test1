package lu1.r;
import com.yxcorp.widget.KwaiRadiusStyles;
import nsd.u;
import lnc.a1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class r	// class@00304e
{
    public final int a;
    public final float b;
    public final KwaiRadiusStyles c;
    public final int d;
    public int e;
    public float f;
    public int g;
    public final int h;

    public void r(int p0,float p1,KwaiRadiusStyles p2,int p3,int p4,float p5,int p6,int p7,int p8,u p9){
       if (p8 & 0x10) {
          p4 = 0;
       }
       if (p8 & 0x20) {
          p5 = 0x3f800000;
       }
       if (p8 & 0x40) {
          p6 = a1.d(R.dimen.arg_RES_7f070334);
       }
       if (p8 & 0x0080) {
          p7 = a1.d(R.dimen.arg_RES_7f0702e8);
       }
       a.p(p2, "radiusStyles");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       return;
    }
    public final int a(){
       return this.h;
    }
    public final KwaiRadiusStyles b(){
       return this.c;
    }
    public final float c(){
       return this.f;
    }
    public final int d(){
       return this.a;
    }
    public final int e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof r && (this.a == p0.a && (!Float.compare(this.b, p0.b) && (a.g(this.c, p0.c) && (this.d == p0.d && (this.e == p0.e && (!Float.compare(this.f, p0.f) && (this.g == p0.g && this.h == p0.h))))))))) {
          return true;
       }
       return false;
    }
    public final int f(){
       return this.g;
    }
    public final int g(){
       return this.d;
    }
    public final float h(){
       return this.b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.a * 31) + Float.floatToIntBits(this.b)) * 31;
       r tc = this.c;
       int i1 = (tc != null)? tc.hashCode(): 0;
       return (((((((((((i + i1) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(this.f)) * 31) + this.g) * 31) + this.h);
    }
    public final void i(float p0){
       this.f = p0;
    }
    public final void j(int p0){
       this.e = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkRenderCellUserTagStyleConfig\(userTagHeightPx="+this.a+", userTagTextSizeDp="+this.b+", radiusStyles="+this.c+", userTagPaddingHorizontalPx="+this.d+", userTagLayoutType="+this.e+", userTagAlpha="+this.f+", userTagMarginPx="+this.g+", minWidth="+this.h+"\)";
    }
}
