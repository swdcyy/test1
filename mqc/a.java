package mqc.a;
import pqc.a;
import voc.y;
import pn9.b;
import mqc.a$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import android.view.View;
import k2b.s$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lqc.d;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qqc.d;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import mqc.a$d;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import kqc.c;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import android.widget.ProgressBar;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jn9.d;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import jn9.e;
import voc.x;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import jn9.b;
import com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import java.util.List;
import java.lang.Boolean;
import kqc.e;
import java.util.Collection;
import hqc.a;
import com.yxcorp.gifshow.widget.adv.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;
import mqc.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tyc.i2;
import o56.c;
import o56.a;
import android.app.Application;
import tyc.j2;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import mqc.b;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.lifecycle.LifecycleOwner;
import mqc.a$c;
import java.lang.Runnable;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import mqc.a$e;
import mqc.a$f;

public abstract class a extends b implements a, y	// class@002ff4
{
    public final boolean c;
    public final d d;
    public RecyclerView e;
    public PostListComponentView f;
    public ProgressBar g;
    public View h;
    public TimelineCoreView i;
    public EditorTimeLineView j;
    public b k;
    public int l;
    public boolean m;
    public LoadingStatus n;
    public final Fragment o;
    public final Fragment p;
    public final View q;
    public final s$b r;
    public static final a$a s;

    static {
       a.s = new a$a(null);
    }
    public void a(Fragment p0,Fragment p1,View p2,s$b p3){
       a.p(p0, "previewFragment");
       a.p(p1, "fragment");
       a.p(p2, "rootView");
       super(p2);
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.c = d.a();
       ViewModel viewModel = ViewModelProviders.of(p0).get(d.class);
       a.o(viewModel, "ViewModelProviders.of\(pr¡­ectViewModel::class.java\)");
       this.d = viewModel;
       this.l = -1;
       this.n = LoadingStatus.IDLE;
    }
    public void B(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "16")) {
          return;
       }
       if (this.m == null) {
          this.Y();
          this.Z();
          if (!PatchProxy.applyVoid(objArray, this, uoa, "21") && this.c != null) {
             View view = this.V();
             if (view != null) {
                view.setVisibility(8);
             }
          }
          this.m = true;
       }
       uoa = this.r;
       if (uoa != null) {
          a te = this.e;
          if (te == null) {
             a.S("mRecyclerView");
          }
          uoa.b(te);
       }
       uoa = this.h;
       if (uoa == null) {
          a.S("mRetryView");
       }
       uoa.setOnClickListener(new a$d(this));
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          a te = this.e;
          if (te == null) {
             a.S("mRecyclerView");
          }
          tr.c(te);
       }
       this.a0();
       return;
    }
    public RecyclerView D(){
       a obj = PatchProxy.apply(null, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       return obj;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "27")) {
          return;
       }
       if (this.d.o0().c().getType() == this.H().getType()) {
          this.n = LoadingStatus.DATA_LOADING_FINISH;
          a tg = this.g;
          if (tg == null) {
             a.S("mLoadingView");
          }
          int i = 8;
          tg.setVisibility(i);
          tg = this.h;
          if (tg == null) {
             a.S("mRetryView");
          }
          tg.setVisibility(i);
          tg = this.e;
          if (tg == null) {
             a.S("mRecyclerView");
          }
          tg.setVisibility(0);
          tg = this.f;
          if (tg == null) {
             a.S("mContainer");
          }
          tg.setVisibility(0);
       }
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, a.class, "26")) {
          return;
       }
       if (this.d.o0().c().getType() == this.H().getType()) {
          this.n = LoadingStatus.DATA_LOADING_FAILED;
          a tg = this.g;
          if (tg == null) {
             a.S("mLoadingView");
          }
          tg.setVisibility(8);
          tg = this.h;
          if (tg == null) {
             a.S("mRetryView");
          }
          tg.setVisibility(0);
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "25")) {
          return;
       }
       if (this.d.o0().c().getType() == this.H().getType()) {
          this.n = LoadingStatus.DATA_LOADING;
          a tg = this.g;
          if (tg == null) {
             a.S("mLoadingView");
          }
          tg.setVisibility(0);
          tg = this.h;
          if (tg == null) {
             a.S("mRetryView");
          }
          tg.setVisibility(8);
       }
       return;
    }
    public abstract EffectGroupType H();
    public abstract d I();
    public abstract PostListComponentView$b J();
    public abstract e K();
    public final d L(){
       return this.d;
    }
    public final Fragment M(){
       return this.p;
    }
    public void Md(){
       x.g(this);
    }
    public final PostListComponentView N(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("mContainer");
       }
       return obj;
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public final EditorTimeLineView P(){
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("mEditorTimelineView");
       }
       return obj;
    }
    public final b Q(){
       a obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("mPostListAdapter");
       }
       return obj;
    }
    public final RecyclerView R(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       return obj;
    }
    public final TimelineCoreView S(){
       a obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("mTimelineView");
       }
       return obj;
    }
    public final View T(){
       return this.q;
    }
    public final int U(){
       return this.l;
    }
    public abstract View V();
    public abstract List W();
    public boolean X(){
       Object obj = PatchProxy.apply(null, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (!(this.d.o0().h().b().isEmpty() ^ i) || this.d.o0().h().b().get(0).F().b() != 3) {
          i = false;
       }
       return i;
    }
    public abstract void Y();
    public final void Z(){
       a tp;
       boolean b;
       GridLayoutManager gridLayoutMa;
       Application uApplication;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "19")) {
          return;
       }
       FragmentActivity activity = this.p.getActivity();
       a.m(activity);
       String str = "mRecyclerView";
       if (n.k(activity) <= 0) {
          uoa = this.e;
          if (uoa == null) {
             a.S(str);
          }
          uoa.getViewTreeObserver().addOnGlobalLayoutListener(new a$b(this));
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoa, "20")){
          b = false;
          String str1 = "AppEnv.get\(\)";
          if (this.c != null) {
             gridLayoutMa = new GridLayoutManager(a1.c(), 5, 1, b);
             a te = this.e;
             if (te == null) {
                a.S(str);
             }
             te.setLayoutManager(gridLayoutMa);
             c uoc = a.a();
             a.o(uoc, str1);
             uoc = a.a();
             a.o(uoc, str1);
             uoc = a.a();
             a.o(uoc, str1);
             uoc = a.a();
             a.o(uoc, str1);
             uoc = a.a();
             a.o(uoc, str1);
             uApplication = uoc.a();
             i2 oi2 = new i2(n.c(uoc.a(), 24.00f), n.c(uoc.a(), 19.00f), n.c(uoc.a(), 19.00f), n.c(uoc.a(), 12.00f), n.c(uApplication, 13.00f), 0, null);
          }else {
             c uoc1 = a.a();
             a.o(uoc1, str1);
             int i = n.c(uoc1.a(), 9.00f);
             NpaLinearLayoutManager npaLinearLay = new NpaLinearLayoutManager(a1.c(), b, b);
             a te2 = this.e;
             if (te2 == null) {
                a.S(str);
             }
             te2.setLayoutManager(npaLinearLay);
             c uoc2 = a.a();
             a.o(uoc2, str1);
             uApplication = uoc2.a();
             b uob1 = new b(b, n.c(uApplication, 5.00f), i, i);
          }
          tp = this.e;
          if (tp == null) {
             a.S(str);
          }
          if (tp.getItemDecorationCount()) {
             tp = this.e;
             if (tp == null) {
                a.S(str);
             }
             tp.removeItemDecorationAt(b);
          }
          a te1 = this.e;
          if (te1 == null) {
             a.S(str);
          }
          te1.addItemDecoration(gridLayoutMa);
          if (this.c != null) {
             uoa = this.e;
             if (uoa == null) {
                a.S(str);
             }
             uoa.addOnScrollListener(new b(this));
          }
       }
       b uob = new b(this.I(), this.p);
       this.k = uob;
       b.w(uob, false, false, null, 7, null);
       uoa = this.f;
       if (uoa == null) {
          a.S("mContainer");
       }
       e uoe = this.K();
       tp = this.p;
       a tk = this.k;
       if (tk == null) {
          a.S("mPostListAdapter");
       }
       uoa.a(uoe, tp, tk);
       return;
    }
    public final void a0(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       a tf = this.f;
       String str = "mContainer";
       if (tf == null) {
          a.S(str);
       }
       if (tf.getShowedItemPositionList().isEmpty()) {
          tf = this.f;
          if (tf == null) {
             a.S(str);
          }
          tf.c();
          tf = this.f;
          if (tf == null) {
             a.S(str);
          }
          tf.requestLayout();
       }
       tf = this.f;
       if (tf == null) {
          a.S(str);
       }
       tf.post(new a$c(this));
       return;
    }
    public abstract void b0();
    public final void c0(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       if (this.l == -1) {
          return;
       }
       a te = this.e;
       if (te == null) {
          a.S("mRecyclerView");
       }
       RecyclerView$LayoutManager layoutManage = te.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       int i = layoutManage.i0();
       int i1 = layoutManage.c();
       a tl = this.l;
       if (i <= tl && i1 >= tl) {
          tl = this.f;
          if (tl == null) {
             a.S("mContainer");
          }
          tl.post(new a$e(this));
       }
       tl = this.l;
       if (i > tl || i1 < tl) {
          te = this.k;
          if (te == null) {
             a.S("mPostListAdapter");
          }
          if (te.q() >= 0) {
             te = this.f;
             if (te == null) {
                a.S("mContainer");
             }
             te.post(new a$f(this));
          }
       }
       return;
    }
    public void c2(){
       x.d(this);
    }
    public final void d0(PostListComponentView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
    public final void e0(EditorTimeLineView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.j = p0;
       return;
    }
    public final void f0(ProgressBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public final void g0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void h0(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.h = p0;
       return;
    }
    public final void i0(TimelineCoreView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.i = p0;
       return;
    }
    public final void j0(int p0){
       this.l = p0;
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       x.j(this);
    }
    public void z2(){
       x.c(this);
    }
}
