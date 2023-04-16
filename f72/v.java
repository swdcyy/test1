package f72.v;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.CoverMeta;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import zp.d;
import com.facebook.drawee.view.DraweeView;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import tl8.d;
import ga5.m;
import jp.a;
import f72.v$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.image.KwaiImageView;
import jd.c;
import ub.b;
import wb5.h;
import com.kuaishou.android.model.mix.CoverMetaExt;
import com.facebook.drawee.controller.ForwardingControllerListener;
import f72.v$a;
import hn5.n;
import hn5.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import dd.d;
import ekd.j;
import wb5.a;
import android.view.View;
import ekd.m1;

public class v extends c	// class@0028de
{
    public KwaiImageView p;
    public CommonMeta q;
    public CoverMeta r;
    public QPhoto s;
    public RecyclerFragment t;
    public static String sLivePresenterClassName = "LiveDoubleListFeedCoverPresenter";

    public void v(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       QPhoto mEntity = this.s.mEntity;
       this.q = r1.w0(mEntity);
       this.r = r1.D0(mEntity);
       this.p.setPlaceHolderImage(new ColorDrawable(this.r.mColor));
       float f = d.a(mEntity);
       float f1 = 0x3f800000;
       if (f > 0) {
          this.p.setAspectRatio((f1 / f));
          h.c(this.p, mEntity, new m(mEntity.a(CoverPicRecommendedCropWindow.class)), a.b, new v$b(this, this.t, this.q, this.r), true);
       }else {
          f = CoverMetaExt.getCoverAspectRatio(r1.D0(mEntity));
          if (f - 0x3fe38e39 > 0) {
             f = 0x3fe38e39;
          }
          this.p.setAspectRatio((f1 / f));
          h.f(this.p, mEntity, false, a.c, ForwardingControllerListener.of(new v$b(this, this.t, this.q, this.r)), new v$a(m.a().U3(this.getActivity())));
       }
       if (!j.h(this.r.mOverrideCoverThumbnailUrls)) {
          a.c(this.r);
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, v.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1c85);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("FRAGMENT");
       return;
    }
}
