package dlc.a1;
import qvb.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dlc.y0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import qvb.a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import java.lang.Boolean;
import android.view.View;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import qvb.p;
import ekd.m1;
import tkc.f;
import brd.y;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import sy6.a;
import qvb.n0;
import com.yxcorp.gifshow.entity.QPhoto;
import fw6.c;
import ux5.b;
import java.util.Objects;
import java.lang.Integer;
import yw6.g;
import java.util.List;
import qvb.i;
import fw6.b;
import gw6.b;
import com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent;
import com.yxcorp.gifshow.entity.TrendingInfo;
import xkc.b;

public class a1 extends PresenterV2 implements q	// class@002235
{
    public TrendingInfo A;
    public Runnable p;
    public a q;
    public View r;
    public f s;
    public y t;
    public t u;
    public f v;
    public PublishSubject w;
    public PublishSubject x;
    public String y;
    public int z;

    public void a1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "3")) {
          return;
       }
       this.X7(this.u.subscribe(new y0(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "8")) {
          return;
       }
       this.s.f(this);
       a1 tp = this.p;
       if (tp != null) {
          k1.m(tp);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       a1 uoa1 = a1.class;
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa1, "7")) {
          return;
       }
       this.s.f(this);
       this.r.setVisibility(8);
       this.A = null;
       if (p1 != null) {
          ExceptionHandler.handleException(this.getContext(), p1);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a1.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0feb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "1")) {
          return;
       }
       this.s = this.r8("TRENDING_FEED_PAGE_LIST");
       this.t = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVER");
       this.u = this.r8("TRENDING_INFO_ITEM_CLICK_OBSERVABLE");
       this.v = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.w = this.r8("CURRENT_PLAY_FEED_INDEX_IN_TRENDING_INFO");
       this.x = this.r8("FIRST_SHOW_FEED_INDEX_ON_LOAD_FINISH");
       this.y = this.t8("TRENDING_REQUEST_LOCATION");
       this.q = this.q8(a.class);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       a1 uoa1 = a1.class;
       String str = "6";
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa1, str)) {
          return;
       }
       this.r.setVisibility(8);
       this.s.f(this);
       if (p0 && this.A != null) {
          int i = this.s.m2();
          a1 tq = this.q;
          this.z = this.q.a0();
          this.q.k(tq.q(tq.M(this.s.getItem(i))), false);
          if (this.q.getDataSource() instanceof b) {
             b dataSource = this.q.getDataSource();
             uoa1 = this.z;
             Objects.requireNonNull(dataSource);
             b uob = b.class;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(uoa1), dataSource, uob, str)) {
                g g = dataSource.g;
                if (g != null && g.getItems() != null) {
                   dataSource.e.a(dataSource.c, uoa1);
                }
             }
          }
          this.v.set(this.A);
          this.t.onNext(new OnPlayTrendingInfoChangeEvent(this.A));
          this.w.onNext(new b(this.s.F0(i), this.s.O0(i)));
          this.x.onNext(Integer.valueOf(i));
          this.A = null;
       }
       return;
    }
}
