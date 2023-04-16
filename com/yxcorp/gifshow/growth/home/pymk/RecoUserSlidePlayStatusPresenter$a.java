package com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import vna.t;
import androidx.viewpager2.widget.ViewPager2;

public class RecoUserSlidePlayStatusPresenter$a extends a	// class@001399
{
    public final RecoUserSlidePlayStatusPresenter b;

    public void RecoUserSlidePlayStatusPresenter$a(RecoUserSlidePlayStatusPresenter p0){
       this.b = p0;
       super();
    }
    public void B0(){
       RecoUserSlidePlayStatusPresenter$a uoa = RecoUserSlidePlayStatusPresenter$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       if (this.b.r.R0()) {
          RecoUserSlidePlayStatusPresenter$a tb = this.b;
          tb.y.G(tb.s.getPhoto(), uoa.getSimpleName());
       }
       return;
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecoUserSlidePlayStatusPresenter$a.class, "2")) {
          return;
       }
       this.b.x = false;
       this.b.u.onNext(Integer.valueOf(-1));
       RecoUserSlidePlayStatusPresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, RecoUserSlidePlayStatusPresenter.class, "8")) {
          int i = 0;
          while (i < tb.r.Q0().size()) {
             RecommendUserWrapper recommendUse = tb.r.r1(i);
             if (recommendUse != null) {
                recommendUse.setShowed(false);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, RecoUserSlidePlayStatusPresenter$a.class, "1")) {
          return;
       }
       this.b.x = true;
       RecoUserSlidePlayStatusPresenter$a tb = this.b;
       RecoUserSlidePlayStatusPresenter p = tb.p;
       if (p != null) {
          tb.u.onNext(Integer.valueOf(p.getCurrentItem()));
          tb = this.b;
          tb.P8(tb.p.getCurrentItem(), "first");
       }
       return;
    }
}
