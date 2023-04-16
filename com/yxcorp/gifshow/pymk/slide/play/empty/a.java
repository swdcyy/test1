package com.yxcorp.gifshow.pymk.slide.play.empty.a;
import z1.k;
import com.yxcorp.gifshow.pymk.slide.play.empty.e;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment;
import java.lang.Object;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayFragment;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.t;
import com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListFeed;
import com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListMeta;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import k7c.h;
import tkd.b;
import tkd.d;
import rx5.c;
import ok.x;
import qvb.i;
import com.yxcorp.gifshow.pymk.f;
import k7c.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lkd.b;
import ok.h;

public final class a implements k	// class@0016d7
{
    public final e b;
    public final PymkDetailSlidePlayRecyclerFragment c;

    public void a(e p0,PymkDetailSlidePlayRecyclerFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       ReminderRecommendUserListMeta mRecoHeaderC;
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.applyOneRefs(tc, tb, e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          e a = tb.a;
          ReminderRecommendUserListMeta reminderReco = null;
          if (a != null) {
             ReminderRecommendUserListFeed mRecommendUs = a.mRecommendUserListMeta;
             if (mRecommendUs != null) {
                mRecoHeaderC = mRecommendUs.mRecoHeaderContent;
             label_0025 :
                String str = TextUtils.i(mRecoHeaderC, a1.p(R.string.arg_RES_7f104934));
                a = tb.a;
                if (a != null) {
                   mRecommendUs = a.mRecommendUserListMeta;
                   if (mRecommendUs != null) {
                      reminderReco = mRecommendUs.mRecoHeaderDescription;
                   }
                }
                ot = d.a(0x77cfa10c).UK(tc, new h(tb, tc, tc), tb.e.get(), tb.e.get().r, 2, str, TextUtils.i(reminderReco, a1.p(R.string.arg_RES_7f101082)), new f(tb), null, tb.c.get().booleanValue());
             }
          }
          mRecoHeaderC = reminderReco;
          goto label_0025 ;
       }
       return ot;
    }
}
