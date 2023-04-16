package com.kuaishou.live.common.core.component.bottombubble.notices.recharge.b;
import lc1.b;
import lp3.e;
import android.content.Context;
import java.lang.Object;
import xp5.g;
import lp3.i;
import java.lang.Class;
import lp3.c;
import xp5.i;
import ss5.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.LiveRechargeNoticeInfo;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import hd1.g;
import s81.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import hd1.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.LiveRechargeNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import nc1.j$a;
import bq5.f$a;
import hd1.f;
import bq5.d;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import java.lang.Number;
import lc1.e;
import lc1.d;

public class b implements b	// class@000fea
{
    public final g b;
    public final i c;
    public final e d;
    public final a e;
    public final Context f;

    public void b(e p0,Context p1){
       super();
       this.f = p1;
       this.b = p0.a(g.class);
       this.c = p0.a(i.class);
       this.e = p0.a(a.class);
       this.d = p0;
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       SharedPreferences a;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "3")) {
       }else {
          Object[] objArray = PatchProxy.applyOneRefs(p1, this, uob, "4");
          if (objArray != PatchProxyResult.class) {
          }else {
             Object[] objArray1 = null;
             if (!PatchProxy.applyVoid(objArray1, objArray1, g.class, "2")) {
                a = a.a;
                String str = "user";
                String str1 = "localHighValueRechargeConfigDate";
                if (!(g.a()).equals(a.getString(b.d(str)+str1, ""))) {
                   SharedPreferences$Editor uEditor = a.edit();
                   uEditor.putString(b.d(str)+str1, g.a());
                   g.a(uEditor);
                   a.Q(0);
                }
             }
             LiveGenericCommentNoticeInfo mTotalShowTi = p1.mTotalShowTimes;
             if (a.z() >= mTotalShowTi) {
                b.d0(LiveCommonLogTag.COMMENT_NOTICE, "[HIGH_VALUE_RECHARGE] Cannot show card again", "showTotalCount", Integer.valueOf(mTotalShowTi), "already showCount: ", Integer.valueOf(a.z()));
             }else if(a.g() && p1.mDisplayOnceEnabled != null){
                b.d0(LiveLogTag.LIVE_COMMENT_NOTICE, "[HIGH_VALUE_RECHARGE] Cannot show card again!", "hasShownCardToThisUser", Boolean.valueOf(a.g()), "switch state", Boolean.valueOf(p1.mDisplayOnceEnabled));
             }else {
                a uoa = new a(p1, new e(this));
                LiveCommentNoticeBaseExtraInfo liveCommentN = null;
                LiveGenericCommentNoticeInfo mExtraInfo = p1.mExtraInfo;
                if (mExtraInfo != null) {
                   liveCommentN = mExtraInfo.mDelayDisplayTimeMs;
                }
                j$a uoa1 = new j$a();
                uoa1.e(uoa);
                uoa1.c(p1.mDisplayDurationMs);
                uoa1.f(p1.mPriority);
                uoa1.i(p1.mNoticeType);
                uoa1.j(liveCommentN);
                uoa1.d(new f(this, p1));
                objArray = uoa1.g();
             }
             objArray = objArray1;
          }
          if (objArray != null) {
             this.d.a(k.class).Y9(objArray);
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uob, "2");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.API_DELAY_INFO};
          i = LiveCommentNoticeChannelType.combineChannels(liveCommentN);
       }
       return f.b(10, i, new e(LiveRechargeNoticeInfo.class));
    }
    public void dispose(){
       a.a(this);
    }
}
