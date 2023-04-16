package com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter$b;
import qr5.b$a;
import com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import java.lang.StringBuilder;
import com.google.protobuf.nano.MessageNano;
import p74.a;
import o74.a;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import ks3.i0;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.System;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig$WakeupConfig;
import java.lang.Integer;
import fq5.b;
import com.kuaishou.merchant.live.robot.LiveCartEffectFrequencyHelper;
import y90.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;
import com.yxcorp.gifshow.util.DateUtils;
import android.view.View;
import ks3.r;
import ps3.c;
import com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter$EffectMsg;
import fg6.a;
import com.google.gson.Gson;
import i74.a;
import ks3.c0;
import ks3.d0;

public class LiveAudienceCartEffectPresenter$b implements b$a	// class@001ac9
{
    public final LiveAudienceCartEffectPresenter b;

    public void LiveAudienceCartEffectPresenter$b(LiveAudienceCartEffectPresenter p0){
       this.b = p0;
       super();
    }
    public void O7(LiveFlvStream$LiveFlvStreamMessage p0){
       int i1;
       LiveAudienceCartEffectPresenter liveAudience = LiveAudienceCartEffectPresenter.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceCartEffectPresenter$b.class, str)) {
          return;
       }
       MerchantLiveLogBiz rOBOT = MerchantLiveLogBiz.ROBOT;
       String str1 = "LiveAudienceCartEffectPresenter";
       a.s(rOBOT, str1, "receive merchant msg from live stream："+p0.toString());
       LiveAudienceCartEffectPresenter s = this.b.s;
       if (s == null) {
          return;
       }
       MerchantLivePlayConfig merchantLive = s.e();
       if (merchantLive != null) {
          MerchantLivePlayConfig mWakeupConfi = merchantLive.mWakeupConfig;
          if (mWakeupConfi != null && p0.merchantWakeupInfo != null) {
             LiveAudienceCartEffectPresenter$b tb = this.b;
             Objects.requireNonNull(tb);
             MerchantLivePlayConfig$WakeupConfig obj = PatchProxy.applyOneRefs(mWakeupConfi, tb, liveAudience, "4");
             boolean b = false;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = mWakeupConfi.mShowEffectDelay;
                if ((System.currentTimeMillis() - tb.u) - (long)obj < 0) {
                   a.t(rOBOT, str1, "直播间待时间不够不展示动效", "delay", Integer.valueOf(obj));
                }else {
                   String liveStreamId = tb.p.getLiveStreamId();
                   Object obj1 = null;
                   Type obj2 = PatchProxy.applyTwoRefs(liveStreamId, mWakeupConfi, obj1, LiveCartEffectFrequencyHelper.class, str);
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else {
                      obj2 = LiveCartEffectFrequencyHelper.a;
                      str1 = a.a.getString("merchant_yellow_car_effect_cache", "null");
                      if (str1 != null && str1 != "") {
                         obj1 = b.a(str1, obj2);
                      }
                      if (obj1 == null) {
                         obj1 = new HashMap();
                      }
                      str = DateUtils.m();
                      if (!obj1.containsKey(str)) {
                         obj1.clear();
                      }
                      int i = (obj1.containsKey(str))? obj1.get(str).intValue(): 0;
                      MerchantLivePlayConfig$WakeupConfig mShowCountPe = mWakeupConfi.mShowCountPerDay;
                      if (i >= mShowCountPe) {
                         a.t(rOBOT, "LiveCartEffectFrequencyHelper", "今日小黄车动效播放次数已达上限", "todayCount", Integer.valueOf(mShowCountPe));
                      }else if(obj1.containsKey(liveStreamId)){
                         i1 = obj1.get(liveStreamId).intValue();
                      }else {
                         i1 = 0;
                      }
                      MerchantLivePlayConfig$WakeupConfig mShowCountPe1 = mWakeupConfi.mShowCountPerLive;
                      if (i1 >= mShowCountPe1) {
                         a.t(rOBOT, "LiveCartEffectFrequencyHelper", "该直播间小黄车动效播放次数已达上限", "liveCount", Integer.valueOf(mShowCountPe1));
                      }else {
                         b = 1;
                         obj1.put(str, Integer.valueOf((i + b)));
                         obj1.put(liveStreamId, Integer.valueOf((i1 + b)));
                         a.e(obj1);
                      }
                   }
                }
             }
             if (!b) {
                return;
             }else {
                tb = this.b;
                MerchantLivePlayConfig$WakeupConfig mMagicFaceId = merchantLive.mWakeupConfig.mMagicFaceId;
                Objects.requireNonNull(tb);
                if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mMagicFaceId), tb, liveAudience, "5")) {
                   View view = tb.q.a();
                   if (!tb.q.c() || (view != null && view.getVisibility() != 8)) {
                      String str2 = PatchProxy.applyOneRefs(view, tb, liveAudience, "6");
                      if (str2 != patchProxyRe) {
                      }else {
                         str2 = a.a.q(LiveAudienceCartEffectPresenter$EffectMsg.create(c.a(view)));
                      }
                      tb.r.a((long)mMagicFaceId, str2, false, new a(tb));
                   }
                }
             }
          }
       }
    label_0172 :
       return;
    }
    public boolean z1(int p0){
       boolean b = (p0 == 20)? true: false;
       return b;
    }
}
