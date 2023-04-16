package b5d.a;
import kob.r;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import b5d.c;
import java.util.Objects;
import com.yxcorp.plugin.music.player.controller.base.BasePlayerController;
import c5d.b;
import g5d.i;
import npb.c;
import npb.a;
import java.util.Map;
import e5d.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.rx.RxBus;
import kob.g;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kob.w;
import java.lang.Integer;
import java.lang.Number;
import java.util.ArrayList;
import java.util.HashMap;
import crd.b;
import trd.u;
import java.util.Collection;
import java.lang.Math;
import android.app.Activity;
import e5d.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.io.File;
import kqb.b0;
import i5d.p;
import f5d.f;
import f5d.g;
import kob.x;
import java.lang.Long;

public class a implements r	// class@0003a4
{

    public void a(){
       super();
    }
    public void BZ(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "37")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       BasePlayerController uBasePlayerC = BasePlayerController.class;
       if (!PatchProxy.isSupport(uBasePlayerC) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), p, uBasePlayerC, "31")) {
          p.d().h = p0;
       }
       return;
    }
    public void DD(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "35")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), p, uoc, "13")) {
          p.o().O = p0;
       }
       return;
    }
    public void Df(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       c.p.l(p0);
       return;
    }
    public void HS(Map p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "36")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, p, c.class, "11")) {
          f n = c.n;
          n.e = p0;
          n.f = p1;
       }
       return;
    }
    public t Lk(){
       Object obj = PatchProxy.apply(null, this, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.p.j();
    }
    public t Pp(){
       Object obj = PatchProxy.apply(null, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RxBus.f.f(g.class);
    }
    public boolean R1(List p0,String p1){
       boolean b;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       Iterator obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, BasePlayerController.class, "12");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "musicModels");
          b uob = obj.d();
          Objects.requireNonNull(uob);
          obj1 = PatchProxy.applyTwoRefs(p0, p1, uob, b.class, "7");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             a.p(p0, "list");
             int i = 0;
             if (p1 != null) {
                obj1 = p0.iterator();
                i1 = 0;
                int i2 = 0;
                while (obj1.hasNext()) {
                   Object obj2 = obj1.next();
                   int i3 = i2 + 1;
                   if (i2 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (a.g(obj2.getId(), p1)) {
                      i1 = 1;
                      i = i2;
                   }
                   i2 = i3;
                }
             }else {
                i1 = 0;
             }
             uob.l(p0, i);
             b = i1;
          }
       }
       return b;
    }
    public t Ri(){
       Object obj = PatchProxy.apply(null, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RxBus.f.f(w.class);
    }
    public void T1(List p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "10")) {
          return;
       }
       c.p.T1(p0, p1);
       return;
    }
    public long U(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "16");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, BasePlayerController.class, "22");
       long l = (obj1 != patchProxyRe)? obj1.longValue(): obj.d().j;
       return l;
    }
    public List U0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       a obj1 = PatchProxy.apply(objArray, obj, BasePlayerController.class, "17");
       if (obj1 != patchProxyRe) {
       }else {
          b uob = obj.d();
          Objects.requireNonNull(uob);
          Iterator obj2 = PatchProxy.apply(objArray, uob, b.class, "15");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             ArrayList uArrayList = new ArrayList();
             obj2 = uob.b.iterator();
             while (obj2.hasNext()) {
                obj1 = uob.a.get(obj2.next());
                if (obj1 != null) {
                   uArrayList.add(obj1);
                }
             }
             obj1 = uArrayList;
          }
       }
       return obj1;
    }
    public void Z8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(p0, p, BasePlayerController.class, "24") && p0 != null) {
          b uob = p.d();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "10")) {
             a.p(p0, "list");
             b e = uob.e;
             if (e != null && !e.isDisposed()) {
                e = uob.e;
                if (e != null) {
                   e.dispose();
                }
                uob.e = null;
             }
             if (!p0.isEmpty()) {
                if (uob.b.isEmpty()) {
                   uob.d = "";
                }
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList(u.Y(p0, 10));
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   String str = uob.f(uoa);
                   uob.a.put(str, uoa);
                   uArrayList1.add(str);
                }
                uArrayList.addAll(uArrayList1);
                uArrayList.removeAll(uob.b);
                uob.b.addAll(uArrayList);
                iterator = uob.b.get(Math.max(0, uob.b.indexOf(uob.d)));
                a.o(iterator, "mDataList[index]");
                uob.d = iterator;
                uob.j();
                uob.k(0);
             }
          }
       }
       return;
    }
    public void aU(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "32")) {
          return;
       }
       Objects.requireNonNull(c.p);
       a o = c.o;
       Objects.requireNonNull(o);
       if (!PatchProxy.applyVoidOneRefs(p0, o, a.class, "1")) {
          a.p(p0, "activity");
          o.a.add(new WeakReference(p0));
       }
       return;
    }
    public int ca(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.p.n(p0);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       c.p.T1(new ArrayList(), 0);
       return;
    }
    public void d50(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "33")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoid(objArray, p, c.class, "10")) {
          c.n.b(true, false);
       }
       return;
    }
    public boolean e40(){
       Object obj = PatchProxy.apply(null, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.p.p();
    }
    public c getCurrent(){
       Object obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.p.c();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return c.p.getCurrentPosition();
    }
    public c getNext(){
       Object obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.p.f();
    }
    public boolean hasNext(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, BasePlayerController.class, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.d().c() != null){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean hasPrevious(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, BasePlayerController.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.d().e() != null){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.p.isPlaying();
    }
    public long m(){
       Object obj = PatchProxy.apply(null, this, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return c.p.m();
    }
    public boolean next(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, BasePlayerController.class, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.d().h() != null){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       c.p.pause();
       return;
    }
    public boolean previous(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, BasePlayerController.class, "10");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b uob = obj.d();
          Objects.requireNonNull(uob);
          a uoa = PatchProxy.apply(objArray, uob, b.class, "5");
          if (uoa != patchProxyRe) {
          }else {
             uoa = uob.e();
             if (uoa != null) {
                uob.d = uob.f(uoa);
                uob.i(true);
             }
          }
          if (uoa != null) {
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
    public void qI(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, p, BasePlayerController.class, "28");
       if (obj != patchProxyRe) {
          obj.booleanValue();
       }else {
          a.p(p0, "uniqueId");
          b uob = p.d();
          Objects.requireNonNull(uob);
          Object obj1 = PatchProxy.applyOneRefs(p0, uob, b.class, "11");
          if (obj1 != patchProxyRe) {
             obj1.booleanValue();
          }else {
             a.p(p0, "uniqueId");
             if (uob.b.contains(p0)) {
                uob.d = p0;
                uob.k = uob.g(uob.a()) ^ 1;
                uob.k(1);
             }
          }
       }
       return;
    }
    public void qj(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "34")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), p, uoc, "12")) {
          p.o().x(p0);
       }
       return;
    }
    public CountDownLatch rJ(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, a.class, "30");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       CountDownLatch uCountDownLa = PatchProxy.applyOneRefs(p0, obj, c.class, "4");
       if (uCountDownLa != patchProxyRe) {
       }else {
          a.p(p0, "cacheKey");
          if (p.a(b0.b(p0))) {
             CountDownLatch uCountDownLa1 = c.l.remove(p0);
             if (uCountDownLa1 != null) {
                uCountDownLa1.countDown();
             }
             uCountDownLa = null;
          }else {
             uCountDownLa = c.l.get(p0);
          }
       }
       return uCountDownLa;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "31")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoid(objArray, p, BasePlayerController.class, "26")) {
          p.c.release();
          BasePlayerController f = p.f;
          if (f != null) {
             f.dispose();
          }
          p.c.B(p.i);
       }
       return;
    }
    public t rx(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.apply(null, this, a.class, "24");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.p;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(null, obj, BasePlayerController.class, "36");
       if (ot != patchProxyRe) {
       }else {
          ot = RxBus.f.f(x.class);
       }
       return ot;
    }
    public void seekTo(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "3")) {
          return;
       }
       c.p.seekTo(p0);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       c.p.start();
       return;
    }
    public void w3(List p0){
       List list;
       Object obj;
       int i1;
       b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(p0, p, BasePlayerController.class, "23") && p0 != null) {
          b uob = p.d();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "9")) {
             a.p(p0, "list");
             b e = uob.e;
             if (e != null && !e.isDisposed()) {
                e = uob.e;
                if (e != null) {
                   e.dispose();
                }
                uob.e = null;
             }
             if (!p0.isEmpty()) {
                if (uob.b.isEmpty()) {
                   uob.d = "";
                }
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList(u.Y(p0, 10));
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   String str = uob.f(uoa);
                   uob.a.put(str, uoa);
                   uArrayList1.add(str);
                }
                uArrayList.addAll(uArrayList1);
                int i = uob.b.indexOf(uob.d);
                if (i < 0) {
                   uob.b.removeAll(uArrayList);
                   uob.b.addAll(0, uArrayList);
                }else if(i >= (uob.b.size() - true)){
                   uob.b.removeAll(uArrayList);
                   uob.b.addAll(uArrayList);
                }else {
                   i = i + true;
                   list = uob.b.subList(0, i);
                   a.o(list, "mDataList.subList\(0, index + 1\)");
                   ArrayList uArrayList2 = new ArrayList();
                   Iterator iterator1 = list.iterator();
                   while (iterator1.hasNext()) {
                      obj = iterator1.next();
                      i1 = uArrayList.contains(obj) ^ true;
                      if (i1) {
                         uArrayList2.add(obj);
                      }
                   }
                   b = uob.b;
                   i = b.subList(i, b.size());
                   a.o(i, "mDataList.subList\(index + 1, mDataList.size\)");
                   ArrayList uArrayList3 = new ArrayList();
                   iterator = i.iterator();
                   while (iterator.hasNext()) {
                      obj = iterator.next();
                      i1 = uArrayList.contains(obj) ^ true;
                      if (i1) {
                         uArrayList3.add(obj);
                      }
                   }
                   uob.b.clear();
                   uob.b.addAll(uArrayList2);
                   uob.b.addAll(uArrayList);
                   uob.b.addAll(uArrayList3);
                }
                i = uob.b.get(Math.max(0, uob.b.indexOf(uob.d)));
                a.o(i, "mDataList[index]");
                uob.d = i;
                uob.j();
                uob.k(true);
             }
          }
       }
       return;
    }
    public c y2(){
       Object obj = PatchProxy.apply(null, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.p.g();
    }
    public void ya(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "15")) {
          return;
       }
       c p = c.p;
       Objects.requireNonNull(p);
       BasePlayerController uBasePlayerC = BasePlayerController.class;
       if (!PatchProxy.isSupport(uBasePlayerC) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), p, uBasePlayerC, "21")) {
          b uob = p.d();
          Objects.requireNonNull(uob);
          b uob1 = b.class;
          if (PatchProxy.isSupport(uob1) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(p0), uob, uob1, "13") && p0 - uob.j)) {
             uob.j = p0;
             uob.k(false);
          }
       }
       return;
    }
}
