package dd1.c;
import lc1.b;
import lp3.e;
import java.lang.Object;
import dd1.c$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.merchant.a;
import xp5.i;
import java.lang.Class;
import lp3.c;
import dd1.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.merchant.LiveCustomerReplyNoticeInfo;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bq5.h;
import bq5.f;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.util.List;
import nc1.j;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import nc1.j$a;
import bq5.f$a;
import dd1.b;
import bq5.d;
import nc1.k;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import lnc.a1;
import android.text.style.ForegroundColorSpan;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeClickEventInfo;

public class c implements b	// class@001f79
{
    public final e b;
    public final d c;
    public final i d;
    public c$a e;

    public void c(e p0){
       super();
       this.e = new c$a(null);
       this.b = p0;
       this.d = p0.a(i.class);
       this.c = p0.a(d.class);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
       }else if(this.e.c() == 2){
          this.b.a(h.class).t3().e(p1.mDisplayDurationMs);
          if (this.e.d() != null) {
             LiveGenericCommentNoticeView view = this.e.d().getView();
             if (view != null) {
                view.setFirstLineContent(this.d(p1));
                view.c(p1.mContentIconUrls);
             }
          }
       }else if(this.e.c() == 1){
          if (this.e.b() != null) {
             p0.i = p1.mBizId;
             this.e.b().e(p1.mDisplayDurationMs);
             a uoa = this.e.d();
             if (uoa != null) {
                uoa.b = p1;
             }
          }
       }else {
          j oj = PatchProxy.applyOneRefs(p1, this, uoc, "3");
          if (oj != PatchProxyResult.class) {
          }else {
             j$a uoa1 = new j$a();
             uoa1.h(p1.mBizId);
             uoa1.f(p1.mPriority);
             uoa1.e(new a(p1, new a(this, p1)));
             uoa1.c(p1.mDisplayDurationMs);
             uoa1.j(p1.mDelayDisplayTimeMs);
             uoa1.i(p1.mNoticeType);
             uoa1.d(new b(this, p1));
             oj = uoa1.g();
          }
          if (oj != null) {
             this.b.a(k.class).Y9(oj);
             c te = this.e;
             te.c = oj;
             te.b = oj.c();
             te.a(1);
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(25, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveCustomerReplyNoticeInfo.class));
    }
    public SpannableStringBuilder d(LiveCustomerReplyNoticeInfo p0){
       SpannableStringBuilder obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder();
       if (p0 != null) {
          int i = obj.length();
          obj.append(TextUtils.i(p0.mTitle, "")+"£º");
          int i1 = obj.length();
          obj.setSpan(new AbsoluteSizeSpan(a1.d(R.dimen.arg_RES_7f070f70), false), i, i1, 33);
          obj.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f061bd5)), i, i1, 33);
          obj.append(TextUtils.i(p0.mDescription, ""));
       }
       return obj;
    }
    public void dispose(){
       a.a(this);
    }
    public void e(LiveCustomerReplyNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.b.a(k.class).D6();
       a.b(this.d.a(), String.valueOf(25), p0.mBizId);
       this.c.Tj(p0.mNoticeClickEventInfo.mUrl);
       return;
    }
}
