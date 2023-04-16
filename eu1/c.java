package eu1.c;
import java.lang.String;
import sp5.b;
import java.util.Map;
import ut1.f;
import ut1.p;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@0021f9
{
    public final String a;
    public final boolean b;
    public final b c;
    public final Map d;
    public final Map e;
    public final f f;
    public final p g;

    public void c(String p0,boolean p1,b p2,Map p3,Map p4,f p5,p p6){
       a.p(p0, "anchorUserId");
       a.p(p2, "pkWindowSize");
       a.p(p3, "teamWindows");
       a.p(p4, "userWindows");
       a.p(p5, "liveMultiPkInfoModel");
       a.p(p6, "viewConfig");
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
       return this.a;
    }
    public final f b(){
       return this.f;
    }
    public final b c(){
       return this.c;
    }
    public final Map d(){
       return this.d;
    }
    public final Map e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (this.b == p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && a.g(this.g, p0.g))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       int i2 = (tb != null)? tb.hashCode(): 0;
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
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkUIInfo\(anchorUserId="+this.a+", isAnchor="+this.b+", pkWindowSize="+this.c+", teamWindows="+this.d+", userWindows="+this.e+", liveMultiPkInfoModel="+this.f+", viewConfig="+this.g+"\)";
    }
}
