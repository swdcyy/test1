package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a;
import lc1.b;
import lp3.e;
import android.content.Context;
import xp5.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.util.HashMap;
import xp5.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.b;
import java.lang.String;
import cd1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.b$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo$ExtraInfo;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import java.lang.Integer;
import java.util.Map;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$NoticeStatus;
import bq5.f;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView;
import java.lang.Long;
import android.widget.TextView;
import cd1.c;
import ekd.f$h;
import android.animation.Animator;
import ekd.f;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$b;
import nc1.j$a;
import bq5.f$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a$b;
import bq5.d;
import nc1.j;
import nc1.k;
import fg6.a;
import com.google.gson.Gson;
import mc1.a;

public class a implements b	// class@000fe1
{
    public final String b;
    public final Context c;
    public final e d;
    public final b e;
    public final ClientContent$LiveStreamPackage f;
    public final Map g;
    public j h;
    public boolean i;

    public void a(e p0,Context p1){
       super(p0, p1, p0.a(i.class).a());
    }
    public void a(e p0,Context p1,ClientContent$LiveStreamPackage p2){
       super();
       this.b = "+";
       this.g = new HashMap();
       this.d = p0;
       this.c = p1;
       this.f = p2;
       this.i = p0.a(g.class).e();
       b uob = p0.a(b.class);
       this.e = uob;
       uob.n7(this.e(), new b(this));
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       String str2;
       boolean b;
       Object obj = this;
       String str = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, str, obj, uoa, "2")) {
       }else if(str.mExtraInfo == null){
          LiveIncreaseFansNoticeInfo$ExtraInfo uExtraInfo = PatchProxy.applyOneRefs(str, obj, uoa, "13");
          Object obj1 = null;
          if (uExtraInfo != patchProxyRe) {
          }else {
             LiveCommentNoticeBaseInfo mBizType = str.mBizType;
             if (mBizType == 124) {
                LiveGenericCommentNoticeInfo mExtraInfo = str.mExtraInfo;
                uExtraInfo = (mExtraInfo != null)? mExtraInfo.mActionButtonText: obj1;
             }else if(mBizType == 76){
                uExtraInfo = a1.p(R.string.arg_RES_7f1024fa);
             }else if(mBizType == 77){
                uExtraInfo = a1.p(R.string.arg_RES_7f1024f7);
             }else {
                uExtraInfo = a1.p(R.string.arg_RES_7f100f8f);
             }
          }
          str.mRightButtonText = TextUtils.k(uExtraInfo);
          LiveIncreaseFansNoticeWidget obj2 = PatchProxy.applyOneRefs(str, obj, uoa, "19");
          LiveGenericCommentNoticeInfo liveGenericC = 1;
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             obj2 = obj.g.get(Integer.valueOf(str.mBizType));
             if (obj2 != null) {
                Object obj3 = PatchProxy.applyOneRefs(str, obj2, LiveIncreaseFansNoticeWidget.class, "6");
                if (obj3 != patchProxyRe) {
                   b = obj3.booleanValue();
                }else if(TextUtils.equals(obj2.g, str.mExtraInfo.mUserId) && obj2.t() == str.mBizType){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   obj1 = obj2;
                }
             }
          }
          if (obj1 != null) {
             if (!PatchProxy.applyVoidTwoRefs(obj1, str, obj, uoa, "10")) {
                if (obj1.f == LiveIncreaseFansNoticeWidget$NoticeStatus.STATUS_SHOWING) {
                   obj.h.e(str.mDisplayDurationMs);
                   LiveIncreaseFansNoticeView view = obj1.getView();
                   LiveIncreaseFansNoticeWidget d = obj1.d;
                   obj1.F(obj.h(str), str.mDescription, str.mDisplayCount);
                   if (view != null && (!TextUtils.x(str.mDescription) && (str.mDescription).startsWith("+"))) {
                      long l = (long)d;
                      long l1 = (long)str.mDisplayCount;
                      String str1 = "+";
                      if (PatchProxy.isSupport(LiveIncreaseFansNoticeView.class)) {
                         str2 = str1;
                         if (!PatchProxy.applyVoidThreeRefs(Long.valueOf(l), Long.valueOf(l1), str1, view, LiveIncreaseFansNoticeView.class, "9")) {
                         }
                      }else {
                         str2 = str1;
                      }
                   }
                }else {
                   obj1.F(obj.h(str), str.mDescription, str.mDisplayCount);
                }
             label_0135 :
                if (str.mBizType == 124) {
                   obj1.C(obj.l(false, str));
                }
                obj1.B(obj.k(str));
             }
          }else if(PatchProxy.applyVoidOneRefs(str, obj, uoa, "9")){
             str2 = (str.mBizType == 27 && obj.i == null)? 1: 0;
             if (!str2) {
                obj.d(liveGenericC, str);
             }else {
                obj.e.hc(this.e(), str);
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
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(21, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveIncreaseFansNoticeInfo.class));
    }
    public final void d(boolean p0,LiveIncreaseFansNoticeInfo p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a.class, "11")) {
          return;
       }
       LiveIncreaseFansNoticeWidget liveIncrease = new LiveIncreaseFansNoticeWidget(p1, new a$a(this));
       liveIncrease.C(this.l(p0, p1));
       liveIncrease.B(this.k(p1));
       liveIncrease.F(p1.mSubTitle, p1.mDescription, p1.mDisplayCount);
       j$a uoa = new j$a();
       uoa.c(p1.mDisplayDurationMs);
       uoa.e(liveIncrease);
       uoa.j(p1.mDelayDisplayTimeMs);
       uoa.h(p1.mBizId);
       uoa.i(p1.mNoticeType);
       uoa.d(new a$b(this, liveIncrease, p1));
       this.h = uoa.g();
       this.d.a(k.class).Y9(this.h);
       LiveCommentNoticeBaseInfo mBizType = p1.mBizType;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mBizType), liveIncrease, this, a.class, "17")) {
          this.g.put(Integer.valueOf(mBizType), liveIncrease);
       }
       return;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.e.Sb(this.e());
       this.g.clear();
       return;
    }
    public String e(){
       return "LiveIncreaseFansNoticeHandler";
    }
    public String f(LiveIncreaseFansNoticeInfo p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g(p0, p1, null);
    }
    public String g(LiveIncreaseFansNoticeInfo p0,int p1,String p2){
       HashMap obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return "";
       }else {
          obj = new HashMap();
          obj.put("extra_info", TextUtils.k(p0.mExtraInfoStr));
          obj.put("position", String.valueOf(p1));
          obj.put("biz_type", String.valueOf(p0.mBizType));
          if (!TextUtils.x(p2)) {
             obj.put("btn_type", p2);
          }
          return a.a.q(obj);
       }
    }
    public String h(LiveIncreaseFansNoticeInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveIncreaseFansNoticeInfo$ExtraInfo mToAuthorSto = (this.m(p0))? p0.mExtraInfo.mToAuthorStopTips: p0.mSubTitle;
       return mToAuthorSto;
    }
    public void i(LiveIncreaseFansNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.e.Ol(p0);
       a.c(this.f, String.valueOf(p0.mNoticeType), p0.mBizId, this.f(p0, 2));
       return;
    }
    public final boolean j(LiveIncreaseFansNoticeInfo p0){
       boolean b = (p0.mExtraInfo.mDeliveryPerformStatus == 2)? true: false;
       return b;
    }
    public final boolean k(LiveIncreaseFansNoticeInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.mBizType != 124 && !p0.mContentIconUrls.isEmpty())? true: false;
       return b;
    }
    public boolean l(boolean p0,LiveIncreaseFansNoticeInfo p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p1.mBizType == 124) {
          LiveGenericCommentNoticeInfo mExtraInfo = p1.mExtraInfo;
          if (mExtraInfo != null && mExtraInfo.mActionButtonType == 1) {
             b = true;
          }
          return b;
       }else if(p0 || (!this.j(p1) || p1.mBizType != 27)){
          b = true;
       }
       return b;
    }
    public boolean m(LiveIncreaseFansNoticeInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.mBizType != 124 && (this.i != null && this.j(p0)))? true: false;
       return b;
    }
}
