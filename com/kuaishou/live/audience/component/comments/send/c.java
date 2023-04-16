package com.kuaishou.live.audience.component.comments.send.c;
import erd.g;
import com.kuaishou.live.audience.component.comments.send.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import tl2.a;
import n91.f;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import y47.k;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ry1.b;
import mb1.c;
import gy0.d;
import java.lang.Runnable;
import e93.f;
import pf1.f$a$a;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.basic.utils.e;
import android.os.SystemClock;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import pf1.f$a;
import pf1.f;

public final class c implements g	// class@000ab8
{
    public final e b;
    public final int c;
    public final BaseEditorFragment$g d;
    public final boolean e;
    public final long f;
    public final ClientContentWrapper$MoreInfoPackage g;

    public void c(e p0,int p1,BaseEditorFragment$g p2,boolean p3,long p4,ClientContentWrapper$MoreInfoPackage p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       e uoe;
       BaseEditorFragment$g d;
       a0 v1;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       c tf = this.f;
       c tg = this.g;
       Objects.requireNonNull(tb);
       b.y(LiveLogTag.COMMENT.appendTag("LiveAudienceSendCommentsPresenter"), "live/comment error", p0);
       e r = tb.r;
       r.B.onCommentRequestFail(p0, r.c);
       if (tb.getActivity() == null) {
       }else if(tc == 2){
          p0 = null;
          uoe = e.class;
          if (!PatchProxy.applyVoidTwoRefs(td, p0, tb, uoe, "11")) {
             CommentMessage uCommentMess = LiveCommentsMocker.b(td.c, a.b(tb.r, true), tb.D.s(), tb.r.b2.d(QCurrentUser.me().getId()).ordinal());
             if (!PatchProxy.applyVoidOneRefs(uCommentMess, tb, uoe, "15")) {
                uoe = ((v1 = tb.r.v1) != null && (v1.a() && QCurrentUser.ME.isLogined()))? 1: null;
                if (uoe) {
                   uCommentMess.mUnsupportedGzoneEmotions = tb.r.v1.g();
                }
                uCommentMess.mEnableKwaiEmoji = true;
             }
             if (!TextUtils.x(td.o)) {
                uCommentMess.mLandscapeFontColor = td.o;
             }
             uCommentMess.mIsAnonymous = c.a(tb.r.b3);
             f.k("mockComment", new d(tb, p0, uCommentMess), tb, e.X);
          }
       }
       p0 = new f$a$a();
       p0.j(tb.r.R().t0());
       p0.h(tb.r.Z2.a());
       String str = (td.i != null)? "VOICE": "CLICK";
       p0.k(str);
       p0.n(td.k);
       p0.f(te);
       p0.b(td.l);
       p0.l(e.r(tb.getActivity()));
       uoe = (TextUtils.x(td.d))? tb.L: td.d;
       p0.m(uoe);
       p0.d((SystemClock.elapsedRealtime() - tf));
       p0.e(tb.E);
       p0.g(tb.r.c0());
       p0.i(tg);
       f.c(p0.a(), 8);
       return;
    }
}
