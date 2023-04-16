package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2$a;
import qw6.b;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cia.w;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Set;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import java.lang.StringBuilder;
import yga.c;
import com.kwai.framework.model.user.User;
import kotlin.collections.CollectionsKt__CollectionsKt;
import xga.a;
import java.lang.Integer;
import rq4.r;
import rq4.n;
import rq4.o;
import java.util.Collection;
import ekd.q;

public final class FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2$a extends b	// class@001112
{
    public final FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2 b;

    public void FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2$a(FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, FollowSlideAcquaintanceRecordPresenter$itemAppearanceChangedListener$2$a.class, "1")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = this.b.this$0.R8().O();
       if (slidePlayVie != null) {
          QPhoto currentPhoto = slidePlayVie.getCurrentPhoto();
          if (currentPhoto != null) {
             a.o(currentPhoto, "currentPhoto ?: return@apply");
             String str = r1.t1(currentPhoto.mEntity);
             if (!this.b.this$0.r.contains(str)) {
                int i = slidePlayVie.q(slidePlayVie.j());
                FollowSlideAcquaintanceRecordPresenter q = this.b.this$0.q;
                if (q != null) {
                   c.i(KsLogFollowTag.FOLLOW_ACQUAINTANCE.appendTag("FollowSlideAcquaintanceRecordPresenter"), "reportShowRecoUser "+r1.t1(currentPhoto.mEntity));
                   a.o(str, "photoId");
                   this.b.this$0.r.add(str);
                   User user = currentPhoto.getUser();
                   BaseFeed[] uBaseFeedArr = new BaseFeed[]{currentPhoto.mEntity};
                   List list = CollectionsKt__CollectionsKt.P(uBaseFeedArr);
                   if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(q, Integer.valueOf(i), user, list, null, a.class, "1")) {
                      r or = a.a(50, q);
                      or.d = 4;
                      n[] onArray = new n[1];
                      n on = new n();
                      on.a = user.getId();
                      on.d = user.mPosition + 1;
                      o[] ooArray = new o[1];
                      on.e = ooArray;
                      if (!q.f(list)) {
                         int i1 = 0;
                         while (i1 < list.size()) {
                            BaseFeed uBaseFeed = list.get(i1);
                            if (uBaseFeed != null) {
                               on.e[i1] = new o();
                               on.e[i1].a = r1.t1(uBaseFeed);
                               int i2 = i + 1;
                               on.e[i1].b = i2;
                            }
                            i1 = i1 + 1;
                         }
                      }
                      onArray[0] = on;
                      or.f = onArray;
                      a.b(or);
                   }
                }
             }
          }
       }
       return;
    }
}
