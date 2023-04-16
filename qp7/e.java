package qp7.e;
import androidx.lifecycle.LifecycleOwner;
import ih5.c0;
import qp7.e$a;
import nsd.u;
import qp7.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleRegistry;
import crd.a;
import pp7.b;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import qp7.b;
import qp7.t0;
import qp7.x0;
import android.content.Context;
import android.widget.RelativeLayout;
import rp7.a;
import java.lang.Exception;
import java.lang.StringBuilder;
import qp7.f;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import qp7.e$b;
import java.util.Comparator;
import java.util.Collections;
import qp7.e$c;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ih5.c0$a;
import as7.a;
import q87.c;
import qp7.d;
import android.view.View;
import android.view.ViewParent;
import eh5.l;
import java.lang.Long;
import ih5.b0;
import ih5.x;
import androidx.lifecycle.Lifecycle;
import uy6.h;
import uy6.b;
import java.util.Objects;
import android.view.ViewGroup;
import qp7.h;
import qp7.c;
import com.kwai.slide.play.detail.biz.ElementCategoryLayoutInfo;
import java.lang.Throwable;
import androidx.lifecycle.Lifecycle$Event;

public abstract class e implements LifecycleOwner, c0	// class@003424
{
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public t0 f;
    public final LifecycleRegistry g;
    public a h;
    public final b i;
    public final ArrayList j;
    public final ArrayList k;
    public RelativeLayout l;
    public h m;
    public final g n;
    public static final e$a o;

    static {
       e.o = new e$a(null);
    }
    public void e(g p0){
       a.p(p0, "groupEventBus");
       super();
       this.n = p0;
       this.g = new LifecycleRegistry(this);
       this.h = new a();
       this.i = new b();
       this.j = new ArrayList();
       this.k = new ArrayList();
    }
    public void a(List p0){
       b uob;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "6")) {
          return;
       }
       a.p(p0, "elementList");
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             uob = iterator.next();
             e tf = this.f;
             String str = "config";
             if (tf == null) {
                a.S(str);
             }
             uob.a0(tf);
             uob.Z(this.n);
             uob.p();
             x0 ox0 = uob.E();
             e tf1 = this.f;
             if (tf1 == null) {
                a.S(str);
             }
             ox0.d(tf1);
             ox0 = uob.E();
             e tl = this.l;
             if (tl == null) {
                a.S("detailPageView");
             }
             Context context = tl.getContext();
             a.o(context, "detailPageView.context");
             ox0.e(context);
             uob.E().f(this);
             this.k.add(uob);
             if (uob.x().b() != null) {
                if (uob.x().e() != -1) {
                   this.j.add(uob);
                }else {
                   break ;
                }
             }
             if (!PatchProxy.applyVoidOneRefs(uob, this, uoe, "14")) {
                uob.N(this, new f(this, uob));
             }
             if (this.c != null) {
                if (!uob instanceof DispatchBaseElement || !uob.G()) {
                   uob.c0();
                }
                uob.m = false;
                uob.n();
             }
          }else {
             Collections.sort(this.j, e$b.b);
             Collections.sort(this.k, e$c.b);
             return;
          }
       }
       throw new Exception("excludeBizList不为null，但priorityInExclude没有设置  "+uob.getClass().getName());
    }
    public boolean b(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, e.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return c0$a.b(this, p0, p1, p2);
    }
    public final void c(){
       d uod;
       View view;
       Integer integer;
       b uob1;
       ViewParent parent;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "11")) {
          return;
       }
       a uoa = a.C();
       String str = "attached start, "+this.p();
       Object[] objArray1 = new Object[0];
       try{
          uoa.t("VM_BaseGroup", str, objArray1);
          Iterator iterator = this.k.iterator();
          while (true) {
             if (iterator.hasNext()) {
                uob1 = iterator.next();
                uob1.k();
                if (uob1.m != null) {
                   if (uob1.C() != null) {
                      uod = uob1.C();
                      if (uod != null) {
                         view = uod.p();
                         if (view != null) {
                            parent = view.getParent();
                         label_005e :
                            if (parent != null) {
                               uod = uob1.C();
                               if (uod != null) {
                                  view = uod.p();
                                  if (view != null && view.getVisibility() == 8) {
                                     break ;
                                  }
                               }
                               uob1.S();
                            }else {
                               throw new Exception("isRealShow为true，但element并没有添加到父布局里  "+uob1.getClass().getName());
                            }
                         }
                      }
                      parent = objArray;
                      goto label_005e ;
                   }else {
                      throw new Exception("isRealShow为true，但element为null "+uob1.getClass().getName());
                   }
                }
             }else {
                this.e = true;
                Object[] objArray4 = new Object[0];
                a.C().t("VM_BaseGroup", "attached end, "+this.p(), objArray4);
                return;
             }
          }
          throw new Exception("isRealShow为true，但element为GONE  "+uob1.getClass().getName()+",检查Element是否修改了ElementView根布局可见性");
       }catch(java.lang.Exception e0){
          Object[] objArray2 = new Object[0];
          a.C().t("VM_BaseGroup", "attached throw Exception isBind = "+this.c+", "+this.p(), objArray2);
          Iterator iterator1 = this.k.iterator();
       label_012c :
          if (!iterator1.hasNext()) {
             throw e0;
          }
          b uob = iterator1.next();
          a uoa1 = a.C();
          StringBuilder str1 = "attached throw Exception, isRealShow = "+uob.m+" , visibility = ";
          uod = uob.C();
          if (uod != null) {
             view = uod.p();
             if (view != null) {
                integer = Integer.valueOf(view.getVisibility());
             label_0166 :
                Object[] objArray3 = new Object[0];
                uoa1.t("VM_BaseGroup", str1+integer+", "+this.p(), objArray3);
                goto label_012c ;
             }
          }
          integer = objArray;
          goto label_0166 ;
       }
    }
    public void d(long p0,l p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, e.class, "19")) {
          return;
       }
       a.p(p1, "type");
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob instanceof c0) {
             uob.d(p0, p1, p2);
          }
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "9")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().l();
       }
       this.d = true;
       return;
    }
    public void f(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "21")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob instanceof c0) {
             uob.f(p0);
          }
       }
       return;
    }
    public void g(long p0,l p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, e.class, "20")) {
          return;
       }
       a.p(p1, "type");
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob instanceof c0) {
             uob.g(p0, p1, p2, p3);
          }
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.g;
    }
    public void h(long p0,l p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, e.class, "22")) {
          return;
       }
       a.p(p1, "type");
       c0$a.a(this, p0, p1, p2);
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().m();
       }
       this.d = false;
       return;
    }
    public final void j(){
       Object[] objArray2;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "7")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().t("VM_BaseGroup", "bind start isBind = "+this.c+", "+this.p(), objArray1);
       if (this.c != null) {
          throw new Exception(this.getClass().getName()+"  Already bind");
       }
       try{
          Iterator iterator = this.k.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (!uob instanceof DispatchBaseElement || !uob.G()) {
                uob.c0();
             }
             uob.m = false;
             uob.n();
          }
          this.c = true;
          if (!PatchProxy.applyVoid(objArray, this, uoe, "13")) {
             if (h.a.l == null) {
                objArray2 = new Object[0];
                a.C().t("VM_BaseGroup", "refreshAll start, "+this.p(), objArray2);
             }
             this.k();
             ArrayList uArrayList = new ArrayList();
             Iterator iterator1 = this.k.iterator();
             while (iterator1.hasNext()) {
                b uob1 = iterator1.next();
                if (uob1.m != null) {
                   if (uob1.C() == null) {
                      d uod = uob1.q();
                      Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.slide.play.detail.base.BaseElementView<com.kwai.slide.play.detail.base.BaseViewModel, com.kwai.slide.play.detail.base.BaseElementEventBus>");
                      e tf = this.f;
                      if (tf == null) {
                         a.S("config");
                      }
                      uod.s(tf);
                      uod.u(uob1.x().c());
                      uod.t(uob1.x().d());
                      tf = this.m;
                      a.m(tf);
                      uod.h(tf.b(), uob1.A(), uob1.x().a().getBottomMargin(), uob1.x().a().getWidthRatio());
                      uod.g(uob1.E());
                      uob1.Y(uod);
                   }
                   d uod1 = uob1.C();
                   a.m(uod1);
                   uArrayList.add(uod1);
                }
             }
             e tm = this.m;
             a.m(tm);
             tm.c(uArrayList);
             this.i.f(uArrayList);
             if (h.a.l == null) {
                objArray2 = new Object[0];
                a.C().t("VM_BaseGroup", "refreshAll end, "+this.p(), objArray2);
             }
          }
          objArray2 = new Object[0];
          a.C().t("VM_BaseGroup", "bind end, "+this.p(), objArray2);
          return;
       }catch(java.lang.Exception e0){
          a.C().e("VM_BaseGroup", "bind elementOrderList throw Exception ", e0);
          throw e0;
       }
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, e.class, "16")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().t("VM_BaseGroup", "calculateElementRealShow start, "+this.p(), objArray);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (!uob.M()) {
             uob.m = i;
          }else {
             int i1 = uob.x().d();
             uob.m = true;
             if (uArrayList.contains(Integer.valueOf(i1))) {
                uob.m = i;
             }else {
                uArrayList.add(Integer.valueOf(i1));
             }
          }
       }
       Iterator iterator1 = this.j.iterator();
       while (iterator1.hasNext()) {
          b uob1 = iterator1.next();
          if (uob1.m != null) {
             List list = uob1.x().b();
             if (list != null) {
                iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   Iterator iterator2 = this.k.iterator();
                   while (iterator2.hasNext()) {
                      b uob2 = iterator2.next();
                      if (uob2.m != null && a.g(uob2.x(), uoa)) {
                         uob2.m = i;
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
       }
       Object[] objArray1 = new Object[i];
       a.C().t("VM_BaseGroup", "calculateElementRealShow end, "+this.p(), objArray1);
       return;
    }
    public void l(RelativeLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "detailPageView");
       if (this.b != null) {
          throw new Exception("Already created");
       }
       this.b = true;
       this.l = p0;
       this.m = this.m(p0);
       this.g.handleLifecycleEvent(Lifecycle$Event.ON_CREATE);
       this.g.handleLifecycleEvent(Lifecycle$Event.ON_START);
       return;
    }
    public abstract h m(RelativeLayout p0);
    public void n(){
       if (PatchProxy.applyVoid(null, this, e.class, "17")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().u();
       }
       this.k.clear();
       this.j.clear();
       this.g.handleLifecycleEvent(Lifecycle$Event.ON_STOP);
       this.g.handleLifecycleEvent(Lifecycle$Event.ON_DESTROY);
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().v();
       }
       this.e = false;
       return;
    }
    public final String p(){
       Object obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getClass().getName();
    }
    public final t0 q(){
       e obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("config");
       }
       return obj;
    }
    public final b r(){
       return this.i;
    }
    public final g s(){
       return this.n;
    }
    public final h t(){
       return this.m;
    }
    public final ViewGroup u(){
       e obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       a.m(obj);
       return obj.b();
    }
    public final void v(t0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().d0();
       }
       this.h.dispose();
       this.h = new a();
       this.c = false;
       return;
    }
}
