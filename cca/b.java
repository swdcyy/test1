package cca.b;
import tvc.e;
import cca.b$a;
import nsd.u;
import cca.a;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b extends e	// class@00059f
{
    public final a a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Size j;
    public final double k;
    public final boolean l;
    public int m;
    public String n;
    public boolean o;
    public boolean p;
    public static final b$a q;

    static {
       b.q = new b$a(null);
    }
    public void b(){
       super(null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xffff, null);
    }
    public void b(a p0,boolean p1,boolean p2,List p3,List p4,int p5,boolean p6,boolean p7,boolean p8,Size p9,double p10,boolean p11,int p12,String p13,boolean p14,boolean p15){
       int i = this;
       a.p(p3, "tabInfoList");
       a.p(p4, "medias");
       a.p(p9, "videoSize");
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
    }
    public void b(a p0,boolean p1,boolean p2,List p3,List p4,int p5,boolean p6,boolean p7,boolean p8,Size p9,double p10,boolean p11,int p12,String p13,boolean p14,boolean p15,int p16,u p17){
       int i = p16;
       int i1 = (i & 0x02)? 1: p1;
       int i2 = 0;
       int i3 = (i & 0x04)? 0: p2;
       ArrayList uArrayList = (i & 0x08)? new ArrayList(): 0;
       ArrayList uArrayList1 = (i & 0x10)? new ArrayList(): 0;
       int i4 = (i & 0x20)? -1: p5;
       int i5 = (i & 0x40)? 1: p6;
       int i6 = (i & 0x0080)? 0: p7;
       int i7 = (i & 0x0100)? 0: p8;
       Size size = (i & 0x0200)? new Size(i2, i2): 0;
       int i8 = (i & 0x0400)? 0: p10;
       int i9 = (i & 0x0800)? 1: p11;
       i2 = (i & 0x1000)? 0: p12;
       String str = (i & 0x2000)? "default": 0;
       int i10 = (i & 0x4000)? 0: p14;
       i = (i & 0x8000)? 0: p15;
       super(0, i1, i3, uArrayList, uArrayList1, i4, i5, i6, i7, size, i8, i9, i2, str, i10, i);
       return;
    }
    public static b a(b p0,a p1,boolean p2,boolean p3,List p4,List p5,int p6,boolean p7,boolean p8,boolean p9,Size p10,double p11,boolean p12,int p13,String p14,boolean p15,boolean p16,int p17,Object p18){
       b uob3;
       b uob4;
       b uob5;
       int b1;
       b uob = p0;
       int i = p17;
       b a = (i & 0x01)? uob.a: p1;
       b b = (i & 0x02)? uob.b: p2;
       b c = (i & 0x04)? uob.c: p3;
       b d = (i & 0x08)? uob.d: p4;
       b e = (i & 0x10)? uob.e: null;
       b f = (i & 0x20)? uob.f: p6;
       b g = (i & 0x40)? uob.g: p7;
       b h = (i & 0x0080)? uob.h: p8;
       b i1 = (i & 0x0100)? uob.i: p9;
       b j = (i & 0x0200)? uob.j: p10;
       b k = (i & 0x0400)? uob.k: p11;
       b l = (i & 0x0800)? uob.l: p12;
       b m = (i & 0x1000)? uob.m: p13;
       b uob1 = m;
       m = (i & 0x2000)? uob.n: p14;
       b uob2 = m;
       m = (i & 0x4000)? uob.o: p15;
       b p = (i & 0x8000)? uob.p: p16;
       Objects.requireNonNull(p0);
       uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[16];
          objArray[0] = a;
          objArray[1] = Boolean.valueOf(b);
          objArray[2] = Boolean.valueOf(c);
          objArray[3] = d;
          objArray[4] = e;
          objArray[5] = Integer.valueOf(f);
          objArray[6] = Boolean.valueOf(g);
          objArray[7] = Boolean.valueOf(h);
          objArray[8] = Boolean.valueOf(i1);
          objArray[9] = j;
          objArray[10] = Double.valueOf(k);
          objArray[11] = Boolean.valueOf(l);
          objArray[12] = Integer.valueOf(uob1);
          objArray[13] = uob2;
          objArray[14] = Boolean.valueOf(m);
          objArray[15] = Boolean.valueOf(p);
          uob3 = p;
          uob4 = l;
          uob5 = m;
          uob = PatchProxy.apply(objArray, p0, uob, "1");
          if (uob != PatchProxyResult.class) {
          label_0160 :
             return uob;
          }
       }else {
          uob3 = p;
          uob4 = l;
          uob5 = m;
       }
       a.p(d, "tabInfoList");
       a.p(e, "medias");
       a.p(j, "videoSize");
       p0 = new b(a, b, c, d, e, f, g, h, i1, j, k, uob4, uob1, uob2, uob5, uob3);
       goto label_0160 ;
    }
    public final boolean b(){
       return this.o;
    }
    public final int c(){
       return this.f;
    }
    public final String d(){
       return this.n;
    }
    public final a e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (this.f == p0.f && (this.g == p0.g && (this.h == p0.h && (this.i == p0.i && (a.g(this.j, p0.j) && (!Double.compare(this.k, p0.k) && (this.l == p0.l && (this.m == p0.m && (a.g(this.n, p0.n) && (this.o == p0.o && this.p == p0.p))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.l;
    }
    public final List g(){
       return this.d;
    }
    public final Size h(){
       return this.j;
    }
    public int hashCode(){
       int i3;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tb = this.b;
       int i2 = 1;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.d;
       i3 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tb = this.e;
       i3 = (tb != null)? tb.hashCode(): 0;
       i1 = (((i1 + i3) * 31) + this.f) * 31;
       tb = this.g;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.h;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.i;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.j;
       i3 = (tb != null)? tb.hashCode(): 0;
       long l = Double.doubleToLongBits(this.k);
       i1 = (((i1 + i3) * 31) + (int)(l ^ (l >> 32))) * 31;
       tb = this.l;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (((i1 + i3) * 31) + this.m) * 31;
       tb = this.n;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       b to = this.o;
       if (to != null) {
          to = 1;
       }
       i1 = (i1 + to) * 31;
       to = this.p;
       if (to == null) {
          i2 = to;
       }
       return (i1 + i2);
    }
    public final boolean i(){
       return this.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoTemplateRootState\(loadingPageState="+this.a+", isPanelShowing="+this.b+", isProgressShowing="+this.c+", tabInfoList="+this.d+", medias="+this.e+", currentSelectedIndex="+this.f+", isPlaying="+this.g+", isManuallySetVolume="+this.h+", hasVocal="+this.i+", videoSize="+this.j+", displayDuration="+this.k+", needAutoApplyTemplate="+this.l+", actionCode="+this.m+", lastSelectedAICutSubItemId="+this.n+", aiCutItemHasFocus="+this.o+", isAICutSubItemLoading="+this.p+"\)";
    }
}
