package a99.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a99.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import wh5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import a99.c;
import android.view.View$OnClickListener;
import a99.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import a99.d;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import a99.g$b;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import tkd.b;
import tkd.d;
import vo5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.animation.ObjectAnimator;
import a99.g$c;
import a99.g$d;
import android.view.MotionEvent;
import android.app.Activity;
import uw9.m3;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Number;
import m99.f;
import android.view.View;
import l17.a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import a99.e;
import ekd.m1;
import android.widget.RelativeLayout;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.util.Set;
import io.reactivex.subjects.PublishSubject;

public abstract class g extends PresenterV2	// class@000064
{
    public Set A;
    public t B;
    public b C;
    public PublishSubject D;
    public boolean E;
    public boolean F;
    public int G;
    public b H;
    public RecyclerView I;
    public boolean J;
    public final PhotosScaleHelpView$c K;
    public AnimatorSet L;
    public AnimatorSet M;
    public RelativeLayout p;
    public PhotosScaleHelpView q;
    public ImageView r;
    public DetailToolBarButtonView s;
    public QPhoto t;
    public NormalDetailBizParam u;
    public BaseFragment v;
    public Set w;
    public f x;
    public PublishSubject y;
    public PublishSubject z;

    public void g(){
       super();
       this.K = new g$a(this);
    }
    public void E8(){
       g obj;
       boolean b;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "5")) {
          return;
       }
       if (NasaExperimentUtils.z() && !c.b()) {
          obj = PatchProxy.apply(objArray, this, og, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             PhotoMeta photoMeta = this.t.mEntity.a(PhotoMeta.class);
             if (photoMeta != null) {
                photoMeta = photoMeta.mMMUSimilarSearchInfo;
                if (photoMeta != null) {
                   MMUSimilarSearchInfo mHasCommodit = photoMeta.mHasCommodityPicIndexes;
                   if (mHasCommodit != null && mHasCommodit.size() > 0) {
                      b = true;
                   }
                }
             }
             b = false;
          }
          if (b && !PatchProxy.applyVoid(objArray, this, og, "6")) {
             RelativeLayout$LayoutParams layoutParams = this.r.getLayoutParams();
             layoutParams.bottomMargin = a1.e(64.00f);
             this.r.setLayoutParams(layoutParams);
          }
       }
    label_006a :
       this.r.setOnClickListener(new c(this));
       obj = Functions.e;
       this.X7(this.B.subscribe(new f(this), obj));
       this.X7(this.v.m().subscribe(new d(this), obj));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.G = c.b(a.B.getResources(), 0x7f070fdf);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "22")) {
          return;
       }
       if (this.E == null) {
          return;
       }
       g tM = this.M;
       if (tM != null && tM.isRunning()) {
          this.M.cancel();
       }
       this.L = new AnimatorSet();
       this.L.setDuration(300);
       this.L.addListener(new g$b(this));
       this.L.playTogether(new ArrayList());
       this.L.start();
       return;
    }
    public void R8(){
       boolean b;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "23")) {
          return;
       }
       ArrayList obj = PatchProxy.apply(objArray, this, og, "16");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a uoa = d.a(-392345116);
          b = (uoa != null && uoa.FW(this.v))? uoa.R30(this.v): false;
       }
       if (!b && this.E == null) {
          og = this.L;
          if (og != null && og.isRunning()) {
             this.L.cancel();
          }
          this.M = new AnimatorSet();
          obj = new ArrayList();
          g tr = this.r;
          float[] uofloatArray = new float[]{tr.getAlpha(),0x3f800000};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tr, "alpha", uofloatArray);
          objectAnimat.addListener(new g$c(this));
          obj.add(objectAnimat);
          this.M.setDuration(300);
          this.M.addListener(new g$d(this));
          this.M.playTogether(obj);
          this.M.start();
       }
       return;
    }
    public boolean S8(MotionEvent p0){
       a obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.a(-392345116);
       if (obj == null || !obj.FW(this.v)) {
          return false;
       }
       if (p0.getY() - ((obj.XJ(this.v) - (float)a1.d(0x7f07031f)) - (float)m3.e(this.getActivity(), this.t)) > 0) {
          return false;
       }
       return true;
    }
    public abstract boolean V8(RecyclerView p0);
    public abstract RecyclerView W8();
    public final int X8(){
       Object obj = PatchProxy.apply(null, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.x.s1() - 1;
       if (i < 0) {
          i = 0;
       }
       return i;
    }
    public abstract View Y8();
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       if (a.a(this.I).e() >= (this.x.s1() - 1)) {
          this.r.setVisibility(8);
          this.F = false;
       }else {
          this.r.setVisibility(false);
          this.F = true;
       }
       this.q.setScaleEnabled(this.V8(this.I));
       return;
    }
    public abstract void a9();
    public void b9(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       b9.a(this.C);
       this.C = t.timer(2, TimeUnit.SECONDS).observeOn(d.a).subscribe(new e(this), Functions.e);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3698);
       this.q = m1.f(p0, 0x7f0a2f51);
       ImageView imageView = m1.f(p0, R.id.fast_up_down);
       this.r = imageView;
       imageView.setImageResource(R.drawable.arg_RES_7f0809b3);
       this.s = m1.f(p0, 0x7f0a0cb2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.t = this.q8(QPhoto.class);
       this.u = this.q8(NormalDetailBizParam.class);
       this.v = this.r8("DETAIL_FRAGMENT");
       this.w = this.r8("DETAIL_SCROLL_LISTENERS");
       this.x = this.q8(f.class);
       this.y = this.r8("DETAIL_EDITOR_SHOW_STATE_CHANGE");
       this.z = this.r8("DETAIL_DOUBLE_CLICK_LIKE");
       this.A = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       this.B = this.r8("DETAIL_PAGE_VISIBLE_OBSERVABLE");
       this.D = this.r8("DETAIL_TIMECOUNTDOWN_PUBLISHER");
       return;
    }
}
