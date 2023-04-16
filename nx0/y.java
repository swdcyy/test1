package nx0.y;
import java.lang.String;
import java.lang.CharSequence;
import java.util.List;
import qd1.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class y	// class@003409
{
    public String a;
    public final String b;
    public final long c;
    public String d;
    public final long e;
    public final CharSequence f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final String k;
    public final boolean l;
    public final a m;

    public void y(String p0,String p1,long p2,String p3,long p4,CharSequence p5,List p6,boolean p7,boolean p8,List p9,String p10,boolean p11,a p12){
       a.p(p5, "afterPartDisplayTitle");
       a.p(p12, "textColorStyleConfig");
       super();
       this.a = null;
       this.b = p1;
       this.c = p2;
       this.d = null;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
    }
    public final String a(){
       return this.d;
    }
    public final List b(){
       return this.g;
    }
    public final String c(){
       return this.k;
    }
    public final List d(){
       return this.j;
    }
    public final String e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof y && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (!this.c - p0.c && (a.g(this.d, p0.d) && (!this.e - p0.e && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (this.h == p0.h && (this.i == p0.i && (a.g(this.j, p0.j) && (a.g(this.k, p0.k) && (this.l == p0.l && a.g(this.m, p0.m))))))))))))))) {
          return true;
       }
       return false;
    }
    public final long f(){
       return this.c;
    }
    public final String g(){
       return this.b;
    }
    public final a h(){
       return this.m;
    }
    public int hashCode(){
       y obj = PatchProxy.apply(null, this, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       y tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       tb = this.c;
       long l = 32;
       i1 = (((i1 + i2) * 31) + (int)(tb ^ (tb >> l))) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       tb = this.e;
       i1 = (((i1 + i2) * 31) + (int)(tb ^ (tb >> l))) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.h;
       int i3 = 1;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.i;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.j;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.k;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.l;
       if (tb == null) {
          i3 = tb;
       }
       i1 = (i1 + i3) * 31;
       tb = this.m;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final void i(String p0){
       this.d = p0;
    }
    public final void j(String p0){
       this.a = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceOverRoomV2ViewParam\(prePartAnimationUriString="+this.a+", prePartDisplayTitle="+this.b+", prePartDisplayDuration="+this.c+", afterPartAnimationUriString="+this.d+", afterPartDisplayDuration="+this.e+", afterPartDisplayTitle="+this.f+", afterPartCentralAvatarUrls="+this.g+", afterPartTitleTextViewUseNumberStyle="+this.h+", enableAfterPartLiveIcon="+this.i+", bottomPartIconUrls="+this.j+", bottomPartDisplayTitle="+this.k+", showBottomPartIconAsCircle="+this.l+", textColorStyleConfig="+this.m+"\)";
    }
}
