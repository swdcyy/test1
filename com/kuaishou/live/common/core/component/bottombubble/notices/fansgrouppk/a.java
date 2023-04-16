package com.kuaishou.live.common.core.component.bottombubble.notices.fansgrouppk.a;
import lc1.b;
import lp3.e;
import java.lang.Object;
import xp5.g;
import java.lang.Class;
import lp3.c;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.fansgrouppk.FansGroupPkNoticeInfo;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import e61.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tc1.c;
import java.lang.Long;
import e61.f$b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import n91.f;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import tc1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import nc1.j$a;
import bq5.f$a;
import tc1.b;
import bq5.d;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import java.lang.reflect.Type;
import e61.d;
import java.lang.Number;

public class a implements b	// class@000fb7
{
    public final e b;
    public final g c;
    public final i d;
    public f e;

    public void a(e p0){
       super();
       this.b = p0;
       this.c = p0.a(g.class);
       this.d = p0.a(i.class);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       boolean b;
       int b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
       }else {
          b.d0(LiveCommonLogTag.COMMENT_NOTICE, "onReceiveCommentNotice", "channelType", p0, "noticeInfo", p1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          j$a obj = PatchProxy.applyOneRefs(p1, this, a.class, "3");
          if (obj != patchProxyRe) {
          }else {
             obj = PatchProxy.applyOneRefs(p1, this, a.class, "5");
             LiveCommentNoticeBaseInfo liveCommentN = 49;
             b = false;
             int i = 1;
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(this.c.e() && (p1.mBizType == liveCommentN && p1.mEnableAuthorAware == null)){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                b.Z(LiveLogTag.LIVE_COMMENT_NOTICE, "filter fans group pk comment notice");
             }else if(!this.c.e() && p1.mBizType == liveCommentN){
                obj = PatchProxy.apply(null, this, a.class, "9");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   this.d();
                   a te1 = this.e;
                   b1 = (te1 != null)? TextUtils.x(te1.get(this.c.getLiveStreamId())) ^ i: 0;
                }
                if (b1) {
                   b.Z(LiveLogTag.LIVE_COMMENT_NOTICE, "fans group pk comment notice already shown");
                }
             }
          label_009a :
             obj = PatchProxy.applyOneRefs(p1, this, a.class, "6");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(!this.c.e() && (p1.mBizType == liveCommentN && p1.mMaxShowLimit > null)){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                obj = PatchProxy.applyOneRefs(p1, this, a.class, "7");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(!this.e() && c.a() >= p1.mMaxShowLimit){
                   b = true;
                }
                if (!b) {
                label_00e2 :
                   if (!PatchProxy.applyVoid(null, this, a.class, "8")) {
                      this.d();
                      a te = this.e;
                      if (te != null) {
                         String liveStreamId = this.c.getLiveStreamId();
                         String liveStreamId1 = this.c.getLiveStreamId();
                         long l1 = 0x5265c00;
                         if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(liveStreamId, liveStreamId1, Long.valueOf(l1), te, f.class, "4")) {
                            f$b uob = new f$b(te, liveStreamId, liveStreamId1, 0x5265c00);
                            c.k(v5);
                         }
                      }
                   }
                   b.Z(LiveLogTag.LIVE_COMMENT_NOTICE, "show fans group pk comment notice");
                   if (PatchProxy.applyVoidOneRefs(p1, this, a.class, "11") || (!this.c.e() && p1.mBizType == liveCommentN)) {
                      if (this.e()) {
                         c.b(i);
                         long l = this.b.a(f.class).s();
                         c uoc = c.class;
                         if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), null, uoc, "4")) {
                            SharedPreferences$Editor uEditor = a.a.edit();
                            uEditor.putLong("liveCommentNoticeFansGroupPkLastShowTimeMs", l);
                            g.a(uEditor);
                         }
                      }else {
                         c.b((c.a() + i));
                      }
                   }
                   obj = new j$a();
                   obj.e(new a(p1, new a(this)));
                   obj.c(p1.mDisplayDurationMs);
                   obj.f(p1.mPriority);
                   obj.j(p1.mDelayDisplayTimeMs);
                   obj.h(p1.mBizId);
                   obj.i(p1.mNoticeType);
                   obj.d(new b(this, p1));
                   obj = obj.g();
                }
             }else {
                goto label_00e2 ;
             }
             obj = null;
          }
          if (obj != null) {
             this.b.a(k.class).Y9(obj);
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(34, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(FansGroupPkNoticeInfo.class));
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       if (this.e == null) {
          this.e = d.a("LiveCommentNoticeFansGroupPkLiveStreamId", 200, String.class);
       }
       return;
    }
    public void dispose(){
       a.a(this);
    }
    public final boolean e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       long l = this.b.a(f.class).s();
       obj = PatchProxy.apply(objArray, objArray, c.class, "3");
       long l1 = (obj != patchProxyRe)? obj.longValue(): a.a.getLong("liveCommentNoticeFansGroupPkLastShowTimeMs", 0);
       boolean b = ((l - l1) - 0x5265c00 > 0)? true: false;
       return b;
    }
}
