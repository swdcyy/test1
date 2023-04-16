package jn9.b;
import jn9.d;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn9.d;
import nn9.a;
import java.util.List;
import nsd.u;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import mn9.a;
import nn9.b;
import mn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import nn9.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import java.util.Collection;
import mn9.f;
import on9.c;
import tvc.c;
import ln9.l;
import jn9.b$a;
import tvc.f;
import tvc.b;
import androidx.lifecycle.Observer;
import jn9.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kn9.j;
import tvc.a;
import java.lang.Integer;
import java.lang.Boolean;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.KSStore;
import kn9.k;
import kn9.e;
import kn9.m;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kn9.n;
import kn9.a;
import kn9.b;
import kn9.c;
import java.lang.Iterable;
import trd.u;
import kn9.d;
import com.yxcorp.gifshow.component.postlistcomponent.action.InsertActionType;
import kn9.f;
import kn9.h;

public final class b	// class@002b18
{
    public d a;
    public final Observer b;
    public final c c;
    public final CopyOnWriteArrayList d;
    public final b e;
    public final d f;

    public void b(d p0,LifecycleOwner p1){
       ArrayList obj1;
       b uob = this;
       Iterator obj = p0;
       LifecycleOwner lifecycleOwn = p1;
       a.p(obj, "dataConfig");
       super();
       uob.f = obj;
       d uod = new d(null, null, null, null, 15, null);
       uob.a = v3;
       uob.d = new CopyOnWriteArrayList();
       uob.e = obj.a;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       obj = obj.e.iterator();
       while (obj.hasNext()) {
          obj1 = obj.next();
          b uob1 = new b(obj1, c.a(obj1, uob.e), 0, false, 0, null, false, false, null, 508, null);
          uArrayList1.add(uod);
       }
       obj1 = new ArrayList();
       obj = uob.f.f.iterator();
       while (obj.hasNext()) {
          Object obj2 = obj.next();
          b uob2 = new b(obj2, c.a(obj2, uob.e), 0, false, 0, null, false, false, null, 508, null);
          obj1.add(uod);
       }
       uArrayList.addAll(uArrayList1);
       uArrayList.addAll(obj1);
       int i = uArrayList.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.get(i1).j(i1);
       }
       int i2 = 1;
       if (uArrayList.isEmpty() ^ i2) {
          uob.a = d.c(uob.a, null, uArrayList1, null, obj1, 5, null);
       }
       c[] uocArray = new c[i2];
       uocArray[0] = new l(new f(uob.e), uob.f);
       c uoc = new c(uob.a, uocArray);
       uob.c = uoc;
       b$a uoa = new b$a(uob);
       uob.b = uoa;
       if (!lifecycleOwn) {
          uoc.d().observeForever(uoa);
       }else {
          uoc.d().observe(lifecycleOwn, uoa);
       }
       return;
    }
    public void b(d p0,LifecycleOwner p1,int p2,u p3){
       super(p0, null);
    }
    public static void E(b p0,int p1,boolean p2,SelectScrollOption p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = SelectScrollOption.NONE;
       }
       p0.C(p1, p2, p3);
       return;
    }
    public static void F(b p0,a p1,boolean p2,SelectScrollOption p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = SelectScrollOption.NONE;
       }
       p0.D(p1, p2, p3);
       return;
    }
    public static void H(b p0,String p1,boolean p2,SelectScrollOption p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = SelectScrollOption.NONE;
       }
       p0.G(p1, p2, p3);
       return;
    }
    public static void b(b p0,b$b p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.a(p1, p2);
       return;
    }
    public static void w(b p0,boolean p1,boolean p2,Object p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = false;
       }
       if (p4 & 0x02) {
          p2 = true;
       }
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.v(p1, p2, p3);
       return;
    }
    public static void y(b p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.x(p1);
       return;
    }
    public final void A(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "29")) {
          return;
       }
       a.p(p0, "id");
       a uoa = this.i(p0);
       if (uoa != null) {
          this.c.a(new j(uoa));
       }
       return;
    }
    public final void B(b$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.d.remove(p0);
       return;
    }
    public final void C(int p0,boolean p1,SelectScrollOption p2){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "21")) {
          return;
       }
       String str = "scrollOption";
       a.p(p2, str);
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, null, this, b.class, "22")) {
          a.p(p2, str);
          int i = this.c.b().j().size();
          if (p0 >= 0 && i > p0) {
             if (p1) {
                this.c.a(new k(p0, false, p2));
             }else {
                this.c.a(new e(p0, p2, null));
             }
          }
       }
       return;
    }
    public final void D(a p0,boolean p1,SelectScrollOption p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b.class, "23")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "scrollOption");
       this.G(p0.getId(), p1, p2);
       return;
    }
    public final void G(String p0,boolean p1,SelectScrollOption p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b.class, "24")) {
          return;
       }
       a.p(p0, "id");
       a.p(p2, "scrollOption");
       this.C(this.g(p0), p1, p2);
       return;
    }
    public final void I(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "20")) {
          return;
       }
       this.c.a(new m(p0));
       return;
    }
    public final int J(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "item");
       int i = this.f(p0);
       if (i >= 0) {
          this.c.a(new n(p0));
       }
       return i;
    }
    public final void a(b$b p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "listener");
       this.d.add(p0);
       if (p1) {
          p0.c(this.c.b(), this.c.e());
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "33")) {
          return;
       }
       this.c.a(new a());
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "31")) {
          return;
       }
       this.c.a(new b());
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "32")) {
          return;
       }
       this.c.a(new c());
       return;
    }
    public final int f(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "item");
       return this.g(p0.getId());
    }
    public final int g(String p0){
       Object obj1;
       int i;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "id");
       obj = this.c.b().j().iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!a.g(obj1.b(), p0)) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          i = (obj1 != null)? obj1.c(): -1;
          break ;
       }
       return i;
    }
    public final b h(String p0){
       b uob;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       obj = this.c.b().j().iterator();
       do {
          if (obj.hasNext()) {
          }else {
             uob = null;
             break ;
          }
          uob = obj.next();
       } while (a.g(uob.b(), p0));
       return uob;
    }
    public final a i(String p0){
       a uoa;
       a uoa1;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       obj = this.c.b().j().iterator();
       while (true) {
          uoa = null;
          if (obj.hasNext()) {
             uoa1 = obj.next();
             if (!a.g(uoa1.b(), p0)) {
                continue ;
             }
          }else {
             uoa1 = uoa;
          }
          if (uoa1 != null) {
             uoa = uoa1.g();
             break ;
          }
          break ;
       }
       return uoa;
    }
    public final List j(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.b().j();
    }
    public final a k(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.b().g();
    }
    public final d l(){
       return this.f;
    }
    public final List m(){
       List obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.b().j();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().g());
       }
       return uArrayList;
    }
    public final b n(){
       return this.e;
    }
    public final List o(){
       List obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.b().f();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().g());
       }
       return new ArrayList(uArrayList);
    }
    public final String p(){
       Object[] objArray1;
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j().iterator();
       while (true) {
          if (obj.hasNext()) {
             objArray1 = obj.next();
             if (!objArray1.d()) {
                continue ;
             }
          }else {
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             objArray = objArray1.b();
             break ;
          }
          break ;
       }
       return objArray;
    }
    public final int q(){
       Iterator obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       obj = this.j().iterator();
       while (true) {
          if (obj.hasNext()) {
             if (obj.next().d()) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public final List r(){
       List obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.b().h();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().g());
       }
       return new ArrayList(uArrayList);
    }
    public final void s(a p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "27")) {
          return;
       }
       a.p(p0, "item");
       this.c.a(new d(p0, p1, InsertActionType.MIDDLE));
       return;
    }
    public final void t(a p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "26")) {
          return;
       }
       a.p(p0, "item");
       this.c.a(new d(p0, p1, InsertActionType.HEAD));
       return;
    }
    public final void u(a p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "28")) {
          return;
       }
       a.p(p0, "item");
       this.c.a(new d(p0, p1, InsertActionType.TAIL));
       return;
    }
    public final void v(boolean p0,boolean p1,Object p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "5")) {
          return;
       }
       this.c.a(new f(p0, p1, p2));
       return;
    }
    public final void x(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "7")) {
          return;
       }
       this.c.a(new h(p0));
       return;
    }
    public final void z(){
       if (PatchProxy.applyVoid(null, this, b.class, "30")) {
          return;
       }
       this.e();
       this.d.clear();
       this.c.d().removeObserver(this.b);
       return;
    }
}
