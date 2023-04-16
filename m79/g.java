package m79.g;
import java.lang.Float;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g	// class@002e26
{
    public int a;
    public int b;
    public int c;
    public int d;
    public Float e;
    public boolean f;

    public void g(){
       super(0, 0, 0, 0, null, false, 63, null);
    }
    public void g(int p0,int p1,int p2,int p3,Float p4,boolean p5,int p6,u p7){
       if (p6 & 0x01) {
          p0 = 0;
       }
       if (p6 & 0x02) {
          p1 = 0;
       }
       if (p6 & 0x04) {
          p2 = 0;
       }
       if (p6 & 0x08) {
          p3 = 0;
       }
       if (p6 & 0x10) {
          p4 = null;
       }
       if (p6 & 0x20) {
          p5 = true;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       return;
    }
    public final int a(){
       return this.d;
    }
    public final int b(){
       return this.c;
    }
    public final Float c(){
       return this.e;
    }
    public final int d(){
       return this.a;
    }
    public final int e(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (a.g(this.e, p0.e) && this.f == p0.f))))))) {
          return true;
       }
       return false;
    }
    public final void f(boolean p0){
       this.f = p0;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
       g te = this.e;
       int i1 = (te != null)? te.hashCode(): 0;
       i = (i + i1) * 31;
       te = this.f;
       if (te != null) {
          i1 = 1;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareViewInfo\(x="+this.a+", y="+this.b+", width="+this.c+", height="+this.d+", widthHeightRatio="+this.e+", enableSwipe="+this.f+"\)";
    }
}
