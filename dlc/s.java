package dlc.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.p;
import dlc.s$a;
import dlc.s$b;
import dlc.s$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c$b;
import androidx.fragment.app.c;
import df5.b;
import hf5.b;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2;
import com.yxcorp.gifshow.entity.TrendingListRequestInfo;
import ykc.c;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import dlc.q;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import tkc.n;
import android.view.View;
import dlc.o;
import android.view.View$OnClickListener;
import m01.a;
import dlc.n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import tkc.b;
import java.lang.IllegalStateException;
import q87.c;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import dlc.r;
import java.lang.Runnable;
import rf5.u;
import hf5.e;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import sy6.a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.trending.list.TrendingSubListFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import dlc.w;
import xl8.b;
import java.lang.Exception;
import ekd.m1;
import tkc.i;
import io.reactivex.subjects.PublishSubject;

public class s extends PresenterV2	// class@002270
{
    public String A;
    public i B;
    public u C;
    public e D;
    public b E;
    public a F;
    public f G;
    public PublishSubject H;
    public PublishSubject I;
    public TrendingListFragmentV2 J;
    public f K;
    public c L;
    public f M;
    public final boolean N;
    public b O;
    public boolean P;
    public boolean Q;
    public final a R;
    public final b S;
    public final c$b T;
    public final q U;
    public View p;
    public View q;
    public View r;
    public View s;
    public SwipeLayout t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public void s(boolean p0){
       super();
       this.R = new p(this);
       this.S = new s$a(this);
       this.T = new s$b(this);
       this.U = new s$c(this);
       this.N = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       this.L.registerFragmentLifecycleCallbacks(this.T, false);
       this.E.De(this.S);
       this.B.h(this.U);
       s tJ = this.J;
       tJ.E = this.B;
       tJ.A8(this.y);
       tJ = this.J;
       s tz = this.z;
       tJ.N = tz;
       s ty = this.y;
       TrendingListRequestInfo trendingList = new TrendingListRequestInfo(this.x, ty, this.w, this.u, this.v, ty, tz, "", this.A);
       tJ.bf(v11);
       tJ = this.J;
       s tu = this.u;
       tJ.T = tu;
       tJ.S.e = tu;
       tJ.F = this.I;
       if (this.G.get() != null) {
          this.J.Z6(this.G.get().mId);
          this.J.Vh(this.G.get().getWrapperId());
          this.J.ee(this.G.get().mTrendingType);
       }
       this.J.K = this.H;
       this.P8(true);
       this.X7(this.I.subscribe(new q(this), Functions.e));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.q.setTranslationY((float)n.b());
       this.p.setOnClickListener(new o(this));
       this.r.setVisibility(8);
       this.r.setOnClickListener(a.b);
       this.s.setVisibility(8);
       this.s.setOnClickListener(new n(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "11")) {
          return;
       }
       this.B.f(this.U);
       this.L.unregisterFragmentLifecycleCallbacks(this.T);
       this.E.c3(this.S);
       if (this.J.isAdded()) {
          try{
             e uoe = this.L.beginTransaction();
             uoe.u(this.J);
             uoe.o();
          }catch(java.lang.IllegalStateException e0){
             Object[] objArray = new Object[0];
             b.C().t("MilanoMoreTrendingListV2Presenter", e0.getMessage(), objArray);
          }
       }
    }
    public final void P8(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "6")) {
          return;
       }
       if (this.Q == null && !this.J.isAdded()) {
          boolean b = true;
          try{
             this.Q = b;
             if (this.L.findFragmentByTag("detail_trending") != null) {
                return;
             }else {
                e uoe = this.L.beginTransaction();
                uoe.w(R.id.more_trending_container, this.J, "detail_trending");
                if (p0) {
                   uoe.s(this.J);
                }
                uoe.o();
             }
          }catch(java.lang.Exception e0){
             this.Q = false;
          }
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, s.class, "9")) {
          return;
       }
       this.V8(true);
       this.s.setVisibility(8);
       return;
    }
    public void S8(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "8")) {
          return;
       }
       if (!this.J.isAdded() || this.P == null) {
          this.s.setVisibility(8);
          return;
       }else {
          this.getActivity().l3(this.R);
          this.P = false;
          this.r.setVisibility(false);
          this.J.I6(this.q, new r(this), p0);
          this.R8();
          return;
       }
    }
    public final void V8(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "10")) {
          return;
       }
       s tC = this.C;
       if (tC != null) {
          tC.F(p0, 10);
       }
       if (p0) {
          this.D.B5(10);
       }else {
          this.D.S8(10);
       }
       if (!PatchProxy.isSupport(os) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "12")) {
          if (this.t == null) {
             this.t = w9.c(this.getActivity());
          }
          os = this.t;
          if (os != null) {
             os.n(p0, 14);
          }
       }
       this.F.d(p0, 10);
       if (this.J.t() != null) {
          this.J.t().h0().setEnabled((p0 ^ 0x01));
       }
       return;
    }
    public void W8(){
       Object[] objArray2;
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "5")) {
          return;
       }
       if (this.G.get() != null) {
          this.J.Z6(this.G.get().mId);
          this.J.Vh(this.G.get().getWrapperId());
          this.J.ee(this.G.get().mTrendingType);
       }
       Object[] objArray1 = new Object[0];
       b.C().w("MilanoMoreTrendingListV2Presenter", "showMoreTrendingList-setCurrentBottomBarShowingTrendingDesc", objArray1);
       this.J.Uh(this.M.get());
       if (!this.J.isAdded()) {
          this.P8(0);
       }else if(PatchProxy.applyVoid(objArray, this, os, "7") || (!this.J.isAdded() && this.B.getCount() <= 0)){
          this.getActivity().F2(this.R);
          if (!this.J.isVisible()) {
             e uoe = this.L.beginTransaction();
             uoe.E(this.J);
             uoe.m();
          }
          this.V8(0);
          this.r.setVisibility(0);
          this.J.X8(this.q, new w(this));
          this.O.d(Boolean.TRUE);
          this.P = true;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2c29);
       this.q = m1.f(p0, 0x7f0a2c2a);
       this.r = m1.f(p0, 0x7f0a2c27);
       this.s = m1.f(p0, 0x7f0a2c2e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.B = this.r8("TRENDING_LIST_PAGE_LIST");
       this.C = this.s8(u.class);
       this.G = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.H = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVER");
       this.I = this.r8("TRENDING_INFO_ITEM_CLICK_OBSERVER");
       this.J = this.q8(TrendingListFragmentV2.class);
       this.K = this.x8("MORE_TRENDING_BAR_SHOWING_INFO");
       this.L = this.q8(c.class);
       this.M = this.x8("CURRENT_BOTTOM_BAR_SHOWING_TRENDING_DESC");
       this.O = this.r8("MORE_TRENDING_LIST_SHOW_EVENT");
       this.D = this.q8(e.class);
       this.F = this.q8(a.class);
       this.u = this.r8("TRENDING_REQUEST_SOURCE");
       this.v = this.r8("TRENDING_REQUEST_LIST_INFO");
       this.w = this.r8("TRENDING_REQUEST_TRENDING_ID");
       this.x = this.r8("LOAD_TRENDING_WITH_PHOTO_ID");
       this.y = this.r8("TRENDING_REQUEST_INIT_TRENDING_TYPE");
       this.z = this.r8("TRENDING_REQUEST_IS_RISING_TRENDING");
       this.A = this.t8("TRENDING_REQUEST_LOCATION");
       this.E = this.q8(b.class);
       return;
    }
}
