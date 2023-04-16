package id1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import id1.d;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s51.c;
import lp3.c;
import lp3.e;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import nc1.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public class c implements a$a	// class@00289a
{
    public final d a;

    public void c(d p0){
       this.a = p0;
       super();
    }
    public void a(LiveGenericCommentNoticeView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       p0.setContentIconPlaceHolder(R.drawable.arg_RES_7f081430);
       p0.setContentIconVisibility(0);
       return;
    }
    public void b(LiveGenericCommentNoticeInfo p0,View p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       LiveGenericCommentNoticeInfo mButtonInfo = p0.mButtonInfo;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyOneRefs(mButtonInfo, ta, d.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(mButtonInfo == null){
          c uoc = ta.e.a(c.class);
          if (!TextUtils.x(mButtonInfo.mBtnUrl) && uoc.P0(mButtonInfo.mBtnUrl)) {
             uoc.r4(mButtonInfo.mBtnUrl, ta.d);
             b = true;
          }
       }
       b = false;
       if (b) {
          this.a.e.a(k.class).D6();
       }
       a.a(this.a.f.a(), this.a.f.c0(), String.valueOf(p0.mNoticeType), p0.mBizId, this.a.d(p0.mExtraInfoStr, p0.mBizType));
       this.a.e(758);
       return;
    }
}
