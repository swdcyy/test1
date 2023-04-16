package d99.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y89.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tkd.b;
import tkd.d;
import vo5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import d99.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import im8.a;
import d99.h$c;
import java.lang.Integer;
import android.animation.ValueAnimator;
import d99.h$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import d99.h$b;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import im8.f;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;

public class h extends PresenterV2	// class@0020a1
{
    public NormalDetailBizParam p;
    public f q;
    public f r;
    public NonSlidePhotoConfig s;
    public f t;
    public t u;
    public QPhoto v;
    public Set w;
    public final h x;
    public ValueAnimator y;

    public void h(){
       super();
       this.x = new h();
    }
    public void E8(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "3")) {
          return;
       }
       h tx = this.x;
       Objects.requireNonNull(tx);
       h oh = h.class;
       if (!PatchProxy.applyVoid(objArray, tx, oh, "1")) {
          View view = tx.c.getView();
          a obj = PatchProxy.apply(objArray, tx, oh, "2");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = d.a(-392345116);
             i = (obj != null && obj.Hw(tx.c))? 0x7f0a3057: 0;
          }
          if (view != null && i) {
             tx.e = view.findViewById(i);
          }
       }
    label_0055 :
       this.X7(this.u.subscribe(new d(this), Functions.d()));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.W7(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       this.R8();
       return;
    }
    public void P8(int p0,h$c p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "7")) {
          return;
       }
       this.R8();
       int[] ointArray = new int[]{0,p0};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       this.y = valueAnimato;
       valueAnimato.setDuration(250);
       this.y.addUpdateListener(new h$a(this, p1));
       this.y.addListener(new h$b(this));
       this.y.start();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       h ty = this.y;
       if (ty != null) {
          ty.removeAllListeners();
          this.y.cancel();
       }
       return;
    }
    public void S8(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "6")) {
          return;
       }
       this.r.set(Boolean.valueOf(p0));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(NormalDetailBizParam.class);
       this.q = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.r = this.x8("DETAIL_RECYCLER_VIEW_TRANSLATION_Y_STATUS");
       this.s = this.r8("DETAIL_PHOTO_NON_SLIDE_CONFIG");
       this.t = this.x8("DETAIL_SUSPEND_VIDEO_MIN_HEIGHT");
       this.u = this.r8("DETAIL_PAGE_VISIBLE_OBSERVABLE");
       this.v = this.q8(QPhoto.class);
       this.w = this.r8("DETAIL_RECYCLER_VIEW_TRANSLATION_Y_CHANGE_LISTENER");
       return;
    }
}
