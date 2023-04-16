package com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment$a;
import tw6.a;
import com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import org.greenrobot.eventbus.a;
import e6a.b;
import com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import az6.a;
import d6a.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;

public class GrootSlidePlayDetailBaseContainerFragment$a implements a	// class@000a4d
{
    public final GrootSlidePlayDetailBaseContainerFragment b;

    public void GrootSlidePlayDetailBaseContainerFragment$a(GrootSlidePlayDetailBaseContainerFragment p0){
       this.b = p0;
       super();
    }
    public void d(int p0){
       GrootSlidePlayDetailBaseContainerFragment$a uoa = GrootSlidePlayDetailBaseContainerFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       a.d().k(new b(f.c(this.b.k.mSlidePlayId), this.b.q.getCurrentPhoto(), this.b.k.mDetailCommonParam.getUnserializableBundleId()));
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
