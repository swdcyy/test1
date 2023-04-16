package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.UsePrefetchReason;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import qea.u;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import v40.a;
import sy6.a;
import java.util.ArrayList;
import java.util.Iterator;
import lea.f;
import lea.b;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import vda.l;
import java.lang.Enum;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class FeaturedRankPrefetchPresenter$b implements Runnable	// class@000f25
{
    public final FeaturedRankPrefetchPresenter b;
    public final QPhoto c;

    public void FeaturedRankPrefetchPresenter$b(FeaturedRankPrefetchPresenter p0,QPhoto p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       boolean b;
       QPhoto qPhoto;
       String str2;
       String photoId;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeaturedRankPrefetchPresenter$b.class, "1")) {
          return;
       }
       FeaturedRankPrefetchPresenter$b tb = this.b;
       UsePrefetchReason pOOR_NETWORK = UsePrefetchReason.POOR_NETWORK;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FeaturedRankPrefetchPresenter uFeaturedRan = FeaturedRankPrefetchPresenter.class;
       Object obj = PatchProxy.applyOneRefs(pOOR_NETWORK, tb, uFeaturedRan, "8");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          int i = -622777217;
          List list = b.a(i).o(1, 1, c.a());
          if (q.f(list)) {
             a.a.b("no prefetch photo can consume");
          }else {
             FeaturedRankPrefetchPresenter p = tb.p;
             if (p != null && p.r() == true) {
                a.a.b("insertPrefetchPhotoAtLast: in side profile, return");
             }else {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   f uof = iterator.next();
                   b mQPhoto = (uof != null)? uof.mQPhoto: objArray;
                   if (mQPhoto != null) {
                      mQPhoto = uof.mQPhoto;
                      a.o(mQPhoto, "model.mQPhoto");
                      mQPhoto.setListLoadSequenceID(uof.mLlsid);
                      mQPhoto.setPrefetchReason(pOOR_NETWORK.getReason());
                      uArrayList.add(mQPhoto);
                   }
                }
                if (q.f(uArrayList)) {
                   a.a.b("insert fail, qPhoto list is empty");
                }else {
                   a.a.b("insert "+uArrayList.size()+" photos");
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      qPhoto = iterator.next();
                      a.a.b("insert photo: "+qPhoto.getPhotoId()+"  "+qPhoto.getUserName());
                   }
                   FeaturedRankPrefetchPresenter w = tb.w;
                   if (w != null && a.g(w, tb.v)) {
                      a.a.b("attach photo not change, do insert photo");
                      FeaturedRankPrefetchPresenter p1 = tb.p;
                      if (p1 != null) {
                         p1.m(-1, uArrayList, "FeaturedRankPrefetchP");
                      }
                      a.o(list, "prefetchModels");
                      if (!PatchProxy.applyVoidTwoRefs(list, "poor_net_insert", tb, uFeaturedRan, "11") && !q.f(list)) {
                         Iterator iterator2 = list.iterator();
                         while (iterator2.hasNext()) {
                            f uof2 = iterator2.next();
                            u ou = b.a(i);
                            if (uof2 != null) {
                               b mQPhoto1 = uof2.mQPhoto;
                               if (mQPhoto1 != null) {
                                  photoId = mQPhoto1.getPhotoId();
                               label_014a :
                                  ou.b(photoId, "poor_net_insert");
                               }
                            }
                            photoId = objArray;
                            goto label_014a ;
                         }
                      }
                      String str = "";
                      String str1 = PatchProxy.applyOneRefs(pOOR_NETWORK, tb, uFeaturedRan, "10");
                      if (str1 != patchProxyRe) {
                      }else {
                         int i1 = l.a[pOOR_NETWORK.ordinal()];
                         if (i1 != 1) {
                            str2 = (i1 != 2)? "photo_used_first_play": "photo_used_for_poor_net";
                         }else {
                            str2 = "photo_used_for_no_net";
                         }
                         str1 = str2;
                      }
                      str = str+str1+"_at_last";
                      Iterator iterator1 = list.iterator();
                      while (iterator1.hasNext()) {
                         f uof1 = iterator1.next();
                         if (uof1 != null) {
                            uof1.mDiscardReason = str;
                         }
                      }
                      g.b(list, 1);
                      FeaturedRankPrefetchPresenter t = tb.t;
                      if (t != null) {
                         MilanoContainerEventBus x = t.x;
                         if (x != null) {
                            x.onNext(Integer.valueOf(1));
                         }
                      }
                      a.a.b("insert photo success");
                      b = true;
                   }else {
                      a.a.b("attach photo changed, cancel this insert");
                   }
                }
             }
          }
          b = false;
       }
       if (b) {
          this.b.y.add(this.c);
       }
       return;
    }
}
