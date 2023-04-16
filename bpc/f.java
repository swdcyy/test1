package bpc.f;
import tvc.e;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import fpc.a;
import java.lang.Boolean;
import yoc.j;
import java.lang.StringBuilder;

public final class f extends e	// class@000460
{
    public final List a;
    public final int b;
    public final int c;
    public final double d;
    public final double e;

    public void f(){
       super(null, 0, 0, 0, 0, 31, null);
    }
    public void f(List p0,int p1,int p2,double p3,double p4){
       a.p(p0, "timelineSegmentList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void f(List p0,int p1,int p2,double p3,double p4,int p5,u p6){
       ArrayList uArrayList = (p5 & 0x01)? new ArrayList(): 0;
       int i = (p5 & 0x02)? 0: p1;
       int i1 = (p5 & 0x04)? -1: p2;
       int i2 = 0;
       int i3 = (p5 & 0x08)? i2: p3;
       if (!(p5 & 0x10)) {
          i2 = p4;
       }
       super(uArrayList, i, i1, i3, i2);
       return;
    }
    public static f a(f p0,List p1,int p2,int p3,double p4,double p5,int p6,Object p7){
       f a;
       f b;
       f c;
       f d;
       f e;
       if (p6 & 0x01) {
          a = p0.a;
       }
       if (p6 & 0x02) {
          b = p0.b;
       }
       p7 = b;
       if (p6 & 0x04) {
          c = p0.c;
       }
       f uof = c;
       if (p6 & 0x08) {
          d = p0.d;
       }
       f uof1 = d;
       if (p6 & 0x10) {
          e = p0.e;
       }
       f uof2 = e;
       Objects.requireNonNull(p0);
       b = f.class;
       if (PatchProxy.isSupport(b)) {
          Object[] objArray = new Object[]{a,Integer.valueOf(p7),Integer.valueOf(uof),Double.valueOf(uof1),Double.valueOf(uof2)};
          p0 = PatchProxy.apply(objArray, p0, b, "3");
          if (p0 != PatchProxyResult.class) {
          label_006c :
             return p0;
          }
       }
       a.p(a, "timelineSegmentList");
       b = new f(a, p7, uof, uof1, uof2);
       goto label_006c ;
    }
    public final double b(){
       f obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.b;
       if (obj < null) {
          return 0x3ff0000000000000;
       }
       return this.a.get(obj).q();
    }
    public final int c(){
       return this.b;
    }
    public final int d(){
       return this.c;
    }
    public final double e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof f) {
          return b;
       }
       if (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && j.a(this.d, p0.d)))) {
          b = true;
       }
    label_003c :
       return b;
    }
    public final List f(){
       return this.a;
    }
    public final double g(){
       return this.e;
    }
    public int hashCode(){
       f obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       long l = Double.doubleToLongBits(this.d);
       l = Double.doubleToLongBits(this.e);
       return ((((((((i * 31) + this.b) * 31) + this.c) * 31) + (int)(l ^ (l >> 32))) * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TimelineState\(timelineSegmentList="+this.a+", pointedIndex="+this.b+", selectedIndex="+this.c+", timelineDuration="+this.d+", videoDuration="+this.e+"\)";
    }
}
