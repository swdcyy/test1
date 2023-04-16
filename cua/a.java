package cua.a;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@0023c4
{
    public final Boolean a;
    public final Integer b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;

    public void a(){
       Boolean fALSE = Boolean.FALSE;
       super(fALSE, Integer.valueOf(0), fALSE, Boolean.TRUE, fALSE, fALSE, fALSE, fALSE, fALSE);
    }
    public void a(Boolean p0,Integer p1,Boolean p2,Boolean p3,Boolean p4,Boolean p5,Boolean p6,Boolean p7,Boolean p8){
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
    public final Boolean a(){
       return this.h;
    }
    public final Boolean b(){
       return this.f;
    }
    public final Boolean c(){
       return this.g;
    }
    public final Boolean d(){
       return this.e;
    }
    public final Boolean e(){
       return this.i;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && a.g(this.i, p0.i))))))))))) {
          return true;
       }
       return false;
    }
    public final Boolean f(){
       return this.c;
    }
    public final Boolean g(){
       return this.a;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tb = this.b;
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
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.h;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.i;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HomeFollowMagicFaceRecoConfig\(isNewMockFeedCardStyle="+this.a+", magicFaceRecoType="+this.b+", "+"enableShowMagicFaceReco="+this.c+", enableDownload="+this.d+", enableShowBottomView="+this.e+", "+"enableShareIconStyleV1="+this.f+", enableShareIconStyleV2="+this.g+", "+"enableShareContainerAlginParentBottom="+this.h+", enableShowFansPromoteV2="+this.i+')';
    }
}
