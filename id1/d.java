package id1.d;
import lc1.b;
import lp3.e;
import android.content.Context;
import java.lang.Object;
import xp5.i;
import lp3.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfoWithBaseExtra;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.System;
import s81.a;
import com.yxcorp.gifshow.util.DateUtils;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import id1.c;
import nc1.j$a;
import bq5.f$a;
import id1.b;
import bq5.d;
import nc1.j;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import lnc.i3;
import java.lang.Number;
import or5.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import id1.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;

public class d implements b	// class@00289b
{
    public long b;
    public int c;
    public final Context d;
    public final e e;
    public final i f;

    public void d(e p0,Context p1){
       super();
       this.d = p1;
       this.e = p0;
       this.f = p0.a(i.class);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "2")) {
       }else if(p1.mBizType != 141){
          LiveGenericCommentNoticeInfo mTotalShowTi = p1.mTotalShowTimes;
          if (PatchProxy.isSupport(uod)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(mTotalShowTi), this, uod, "7");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(!DateUtils.I(System.currentTimeMillis(), a.p()) || a.q() < mTotalShowTi){
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_0033 ;
          }
          if (b && !PatchProxy.applyVoidOneRefs(p1, this, uod, "3")) {
             c uoc = PatchProxy.apply(null, this, uod, "4");
             if (uoc != patchProxyRe) {
             }else {
                uoc = new c(this);
             }
             j$a uoa = new j$a();
             uoa.f(p1.mPriority);
             uoa.h(p1.mBizId);
             uoa.j(p1.mDelayDisplayTimeMs);
             uoa.c(p1.mDisplayDurationMs);
             uoa.i(p1.mNoticeType);
             uoa.e(new a(p1, uoc));
             uoa.d(new b(this, p1));
             j oj = uoa.g();
             this.e.a(k.class).Y9(oj);
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(47, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveGenericCommentNoticeInfoWithBaseExtra.class));
    }
    public String d(String p0,int p1){
       i3 obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          obj = i3.f();
          obj.d("extra_info", p0);
          obj.c("bizType", Integer.valueOf(p1));
          return obj.e();
       }
    }
    public void dispose(){
       a.a(this);
    }
    public void e(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "6")) {
          return;
       }
       LiveStreamFeed liveStreamFe = this.e.a(d.class).j0();
       if (liveStreamFe != null) {
          i0.a().e(p0, liveStreamFe).f(a.b).a();
       }
       return;
    }
}
