package bc9.l;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import bc9.z;
import oc9.t;
import zb9.l;
import bc9.b0;
import bc9.x;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qc9.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import zb9.k;
import bc9.l$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.robust.PatchProxy;
import ec9.j;
import cc9.c;
import sa6.a;
import android.view.View;
import oc9.y;
import oc9.x;
import androidx.constraintlayout.widget.ConstraintLayout;
import qxc.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import java.lang.CharSequence;
import ec9.f1;
import androidx.lifecycle.MutableLiveData;
import com.kwai.framework.mvs.BaseViewModel;
import com.yxcorp.gifshow.camera.record.base.d;
import bc9.l$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import bc9.l$c;
import cc9.i;
import bc9.k;
import com.yxcorp.gifshow.widget.q;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import bc9.l$d;
import erd.g;
import crd.b;
import eoc.f;
import bc9.l$e;
import bc9.l$f;
import bc9.l$g;
import bc9.l$h;
import bc9.l$i;
import ub6.a;
import bc9.l$j;
import cc9.q;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import android.widget.ImageView;
import oc9.d0;
import g9c.a;
import cc9.e;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import nsd.u;
import com.kwai.framework.activitycontext.ActivityContext;
import android.content.Intent;
import sa6.d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;

public final class l extends e0	// class@0003fd
{
    public ImageView A;
    public View B;
    public TextView C;
    public AbsRecordBottomBarViewBinder D;
    public ConstraintLayout E;
    public a F;
    public boolean G;
    public boolean H;
    public Animation I;
    public final a J;
    public final b K;
    public boolean q;
    public AssistantResponse r;
    public boolean s;
    public RecyclerView t;
    public HashMap u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public ImageView z;

    public void l(CameraPageType p0,b p1,a p2,b p3){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "assistContext");
       a.p(p3, "viewHelper");
       super(p0, p1);
       this.J = p2;
       this.K = p3;
       this.u = new HashMap();
       this.v = -1;
       this.L0(new z(p0, p1, p2, p3));
       this.L0(new l(p0, p1, p2, p3));
       this.L0(new b0(p0, p1, p2, p3));
       this.L0(new x(p0, p1, p2, p3));
       if (p1.f() instanceof a) {
          BaseFragment uBaseFragmen = p1.f();
          Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.bottombar.IRecordBottomBarOwner");
          this.D = uBaseFragmen.zb();
       }
       p1.n(k.class, new l$a(this));
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, l.class, "9")) {
          return;
       }
       super.I7();
       if (this.J.z()) {
          this.J.g().w0(new c(8));
       }
       return;
    }
    public void Q(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       x.a(this, p0);
       l tD = this.D;
       ConstraintLayout uConstraintL = (tD != null)? tD.y(): null;
       this.E = b.a(uConstraintL, p0, 0x7f0a0086);
       return;
    }
    public void d5(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "11")) {
          return;
       }
       super.d5(p0);
       this.k2();
       return;
    }
    public final a g2(){
       return this.J;
    }
    public final View h2(){
       l ol;
       PosterActivityTabInfo obj = PatchProxy.apply(null, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J.o();
       if (obj != null) {
          obj = obj.mCaptureTitle;
          if (obj != null) {
             ol = (obj.length() > 0)? 1: null;
             if (ol == 1 && this.J.x()) {
                ol = this.B;
             label_0035 :
                return ol;
             }
          }
       }
       ol = this.A;
       goto label_0035 ;
    }
    public final void i2(boolean p0){
       this.q = p0;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       d td = this.d;
       a.o(td, "mCallerContext");
       this.J.r().r0().observe(td.f(), new l$b(this));
       this.J.q().c(new l$c(this));
       super.k(p0);
       this.H = false;
       this.G = false;
       this.t = null;
       this.J.M(null);
       this.v = -1;
       this.J.H(false);
       this.J.l().a(this.e);
       this.J.l().b(this.e.findViewById(R.id.preview));
       this.Y1(f.a(PanelShowEvent.class, new l$d(this)));
       this.J.f().c(new l$e(this));
       this.J.f().c(new l$f(this));
       this.J.f().c(new l$g(this));
       this.J.f().c(new l$h(this));
       this.J.q().c(new l$i(this));
       this.Y1(f.a(a.class, new l$j(this)));
       return;
    }
    public final void k2(){
       l ol;
       if (PatchProxy.applyVoid(null, this, l.class, "13")) {
          return;
       }
       PosterActivityTabInfo posterActivi = this.J.o();
       if (posterActivi != null) {
          posterActivi = posterActivi.mCaptureTitle;
          if (posterActivi != null) {
             int i = 1;
             ol = (posterActivi.length() > 0)? 1: null;
             if (ol == i) {
                return;
             }
          }
       }
       if (this.J.r().v0().d() instanceof KSAssistantTemplate) {
          ol = this.A;
          if (ol != null) {
             ol.setImageResource(R.drawable.arg_RES_7f081ce9);
          }
       }else if(this.f2()){
          ol = this.A;
          if (ol != null) {
             ol.setImageResource(R.drawable.arg_RES_7f080e12);
          }
       }else {
          ol = this.A;
          if (ol != null) {
             ol.setImageResource(R.drawable.arg_RES_7f080e11);
          }
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.F = objArray;
       this.q = false;
       this.s = false;
       this.J.l().d(false);
       d td = this.d;
       a.o(td, "mCallerContext");
       this.J.r().r0().removeObservers(td.f());
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       super.onPause();
       if (!this.J.D()) {
          return;
       }
       if (this.J.z() && this.J.y()) {
          if (this.J.p() != null) {
             k ok = this.J.p();
             a.m(ok);
             if (!ok.R0()) {
             label_0042 :
                this.J.g().w0(new c(8));
             }
          }
          this.G = true;
          goto label_0042 ;
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       super.onResume();
       if (!this.J.D()) {
          return;
       }
       if (this.G != null && this.J.y()) {
          d td = this.d;
          a.o(td, "mCallerContext");
          e uoe = new e(AssistantUtils.d.m(td), 0, false, null, 12, null);
          this.J.g().w0(v8);
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       super.onStop();
       if (!this.J.D()) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       d te = this.e;
       if (te != null && (uActivity != null && uActivity != te)) {
          a.o(te, "mActivity");
          if (!te.isFinishing() && this.J.p() != null) {
             k ok = this.J.p();
             a.m(ok);
             if (!ok.R0()) {
                this.G = false;
             }
          }
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, l.class, "10")) {
          return;
       }
       super.q1();
       if (this.J.z()) {
          this.J.g().w0(new c(8));
       }
       return;
    }
    public void w1(Intent p0){
       f1 uof1 = f1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.w1(p0);
       l tJ = this.J;
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       ViewModel viewModel = d.a.a(uBaseFragmen).get(uof1);
       a.o(viewModel, "KSViewModelProviders.of\(¡­endViewModel::class.java\)");
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoidOneRefs(viewModel, tJ, a.class, "2")) {
          a.p(viewModel, "<set-?>");
          tJ.d = viewModel;
       }
       f1 uof11 = this.J.r();
       AssistantDataHelper uAssistantDa = this.J.d();
       Objects.requireNonNull(uof11);
       if (!PatchProxy.applyVoidOneRefs(uAssistantDa, uof11, uof1, "2")) {
          a.p(uAssistantDa, "<set-?>");
          uof11.j = uAssistantDa;
       }
       return;
    }
}
