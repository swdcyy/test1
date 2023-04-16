package com.kuaishou.live.basic.liveslide.datasource.b;
import c51.e;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;
import brd.t;
import crd.b;
import java.util.Iterator;
import c51.b;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import brd.z;
import io.reactivex.android.schedulers.a;
import c51.f;
import c51.g;
import erd.g;
import java.util.HashSet;
import wg3.b;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import ok.o;
import com.kuaishou.live.basic.liveslide.datasource.a;

public abstract class b implements e	// class@000cd1
{
    public final List a;
    public final List b;
    public final boolean c;
    public boolean d;
    public b e;
    public t f;
    public Object g;

    public void b(){
       super();
       this.a = new ArrayList();
       this.b = new CopyOnWriteArrayList();
       this.c = false;
    }
    public void b(boolean p0){
       super();
       this.a = new ArrayList();
       this.b = new CopyOnWriteArrayList();
       this.c = p0;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.i(false);
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       this.a.addAll(p0);
       return;
    }
    public abstract t c(boolean p0);
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       b te = this.e;
       if (te != null && te.isDisposed()) {
          this.e.dispose();
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().c0();
          }
          this.u();
       }
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "21")) {
          return;
       }
       this.a.clear();
       return;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "20")) {
          return;
       }
       this.a.removeAll(p0);
       return;
    }
    public void e(int p0,List p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "16")) {
          return;
       }
       this.a.addAll(p0, p1);
       return;
    }
    public String f(){
       return "LiveSlideBasePageModel";
    }
    public Object g(){
       return this.g;
    }
    public List getDataList(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.a);
    }
    public abstract boolean h(Object p0);
    public boolean hasMore(){
       return this.d;
    }
    public final boolean i(boolean p0){
       LiveLogTag obj;
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = LiveLogTag.LIVE_NEW_SLIDE_CONTAINER;
       obj.appendTag(this.f());
       b.S(obj, "[loadInternal] method called", "isLoadMore", Boolean.valueOf(p0));
       b = false;
       if (this.f != null) {
          obj.appendTag(this.f());
          b.P(obj, "[loadInternal] return false because observable not null");
          return b;
       }else {
          t ot = this.c(p0);
          this.f = ot;
          if (ot == null) {
             this.l(p0, new Throwable("observable created is null"));
             obj.appendTag(this.f());
             b.P(obj, "[loadInternal] return false because createRequest\(\) returns null");
             return b;
          }else {
             Iterator iterator = this.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().U(p0);
             }
             b.P(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f()), "[loadInternal] real start load");
             this.e = this.f.observeOn(a.c()).subscribe(new f(this, p0), new g(this, p0));
             return true;
          }
       }
    }
    public boolean isLoading(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public final void j(boolean p0,Object p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "6")) {
          return;
       }
       b.P(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f()), "[onLoadCompleteInternal] method called");
       this.g = p1;
       this.d = this.h(p1);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().S(p0);
       }
       p1 = this.m(p0, p1);
       b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f()), "[onLoadCompleteInternal] get items from response", "currentPageSlideDataListSize", Integer.valueOf(p1.size()));
       if (!p0) {
          this.a.clear();
       }
       if (this.c != null || this.a.isEmpty()) {
          this.a.addAll(p1);
       }else {
          HashSet hashSet = new HashSet();
          Iterator iterator1 = this.a.iterator();
          while (iterator1.hasNext()) {
             hashSet.add(iterator1.next().getId());
          }
          iterator1 = p1.iterator();
          while (iterator1.hasNext()) {
             b uob1 = iterator1.next();
             if (hashSet.contains(uob1.getId())) {
                b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f()), "[onLoadCompleteInternal] filter duplicate model", "model id", uob1.getId());
                iterator1.remove();
             }else {
                this.a.add(uob1);
             }
          }
       }
       iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().w(p0, p1);
       }
       b.X(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f()), "[onLoadCompleteInternal] method end, load result", ImmutableMap.of("isLoadMore", Boolean.valueOf(p0), "hasMore", Boolean.valueOf(this.d), "disableDuplicate", Boolean.valueOf(this.c), "currentPageSlideDataListSize", Integer.valueOf(p1.size()), "totalSlideDataListSize", Integer.valueOf(this.a.size())));
       this.u();
       return;
    }
    public void k(int p0,b p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "14")) {
          return;
       }
       this.a.add(p0, p1);
       return;
    }
    public final void l(boolean p0,Throwable p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "8")) {
          return;
       }
       b.x(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f()), "[onLoadErrorInternal] method called", "isLoadMore", Boolean.valueOf(p0), p1);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().X(p0, p1);
       }
       this.u();
       return;
    }
    public abstract List m(boolean p0,Object p1);
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.hasMore()) {
          return this.i(true);
       }
       this.l(true, new Throwable("no more data"));
       return false;
    }
    public o o(){
       Object obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b;
    }
    public void p(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (this.b.contains(p0)) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public void q(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void r(int p0,b p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "17")) {
          return;
       }
       this.a.set(p0, p1);
       return;
    }
    public void remove(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "18")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
    public void s(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
    public void t(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public final void u(){
       this.f = null;
       this.e = null;
    }
}
