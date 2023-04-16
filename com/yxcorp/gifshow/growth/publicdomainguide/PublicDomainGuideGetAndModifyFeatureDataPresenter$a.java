package com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter$a;
import erd.g;
import com.yxcorp.gifshow.growth.publicdomainguide.PublicDomainGuideGetAndModifyFeatureDataPresenter;
import java.lang.Object;
import nna.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import kotlin.jvm.internal.a;
import yw6.g;
import java.util.List;
import fw6.b;
import java.util.Collection;
import com.yxcorp.gifshow.entity.QPhoto;
import bw6.a;

public final class PublicDomainGuideGetAndModifyFeatureDataPresenter$a implements g	// class@001485
{
    public final PublicDomainGuideGetAndModifyFeatureDataPresenter b;

    public void PublicDomainGuideGetAndModifyFeatureDataPresenter$a(PublicDomainGuideGetAndModifyFeatureDataPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublicDomainGuideGetAndModifyFeatureDataPresenter$a.class, "1")) {
       }else {
          SlidePlayViewModel slidePlayVie = this.b.p0();
          a.o(slidePlayVie, "slidePlayViewModel");
          g og = slidePlayVie.P0();
          if (og != null) {
             List list = og.n0();
             if (list != null) {
                a.o(list, "it");
                if (list.isEmpty() ^ 0x01) {
                   int i = list.indexOf(p0.a());
                   int i1 = list.size();
                   int i2 = 0;
                   while (true) {
                      if (i2 < i1) {
                         Object obj = list.get(i2);
                         a.o(obj, "it[i]");
                         if (!obj.isShowed()) {
                         label_0058 :
                            if (i != i2) {
                               slidePlayVie = this.b.p0();
                               a.o(slidePlayVie, "slidePlayViewModel");
                               og = slidePlayVie.P0();
                               if (og != null) {
                                  og.F(p0.a());
                               }
                               slidePlayVie = this.b.p0();
                               a.o(slidePlayVie, "slidePlayViewModel");
                               og = slidePlayVie.P0();
                               if (og != null) {
                                  og.o0(i2, p0.a());
                               }
                            }
                            this.b.p0().k(i2, false);
                            break ;
                         }else {
                            i2 = i2 + 1;
                         }
                      }else {
                         i2 = i;
                         goto label_0058 ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
