package aoa.a$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@000294
{
    public String a;
    public String b;
    public boolean c;
    public int d;

    public void a$a(){
       super(null, null, false, 0, 15, null);
    }
    public void a$a(String p0,String p1,boolean p2,int p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = false;
       }
       if (p4 & 0x08) {
          p3 = 1;
       }
       super();
       this.a = null;
       this.b = null;
       this.c = p2;
       this.d = p3;
       return;
    }
    public final boolean a(){
       return this.c;
    }
    public final String b(){
       return this.a;
    }
    public final String c(){
       return this.b;
    }
    public final void d(int p0){
       this.d = p0;
    }
    public final void e(boolean p0){
       this.c = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public final void f(String p0){
       this.a = p0;
    }
    public final void g(String p0){
       this.b = p0;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       a$a tc = this.c;
       if (tc != null) {
          tc = 1;
       }
       return (((i1 + tc) * 31) + this.d);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InterestTagModel\(tagId="+this.a+", tagName="+this.b+", selected="+this.c+", mType="+this.d+"\)";
    }
}
