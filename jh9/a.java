package jh9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jh9.a$a;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import u80.j;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import mm6.c;
import java.util.Objects;
import h26.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.lifecycle.MutableLiveData;
import jh9.a$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jh9.a$c;
import android.view.View;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import jh9.a$d;
import jh9.a$e;
import erd.g;
import crd.b;
import brd.t;
import jh9.a$f;
import jh9.a$g;
import com.google.android.material.appbar.AppBarLayout$c;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;

public final class a extends PresenterV2	// class@002ad3
{
    public final AppBarLayout$c A;
    public PostToolBoxFragment p;
    public PublishSubject q;
    public PublishSubject r;
    public PublishSubject s;
    public PublishSubject t;
    public KuaishanPageParam u;
    public a v;
    public int w;
    public b x;
    public AppBarLayout y;
    public boolean z;

    public void a(){
       super();
       this.A = new a$a(this);
    }
    public static final AppBarLayout P8(a p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("appBarLayout");
       }
       return p0;
    }
    public void E8(){
       MutableLiveData mutableLiveD;
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       a ty = this.y;
       String str = "appBarLayout";
       if (ty == null) {
          a.S(str);
       }
       ty.setExpanded(true);
       j oj = d.a(-215111236);
       a tu = this.u;
       if (tu == null) {
          a.S("kuaishanPageParam");
       }
       c uoc = oj.uH(tu);
       Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.kwai.feature.post.api.feature.kuaishan.interfaces.IKuaiShanFeedFragment");
       this.v = uoc;
       Objects.requireNonNull(uoc, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
       tu = this.p;
       String str1 = "fragment";
       if (tu == null) {
          a.S(str1);
       }
       e uoe = tu.getChildFragmentManager().beginTransaction();
       a.o(uoe, "fragment.childFragmentManager.beginTransaction\(\)");
       uoe.f(R.id.toolbox_content, uoc);
       uoe.m();
       ty = this.v;
       if (ty != null) {
          mutableLiveD = ty.k5();
          if (mutableLiveD != null) {
             tu = this.p;
             if (tu == null) {
                a.S(str1);
             }
             mutableLiveD.observe(tu, new a$b(this));
          }
       }
       ty = this.y;
       if (ty == null) {
          a.S(str);
       }
       f.G(ty, new a$c(this));
       ty = this.v;
       if (ty != null) {
          mutableLiveD = ty.u9();
          if (mutableLiveD != null) {
             tu = this.p;
             if (tu == null) {
                a.S(str1);
             }
             mutableLiveD.observe(tu, new a$d(this));
          }
       }
       ty = this.q;
       if (ty == null) {
          a.S("refreshPublishSubject");
       }
       this.X7(ty.subscribe(new a$e(this)));
       ty = this.s;
       if (ty == null) {
          a.S("kuaishanNavigateToTemplate");
       }
       this.X7(ty.subscribe(new a$f(this)));
       ty = this.t;
       if (ty == null) {
          a.S("onActivityResultPublishSubject");
       }
       this.X7(ty.subscribe(new a$g(this)));
       ty = this.y;
       if (ty == null) {
          a.S(str);
       }
       ty.c(this.A);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "16")) {
          return;
       }
       a tv = this.v;
       if (tv != null && tv.isAdded()) {
          a tp = this.p;
          if (tp == null) {
             a.S("fragment");
          }
          e uoe = tp.getChildFragmentManager().beginTransaction();
          a.o(uoe, "fragment.childFragmentManager.beginTransaction\(\)");
          uoe.u(tv);
          uoe.m();
       }
       this.v = objArray;
       tv = this.y;
       if (tv == null) {
          a.S("appBarLayout");
       }
       tv.o(this.A);
       return;
    }
    public final PublishSubject R8(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("refreshCompletePublishSubject");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       p0 = m1.f(p0, R.id.app_bar_layout);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.app_bar_layout\)");
       this.y = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("refresh_subject");
       a.o(obj, "inject\(PostToolBoxConst.ACCESS_ID_REFRESH_SUBJECT\)");
       this.q = obj;
       obj = this.r8("refresh_completed_subject");
       a.o(obj, "inject\(PostToolBoxConst.¡­EFRESH_COMPLETED_SUBJECT\)");
       this.r = obj;
       obj = this.r8("kuaishan_navigate_to_template");
       a.o(obj, "inject\(PostToolBoxConst.¡­HAN_NAVIGATE_TO_TEMPLATE\)");
       this.s = obj;
       obj = this.r8("on_activity_result");
       a.o(obj, "inject\(PostToolBoxConst.¡­SS_ID_ON_ACTIVITY_RESULT\)");
       this.t = obj;
       obj = this.r8("kuaishan_page_param");
       a.o(obj, "inject\(PostToolBoxConst.¡­S_ID_KUAISHAN_PAGE_PARAM\)");
       this.u = obj;
       return;
    }
}
