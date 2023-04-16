package nx0.m;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class m	// class@0033f4
{
    public final List a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final boolean g;

    public void m(List p0,String p1,String p2,List p3,String p4,String p5,boolean p6){
       a.p(p3, "afterPartAnimationUrls");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final List a(){
       return this.d;
    }
    public final List b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && this.g == p0.g)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m obj = PatchProxy.apply(null, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       m tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       m tg = this.g;
       if (tg != null) {
          tg = 1;
       }
       return (i1 + tg);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceOverRoomV2ResourceModel\(prePartAnimationUrls="+this.a+", prePartPreloadFileName="+this.b+", prePartPreloadDefaultFileName="+this.c+", afterPartAnimationUrls="+this.d+", afterPartPreloadFileName="+this.e+", afterPartPreloadDefaultFileName="+this.f+", enablePreload="+this.g+"\)";
    }
}
