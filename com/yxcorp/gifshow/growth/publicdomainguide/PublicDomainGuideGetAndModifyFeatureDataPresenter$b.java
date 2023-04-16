package com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter$b;
import qw6.b;
import com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;

public final class PublicDomainGuideGetAndModifyFeatureDataPresenter$b extends b	// class@001486
{
    public final PublicDomainGuideGetAndModifyFeatureDataPresenter b;

    public void PublicDomainGuideGetAndModifyFeatureDataPresenter$b(PublicDomainGuideGetAndModifyFeatureDataPresenter p0){
       this.b = p0;
       super();
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, PublicDomainGuideGetAndModifyFeatureDataPresenter$b.class, "1")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = this.b.p0();
       a.o(slidePlayVie, "slidePlayViewModel");
       QPhoto currentPhoto = slidePlayVie.getCurrentPhoto();
       if (currentPhoto != null) {
          a.o(currentPhoto, "it");
          if (!currentPhoto.isVideoType() || (currentPhoto.isAd() && (!currentPhoto.isAtlasPhotos() && !currentPhoto.isLongPhotos()))) {
             currentPhoto.setShowed(true);
          }
       }
       return;
    }
}
