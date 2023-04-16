package com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import com.kuaishou.android.live.log.b;
import java.util.Calendar;
import java.lang.CharSequence;
import java.lang.Long;
import java.lang.Boolean;

public class LiveEffectDownloadSwitchInfo implements Serializable	// class@001b4d
{
    public boolean enableFetchResourceWhenEnqueue;
    public boolean enablePreDownloadOnColdStart;
    public boolean enablePreDownloadOnEnterLiveRoom;
    public boolean enablePreDownloadOnUpdateGift;
    public boolean enableSurviveEffectTaskWhenDequeue;
    public String endTime;
    public String p2spPolicy;
    public String startTime;
    public String timePattern;
    public static final LiveEffectDownloadSwitchInfo DEFAULT;
    public static final long serialVersionUID;

    static {
       LiveEffectDownloadSwitchInfo liveEffectDo = new LiveEffectDownloadSwitchInfo();
       LiveEffectDownloadSwitchInfo.DEFAULT = liveEffectDo;
       liveEffectDo.enablePreDownloadOnColdStart = true;
       liveEffectDo.enablePreDownloadOnEnterLiveRoom = true;
       liveEffectDo.enablePreDownloadOnUpdateGift = true;
       liveEffectDo.enableFetchResourceWhenEnqueue = true;
       liveEffectDo.enableSurviveEffectTaskWhenDequeue = true;
       liveEffectDo.p2spPolicy = "";
    }
    public void LiveEffectDownloadSwitchInfo(){
       super();
       this.p2spPolicy = "";
    }
    public static long c(String p0,String p1){
       Date uDate;
       SimpleDateFormat obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveEffectDownloadSwitchInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          obj = new SimpleDateFormat(p1);
          uDate = obj.parse(p0);
       }catch(java.lang.Exception e3){
          b.r(LiveLogTag.LIVE_DOWNLOAD_UTILS.appendTag("LiveEffectSwitchInfo"), "[dateStrToTimestamp]:dateStrToTimestamp err: "+Log.getStackTraceString(e3));
       }
       if (uDate == null) {
          return -1;
       }
       return uDate.getTime();
    }
    public final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveEffectDownloadSwitchInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "yyyy-MM-dd "+p0;
    }
    public final String b(String p0){
       Calendar obj = PatchProxy.applyOneRefs(p0, this, LiveEffectDownloadSwitchInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Calendar.getInstance();
       int i = obj.get(1);
       String str = String.valueOf(i);
       return ((("yyyy-MM-dd ").replace("yyyy", str)).replace("MM", String.valueOf((obj.get(2) + 1)))).replace("dd", String.valueOf(obj.get(5)))+p0;
    }
    public boolean match(long p0){
       if (PatchProxy.isSupport(LiveEffectDownloadSwitchInfo.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, LiveEffectDownloadSwitchInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       long l = LiveEffectDownloadSwitchInfo.c(this.b(this.startTime), this.a(this.timePattern));
       long l1 = LiveEffectDownloadSwitchInfo.c(this.b(this.endTime), this.a(this.timePattern));
       boolean b = false;
       LiveLogTag liveLogTag = -1;
       if (!l - liveLogTag || !l1 - liveLogTag) {
          b.r(LiveLogTag.LIVE_DOWNLOAD_UTILS.appendTag("LiveEffectSwitchInfo"), "[match]: time parse err, startTimestamp = "+l+", endTimestamp = "+l1+", switchInfo ="+this+", timestamp = "+p0);
          return b;
       }else if(p0 - l >= 0 && p0 - l1 <= 0){
          b = true;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveEffectDownloadSwitchInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SwitchInfo{startTime=\'"+this.startTime+'''+", endTime=\'"+this.endTime+'''+", timePattern=\'"+this.timePattern+'''+", enablePreDownloadOnColdStart="+this.enablePreDownloadOnColdStart+", enablePreDownloadOnEnterLiveRoom="+this.enablePreDownloadOnEnterLiveRoom+", enablePreDownloadOnUpdateGift="+this.enablePreDownloadOnUpdateGift+", enableFetchResourceWhenEnqueue="+this.enableFetchResourceWhenEnqueue+", enableSurviveEffectTaskWhenDequeue="+this.enableSurviveEffectTaskWhenDequeue+", p2spPolicy="+this.p2spPolicy+'}';
    }
}
