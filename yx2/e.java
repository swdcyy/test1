package yx2.e;
import java.lang.Object;
import nsd.u;
import java.util.ArrayList;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import kotlin.NotImplementedError;

public abstract class e	// class@004d5e
{
    public final List a;
    public Object b;
    public Exception c;
    public boolean d;
    public final Object e;

    public void e(){
       super(null, null, 3, null);
    }
    public void e(Object p0,Object p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       super();
       this.e = null;
       this.a = new ArrayList();
       this.b = p0;
       return;
    }
    public final Object a(l p0){
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "setter");
       Object obj1 = null;
       if (this.d != null) {
          return obj1;
       }
       this.a.add(p0);
       if (this.b != null) {
          obj = this.b;
          if (obj != null) {
             obj1 = p0.invoke(obj);
          }
       }
       return obj1;
    }
    public final Object b(l p0){
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "getter");
       obj = this.b;
       p0 = (obj != null)? p0.invoke(obj): null;
       return p0;
    }
    public void c(Object p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "6")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "7")) {
          int i = 0;
          while (this.a.size() > i) {
             e ta = this.a;
             List list = ta.subList(i, ta.size());
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                iterator.next().invoke(p0);
             }
             i = i + list.size();
          }
       }
       if (a.g(this.b, p0) ^ 0x01) {
          this.b = p0;
       }
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       throw new NotImplementedError("An operation is not implemented: onPrepare should be implemented by subclass");
    }
    public void e(Object p0){
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       if (this.b == null) {
          this.d(this.e);
       }else {
          e tb = this.b;
          a.m(tb);
          this.c(tb);
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.d = true;
       this.e(this.b);
       this.b = null;
       return;
    }
}
