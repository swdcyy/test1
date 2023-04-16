package com.yxcorp.gifshow.ad.detail.presenter.side.a$c;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.side.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$c;
import io.reactivex.subjects.PublishSubject;

public class a$c implements b$b	// class@0016a5
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void d(int p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       QPhoto currentPhoto = this.b.t.getCurrentPhoto();
       if (currentPhoto != null) {
          this.b.s.A.onNext(new MilanoContainerEventBus$c(currentPhoto, p0));
       }
       return;
    }
}
