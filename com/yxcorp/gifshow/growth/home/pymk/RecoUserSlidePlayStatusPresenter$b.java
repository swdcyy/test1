package com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter$b;
import androidx.viewpager2.widget.ViewPager2$h;
import com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;

public class RecoUserSlidePlayStatusPresenter$b extends ViewPager2$h	// class@00139a
{
    public final RecoUserSlidePlayStatusPresenter a;

    public void RecoUserSlidePlayStatusPresenter$b(RecoUserSlidePlayStatusPresenter p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       RecoUserSlidePlayStatusPresenter$b uob = RecoUserSlidePlayStatusPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.a.q.getAdapter() == null || (this.a.q.getAdapter().getItemCount() > 0 && !this.a.q.isAnimating())) {
          if (this.a.x != null) {
             this.a.u.onNext(Integer.valueOf(p0));
             this.a.P8(p0, "slide");
          }
          this.a.v.onNext(Boolean.TRUE);
       }
    label_0059 :
       return;
    }
}
