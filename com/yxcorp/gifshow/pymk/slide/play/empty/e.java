package com.yxcorp.gifshow.pymk.slide.play.empty.e;
import jx5.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.pymk.slide.play.empty.d;
import com.google.common.base.Suppliers;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import com.kwai.framework.model.response.CursorResponse;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import la6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListFeed;
import java.lang.Boolean;
import com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListMeta;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.pymk.f;
import qvb.a;
import qvb.n0;
import mrd.a;
import x6c.s;
import erd.g;
import x6c.t;
import com.yxcorp.gifshow.pymk.d;
import erd.o;
import k7c.g;

public final class e implements a	// class@0016db
{
    public ReminderRecommendUserListFeed a;
    public final x b;
    public final x c;
    public final x d;
    public final x e;

    public void e(x p0,x p1,x p2){
       super();
       this.e = Suppliers.a(d.b);
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public static void c(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "4")) {
          return;
       }
       Log.g("PymkEmptySlidePlay", String.format(p0, p1));
       return;
    }
    public t a(CursorResponse p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       QPhoto obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = true;
       e uoe = null;
       obj = (p0.getItems() != null && (p0.getItems().size() == b && p0.getItems().get(0).mEntity instanceof ReminderRecommendUserListFeed))? p0.getItems().get(0).mEntity: uoe;
       if (obj == null) {
          e td = this.d;
          if (td != null && (td.get().booleanValue() && (p0.getItems() != null && !p0.getItems().size()))) {
             ReminderRecommendUserListFeed reminderReco = new ReminderRecommendUserListFeed();
             reminderReco.afterDeserialize();
             reminderReco.mRecommendUserListMeta.mRecoPortal = 0;
             p0.getItems().add(new QPhoto(reminderReco));
          label_007e :
             if (reminderReco != null) {
                f uof = this.e.get();
                ReminderRecommendUserListFeed mRecommendUs = reminderReco.mRecommendUserListMeta;
                ReminderRecommendUserListMeta mRecoPortal = (mRecommendUs != null)? mRecommendUs.mRecoPortal: null;
                if (uof.r != mRecoPortal) {
                   uof.r = mRecoPortal;
                   uof.clear();
                }
                reminderReco.mCachedPymkHelper = this;
                uof.invalidate();
                f uof1 = f.class;
                if (PatchProxy.isSupport(uof1)) {
                   ot = PatchProxy.applyOneRefs(Boolean.valueOf(b), uof, uof1, "3");
                   if (ot != patchProxyRe) {
                   label_00e1 :
                      return ot.map(new g(p0));
                   }
                }
                if (uof.u == null) {
                   uof.u = a.g();
                }
                ot = uof.h2(0, b).doOnNext(new s(uof)).doOnError(new t(uof)).map(d.b).onErrorReturnItem(Boolean.FALSE);
                goto label_00e1 ;
             }else {
                this.a = uoe;
                this.e.get().clear();
                return t.just(p0);
             }
          }
       }
       b = false;
       goto label_007e ;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.e.get().r == null)? true: false;
       return b;
    }
}
