package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$f;
import erd.g;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter;
import java.lang.Object;
import i50.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import v40.a;
import com.kuaishou.eve.kit.rerank.utils.UploadUtil;
import sy6.a;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import qea.u;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import java.util.List;
import java.lang.Iterable;
import lea.f;
import lea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.UsePrefetchReason;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e50.m;

public final class FeaturedRankPrefetchPresenter$f implements g	// class@000f2a
{
    public final FeaturedRankPrefetchPresenter b;

    public void FeaturedRankPrefetchPresenter$f(FeaturedRankPrefetchPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       List list;
       Iterator iterator1;
       Object obj3;
       Object obj4;
       Object obj = this;
       a obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, FeaturedRankPrefetchPresenter$f.class, "1")) {
       }else {
          FeaturedRankPrefetchPresenter$f b = obj.b;
          a.o(obj1, "event");
          Objects.requireNonNull(b);
          FeaturedRankPrefetchPresenter uFeaturedRan = FeaturedRankPrefetchPresenter.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, uFeaturedRan, "13")) {
             boolean i = -1;
             if (b.B == null) {
                a.a.b("first item not show");
                UploadUtil.d.c(i, "first item not attached");
             }else {
                FeaturedRankPrefetchPresenter p = b.p;
                int i1 = 1;
                if (p != null && p.r() == i1) {
                   a.a.b("insertPrefetchPhotoAtLast: in side profile, return");
                   UploadUtil.d.c(i, "sourceType Profile");
                }else {
                   ArrayList uArrayList = new ArrayList();
                   obj1 = obj1.a;
                   int len = obj1.length;
                   int i2 = 0;
                   int i3 = 0;
                   while (i2 < len) {
                      object oobject = obj1[i2];
                      int i4 = i3 + 1;
                      if (i3 < 2) {
                         uArrayList.add(oobject);
                      }
                      i2 = i2 + 1;
                      i3 = i4;
                   }
                   obj1 = a.a;
                   obj1.b("doReplacePrefetchPhoto: "+uArrayList.size());
                   if (!PatchProxy.applyVoidOneRefs(uArrayList, b, uFeaturedRan, "9")) {
                      if (uArrayList.isEmpty()) {
                         obj1.b("doReplacePrefetchPhoto: replacePids isEmpty");
                         UploadUtil.d.c(i, "invalid replacePids");
                      }else {
                         FeaturedRankPrefetchPresenter p1 = b.p;
                         if (p1 != null) {
                            int i5 = p1.a0();
                            ArrayList uArrayList1 = new ArrayList();
                            ArrayList uArrayList2 = new ArrayList();
                            Iterator iterator = uArrayList.iterator();
                            i3 = 0;
                            while (iterator.hasNext()) {
                               Object obj2 = iterator.next();
                               int i6 = i3 + 1;
                               if (i3 < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               FeaturedRankPrefetchPresenter p2 = b.p;
                               if (p2 != null) {
                                  int i7 = i5 + 1;
                                  i7 = i7 + i3;
                                  QPhoto qPhoto = p2.n(i7);
                                  if (qPhoto != null) {
                                     String str = ", originPhoto: ";
                                     String str1 = "rank prefetch photo: ";
                                     if (!i3) {
                                        list = b.a(-622777217).o(1000, i1, c.a());
                                        if (list != null) {
                                           iterator1 = list.iterator();
                                           while (true) {
                                              if (iterator1.hasNext()) {
                                                 obj3 = iterator1.next();
                                                 b mQPhoto = obj3.mQPhoto;
                                                 a.o(mQPhoto, "it.mQPhoto");
                                                 if (a.g(mQPhoto.getPhotoId(), obj2)) {
                                                    obj4 = obj3;
                                                 label_0123 :
                                                    if (obj4 != null) {
                                                       b mQPhoto1 = obj4.mQPhoto;
                                                       a.o(mQPhoto1, "prefetchModel.mQPhoto");
                                                       mQPhoto1.setPrefetch(true);
                                                       mQPhoto1.setListLoadSequenceID(obj4.mLlsid);
                                                       mQPhoto1.setPrefetchReason(UsePrefetchReason.RERANK_PREFETCH.getReason());
                                                       uArrayList1.add(mQPhoto1);
                                                       uArrayList2.add(qPhoto);
                                                       a.a.b(str1+obj2+str+qPhoto.getPhotoId());
                                                    }
                                                 }else {
                                                    String str2 = 1;
                                                 }
                                              }else {
                                                 obj4 = null;
                                                 goto label_0123 ;
                                              }
                                           }
                                        }
                                     }else {
                                        FeaturedRankPrefetchPresenter obj5 = PatchProxy.applyOneRefs(qPhoto, b, uFeaturedRan, "14");
                                        if (obj5 != PatchProxyResult.class) {
                                           i = obj5.booleanValue();
                                        }else if(!qPhoto.isAd() && (qPhoto.isLiveStream() || !qPhoto.isVideoType())){
                                           i = true;
                                        }else {
                                           i = false;
                                        }
                                        if (!i) {
                                           i = a.g(qPhoto.getPhotoId(), obj2) ^ 1;
                                           if (i) {
                                              obj5 = b.p;
                                              if (obj5 != null) {
                                                 list = obj5.e0();
                                                 if (list != null) {
                                                    iterator1 = list.iterator();
                                                    while (true) {
                                                       if (iterator1.hasNext()) {
                                                          Object obj6 = iterator1.next();
                                                          obj3 = obj6;
                                                          a.o(obj3, "photo");
                                                          if (a.g(obj2, obj3.getPhotoId())) {
                                                             obj4 = obj6;
                                                          }
                                                       }else {
                                                          obj4 = null;
                                                       }
                                                       if (obj4 != null) {
                                                          uArrayList1.add(obj4);
                                                          uArrayList2.add(qPhoto);
                                                          a.a.b(str1+obj2+str+qPhoto.getPhotoId());
                                                       }
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            label_01f0 :
                               i3 = i6;
                               i1 = 1;
                            }
                            if (uArrayList1.isEmpty()) {
                               a.a.b("doReplacePrefetchPhoto fail: replacePhotos isEmpty");
                               UploadUtil.d.c(-1, "no prefetch item found");
                            }else {
                               int i8 = -1;
                               if (uArrayList1.size() != uArrayList2.size()) {
                                  a.a.b("replacePhotos size != originPhotos size");
                                  UploadUtil.d.c(i8, "invalid replacePhotos");
                               }else {
                                  uFeaturedRan = b.u;
                                  if (uFeaturedRan != null) {
                                     uFeaturedRan.t2(uArrayList2);
                                  }
                                  FeaturedRankPrefetchPresenter p3 = b.p;
                                  if (p3 != null) {
                                     p3.S((i5 + 1), uArrayList1, "FeaturedRankPrefetchP");
                                  }
                                  UploadUtil.d.c(1, null);
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
