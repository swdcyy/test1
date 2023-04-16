package bpc.e;
import tvc.e;
import nsd.u;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e extends e	// class@00045f
{
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public void e(){
       super(0, false, 0, 0, false, 0, 63, null);
    }
    public void e(int p0,boolean p1,int p2,int p3,boolean p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public void e(int p0,boolean p1,int p2,int p3,boolean p4,int p5,int p6,u p7){
       int i = (p6 & 0x01)? -1: p0;
       int i1 = (p6 & 0x02)? 1: p1;
       int i2 = (p6 & 0x04)? 0: p2;
       int i3 = (p6 & 0x08)? 0: p3;
       int i4 = (p6 & 0x10)? 0: p4;
       p6 = (p6 & 0x20)? -1: p5;
       super(i, i1, i2, i3, i4, p6);
       return;
    }
    public static e a(e p0,int p1,boolean p2,int p3,int p4,boolean p5,int p6,int p7,Object p8){
       e a;
       e b;
       e c;
       e d;
       e e;
       e f;
       if (p7 & 0x01) {
          a = p0.a;
       }
       if (p7 & 0x02) {
          b = p0.b;
       }
       p8 = b;
       if (p7 & 0x04) {
          c = p0.c;
       }
       e uoe = c;
       if (p7 & 0x08) {
          d = p0.d;
       }
       e uoe1 = d;
       if (p7 & 0x10) {
          e = p0.e;
       }
       e uoe2 = e;
       if (p7 & 0x20) {
          f = p0.f;
       }
       e uoe3 = f;
       Objects.requireNonNull(p0);
       b = e.class;
       if (PatchProxy.isSupport(b)) {
          Object[] objArray = new Object[]{Integer.valueOf(a),Boolean.valueOf(p8),Integer.valueOf(uoe),Integer.valueOf(uoe1),Boolean.valueOf(uoe2),Integer.valueOf(uoe3)};
          p0 = PatchProxy.apply(objArray, p0, b, "1");
          if (p0 != PatchProxyResult.class) {
          label_007a :
             return p0;
          }
       }
       b = new e(a, p8, uoe, uoe1, uoe2, uoe3);
       goto label_007a ;
    }
    public final boolean b(){
       return this.b;
    }
    public final int c(){
       return this.d;
    }
    public final int d(){
       return this.f;
    }
    public final boolean e(){
       return this.e;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof e) {
          return b;
       }
       if (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && this.f == p0.f))))) {
          b = true;
       }
    label_002d :
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       e tb = this.b;
       int i1 = 1;
       if (tb != null) {
          tb = 1;
       }
       i = (((((i + tb) * 31) + this.c) * 31) + this.d) * 31;
       tb = this.e;
       if (tb == null) {
          i1 = tb;
       }
       return (((i + i1) * 31) + this.f);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipTransitionState\(selectedIndex="+this.a+", applyToAll="+this.b+", transitionType="+this.c+", lastApply2AllTransition="+this.d+", transitionPanelStatus="+this.e+", segmentTransitionIndex="+this.f+"\)";
    }
}
