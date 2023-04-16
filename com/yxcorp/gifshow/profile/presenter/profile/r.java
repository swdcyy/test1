package com.yxcorp.gifshow.profile.presenter.profile.r;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.u;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.profile.http.l;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import qvb.a;
import qvb.n0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import om6.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.yxcorp.gifshow.profile.presenter.profile.q;
import com.yxcorp.gifshow.profile.presenter.profile.t;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.StringBuilder;

public final class r implements g	// class@00158a
{
    public final u b;
    public final boolean c;

    public void r(u p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       r tb = this.b;
       r tc = this.c;
       Objects.requireNonNull(tb);
       tb.y = p0.booleanValue();
       boolean b = p0.booleanValue();
       u ou = u.class;
       if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(tc), tb, ou, "5")) {
          QPhoto qPhoto = null;
          int i = 0;
          if (b) {
             tb.r.p2(qPhoto);
             tb.v.clear();
             if (!tb.r.isEmpty() && tb.r.getItem(i).getEntity() instanceof ProfileDraftsFeed) {
                u r = tb.r;
                r.remove(r.getItem(i));
             }
          }else if(tc != null && tb.r.L0() != null){
             tb.r.L0().mDraftGuideConfig = qPhoto;
          }
          u t = tb.t;
          tb.r.p2(t);
          if (tb.w != null && (!tb.r.isEmpty() && !tb.r.getItem(i).getEntity() instanceof ProfileDraftsFeed)) {
             tb.r.add(i, t);
             g.e(KsLogProfileTag.DRAFT.appendTag("MyProfileDraftsInfoPresenter"), "refreshDraftsStatus add profileDraftsInfo");
             tb.R8();
          }
          if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), tb, ou, "6")) {
             tb.X7(y6.s(d.class, LoadPolicy.SILENT_ENQUEUE).R(new q(tb, tc), t.b));
          }
       label_00d4 :
          g.e(KsLogProfileTag.DRAFT.appendTag("MyProfileDraftsInfoPresenter"), "refreshDraftsStatus isLocalAlbumEmpty: "+b);
       }
       return;
    }
}
