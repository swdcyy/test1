package cc9.g;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g	// class@00050c
{
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public void g(){
       super(null, null, null, false, null, 31, null);
    }
    public void g(String p0,String p1,String p2,boolean p3,String p4){
       a.p(p0, "title");
       a.p(p1, "content");
       a.p(p4, "discernLabel");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void g(String p0,String p1,String p2,boolean p3,String p4,int p5,u p6){
       String str = (p5 & 0x01)? "": null;
       String str1 = (p5 & 0x02)? "": null;
       boolean b = (p5 & 0x08)? false: p3;
       String str2 = (p5 & 0x10)? "": null;
       super(str, str1, null, b, str2);
       return;
    }
    public final g a(String p0,String p1,String p2,boolean p3,String p4){
       Object obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "title");
       a.p(p1, "content");
       a.p(p4, "discernLabel");
       g og1 = new g(p0, p1, p2, p3, p4);
       return obj;
    }
    public final String b(){
       return this.c;
    }
    public final boolean c(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (this.d == p0.d && a.g(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       g tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DiscernState\(title="+this.a+", content="+this.b+", showToast="+this.c+", isShowingPanel="+this.d+", discernLabel="+this.e+"\)";
    }
}
