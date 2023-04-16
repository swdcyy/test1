package com.yxcorp.gifshow.detail.fragments.milano.profile.b$c;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import io.reactivex.subjects.PublishSubject;

public class b$c implements b$b	// class@001545
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void d(int p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.b;
       uoc.r.A.onNext(new MilanoContainerEventBus$c(uoc.s.getCurrentPhoto(), p0));
       return;
    }
}
