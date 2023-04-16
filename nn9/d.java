package nn9.d;
import tvc.e;
import nn9.a;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.lang.Throwable;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import nn9.b;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class d extends e	// class@0031e6
{
    public List a;
    public final a b;
    public final List c;
    public final List d;
    public final List e;

    public void d(){
       super(null, null, null, null, 15, null);
    }
    public void d(a p0,List p1,List p2,List p3){
       a.p(p0, "panelSubState");
       a.p(p1, "headerInsertItems");
       a.p(p2, "middleItems");
       a.p(p3, "tailInsertItems");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void d(a p0,List p1,List p2,List p3,int p4,u p5){
       Throwable throwable1;
       Throwable throwable = null;
       p0 = (p4 & 0x01)? new a(LoadingStatus.IDLE, throwable, 2, throwable): throwable;
       ArrayList uArrayList = (p4 & 0x02)? new ArrayList(): throwable;
       ArrayList uArrayList1 = (p4 & 0x04)? new ArrayList(): throwable;
       if (p4 & 0x08) {
          throwable = new ArrayList();
       }
       super(p0, uArrayList, uArrayList1, throwable);
       return;
    }
    public static d c(d p0,a p1,List p2,List p3,List p4,int p5,Object p6){
       if (p5 & 0x01) {
          p1 = null;
       }
       if (p5 & 0x02) {
          p2 = null;
       }
       if (p5 & 0x04) {
          p3 = null;
       }
       if (p5 & 0x08) {
          p4 = null;
       }
       return p0.b(p1, p2, p3, p4);
    }
    public final d a(a p0,List p1,List p2,List p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "panelSubState");
       a.p(p1, "headerInsertItems");
       a.p(p2, "middleItems");
       a.p(p3, "tailInsertItems");
       return new d(p0, p1, p2, p3);
    }
    public final d b(a p0,List p1,List p2,List p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          d tb = this.b;
       }
       if (p1 == null) {
          d tc = this.c;
       }
       if (p2 == null) {
          d td = this.d;
       }
       if (p3 == null) {
          d te = this.e;
       }
       return this.a(p0, p1, p2, p3).d();
    }
    public final d d(){
       ArrayList obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.c);
       obj.addAll(this.d);
       obj.addAll(this.e);
       int i = 0;
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj1.j(i);
          i = i1;
       }
       this.a = obj;
       return this;
    }
    public final List e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && a.g(this.e, p0.e)))))) {
          return true;
       }
       return false;
    }
    public final List f(){
       return this.d;
    }
    public final a g(){
       return this.b;
    }
    public final List h(){
       return this.e;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       d tc = this.c;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.e;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public final List i(b p0){
       d tc;
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemSubState");
       if (this.c.contains(p0)) {
          tc = this.c;
       }else if(this.d.contains(p0)){
          tc = this.d;
       }else if(this.e.contains(p0)){
          tc = this.e;
       }else {
          tc = null;
       }
       return tc;
    }
    public final List j(){
       d obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.d();
       }
       obj = this.a;
       if (obj == null) {
          a.S("totalItems");
       }
       return obj;
    }
    public final d k(b[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemStates");
       ArrayList uArrayList = new ArrayList(this.c);
       ArrayList uArrayList1 = new ArrayList(this.d);
       ArrayList uArrayList2 = new ArrayList(this.e);
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return d.c(this, null, uArrayList, uArrayList1, uArrayList2, 1, null);
          }
          object oobject = p0[i];
          if (oobject != null) {
             List list = this.i(oobject);
             if (list != null) {
                if (a.g(list, this.c)) {
                   uArrayList.set(uArrayList.indexOf(oobject), oobject);
                }else if(a.g(list, this.d)){
                   uArrayList1.set(uArrayList1.indexOf(oobject), oobject);
                }else if(a.g(list, this.e)){
                   uArrayList2.set(uArrayList2.indexOf(oobject), oobject);
                }else {
                   break ;
                }
             }
          }
          i = i + 1;
       }
       throw new IllegalStateException("unexpected targetList");
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostListComponentState\(panelSubState="+this.b+", headerInsertItems="+this.c+", middleItems="+this.d+", tailInsertItems="+this.e+"\)";
    }
}
