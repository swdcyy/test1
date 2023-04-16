package com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.lang.System;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveEffectDownloadSwitchContainer implements Serializable	// class@001b4c
{
    public LiveEffectDownloadSwitchInfo mDefaultSwitchInfo;
    public List mLiveEffectDownloadSwitchInfoList;
    public int type;
    public static final LiveEffectDownloadSwitchContainer b;
    public static LiveEffectDownloadSwitchContainer c;
    public static final long serialVersionUID;

    static {
       LiveEffectDownloadSwitchContainer liveEffectDo = PatchProxy.apply(null, null, LiveEffectDownloadSwitchContainer.class, "3");
       if (liveEffectDo != PatchProxyResult.class) {
       }else {
          liveEffectDo = new LiveEffectDownloadSwitchContainer();
          ArrayList uArrayList = new ArrayList();
          LiveEffectDownloadSwitchInfo liveEffectDo1 = new LiveEffectDownloadSwitchInfo();
          liveEffectDo1.startTime = "17:00";
          liveEffectDo1.endTime = "23:00";
          liveEffectDo1.timePattern = "HH:mm";
          liveEffectDo1.enablePreDownloadOnColdStart = false;
          liveEffectDo1.enablePreDownloadOnEnterLiveRoom = false;
          liveEffectDo1.enablePreDownloadOnUpdateGift = false;
          liveEffectDo1.enableFetchResourceWhenEnqueue = true;
          liveEffectDo1.enableSurviveEffectTaskWhenDequeue = true;
          liveEffectDo1.p2spPolicy = "";
          uArrayList.add(liveEffectDo1);
          liveEffectDo.mLiveEffectDownloadSwitchInfoList = uArrayList;
          LiveEffectDownloadSwitchInfo liveEffectDo2 = new LiveEffectDownloadSwitchInfo();
          liveEffectDo2.enablePreDownloadOnColdStart = true;
          liveEffectDo2.enablePreDownloadOnEnterLiveRoom = true;
          liveEffectDo2.enablePreDownloadOnUpdateGift = true;
          liveEffectDo2.enableFetchResourceWhenEnqueue = true;
          liveEffectDo2.enableSurviveEffectTaskWhenDequeue = true;
          liveEffectDo1.p2spPolicy = "";
          liveEffectDo.mDefaultSwitchInfo = liveEffectDo2;
          liveEffectDo.type = 7;
       }
       LiveEffectDownloadSwitchContainer.b = liveEffectDo;
       LiveEffectDownloadSwitchContainer.c = liveEffectDo;
    }
    public void LiveEffectDownloadSwitchContainer(){
       super();
    }
    public static LiveEffectDownloadSwitchContainer get(){
       if (LiveEffectDownloadSwitchContainer.c != null && LiveEffectDownloadSwitchContainer.c != LiveEffectDownloadSwitchContainer.b) {
          return LiveEffectDownloadSwitchContainer.c;
       }
       return LiveEffectDownloadSwitchContainer.b;
    }
    public static LiveEffectDownloadSwitchInfo getMatchedSwitchInfo(){
       LiveEffectDownloadSwitchInfo dEFAULT;
       LiveEffectDownloadSwitchInfo liveEffectDo;
       LiveEffectDownloadSwitchContainer obj = PatchProxy.apply(null, null, LiveEffectDownloadSwitchContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveEffectDownloadSwitchContainer.get();
       LiveEffectDownloadSwitchContainer mLiveEffectD = obj.mLiveEffectDownloadSwitchInfoList;
       LiveLogTag lIVE_EFFECT = LiveLogTag.LIVE_EFFECT;
       String str = "LiveEffectSwitchContainer";
       lIVE_EFFECT.appendTag(str);
       b.P(lIVE_EFFECT, "[getMatchedSwitchInfo]: type = "+obj.type);
       obj = obj.mDefaultSwitchInfo;
       if (obj == null) {
          dEFAULT = LiveEffectDownloadSwitchInfo.DEFAULT;
       }
       if (mLiveEffectD == null || !mLiveEffectD.size()) {
          lIVE_EFFECT.appendTag(str);
          b.r(lIVE_EFFECT, "[getMatchedSwitchInfo]: downloadSwitches is empty, use default = "+dEFAULT);
          return dEFAULT;
       }else {
          long l = System.currentTimeMillis();
          Iterator iterator = mLiveEffectD.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return dEFAULT;
             }
             liveEffectDo = iterator.next();
             if (liveEffectDo == null) {
                b.r(LiveLogTag.LIVE_EFFECT.appendTag(str), "[getMatchedSwitchInfo]: switchInfo is null, continue");
             }else if(liveEffectDo.match(l)){
                break ;
             }
          }
          b.P(LiveLogTag.LIVE_EFFECT.appendTag(str), "[getMatchedSwitchInfo]: match switch, now = "+l+", switch = "+liveEffectDo);
          return liveEffectDo;
       }
    }
    public static String getP2spPolicy(){
       String str;
       LiveEffectDownloadSwitchInfo obj = PatchProxy.apply(null, null, LiveEffectDownloadSwitchContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo().p2spPolicy;
       if (TextUtils.x(obj)) {
          str = "";
       }
       return str;
    }
}
