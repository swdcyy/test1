package m91.b;
import aq5.d;
import java.util.List;
import java.lang.Object;
import java.util.HashMap;
import m91.a;
import java.util.Comparator;
import java.util.Collections;
import aq5.b;
import aq5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import aq5.c;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lp3.e;
import lp3.c;
import lp3.b;
import pp.a;
import q87.c;
import java.util.concurrent.CopyOnWriteArrayList;

public class b implements d	// class@003136
{
    public Map b;
    public List c;
    public long d;

    public void b(List p0){
       super();
       this.b = new HashMap();
       this.d = 0;
       this.c = p0;
       Collections.sort(p0, a.b);
    }
    public synchronized void G5(b p0,a[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          if (this.b.get(oobject) != null) {
             this.b.get(oobject).remove(p0);
          }
          i = i + 1;
       }
       return;
    }
    public void Jh(a[] p0){
       c.a(this, p0);
    }
    public boolean L8(a[] p0){
       return c.b(this, p0);
    }
    public synchronized void Pj(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (this.r2(p0)) {
          return;
       }
       if (!this.ck(p0)) {
          ExceptionHandler.handleCaughtException(new Exception("trying to enable incompatible biz "+p0+" with current biz status "+Long.toBinaryString(this.d)));
       }else {
          this.d = this.d | (1 << p0.getPositionInStatusBits());
          List list = this.b.get(p0);
          if (!q.f(list)) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                iterator.next().e6(p0, true);
             }
          }
       }
       this.r();
       return;
    }
    public long Ya(){
       return this.d;
    }
    public synchronized boolean ck(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = this.d & p0.getRelationBits();
       if (!l) {
          return true;
       }
       long l1 = 0;
       while (true) {
          if (l1 >= this.c.size()) {
             return true;
          }
          long l2 = 1 << l1;
          l2 = l2 & l;
          if (l2 && this.c.get(l1).getPriority() >= p0.getPriority()) {
             break ;
          }else {
             l1 = l1 + 1;
          }
       }
       return false;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       StringBuilder str = "";
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          b td = this.d;
          long l = uoa.getRelationBits() & td;
          if (l) {
             l = 1 << uoa.getPositionInStatusBits();
             l = l & td;
             if (l) {
                str = str+uoa.getPositionInStatusBits()+", ";
             }
          }
       }
       if (str.length() > 0) {
          str.delete((str.length() - 2), str.length());
          Object[] objArray = new Object[0];
          a.C().t("LiveBizRelation", "current biz state "+Long.toBinaryString(this.d)+" is inconsistent with the biz relation described in BizRelation, biz at position "+str+"should not be enabled", objArray);
       }
       return;
    }
    public boolean r2(a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.d & (1 << p0.getPositionInStatusBits()))? true: false;
       return b;
    }
    public synchronized void u5(b p0,a[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          if (this.b.get(oobject) == null) {
             this.b.put(oobject, new CopyOnWriteArrayList());
          }
          if (!this.b.get(oobject).contains(p0)) {
             this.b.get(oobject).add(p0);
          }
          i = i + 1;
       }
       return;
    }
    public synchronized a w(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = this.d & p0.getRelationBits();
       if (!l) {
          return null;
       }
       long l1 = 0;
       while (true) {
          if (l1 >= this.c.size()) {
             return null;
          }
          long l2 = 1 << l1;
          l2 = l2 & l;
          if (l2 && this.c.get(l1).getPriority() >= p0.getPriority()) {
             break ;
          }else {
             l1 = l1 + 1;
          }
       }
       return this.c.get(l1);
    }
    public synchronized void yj(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (!this.r2(p0)) {
          return;
       }
       this.d = this.d & (~ (1 << p0.getPositionInStatusBits()));
       List list = this.b.get(p0);
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().e6(p0, false);
          }
       }
       return;
    }
}
