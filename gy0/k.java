package gy0.k;
import erd.g;
import com.kuaishou.live.audience.component.comments.send.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.send.LiveCommentResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Float;
import com.kuaishou.android.live.log.b;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import tj3.k;
import tj3.e;
import tj3.i;
import pf1.f$a$a;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.SystemClock;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import pf1.f$a;
import pf1.f;
import n81.a;

public final class k implements g	// class@0025ae
{
    public final e b;
    public final BaseEditorFragment$g c;
    public final boolean d;
    public final long e;
    public final ClientContentWrapper$MoreInfoPackage f;

    public void k(e p0,BaseEditorFragment$g p1,boolean p2,long p3,ClientContentWrapper$MoreInfoPackage p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       k tf = this.f;
       Objects.requireNonNull(tb);
       b.S(LiveLogTag.COMMENT.appendTag("LiveAudienceSendCommentsPresenter"), "send comment", "ratio", Float.valueOf(p0.mSendCommentRatio));
       LiveCommentResponse mSendComment = p0.mSendCommentRatio;
       tb.F = mSendComment;
       if (mSendComment <= 0 || mSendComment - 0x3f800000 > 0) {
          mSendComment = 0x3f800000;
       }
       tb.F = mSendComment;
       e r = tb.r;
       r.B.onCommentRequestSuccess(r.c);
       tb.s.x().U();
       tb.s.h().a();
       f$a$a uoa$a = new f$a$a();
       uoa$a.j(tb.r.R().t0());
       uoa$a.h(tb.r.Z2.a());
       String str = (tc.i != null)? "VOICE": "CLICK";
       uoa$a.k(str);
       uoa$a.n(tc.k);
       uoa$a.f(td);
       uoa$a.b(tc.l);
       uoa$a.l(e.r(tb.getActivity()));
       e l = (TextUtils.x(tc.d))? tb.L: tc.d;
       uoa$a.m(l);
       uoa$a.d((SystemClock.elapsedRealtime() - te));
       uoa$a.e(tb.E);
       uoa$a.g(tb.r.c0());
       uoa$a.i(tf);
       f.c(uoa$a.a(), 7);
       tb.r.X.Db(p0.commentId);
       return;
    }
}
