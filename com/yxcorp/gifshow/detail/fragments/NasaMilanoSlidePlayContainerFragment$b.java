package com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$b;
import n9a.b;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import x1a.c;
import e0a.j;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class NasaMilanoSlidePlayContainerFragment$b implements b	// class@001506
{
    public final boolean a;
    public final NasaMilanoSlidePlayContainerFragment b;

    public void NasaMilanoSlidePlayContainerFragment$b(NasaMilanoSlidePlayContainerFragment p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (j.r() != null && (j.r().mEnableChangeAnim != null && this.a == null))? true: false;
       return b;
    }
    public boolean b(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NasaMilanoSlidePlayContainerFragment$b obj = PatchProxy.apply(objArray, this, NasaMilanoSlidePlayContainerFragment$b.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, NasaMilanoSlidePlayContainerFragment.class, "13");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          GrootSlidePlayDetailBaseContainerFragment q = obj.q;
          if (q != null) {
             QPhoto currentPhoto = q.getCurrentPhoto();
             if (currentPhoto != null && r1.S2(currentPhoto.getEntity())) {
                NasaMilanoSlidePlayContainerFragment c = obj.C;
                if (c != null && c.getNasaSlideParam().mEnableLiveSlidePlay != null) {
                   b = 1;
                }
             }
          }
          b = 0;
       }
       return (b ^ 1);
    }
}
