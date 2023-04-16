package com.kuaishou.live.common.core.component.bottombubble.notices.recharge.a;
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
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import s81.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ButtonInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.c;
import hd1.b;
import jd1.e;
import nc1.j$a;
import bq5.f$a;
import hd1.d;
import bq5.d;
import hd1.c;
import nc1.j;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import lnc.i3;
import java.lang.Float;
import n91.h;
import com.yxcorp.utility.n;
import androidx.fragment.app.KwaiDialogFragment;
import hd1.a;
import android.content.DialogInterface$OnDismissListener;

public class a implements b	// class@000fe9
{
    public long b;
    public int c;
    public final i d;
    public final e e;
    public final Context f;
    public KwaiDialogFragment g;

    public void a(e p0,Context p1){
       super();
       this.d = p0.a(i.class);
       this.e = p0;
       this.f = p1;
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       boolean b;
       SharedPreferences a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
       }else {
          int i = 0;
          if (!PatchProxy.applyVoid(null, this, uoa, "5")) {
             long l = System.currentTimeMillis();
             a = a.a;
             String str = "user";
             if (!DateUtils.I(a.getLong(b.d(str)+"liveFirstRechargeNoticeLastShowTimestamp", 0), l)) {
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putLong(b.d(str)+"liveFirstRechargeNoticeLastShowTimestamp", l);
                g.a(uEditor);
                a.G(i);
             }
          }
          p0 = PatchProxy.applyOneRefs(p1, this, uoa, "4");
          if (p0 != patchProxyRe) {
             b = p0.booleanValue();
          }else if(a.i() < p1.mTotalShowTimes){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             LiveRouterNoticeInfo mButtonInfo = p1.mButtonInfo;
             Object obj = PatchProxy.applyOneRefs(mButtonInfo, this, uoa, "7");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(mButtonInfo != null && !TextUtils.isEmpty(mButtonInfo.mButtonText)){
                i = 1;
             }
             b = i;
             p1.mEnableShowButton = b;
             if (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "3")) {
                j$a uoa1 = new j$a();
                uoa1.f(p1.mPriority);
                uoa1.h(p1.mBizId);
                uoa1.j(p1.mDelayDisplayTimeMs);
                uoa1.c(p1.mDisplayDurationMs);
                uoa1.i(p1.mNoticeType);
                uoa1.e(new c(p1, new b(this)));
                uoa1.d(new d(this));
                uoa1.d(new c(this, p1));
                j oj = uoa1.g();
                this.e.a(k.class).Y9(oj);
             }
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
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.API_DELAY_INFO};
       return f.b(46, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveRouterNoticeInfo.class));
    }
    public String d(String p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       obj = i3.f();
       obj.d("extra_info", p0);
       return obj.e();
    }
    public void dispose(){
       a.a(this);
    }
    public final boolean e(String p0,float p1){
       Object obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!TextUtils.isEmpty(p0) && p1 >= 0) {
          v0 = p1 - 0x3f800000;
          if (obj >= 0) {
             return b;
          }else {
             c uoc = this.e.a(h.class);
             if (obj >= 0) {
                return uoc.Mk(p0);
             }else {
                KwaiDialogFragment kwaiDialogFr = uoc.U9(p0, "LiveFirstRechargeNoticeHandler", "LiveFirstRechargeNoticeHandler", (int)((float)n.v(this.f) * p1), "3", 0, 0.30f, false);
                this.g = kwaiDialogFr;
                if (kwaiDialogFr != null) {
                   kwaiDialogFr.k0(new a(this));
                }
                if (this.g != null) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
}
