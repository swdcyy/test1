package kf9.f;
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
import kf9.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f extends b	// class@002c82
{
    public final HashMap a;
    public final int b;
    public final int c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public void f(){
       super(null, 0, 0, null, false, false, 63, null);
    }
    public void f(HashMap p0,int p1,int p2,List p3,boolean p4,boolean p5){
       a.p(p0, "stateMap");
       a.p(p3, "slipList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public void f(HashMap p0,int p1,int p2,List p3,boolean p4,boolean p5,int p6,u p7){
       ArrayList uArrayList;
       if (p6 & 0x01) {
          p0 = new HashMap();
       }
       int i = -1;
       int i1 = (p6 & 0x02)? -1: p1;
       if (!(p6 & 0x04)) {
          i = p2;
       }
       if (p6 & 0x08) {
          uArrayList = new ArrayList();
       }
       ArrayList uArrayList1 = uArrayList;
       int i2 = (p6 & 0x10)? 0: p4;
       int i3 = (p6 & 0x20)? 0: p5;
       super(p0, i1, i, uArrayList1, i2, i3);
       return;
    }
    public static f a(f p0,HashMap p1,int p2,int p3,List p4,boolean p5,boolean p6,int p7,Object p8){
       f b;
       f c;
       f d;
       f e;
       f f;
       f a = (p7 & 0x01)? p0.a: null;
       if (p7 & 0x02) {
          b = p0.b;
       }
       p8 = b;
       if (p7 & 0x04) {
          c = p0.c;
       }
       f uof = c;
       if (p7 & 0x08) {
          d = p0.d;
       }
       f uof1 = d;
       if (p7 & 0x10) {
          e = p0.e;
       }
       f uof2 = e;
       if (p7 & 0x20) {
          f = p0.f;
       }
       f uof3 = f;
       Objects.requireNonNull(p0);
       b = f.class;
       if (PatchProxy.isSupport(b)) {
          Object[] objArray = new Object[]{a,Integer.valueOf(p8),Integer.valueOf(uof),uof1,Boolean.valueOf(uof2),Boolean.valueOf(uof3)};
          p0 = PatchProxy.apply(objArray, p0, b, "4");
          if (p0 != PatchProxyResult.class) {
          label_007e :
             return p0;
          }
       }
       a.p(a, "stateMap");
       a.p(uof1, "slipList");
       b = new f(a, p8, uof, uof1, uof2, uof3);
       goto label_007e ;
    }
    public final int b(){
       return this.c;
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get(Integer.valueOf(this.c));
    }
    public final boolean d(){
       return this.f;
    }
    public final boolean e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (a.g(this.d, p0.d) && (this.e == p0.e && this.f == p0.f))))))) {
          return true;
       }
       return false;
    }
    public final List f(){
       return this.d;
    }
    public final HashMap g(){
       return this.a;
    }
    public int hashCode(){
       f obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.b) * 31) + this.c) * 31;
       f td = this.d;
       if (td != null) {
          i = td.hashCode();
       }
       i1 = (i1 + i) * 31;
       f te = this.e;
       int i2 = 1;
       if (te != null) {
          te = 1;
       }
       i1 = (i1 + te) * 31;
       te = this.f;
       if (te == null) {
          i2 = te;
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SlipListState\(stateMap="+this.a+", lastSelectPosition="+this.b+", currentSelectPosition="+this.c+", slipList="+this.d+", showDownloadRetryBtn="+this.e+", showCaptureTip="+this.f+"\)";
    }
}
