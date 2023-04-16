package com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter$2;
import com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import androidx.lifecycle.LifecycleOwner;

public class RecoUserSlidePlayStatusPresenter$2 extends FixedLifecycleObserver	// class@001398
{
    public final RecoUserSlidePlayStatusPresenter f;

    public void RecoUserSlidePlayStatusPresenter$2(RecoUserSlidePlayStatusPresenter p0){
       this.f = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RecoUserSlidePlayStatusPresenter$2.class, "1")) {
          return;
       }
       this.f.R8();
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecoUserSlidePlayStatusPresenter$2.class, "2")) {
          return;
       }
       RecoUserSlidePlayStatusPresenter$2 tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, RecoUserSlidePlayStatusPresenter.class, "5") && tf.x != null) {
          tf.u.onNext(Integer.valueOf(tf.p.getCurrentItem()));
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoUserSlidePlayStatusPresenter$2.class, "3")) {
          return;
       }
       super.onStop(p0);
       this.f.R8();
       return;
    }
}
