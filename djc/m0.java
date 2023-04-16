package djc.m0;
import java.lang.String;
import mhc.q;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;

public final class m0	// class@002207
{
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final boolean e;
    public final q f;
    public final KwaiDialogFragment g;

    public void m0(String p0,String p1,String p2,double p3,boolean p4,q p5,KwaiDialogFragment p6){
       a.p(p0, "imageBytes");
       a.p(p1, "imageUrl");
       a.p(p2, "actionUrl");
       a.p(p6, "fragment");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final String a(){
       return this.c;
    }
    public final double b(){
       return this.d;
    }
    public final q c(){
       return this.f;
    }
    public final String d(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m0 && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (!Double.compare(this.d, p0.d) && (this.e == p0.e && (a.g(this.f, p0.f) && a.g(this.g, p0.g))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m0 obj = PatchProxy.apply(null, this, m0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       m0 tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       long l = Double.doubleToLongBits(this.d);
       i1 = (((i1 + i2) * 31) + (int)(l ^ (l >> 32))) * 31;
       tb = this.e;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ForwardJsCustomBannerBanner\(imageBytes="+this.a+", imageUrl="+this.b+", actionUrl="+this.c+", aspectRatio="+this.d+", hideClicked="+this.e+", forwardBannerListener="+this.f+", fragment="+this.g+"\)";
    }
}
