package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$c;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cia.w;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.StringBuilder;
import yga.c;
import xga.a;
import rq4.r;
import rq4.n;

public final class FollowSlideAcquaintanceRecordPresenter$c implements g	// class@00110f
{
    public final FollowSlideAcquaintanceRecordPresenter b;

    public void FollowSlideAcquaintanceRecordPresenter$c(FollowSlideAcquaintanceRecordPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Pair pair;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideAcquaintanceRecordPresenter$c.class, "1")) {
       }else {
          SlidePlayViewModel slidePlayVie = this.b.R8().O();
          Object obj = null;
          if (slidePlayVie != null) {
             List list = slidePlayVie.V0();
             if (list != null) {
                Iterator iterator = list.iterator();
                int i = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      Object obj1 = iterator.next();
                      if (a.g(r1.U1(obj1.mEntity), p0.b)) {
                         pair = new Pair(Integer.valueOf(i), obj1);
                      label_0050 :
                         if (pair != null) {
                            p0.a.mPosition = pair.getFirst().intValue();
                         }
                         FollowSlideAcquaintanceRecordPresenter q = this.b.q;
                         if (q != null) {
                            c.i(KsLogFollowTag.FOLLOW_ACQUAINTANCE.appendTag("FollowSlideAcquaintanceRecordPresenter"), "reportRecoFollow "+p0.b);
                            p0 = p0.a;
                            if (!PatchProxy.applyVoidTwoRefs(q, p0, obj, a.class, "3")) {
                               r or = a.a(50, q);
                               or.d = 2;
                               n on = new n();
                               if (p0 != null) {
                                  on.a = p0.getId();
                                  on.d = p0.mPosition + 1;
                               }
                               if (p0 != null) {
                                  p0 = p0.mPage;
                                  if (p0 != null) {
                                     int i1 = -1;
                                     switch (p0.hashCode()){
                                         case 0xed8e89a9:
                                           if (p0.equals("profile")) {
                                              i1 = 0;
                                           }
                                           break;
                                         case 0x32b0ec:
                                           if (p0.equals("live")) {
                                              i1 = 1;
                                           }
                                           break;
                                         case 0x3559df:
                                           if (p0.equals("reco")) {
                                              i1 = 2;
                                           }
                                           break;
                                         case 0x65b3e32:
                                           if (p0.equals("photo")) {
                                              i1 = 3;
                                           }
                                           break;
                                         default:
                                     }
                                     switch (i1){
                                         case 0:
                                           on.f = 2;
                                           break;
                                         case 1:
                                           on.f = 4;
                                           break;
                                         case 2:
                                           on.f = 1;
                                           break;
                                         case 3:
                                           on.f = 3;
                                           break;
                                         default:
                                           on.f = 0;
                                     }
                                  }else {
                                  label_00fc :
                                     on.f = 1;
                                  }
                               }else {
                                  goto label_00fc ;
                               }
                               or.g = on;
                               a.b(or);
                               break ;
                            }
                         }
                      }else {
                         i = i + 1;
                      }
                   }
                }
             }
          }
          pair = obj;
          goto label_0050 ;
       }
       return;
    }
}
