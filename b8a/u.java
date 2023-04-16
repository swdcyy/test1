package b8a.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.u$b;
import b8a.w;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import b8a.u$c;
import android.view.View$OnClickListener;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.util.rx.RxBus;
import bm5.f;
import java.util.Map;
import androidx.lifecycle.MutableLiveData;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment;
import b8a.u$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment$a;
import androidx.fragment.app.e;
import java.lang.Runnable;
import gz9.a;
import uc6.c;
import com.kwai.robust.PatchProxyResult;
import sd5.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import r0.a;
import android.text.TextPaint;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class u extends PresenterV2	// class@000408
{
    public a p;
    public PhotoDetailParam q;
    public QPhoto r;
    public BaseFragment s;
    public a t;
    public d u;
    public TextView v;
    public SlidePlayViewModel w;
    public w x;
    public final u$b y;

    public void u(){
       super();
       this.y = new u$b(this);
    }
    public static final w P8(u p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mPanoramaViewModel");
       }
       return p0;
    }
    public static void S8(u p0,Bitmap p1,Boolean p2,int p3,Object p4){
       Boolean fALSE = (p3 & 0x02)? Boolean.FALSE: null;
       p0.R8(null, fALSE);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "12")) {
          return;
       }
       u tr = this.r;
       String str = "mPhoto";
       if (tr == null) {
          a.S(str);
       }
       if (tr.isVideoType()) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          if (r1.l3(tr.mEntity)) {
             tr = this.s;
             str = "mFragment";
             if (tr == null) {
                a.S(str);
             }
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
             if (slidePlayVie != null) {
                this.w = slidePlayVie;
                u ts = this.s;
                if (ts == null) {
                   a.S(str);
                }
                slidePlayVie.P(ts, this.y);
                Activity activity = this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ViewModel viewModel = ViewModelProviders.of(activity).get(w.class);
                a.o(viewModel, "ViewModelProviders.of\(fr¡­amaViewModel::class.java\)");
                this.x = viewModel;
                tr = this.v;
                str = "mOpenPanoramaDetailButton";
                if (tr == null) {
                   a.S(str);
                }
                int i = (NasaSlidePlayExperimentUtil.e())? 0x7f08017e: 0x7f08018f;
                tr.setBackgroundResource(i);
                tr = this.v;
                if (tr == null) {
                   a.S(str);
                }
                i = (NasaSlidePlayExperimentUtil.j())? 8: 0;
                tr.setVisibility(i);
                tr = this.v;
                if (tr == null) {
                   a.S(str);
                }
                tr.setText(a1.p(R.string.arg_RES_7f103b6b));
                tr = this.v;
                if (tr == null) {
                   a.S(str);
                }
                tr.setOnClickListener(new u$c(this));
                return;
             }else {
                throw new IllegalArgumentException("Required value was null.".toString());
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "13")) {
          return;
       }
       u tr = this.r;
       String str = "mPhoto";
       if (tr == null) {
          a.S(str);
       }
       if (tr.isVideoType()) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          if (r1.l3(tr.mEntity)) {
             tr = this.w;
             if (tr == null) {
                a.S("mSlidePlayViewModel");
             }
             u ts = this.s;
             if (ts == null) {
                a.S("mFragment");
             }
             tr.D(ts, this.y);
          }
       }
       return;
    }
    public final void R8(Bitmap p0,Boolean p1){
       NasaPanoramaDetailFragment$a u;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, u.class, "15")) {
          return;
       }
       RxBus.f.b(new f(false));
       u tx = this.x;
       String str = "mPanoramaViewModel";
       if (tx == null) {
          a.S(str);
       }
       Map map = tx.p0();
       u ts = this.s;
       String str1 = "mFragment";
       if (ts == null) {
          a.S(str1);
       }
       map.remove(String.valueOf(ts.hashCode()));
       tx = this.x;
       if (tx == null) {
          a.S(str);
       }
       map = tx.o0();
       ts = this.s;
       if (ts == null) {
          a.S(str1);
       }
       map.remove(String.valueOf(ts.hashCode()));
       tx = this.x;
       if (tx == null) {
          a.S(str);
       }
       tx.r0().setValue(Boolean.FALSE);
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       c supportFragm = activity.getSupportFragmentManager();
       a.o(supportFragm, "\(activity as FragmentAct¡­y\).supportFragmentManager");
       u = NasaPanoramaDetailFragment.u;
       u$a uoa = new u$a(this, p0);
       Objects.requireNonNull(u);
       NasaPanoramaDetailFragment$a uoa1 = NasaPanoramaDetailFragment$a.class;
       if (!PatchProxy.applyVoidTwoRefsWithListener(supportFragm, uoa, u, uoa1, "2")) {
          a.p(supportFragm, "fragmentManager");
          Fragment uFragment = supportFragm.findFragmentByTag("PANORAMA_DETAIL_FRAGMENT_TAG");
          if (uFragment != null) {
             e uoe = supportFragm.beginTransaction();
             uoe.y(false, R.anim.arg_RES_7f0100cf);
             uoe.u(uFragment);
             uoe.x(uoa);
             uoe.o();
          }
          PatchProxy.onMethodExit(uoa1, "2");
       }
       if (a.g(p1, Boolean.TRUE)) {
          u tp = this.p;
          if (tp != null) {
             tp.d(true);
          }
       }
       return;
    }
    public final c V8(){
       u obj = PatchProxy.apply(null, this, u.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mFrameUiHolder");
       }
       return obj.N();
    }
    public final BaseFragment W8(){
       u obj = PatchProxy.apply(null, this, u.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public final a X8(){
       u obj = PatchProxy.apply(null, this, u.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPlayModule");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "11")) {
          return;
       }
       a.p(p0, "rootView");
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       a.o(uod, "ContentFrameExitSwipeAni¡­R.id.texture_view_frame\)\)");
       this.u = uod;
       if (uod == null) {
          a.S("mFrameUiHolder");
       }
       this.W7(uod);
       p0 = m1.f(p0, R.id.open_long_atlas);
       a.o(p0, "bindWidget\(rootView, R.id.open_long_atlas\)");
       this.v = p0;
       String str = "mOpenPanoramaDetailButton";
       if (p0 == null) {
          a.S(str);
       }
       u tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tv.getLayoutParams();
       layoutParams.height = a1.e(32.00f);
       u tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       tv1.setPadding(a1.e(12.00f), a1.e(6.00f), a1.e(12.00f), a1.e(6.00f));
       tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       tv1.setTextSize(12.00f);
       p0.setLayoutParams(layoutParams);
       Context context = this.getContext();
       a.m(context);
       Drawable uDrawable = a.d(context, R.drawable.arg_RES_7f080a70);
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       tv.setCompoundDrawablesWithIntrinsicBounds(uDrawable, null, null, null);
       u tv2 = this.v;
       if (tv2 == null) {
          a.S(str);
       }
       tv2.setCompoundDrawablePadding(a1.d(R.dimen.arg_RES_7f07031b));
       tv2 = this.v;
       if (tv2 == null) {
          a.S(str);
       }
       TextPaint paint = tv2.getPaint();
       if (paint != null) {
          paint.setFakeBoldText(true);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.t = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.q = obj;
       this.p = this.s8(a.class);
       return;
    }
}
