package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$a;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import fm5.a;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import zl5.c;
import qvb.a;
import zl5.d;
import java.util.List;
import y8a.c;
import uw9.o;
import q87.c;
import zl5.f;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import com.yxcorp.gifshow.tube.SerialInfo;

public final class NasaSimilarPhotoAutoPlayPresenter$a implements g	// class@0018b5
{
    public final NasaSimilarPhotoAutoPlayPresenter b;

    public void NasaSimilarPhotoAutoPlayPresenter$a(NasaSimilarPhotoAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String obj2;
       boolean b1;
       SlidePlayAutoPlayNextPresenter v0;
       i oi;
       SerialInfo serialInfo;
       Object obj = this;
       PatchProxyResult obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, NasaSimilarPhotoAutoPlayPresenter$a.class, "1")) {
       }else {
          NasaSimilarPhotoAutoPlayPresenter$a b = obj.b;
          a.o(obj1, "currentPosition");
          long l = obj1.longValue();
          Objects.requireNonNull(b);
          obj1 = PatchProxyResult.class;
          NasaSimilarPhotoAutoPlayPresenter nasaSimilarP = NasaSimilarPhotoAutoPlayPresenter.class;
          if (!PatchProxy.isSupport(nasaSimilarP) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), b, nasaSimilarP, "15")) {
             long l1 = 0x2710;
             if ((System.currentTimeMillis() - b.k1) - l1 >= 0) {
                String str = "mPhoto";
                int i = 1;
                int i1 = 0;
                if (PatchProxy.isSupport(nasaSimilarP)) {
                   obj2 = PatchProxy.applyOneRefs(Long.valueOf(l), b, nasaSimilarP, "16");
                   if (obj2 != obj1) {
                      b1 = obj2.booleanValue();
                   }else {
                   label_0062 :
                      SlidePlayAutoPlayNextPresenter x1 = b.x;
                      a.o(x1, str);
                      if ((r1.L0(x1.getEntity()) - l) - l1 <= 0) {
                         x1 = b.x;
                         a.o(x1, str);
                         if ((r1.L0(x1.getEntity()) - l) > 0) {
                            b1 = true;
                         }
                      }
                      b1 = false;
                   }
                }else {
                   goto label_0062 ;
                }
                if (b1) {
                   b.k1 = System.currentTimeMillis();
                   String str1 = "mSlidePlayViewModel.pageList";
                   obj2 = "mSlidePlayViewModel";
                   Object[] objArray = null;
                   if (a.v(b.x)) {
                      if (!PatchProxy.applyVoid(objArray, b, nasaSimilarP, "17")) {
                         v0 = b.V0;
                         a.o(v0, obj2);
                         oi = v0.X0();
                         if (!oi instanceof c) {
                            oi = objArray;
                         }
                         if (oi != null && !oi.isEmpty()) {
                            if (oi.w != null) {
                               i1 = 1;
                            }
                            if (!i1 && !oi.Q0()) {
                               SlidePlayAutoPlayNextPresenter x = b.x;
                               a.o(x, str);
                               Object obj3 = oi.getItems().get((oi.getItems().size() - i));
                               a.o(obj3, "it.items[it.items.size - 1]");
                               if (a.g(x.getPhotoId(), obj3.getPhotoId())) {
                                  SlidePlayAutoPlayNextPresenter v01 = b.V0;
                                  a.o(v01, obj2);
                                  i oi1 = v01.X0();
                                  a.o(oi1, str1);
                                  if (!c.a.g(oi1)) {
                                     c uoc = new c("", 1, "", "", "");
                                     if (!PatchProxy.applyVoidOneRefs(oi1, oi, c.class, "4")) {
                                        oi.r2(oi1);
                                        d uod = oi.j2();
                                        if (uod instanceof c) {
                                           d uod1 = uod;
                                           uod1.B = oi.B;
                                           uod1.z = oi.z;
                                           uod1.A = oi.A;
                                           uod1 = PatchProxy.apply(objArray, oi, d.class, "1");
                                           if (uod1 != obj1) {
                                           }else {
                                              uod1 = oi.r;
                                              if (uod1 == null) {
                                                 a.S("mInitPhotoId");
                                              }
                                           }
                                           uod.t2(uod1);
                                           uod.C = oi.C;
                                        }
                                     }
                                     oi1.p2();
                                  }
                               }
                            }
                         }
                      }
                   }else if(!PatchProxy.applyVoid(objArray, b, nasaSimilarP, "18") && a.w(b.x)){
                      Object[] objArray1 = new Object[i1];
                      o.C().w(b.f1, "---------preloadEpisodes: ", objArray1);
                      SlidePlayAutoPlayNextPresenter v02 = b.V0;
                      a.o(v02, obj2);
                      if (!v02.p1()) {
                         v0 = b.V0;
                         a.o(v0, obj2);
                         oi = v0.X0();
                         a.o(oi, str1);
                         if (c.a.g(oi)) {
                         label_020c :
                            PatchProxy.onMethodExit(NasaSimilarPhotoAutoPlayPresenter$a.class, "1");
                         }
                      }
                      v02 = b.V0;
                      a.o(v02, obj2);
                      i oi2 = v02.X0();
                      if (oi2 instanceof f) {
                         objArray = oi2;
                      }
                      if (objArray != null) {
                         v0 = b.x;
                         a.o(v0, str);
                         String photoId = v0.getPhotoId();
                         StandardSerialInfo standardSeri = a.t(b.x);
                         if (standardSeri != null) {
                            standardSeri = standardSeri.mSerialInfo;
                            if (standardSeri != null) {
                               serialInfo = standardSeri.mBusinessType;
                            label_01d7 :
                               f uof = new f(photoId, "", 0, "", serialInfo);
                               if (!PatchProxy.applyVoidOneRefs(oi2, objArray, f.class, "3")) {
                                  objArray.r2(oi2);
                                  d uod2 = objArray.j2();
                                  if (uod2 != null && uod2 instanceof f) {
                                     uod2.r = objArray.r;
                                     uod2.A = objArray.A;
                                     uod2.B = objArray.B;
                                     uod2.C = objArray.C;
                                  }
                               }
                               oi2.p2();
                               goto label_020c ;
                            }
                         }
                         serialInfo = 0;
                         goto label_01d7 ;
                      }else {
                         goto label_020c ;
                      }
                   }else {
                      goto label_020c ;
                   }
                }else {
                   goto label_020c ;
                }
             }else {
                goto label_020c ;
             }
          }
       }
       return;
    }
}
