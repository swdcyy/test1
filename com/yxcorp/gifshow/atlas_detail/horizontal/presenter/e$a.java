package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e$a;
import tyc.k;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gb5.a;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.facebook.drawee.view.DraweeView;
import ac.b;
import yb.a;
import java.lang.Integer;
import java.util.List;
import jd5.a;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCoverFrameReadyEvent;

public class e$a implements k	// class@001bc5
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "2")) {
          return;
       }
       b.a(0x8708467).log("AtlasCover first frame error");
       return;
    }
    public void b(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       e$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, e.class, "6")) {
          if (ta.x.getSource() == 288 || (ta.x.getSource() == 8 && NasaExperimentUtils.A())) {
             float f = 0x3fe38e39;
             if (ta.p.getAspectRatio() - f > 0) {
                ta.p.setAspectRatio(f);
             }
          }
          a hierarchy = ta.p.getHierarchy();
          if (hierarchy != null) {
             hierarchy.f(p0, 0x3f800000, true);
          }
          if (!ta.u.contains(Integer.valueOf(ta.t))) {
             ta.u.add(Integer.valueOf(ta.t));
             ta.v.onNext(new a(true, 4, ta.t));
          }
          ta.q.setVisibility(8);
          e r = ta.r;
          if (r != null) {
             r.setVisibility(8);
          }
          b.a(0x8708467).log("AtlasCover first frame ready");
          RxBus.f.b(new PhotoDetailCoverFrameReadyEvent());
       }
       return;
    }
}
