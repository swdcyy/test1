package bpc.d;
import tvc.e;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d extends e	// class@00045e
{
    public final boolean a;
    public boolean b;
    public final String c;
    public final int d;

    public void d(){
       super(false, false, null, 0, 15, null);
    }
    public void d(boolean p0,boolean p1,String p2,int p3){
       a.p(p2, "content");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void d(boolean p0,boolean p1,String p2,int p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = false;
       }
       if (p4 & 0x02) {
          p1 = false;
       }
       p2 = (p4 & 0x04)? "": null;
       if (p4 & 0x08) {
          p3 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static d a(d p0,boolean p1,boolean p2,String p3,int p4,int p5,Object p6){
       d a;
       d b;
       d c;
       d d;
       if (p5 & 0x01) {
          a = p0.a;
       }
       if (p5 & 0x02) {
          b = p0.b;
       }
       if (p5 & 0x04) {
          c = p0.c;
       }
       if (p5 & 0x08) {
          d = p0.d;
       }
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(d.class)) {
          p0 = PatchProxy.applyFourRefs(Boolean.valueOf(a), Boolean.valueOf(b), c, Integer.valueOf(d), p0, d.class, "2");
          if (p0 != PatchProxyResult.class) {
          label_004a :
             return p0;
          }
       }
       a.p(c, "content");
       p0 = new d(a, b, c, d);
       goto label_004a ;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof d) {
          return b;
       }
       if (this.a == p0.a && (this.b == p0.b && (a.g(this.c, p0.c) && this.d == p0.d))) {
          b = true;
       }
    label_0038 :
       return b;
    }
    public int hashCode(){
       int i1;
       d tc;
       d obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       d tb = this.b;
       if (tb == null) {
          tc = tb;
       }
       i1 = (i1 + i) * 31;
       tc = this.c;
       i = (tc != null)? tc.hashCode(): 0;
       return (((i1 + i) * 31) + this.d);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipTipsState\(needShow="+this.a+", isShowing="+this.b+", content="+this.c+", tipType="+this.d+"\)";
    }
}
