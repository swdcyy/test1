package com.kwai.video.wayne.player.logreport.LaunchReport;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.wayne.player.builder.WayneVideoContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import org.json.JSONObject;
import com.kwai.video.wayne.player.KSActionEventCollector;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.logreport.LogReport;
import com.kwai.video.wayne.player.logreport.IKSLogReport;
import com.kwai.video.wayne.player.WayneContext;
import java.lang.Enum;
import org.json.JSONException;

public class LaunchReport	// class@000d3f
{

    public void LaunchReport(){
       super();
    }
    public static void logVpLaunchPlay(boolean p0,long p1,long p2,String p3,WayneVideoContext p4){
       object oobject = p4;
       LaunchReport launchReport = LaunchReport.class;
       int i = 1;
       if (PatchProxy.isSupport(launchReport)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),p3,oobject};
          if (PatchProxy.applyVoid(objArray, null, launchReport, "1")) {
             return;
          }
       }
       try{
          JSONObject jSONObject = new JSONObject();
          String str = "";
          String str1 = (p0)? str: p3;
          jSONObject.put(str, str1);
          JSONObject jSONObject1 = new JSONObject();
          if (oobject != null) {
             jSONObject1.put("video_id", oobject.mVideoId);
             jSONObject1.put("enter_action", oobject.mEnterAction);
             jSONObject1.put("stats_extra", oobject.mExtra);
             String str2 = "launch_to_prepare_player";
             KSActionEventCollector kSActionEven = -1;
             long l = (p1 > 0)? p1 - KSActionEventCollector.getInstance().getLaunchTimeStamp(): kSActionEven;
             jSONObject1.put(str2, l);
             str2 = "launch_prepare";
             if (!p0) {
                String str3 = "launch_to_first_frame";
                if (p2 > 0) {
                   kSActionEven = p2 - KSActionEventCollector.getInstance().getLaunchTimeStamp();
                }
                jSONObject1.put(str3, kSActionEven);
                jSONObject1.put(str2, 0);
             }else {
                jSONObject1.put(str2, i);
             }
          }
          jSONObject.put("stats", jSONObject1.toString());
          jSONObject.put("session_id", KSActionEventCollector.getInstance().getLaunchSessionId());
          DebugLog.i("report", "logVpLaunchPlay VP_LAUNCH_PLAY£º"+jSONObject.toString());
          LogReport.get().getLogger().logEvent(WayneContext.app.name(), "VP_LAUNCH_PLAY", jSONObject.toString(), 0);
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return;
    }
}
