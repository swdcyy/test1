package com.kuaishou.live.common.core.component.bottombubble.notices.gzone.e;
import lc1.b;
import lp3.e;
import java.lang.Object;
import xp5.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo;
import xp5.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import ez1.a;
import java.lang.Boolean;
import s81.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.SystemUtil;
import e17.i;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import s51.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo$ExtraInfo;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.a;
import java.lang.reflect.Type;
import el.a;
import java.util.LinkedHashMap;
import java.util.Map;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.b;
import java.util.HashMap;
import java.lang.Long;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import zc1.a;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import java.util.List;
import lc1.e;
import lc1.f;
import lc1.d;
import java.util.Arrays;
import lc1.a;
import lnc.i3;
import java.lang.Number;
import lnc.b9;

public class e implements b	// class@000fc6
{
    public LinkedHashMap b;
    public LinkedHashMap c;
    public final e d;
    public final i e;
    public b f;

    public void e(e p0){
       super();
       this.d = p0;
       this.e = p0.a(i.class);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       boolean b;
       boolean b2;
       g og = g.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "1")) {
       }else {
          String str = "2";
          if (p1.mNoticeType == 30) {
             if (QCurrentUser.me().isLogined()) {
                p0 = PatchProxy.apply(null, null, a.class, str);
                b = (p0 != patchProxyRe)? p0.booleanValue(): TextUtils.n(a.a(), a.a.getString(b.d("user")+"gzonePasswordLotteryNoticeShowTime", ""));
                if (b) {
                   if (SystemUtil.I()) {
                      i.d(R.style.arg_RES_7f110668, "一天只展示一次PASSWORD LOTTERY强提醒");
                   }
                }
             }
          }
          if (p1.mNoticeType != 52 || (QCurrentUser.me().isLogined() && (!TextUtils.n(QCurrentUser.me().getId(), this.d.a(og).d()) && !b.a(-404437045).g()))) {
             b = PatchProxy.applyOneRefs(p1, this, uoe, str);
             boolean b1 = true;
             if (b != patchProxyRe) {
                b = b.booleanValue();
             }else {
                LiveGenericCommentNoticeInfo mButtonInfo = p1.mButtonInfo;
                if (mButtonInfo != null) {
                   LiveCommentNoticeButtonInfo mBtnUrl = mButtonInfo.mBtnUrl;
                   if (mBtnUrl == null || !this.d.a(c.class).P0(mBtnUrl)) {
                      b = false;
                   }
                }
                b = true;
             }
             if (b) {
                LiveCommentNoticeBaseInfo mBizType = p1.mBizType;
                LiveGenericCommentNoticeInfo mExtraInfo = p1.mExtraInfo;
                if (PatchProxy.isSupport(uoe)) {
                   LinkedHashMap obj = PatchProxy.applyTwoRefs(Integer.valueOf(mBizType), mExtraInfo, this, uoe, "3");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else if(mExtraInfo == null){
                      String liveStreamId = this.d.a(og).getLiveStreamId();
                      if (mExtraInfo.canShowTimes > null) {
                         LinkedHashMap linkedHashMa = a.e(new a(this).getType());
                         if (linkedHashMa != null) {
                            Map map = linkedHashMa.get(liveStreamId);
                            if (map != null) {
                               Integer integer = map.get(Integer.valueOf(mBizType));
                               if (integer != null && integer.intValue() >= mExtraInfo.canShowTimes) {
                                  b2 = false;
                               label_013f :
                                  LiveLogTag gZONE = LiveLogTag.GZONE;
                                  b.Z(gZONE, "onReceiveCommentNotice: canShowTimes "+b2);
                                  if (mExtraInfo.mDailyShowTimes > null && b2) {
                                     obj = a.f(new b(this).getType());
                                     if (obj != null) {
                                        String str1 = obj.get(Integer.valueOf(mBizType));
                                        if (!TextUtils.x(str1)) {
                                           String[] stringArray = str1.split(",");
                                           if (!DateUtils.r(Long.parseLong(stringArray[0]), System.currentTimeMillis()) && Integer.parseInt(stringArray[b1]) >= mExtraInfo.mDailyShowTimes) {
                                              b1 = false;
                                           label_019d :
                                              b.Z(gZONE, "onReceiveCommentNotice: mDailyShowTimes "+b1);
                                           }
                                        }
                                     }
                                  }
                                  b1 = b2;
                                  goto label_019d ;
                               }
                            }
                         }
                      }
                      b2 = true;
                      goto label_013f ;
                   }
                }else {
                   goto label_00fd ;
                }
                if (!b1) {
                   b.Z(LiveLogTag.GZONE, "onReceiveCommentNotice: canShowNotice false");
                }else {
                   this.f = t.just(p1).delaySubscription(p1.mDelayDisplayTimeMs, TimeUnit.MILLISECONDS, d.a).subscribe(new a(this, p1), e.b);
                }
             }
          }
       }
    label_01d6 :
       return;
    }
    public List b(){
       e obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e(LiveGzoneCommonNoticeInfo.class);
       f[] uofArray = new f[]{f.b(103, this.e(), obj),f.b(30, this.e(), obj),f.b(52, this.e(), obj)};
       return Arrays.asList(uofArray);
    }
    public f c(){
       return a.b(this);
    }
    public String d(LiveGzoneCommonNoticeInfo p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.c("biz_type", Integer.valueOf(p0.mBizType));
       LiveGenericCommentNoticeInfo mExtraInfo = p0.mExtraInfo;
       if (mExtraInfo != null && mExtraInfo.mSubBizType != null) {
          obj.d("notice_biz_type", mExtraInfo.mSubBizType);
       }
       return obj.e();
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       b9.a(this.f);
       return;
    }
    public final int e(){
       LiveCommentNoticeChannelType[] obj = PatchProxy.apply(null, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return LiveCommentNoticeChannelType.combineChannels(obj);
    }
}
