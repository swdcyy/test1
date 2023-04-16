package gna.b$a;
import gna.b;
import java.lang.String;
import android.graphics.drawable.Drawable;
import msd.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;

public abstract class b$a extends b	// class@002b27
{
    public final ArrayList m;
    public boolean n;
    public boolean o;
    public boolean p;

    public void b$a(String p0,String p1,String p2,Drawable p3,l p4){
       a.p(p0, "title");
       super(p0, p1, p2, p3, false, p4);
       this.m = new ArrayList();
       this.o = true;
       this.p = true;
    }
    public final int A(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z().size();
    }
    public final boolean B(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.C() || this.p != null)? true: false;
       return b;
    }
    public boolean C(){
       return this.o;
    }
    public final void D(boolean p0){
       this.p = p0;
    }
    public final b E(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = this.x();
       b uob = (p0 >= 0 && i > p0)? this.y().get(p0): null;
       return uob;
    }
    public boolean l(){
       Object[] objArray = null;
       b$a obj = PatchProxy.apply(objArray, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b$a uoa = 1;
       if (this.m.isEmpty()) {
          uoa = this.n;
       }else {
          obj = this.m;
          ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(Boolean.valueOf(iterator.next().l()));
          }
          iterator = uArrayList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                Object obj1 = iterator.next();
                int i = obj1.booleanValue() ^ uoa;
                if (i) {
                   objArray = obj1;
                }
             }
             if (objArray != null) {
                uoa = false;
                break ;
             }
          }
       }
       return uoa;
    }
    public void q(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.n = p0;
       Iterator iterator = this.m.iterator();
       while (iterator.hasNext()) {
          iterator.next().q(p0);
       }
       return;
    }
    public final boolean u(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "son");
       if (this.m.contains(p0) || !this.m.add(p0)) {
          return false;
       }
       p0.f = this;
       return true;
    }
    public final int v(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.A();
       Iterator iterator = this.z().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob instanceof b$a) {
             i = i + uob.v();
          }
       }
       return i;
    }
    public final ArrayList w(){
       ArrayList obj = PatchProxy.apply(null, this, b$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.z().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          obj.add(uob);
          if (uob instanceof b$a) {
             obj.addAll(uob.w());
          }
       }
       return obj;
    }
    public final int x(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.B()) {
          return 0;
       }
       int i = this.A();
       Iterator iterator = this.z().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob instanceof b$a && uob.B()) {
             i = i + uob.x();
          }
       }
       return i;
    }
    public final ArrayList y(){
       ArrayList obj = PatchProxy.apply(null, this, b$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (this.B()) {
          Iterator iterator = this.z().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             obj.add(uob);
             if (uob instanceof b$a && uob.B()) {
                obj.addAll(uob.y());
             }
          }
       }
       return obj;
    }
    public final List z(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.G5(this.m);
    }
}
