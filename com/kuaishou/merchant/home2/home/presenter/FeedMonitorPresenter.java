package com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter$feedPageListObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter$multiTabCallback$2;
import java.util.ArrayList;
import com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import ow3.b;
import lx3.n;
import lx3.k;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import rw3.b;
import java.util.Iterator;
import java.lang.Iterable;
import ow3.c;
import kz3.e;
import java.util.Map;
import java.util.HashMap;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;

public final class FeedMonitorPresenter extends PresenterV2 implements g	// class@0017d7
{
    public b p;
    public final p q;
    public k r;
    public final p s;
    public List t;
    public b u;
    public d v;

    public void FeedMonitorPresenter(){
       super();
       this.q = s.c(new FeedMonitorPresenter$feedPageListObserver$2(this));
       this.s = s.c(new FeedMonitorPresenter$multiTabCallback$2(this));
       this.t = new ArrayList();
       this.v = new FeedMonitorPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FeedMonitorPresenter.class, "4")) {
          return;
       }
       FeedMonitorPresenter tp = this.p;
       if (tp != null) {
          if (tp != null) {
             tp.e(this.P8());
          }
       }else {
          tp = this.r;
          if (tp != null) {
             if (tp != null) {
                tp.c(this.R8());
             }
          }else {
             this.V8();
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, FeedMonitorPresenter.class, "6")) {
          return;
       }
       this.t.clear();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeedMonitorPresenter.class, "5")) {
          return;
       }
       FeedMonitorPresenter tp = this.p;
       if (tp != null) {
          tp.b(this.P8());
       }
       tp = this.r;
       if (tp != null) {
          tp.d(this.R8());
       }
       return;
    }
    public final q P8(){
       Object obj = PatchProxy.apply(null, this, FeedMonitorPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final n R8(){
       Object obj = PatchProxy.apply(null, this, FeedMonitorPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final void S8(boolean p0){
       FeedMonitorPresenter uFeedMonitor = FeedMonitorPresenter.class;
       if (PatchProxy.isSupport(uFeedMonitor) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFeedMonitor, "10")) {
          return;
       }
       if (p0) {
          uFeedMonitor = this.u;
          if (uFeedMonitor == null) {
             a.S("perfViewModel");
          }
          uFeedMonitor.onEvent(11);
       }
       Iterator iterator = this.t.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, FeedMonitorPresenter.class, "9")) {
          return;
       }
       FeedMonitorPresenter tu = this.u;
       if (tu == null) {
          a.S("perfViewModel");
       }
       tu.onEvent(12);
       Iterator iterator = this.t.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedMonitorPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FeedMonitorPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(FeedMonitorPresenter.class, new e());
       }else {
          obj.put(FeedMonitorPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeedMonitorPresenter.class, "3")) {
          return;
       }
       this.p = this.t8("MERCHANT_HOME_FEED_MANAGER_SERVICE");
       this.r = this.t8("MERCHANT_HOME_MULTI_TAB_SERVICE");
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.u = b.s0(activity);
       return;
    }
}
