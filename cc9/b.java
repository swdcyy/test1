package cc9.b;
import sa6.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;
import nsd.u;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import msd.l;
import java.lang.StringBuilder;

public final class b extends b	// class@000507
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final AssistantResponse g;
    public final g h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public void b(){
       super(false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, 0x1ffff, null);
    }
    public void b(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,AssistantResponse p6,g p7,boolean p8,boolean p9,boolean p10,boolean p11,boolean p12,boolean p13,boolean p14,boolean p15,boolean p16){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
    }
    public void b(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,AssistantResponse p6,g p7,boolean p8,boolean p9,boolean p10,boolean p11,boolean p12,boolean p13,boolean p14,boolean p15,boolean p16,int p17,u p18){
       int i = p17;
       int i1 = (i & 0x01)? 0: p0;
       int i2 = (i & 0x02)? 0: p1;
       int i3 = (i & 0x04)? 0: p2;
       int i4 = (i & 0x08)? 0: p3;
       int i5 = (i & 0x10)? 0: p4;
       int i6 = (i & 0x20)? 0: p5;
       int i7 = (i & 0x0100)? 0: p8;
       int i8 = (i & 0x0200)? 0: p9;
       int i9 = (i & 0x0400)? 1: p10;
       int i10 = (i & 0x0800)? 1: p11;
       int i11 = (i & 0x1000)? 1: p12;
       int i12 = (i & 0x2000)? 1: p13;
       int i13 = (i & 0x4000)? 1: p14;
       int i14 = (i & 0x8000)? 0: p15;
       i = (i & 0x10000)? 1: p16;
       super(i1, i2, i3, i4, i5, i6, 0, 0, i7, i8, i9, i10, i11, i12, i13, i14, i);
       return;
    }
    public static b a(b p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,AssistantResponse p7,g p8,boolean p9,boolean p10,boolean p11,boolean p12,boolean p13,boolean p14,boolean p15,boolean p16,boolean p17,int p18,Object p19){
       b uob3;
       b uob4;
       b uob5;
       int b1;
       b uob = p0;
       int i = p18;
       b a = (i & 0x01)? uob.a: p1;
       b b = (i & 0x02)? uob.b: p2;
       b c = (i & 0x04)? uob.c: p3;
       b d = (i & 0x08)? uob.d: p4;
       b e = (i & 0x10)? uob.e: p5;
       b f = (i & 0x20)? uob.f: p6;
       b g = (i & 0x40)? uob.g: p7;
       b h = (i & 0x0080)? uob.h: p8;
       b i1 = (i & 0x0100)? uob.i: p9;
       b j = (i & 0x0200)? uob.j: p10;
       b k = (i & 0x0400)? uob.k: p11;
       b l = (i & 0x0800)? uob.l: p12;
       b m = (i & 0x1000)? uob.m: p13;
       b n = (i & 0x2000)? uob.n: p14;
       b uob1 = n;
       n = (i & 0x4000)? uob.o: p15;
       b uob2 = n;
       n = (i & 0x8000)? uob.p: p16;
       b q = (i & 0x10000)? uob.q: p17;
       Objects.requireNonNull(p0);
       uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[17];
          objArray[0] = Boolean.valueOf(a);
          objArray[1] = Boolean.valueOf(b);
          objArray[2] = Boolean.valueOf(c);
          objArray[3] = Boolean.valueOf(d);
          objArray[4] = Boolean.valueOf(e);
          objArray[5] = Boolean.valueOf(f);
          objArray[6] = g;
          objArray[7] = h;
          objArray[8] = Boolean.valueOf(i1);
          objArray[9] = Boolean.valueOf(j);
          objArray[10] = Boolean.valueOf(k);
          objArray[11] = Boolean.valueOf(l);
          objArray[12] = Boolean.valueOf(m);
          objArray[13] = Boolean.valueOf(uob1);
          objArray[14] = Boolean.valueOf(uob2);
          objArray[15] = Boolean.valueOf(n);
          objArray[16] = Boolean.valueOf(q);
          uob3 = q;
          uob4 = m;
          uob5 = n;
          uob = PatchProxy.apply(objArray, p0, uob, "2");
          if (uob != PatchProxyResult.class) {
          label_0173 :
             return uob;
          }
       }else {
          uob3 = q;
          uob4 = m;
          uob5 = n;
       }
       p0 = new b(a, b, c, d, e, f, g, h, i1, j, k, l, uob4, uob1, uob2, uob5, uob3);
       goto label_0173 ;
    }
    public final AssistantResponse b(){
       return this.g;
    }
    public final boolean c(){
       return this.c;
    }
    public final boolean d(){
       return this.b;
    }
    public final boolean e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && (this.f == p0.f && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && (this.i == p0.i && (this.j == p0.j && (this.k == p0.k && (this.l == p0.l && (this.m == p0.m && (this.n == p0.n && (this.o == p0.o && (this.p == p0.p && this.q == p0.q)))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.d;
    }
    public final boolean g(){
       return this.i;
    }
    public final boolean h(){
       return this.j;
    }
    public int hashCode(){
       int i1;
       int i2;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       b tb = this.b;
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
       int i3 = 0;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.h;
       if (tb != null) {
          i3 = tb.hashCode();
       }
       i1 = (i1 + i3) * 31;
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
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.m;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.n;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.o;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.p;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.q;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public final boolean i(){
       return this.n;
    }
    public final boolean j(){
       return this.m;
    }
    public final boolean k(){
       return this.k;
    }
    public final boolean l(){
       return this.l;
    }
    public final boolean m(){
       return this.p;
    }
    public final boolean n(){
       return this.o;
    }
    public final g o(l p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "discernStateFunction");
       obj = this.h;
       if (obj == null) {
          g og = new g(null, null, null, false, null, 31, null);
       }
       return p0.invoke(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AssistantState\(isEnterAssistantMode="+this.a+", isDetecting="+this.b+", isDetectError="+this.c+", isFlashing="+this.d+", downloadModel="+this.e+", isPanelUIShowing="+this.f+", assistantResponse="+this.g+", discernState="+this.h+", isLoading="+this.i+", isLoadingError="+this.j+", isShowMusicBtn="+this.k+", isShowPrettifyBtn="+this.l+", isShowCollectionBtn="+this.m+", isShowCloseBtn="+this.n+", isShowRefreshBtn="+this.o+", isShowRecordBtn="+this.p+", isShowAlbumBtn="+this.q+"\)";
    }
}
