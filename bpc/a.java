package bpc.a;
import tvc.e;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a extends e	// class@00045a
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Size l;
    public final boolean m;

    public void a(){
       super(false, false, false, false, false, false, false, false, false, false, false, null, false, 8191, null);
    }
    public void a(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,boolean p8,boolean p9,boolean p10,Size p11,boolean p12){
       a.p(p11, "size");
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
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
    }
    public void a(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,boolean p8,boolean p9,boolean p10,Size p11,boolean p12,int p13,u p14){
       int i = p13;
       int i1 = 1;
       int i2 = (i & 0x01)? 1: p0;
       int i3 = (i & 0x02)? 1: p1;
       int i4 = (i & 0x04)? 1: p2;
       int i5 = (i & 0x08)? 1: p3;
       int i6 = (i & 0x10)? 1: p4;
       if (!(i & 0x20)) {
          i1 = p5;
       }
       int i7 = 0;
       int i8 = (i & 0x40)? 0: p6;
       int i9 = (i & 0x0080)? 0: p7;
       int i10 = (i & 0x0100)? 0: p8;
       int i11 = (i & 0x0200)? 0: p9;
       int i12 = (i & 0x0400)? 0: p10;
       Size size = (i & 0x0800)? new Size(i7, i7): 0;
       if (!(i & 0x1000)) {
          i7 = p12;
       }
       super(i2, i3, i4, i5, i6, i1, i8, i9, i10, i11, i12, size, i7);
       return;
    }
    public static a a(a p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,boolean p8,boolean p9,boolean p10,boolean p11,Size p12,boolean p13,int p14,Object p15){
       a uoa1;
       a uoa = p0;
       int i = p14;
       a a = (i & 0x01)? uoa.a: p1;
       a b = (i & 0x02)? uoa.b: p2;
       a c = (i & 0x04)? uoa.c: p3;
       a d = (i & 0x08)? uoa.d: p4;
       a e = (i & 0x10)? uoa.e: p5;
       a f = (i & 0x20)? uoa.f: p6;
       a g = (i & 0x40)? uoa.g: p7;
       a h = (i & 0x0080)? uoa.h: p8;
       a i1 = (i & 0x0100)? uoa.i: p9;
       a j = (i & 0x0200)? uoa.j: p10;
       a k = (i & 0x0400)? uoa.k: p11;
       a l = (i & 0x0800)? uoa.l: p12;
       a m = (i & 0x1000)? uoa.m: p13;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[13];
          objArray[0] = Boolean.valueOf(a);
          objArray[1] = Boolean.valueOf(b);
          objArray[2] = Boolean.valueOf(c);
          objArray[3] = Boolean.valueOf(d);
          objArray[4] = Boolean.valueOf(e);
          objArray[5] = Boolean.valueOf(f);
          objArray[6] = Boolean.valueOf(g);
          objArray[7] = Boolean.valueOf(h);
          objArray[8] = Boolean.valueOf(i1);
          objArray[9] = Boolean.valueOf(j);
          objArray[10] = Boolean.valueOf(k);
          objArray[11] = l;
          objArray[12] = Boolean.valueOf(m);
          uoa1 = m;
          uoa = PatchProxy.apply(objArray, uoa, a.class, "2");
          if (uoa != PatchProxyResult.class) {
          label_0121 :
             return uoa;
          }
       }else {
          uoa1 = m;
       }
       a.p(l, "size");
       p0 = new a(a, b, c, d, e, f, g, h, i1, j, k, l, uoa1);
       goto label_0121 ;
    }
    public final boolean b(){
       return this.d;
    }
    public final boolean c(){
       return this.b;
    }
    public final boolean d(){
       return this.g;
    }
    public final boolean e(){
       return this.f;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof a) {
          return b;
       }
       if (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (this.g == p0.g && (this.h == p0.h && (this.i == p0.i && (this.j == p0.j && (this.k == p0.k && a.g(this.l, p0.l)))))))))) {
          b = true;
       }
    label_005c :
       return b;
    }
    public final boolean f(){
       return this.e;
    }
    public final boolean g(){
       return this.c;
    }
    public final boolean h(){
       return this.a;
    }
    public int hashCode(){
       int i1;
       int i2;
       a obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       a tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.g;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.h;
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
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.k;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.l;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.m;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public final boolean i(){
       return this.k;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipPanelState\(undoButtonEnable="+this.a+", deleteButtonEnable="+this.b+", splitButtonEnable="+this.c+", changeSpeechEnable="+this.d+", rotateButtonEnable="+this.e+", reorderEnable="+this.f+", hasTimeReverseEffect="+this.g+", rotateChanged="+this.h+", showLoading="+this.i+", clipSpeedPanelOpened="+this.j+", isReordering="+this.k+", size="+this.l+", openReorderPanel="+this.m+"\)";
    }
}
