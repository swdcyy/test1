package com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.f;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.h$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.h;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;
import java.util.Objects;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.c;
import msd.a;
import c15.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.e;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.d;
import tkd.b;
import tkd.d;
import ju5.g;

public class f implements d	// class@001002
{
    public final LiveServiceAccountNoticeInfo a;
    public final g b;

    public void f(g p0,LiveServiceAccountNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return (this.b.g ^ 0x01);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.b.d.en(null);
       this.b.e = null;
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       f ta = this.a;
       a.f(this.b.b, String.valueOf(this.a.mNoticeType), ta.mBizId, this.b.e(ta));
       this.b.d.Gf();
       f tb = this.b;
       f ta1 = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta1, tb, g.class, "5") && tb.f == null) {
          LiveServiceAccountNoticeInfo mExtraInfo = ta1.mExtraInfo;
          String str = "preloadMiniApp";
          if (mExtraInfo == null) {
             b.g(KsgLogTunaLiveTag.COMMON_NOTICE.appendTag(str), c.b);
          }else {
             LiveServiceAccountNoticeInfo$ExtraInfo mTunaButtonM = mExtraInfo.mTunaButtonModel;
             if (mTunaButtonM == null) {
                b.g(KsgLogTunaLiveTag.COMMON_NOTICE.appendTag(str), e.b);
             }else {
                String jumpUrl = mTunaButtonM.getJumpUrl();
                if (TextUtils.x(jumpUrl)) {
                   b.g(KsgLogTunaLiveTag.COMMON_NOTICE.appendTag(str), d.b);
                }else {
                   g og = d.a(0x6ea0c3d0);
                   if (og.Qt(jumpUrl) || og.rM(jumpUrl)) {
                      og.t9(jumpUrl, "LiveServiceAccountNoticeHandler");
                      tb.f = true;
                   }
                }
             }
          }
       }
       return;
    }
}
