package com.yxcorp.plugin.music.player.controller.base.BasePlayerController;
import c5d.a;
import com.yxcorp.plugin.music.player.controller.base.BasePlayerController$c;
import nsd.u;
import java.lang.Object;
import kob.v;
import com.yxcorp.plugin.music.player.controller.base.BasePlayerController$mPlayList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.plugin.music.player.controller.base.BasePlayerController$d;
import f5d.f;
import f5d.g;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.yxcorp.plugin.music.player.controller.base.BasePlayerController$a;
import erd.g;
import crd.b;
import c5d.b;
import com.yxcorp.plugin.music.player.controller.base.BasePlayerController$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i5d.o;
import q87.c;
import java.lang.Long;
import java.util.Objects;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import npb.a;
import java.lang.Integer;
import java.lang.Number;
import java.util.ArrayList;
import java.util.HashMap;
import android.app.Application;
import com.yxcorp.gifshow.util.rx.RxBus;
import b5d.e;
import java.lang.Float;
import trd.u;
import java.util.Collection;
import java.lang.Math;

public abstract class BasePlayerController implements a	// class@001cfd
{
    public final Class a;
    public final long b;
    public final f c;
    public final p d;
    public boolean e;
    public b f;
    public a g;
    public int h;
    public BasePlayerController$d i;
    public static final BasePlayerController$c j;

    static {
       BasePlayerController.j = new BasePlayerController$c(null);
    }
    public void BasePlayerController(){
       super();
       this.a = v.class;
       this.b = 500;
       this.d = s.c(BasePlayerController$mPlayList$2.INSTANCE);
       this.i = new BasePlayerController$d(this);
       f uof = this.a();
       this.c = uof;
       uof.y2(this.i);
       this.f = t.interval(500, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new BasePlayerController$a(this));
       this.d().i = new BasePlayerController$b(this);
       if (PatchProxy.applyVoid(null, this, BasePlayerController.class, "32")) {
       }else {
          Object[] objArray = new Object[0];
          o.C().w(this.getClass().getSimpleName(), "connecting to play service", objArray);
       }
       return;
    }
    public void A3(long p0){
       BasePlayerController uBasePlayerC = BasePlayerController.class;
       if (PatchProxy.isSupport(uBasePlayerC) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uBasePlayerC, "21")) {
          return;
       }
       b uob = this.d();
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(p0), uob, uob1, "13") && p0 - uob.j)) {
          uob.j = p0;
          uob.k(false);
       }
       return;
    }
    public void B3(int p0){
    }
    public int C3(){
       return 0;
    }
    public boolean R1(List p0,String p1){
       boolean b;
       int i3;
       int i4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, BasePlayerController.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "musicModels");
       obj = this.d();
       Objects.requireNonNull(obj);
       Iterator obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, b.class, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "list");
          patchProxyRe = 0;
          if (p1 != null) {
             obj1 = p0.iterator();
             int i = 0;
             int i1 = 0;
             while (obj1.hasNext()) {
                Object obj2 = obj1.next();
                int i2 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (a.g(obj2.getId(), p1)) {
                   i3 = i1;
                   i = 1;
                }
                i1 = i2;
             }
             i4 = patchProxyRe;
             i3 = i;
          }else {
             i4 = 0;
          }
          obj.l(p0, i4);
          b = i3;
       }
       return b;
    }
    public void T1(List p0,int p1){
       BasePlayerController uBasePlayerC = BasePlayerController.class;
       if (PatchProxy.isSupport(uBasePlayerC) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uBasePlayerC, "11")) {
          return;
       }
       a.p(p0, "musicModels");
       this.d().l(p0, p1);
       return;
    }
    public long U(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.d().j;
    }
    public List U0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, BasePlayerController.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d();
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(objArray, obj, b.class, "15");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = obj.b.iterator();
          while (iterator.hasNext()) {
             a uoa = obj.a.get(iterator.next());
             if (uoa != null) {
                uArrayList.add(uoa);
             }
          }
       }
       return uArrayList;
    }
    public abstract f a();
    public abstract Application b();
    public a c(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().a();
    }
    public final b d(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final f e(){
       return this.c;
    }
    public a f(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().c();
    }
    public a g(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().e();
    }
    public Object getCurrent(){
       return this.c();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.c.getCurrentPosition();
    }
    public Object getNext(){
       return this.f();
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, BasePlayerController.class, "5")) {
          return;
       }
       RxBus.f.b(new e(this.e));
       return;
    }
    public boolean hasNext(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d().c() != null)? true: false;
       return b;
    }
    public boolean hasPrevious(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d().e() != null)? true: false;
       return b;
    }
    public abstract void i(a p0);
    public boolean isPlaying(){
       return this.e;
    }
    public final t j(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RxBus.f.f(this.a);
    }
    public final void k(float p0,float p1){
       BasePlayerController uBasePlayerC = BasePlayerController.class;
       if (PatchProxy.isSupport(uBasePlayerC) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uBasePlayerC, "30")) {
          return;
       }
       this.c.setVolume(p0, p1);
       return;
    }
    public void l(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePlayerController.class, "13")) {
          return;
       }
       a.p(p0, "music");
       a[] uoaArray = new a[]{p0};
       this.T1(CollectionsKt__CollectionsKt.r(uoaArray), 0);
       return;
    }
    public long m(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.c.getDuration();
    }
    public boolean next(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d().h() != null)? true: false;
       return b;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, BasePlayerController.class, "4")) {
          return;
       }
       this.e = false;
       this.c.pause();
       Object[] objArray = new Object[false];
       o.C().w("BasePlayerControllerTag", "pause", objArray);
       this.h();
       return;
    }
    public boolean previous(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, BasePlayerController.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.d();
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.apply(objArray, obj, b.class, "5");
       b = true;
       if (uoa != patchProxyRe) {
       }else {
          uoa = obj.e();
          if (uoa != null) {
             obj.d = obj.f(uoa);
             obj.i(b);
          }
       }
       if (uoa == null) {
          b = false;
       }
       return b;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, BasePlayerController.class, "26")) {
          return;
       }
       this.c.release();
       BasePlayerController tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       this.c.B(this.i);
       return;
    }
    public void seekTo(long p0){
       BasePlayerController uBasePlayerC = BasePlayerController.class;
       if (PatchProxy.isSupport(uBasePlayerC) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uBasePlayerC, "6")) {
          return;
       }
       this.c.seekTo(p0);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, BasePlayerController.class, "3")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.c.start();
       this.h();
       Object[] objArray = new Object[0];
       o.C().w("BasePlayerControllerTag", "start", objArray);
       return;
    }
    public void w3(List p0){
       List list;
       Object obj;
       int i1;
       b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePlayerController.class, "23")) {
          return;
       }
       if (p0 != null) {
          b uob = this.d();
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
    public Object y2(){
       return this.g();
    }
    public float y3(){
       Object obj = PatchProxy.apply(null, this, BasePlayerController.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.c.getBufferPercentage();
    }
    public void z3(Object p0){
       this.l(p0);
    }
}
