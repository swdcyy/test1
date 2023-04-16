package com.yxcorp.gifshow.reminder.news.data.d;
import qvb.f;
import bdc.b;
import efc.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.action.RealActionBizType;
import qvb.i;
import tkd.b;
import tkd.d;
import jx5.b;
import com.yxcorp.gifshow.reminder.news.data.b;
import com.yxcorp.gifshow.reminder.news.data.a;
import zec.e;
import ok.x;
import jx5.a;
import java.lang.Object;
import qvb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.reminder.news.data.NewsSlidePlayFeedResponse;
import la6.b;
import brd.t;
import qvb.n0;
import zec.i;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import zec.h;
import erd.o;
import com.yxcorp.gifshow.reminder.news.data.c;
import java.util.Objects;
import zec.g;
import zec.f;
import erd.g;
import java.util.List;
import java.util.Collection;
import qk.g0;
import b06.d;
import kp.y1;
import ekd.q;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class d extends f	// class@001af5
{
    public final b p;
    public final c q;
    public final a r;
    public final a s;
    public QPhoto t;
    public static final int u;

    public void d(b p0,a p1,QPhoto p2){
       super();
       this.q = RealActionBizType.NEWS_SLIDE;
       this.p = p0;
       p0.g(this);
       this.s = p1;
       this.r = d.a(-1571632429).as(b.b, a.b, new e(this));
       this.t = p2;
       if (p2 != null) {
          this.add(0, p2);
       }
       return;
    }
    public boolean E1(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.p.h();
    }
    public Object F1(){
       NewsSlidePlayFeedResponse newsSlidePla = PatchProxy.apply(null, this, d.class, "2");
       if (newsSlidePla != PatchProxyResult.class) {
       }else {
          newsSlidePla = this.p.i(NewsSlidePlayFeedResponse.class);
       }
       return newsSlidePla;
    }
    public t I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       if (this.K() && this.L0() != null) {
          this.s.d = 2;
       }else if(!this.K()){
          this.s.d = 3;
       }
       d tr = this.r;
       Objects.requireNonNull(tr);
       return t.fromCallable(new i(this)).subscribeOn(d.c).observeOn(d.a).flatMap(new h(this, objArray)).map(c.b).flatMap(new g(tr)).doOnNext(new f(this));
    }
    public boolean P1(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.p.h();
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "6");
       if (list != PatchProxyResult.class) {
       }else {
          list = super.W1(p0, p1);
          d.h(list);
          y1.g(list, 0, p0.mLlsid);
          d.d(list);
       }
       return list;
    }
    public void a2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       if (this.K() && (this.t != null && (q.f(p0) || !TextUtils.n(r1.t1(p0.get(0).mEntity), r1.t1(this.t.mEntity))))) {
          p0.add(0, this.t);
       }
    label_003b :
       this.t = null;
       return;
    }
    public boolean i(){
       return false;
    }
}
