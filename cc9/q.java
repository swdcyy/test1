package cc9.q;
import sa6.b;
import java.util.HashMap;
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
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import cc9.h;
import ac9.g;
import java.lang.Number;
import java.lang.StringBuilder;

public final class q extends b	// class@000517
{
    public final HashMap a;
    public final int b;
    public final int c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public boolean g;
    public final boolean h;

    public void q(){
       super(null, 0, 0, null, false, false, false, false, 255, null);
    }
    public void q(HashMap p0,int p1,int p2,List p3,boolean p4,boolean p5,boolean p6,boolean p7){
       a.p(p0, "stateMap");
       a.p(p3, "recommendList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public void q(HashMap p0,int p1,int p2,List p3,boolean p4,boolean p5,boolean p6,boolean p7,int p8,u p9){
       int i = p8;
       HashMap hashMap = (i & 0x01)? new HashMap(): p0;
       int i1 = -1;
       int i2 = (i & 0x02)? -1: p1;
       if (!(i & 0x04)) {
          i1 = p2;
       }
       ArrayList uArrayList = (i & 0x08)? new ArrayList(): p3;
       int i3 = 0;
       int i4 = (i & 0x10)? 0: p4;
       int i5 = (i & 0x20)? 0: p5;
       int i6 = (i & 0x40)? 0: p6;
       if (!(i & 0x0080)) {
          i3 = p7;
       }
       super(hashMap, i2, i1, uArrayList, i4, i5, i6, i3);
       return;
    }
    public static q a(q p0,HashMap p1,int p2,int p3,List p4,boolean p5,boolean p6,boolean p7,boolean p8,int p9,Object p10){
       q oq = p0;
       int i = p9;
       q a = (i & 0x01)? oq.a: null;
       q b = (i & 0x02)? oq.b: p2;
       q c = (i & 0x04)? oq.c: p3;
       q d = (i & 0x08)? oq.d: p4;
       q e = (i & 0x10)? oq.e: p5;
       q f = (i & 0x20)? oq.f: p6;
       q g = (i & 0x40)? oq.g: p7;
       q h = (i & 0x0080)? oq.h: p8;
       Objects.requireNonNull(p0);
       q oq1 = q.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{a,Integer.valueOf(b),Integer.valueOf(c),d,Boolean.valueOf(e),Boolean.valueOf(f),Boolean.valueOf(g),Boolean.valueOf(h)};
          oq = PatchProxy.apply(objArray, p0, oq1, "4");
          if (oq != PatchProxyResult.class) {
          label_00b3 :
             return oq;
          }
       }
       a.p(a, "stateMap");
       a.p(d, "recommendList");
       p0 = new q(a, b, c, d, e, f, g, h);
       goto label_00b3 ;
    }
    public final int b(){
       return this.c;
    }
    public final h c(){
       Object obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get(Integer.valueOf(this.c));
    }
    public final g d(){
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj < null || obj >= this.d.size()) {
          return objArray;
       }
       return this.d.get(this.c);
    }
    public final int e(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof q && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (a.g(this.d, p0.d) && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && this.h == p0.h))))))))) {
          return true;
       }
       return false;
    }
    public final List f(){
       return this.d;
    }
    public final boolean g(){
       return this.f;
    }
    public final boolean h(){
       return this.e;
    }
    public int hashCode(){
       q obj = PatchProxy.apply(null, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.b) * 31) + this.c) * 31;
       q td = this.d;
       if (td != null) {
          i = td.hashCode();
       }
       i1 = (i1 + i) * 31;
       q te = this.e;
       int i2 = 1;
       if (te != null) {
          te = 1;
       }
       i1 = (i1 + te) * 31;
       te = this.f;
       if (te != null) {
          i = 1;
       }
       i1 = (i1 + i) * 31;
       te = this.g;
       if (te != null) {
          i = 1;
       }
       i1 = (i1 + i) * 31;
       te = this.h;
       if (te == null) {
          i2 = te;
       }
       return (i1 + i2);
    }
    public final HashMap i(){
       return this.a;
    }
    public final boolean j(){
       return this.g;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecommendListState\(stateMap="+this.a+", lastSelectPosition="+this.b+", currentSelectPosition="+this.c+", recommendList="+this.d+", showDownloadRetryBtn="+this.e+", showCaptureTip="+this.f+", isCollection="+this.g+", smoothScroll="+this.h+"\)";
    }
}
