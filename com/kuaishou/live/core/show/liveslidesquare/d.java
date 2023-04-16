package com.kuaishou.live.core.show.liveslidesquare.d;
import e12.c;
import qvb.f;
import java.lang.Object;
import com.kuaishou.live.core.show.liveslidesquare.LiveSlideSquareResponse;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.n0;
import java.util.Collection;
import ekd.q;
import za2.u;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import za2.w;
import o02.e;
import d61.a0;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.liveslidesquare.c;
import za2.t;
import erd.g;
import java.util.List;
import la6.b;
import java.util.ArrayList;
import java.lang.Boolean;
import ub2.j;
import qvb.a;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import qvb.j;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kwai.framework.model.response.CursorResponse;

public class d extends f implements c	// class@000c94
{
    public j A;
    public int p;
    public int q;
    public String r;
    public String s;
    public String t;
    public List u;
    public String v;
    public String w;
    public boolean x;
    public boolean y;
    public String z;

    public void d(){
       super();
       this.p = 0;
       this.q = 0;
    }
    public boolean B1(Object p0){
       return this.i2(p0);
    }
    public t I1(){
       d uod1;
       d tt;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uod, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = (TextUtils.x(this.t))? "/rest/n/live/feed/slide/more": this.t;
       String str = obj;
       if (this.K() && (this.y != null && !q.f(this.u))) {
          return t.fromCallable(new u(this)).observeOn(d.a);
       }else {
          w ow = e.m();
          Object obj1 = PatchProxy.apply(objArray, this, uod, "7");
          if (obj1 != patchProxyRe) {
             uod1 = obj1;
          }else if(this.K()){
             uod1 = this.v;
          }else if(this.L0() != null){
             objArray = this.L0().mCursor;
          }
          uod1 = objArray;
          d tp = this.p;
          d tz = (!TextUtils.x(this.z))? this.z: this.r;
          return ow.i(str, uod1, tp, tz, this.s, a0.a(this.q), this.w).map(new e()).concatMap(new c(this)).doOnError(new t(this)).subscribeOn(d.b).observeOn(d.a);
       }
    }
    public void M1(Object p0,List p1){
       this.j2(p0, p1);
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "3");
       if (list != PatchProxyResult.class) {
       }else if(this.K() && !q.f(this.u)){
          if (p0.mItems == null) {
             p0.mItems = new ArrayList();
          }
          p0.mItems.addAll(0, this.u);
          this.u.clear();
       }
       list = super.W1(p0, p1);
       return list;
    }
    public boolean X1(b p0){
       return this.i2(p0);
    }
    public boolean Y(List p0){
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj != null) {
          obj.b(p0);
       }
       return this.d(p0);
    }
    public void a2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       boolean b = (this.q != null)? true: false;
       if (b) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             x.y(this.q, iterator.next().mEntity);
          }
       }
       return;
    }
    public void d2(b p0,List p1){
       this.j2(p0, p1);
    }
    public j g0(){
       return this.c;
    }
    public final BaseFeed h2(LiveSlideSquareResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0.mItems)) {
          return null;
       }
       return p0.mItems.get(0).mEntity;
    }
    public boolean i(){
       return false;
    }
    public boolean i0(QPhoto p0){
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj != null) {
          obj.a(p0);
       }
       return this.remove(p0);
    }
    public boolean i2(LiveSlideSquareResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.y == null) {
          return super.X1(p0);
       }
       this.y = false;
       return true;
    }
    public void j2(LiveSlideSquareResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       super.d2(p0, p1);
       if (this.v != null) {
          this.v = null;
       }
       if (this.x != null) {
          this.R1(false);
       }
       d.a(-1638991736).processFeedsListAsync(p0.mItems);
       return;
    }
    public void k2(boolean p0){
       this.x = p0;
    }
    public void l1(j p0){
       this.A = p0;
    }
    public void l2(String p0){
       this.w = p0;
    }
    public void m2(String p0){
       this.r = p0;
    }
    public List n0(){
       Object obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getItems();
    }
    public void n2(String p0){
       this.t = p0;
    }
    public void o2(LiveSlideSquareResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "12")) {
          return;
       }
       this.S1(p0);
       return;
    }
    public CursorResponse v0(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L0();
    }
    public void z(Object p0){
       this.o2(p0);
    }
}
