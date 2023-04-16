package com.kuaishou.live.playeradapter.statistics.b$e;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.playeradapter.statistics.b;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.video.player.IKwaiMediaPlayer;
import org.json.JSONObject;
import tj3.d;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import tj3.r;
import tj3.k;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.util.List;
import java.lang.Boolean;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.framework.player.config.PhotoPlayerConfig;
import com.kwai.video.waynelive.LivePlayerUtils;
import tj3.i;
import android.os.SystemClock;

public class b$e implements LivePlayerStateChangeListener	// class@000d61
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public void onStateChange(LivePlayerState p0){
       boolean b;
       IKwaiMediaPlayer iKwaiMediaPl;
       LivePlayerState pLAYING;
       b c1;
       b$e tb2;
       b$e tb3;
       JSONObject jSONObject;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (p0 == LivePlayerState.PREPARING) {
          b$e tb = this.b;
          b = true;
          if (tb.k == null) {
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, uob, "42")) {
                iKwaiMediaPl = tb.E();
                if (iKwaiMediaPl != null) {
                   try{
                      jSONObject = new JSONObject();
                      jSONObject.put("page_session_id", tb.f.c());
                      iKwaiMediaPl.setAppQosStatJson(jSONObject);
                   }catch(org.json.JSONException e2){
                      DebugLog.e("LiveLogReporterImpl", "uploadQosWhenSessionIdChanged error"+e2);
                   }
                }
             }
          }
          try{
             this.b.J();
             this.b.M();
             this.b.c.H();
             this.b.c.e0();
             tb = this.b;
             iKwaiMediaPl = tb.E();
             b$e tb1 = this.b;
             b c = tb1.c;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidThreeRefs(iKwaiMediaPl, c, tb1.f, tb, b.class, "32") && iKwaiMediaPl != null) {
                jSONObject = new JSONObject();
                jSONObject.put("play_start_time", c.M());
                jSONObject.put("client_id", TextUtils.k(c.R));
                jSONObject.put("push_cdn", TextUtils.k(c.S));
                jSONObject.put("pull_cdn", TextUtils.k(c.T));
                jSONObject.put("stream_id", TextUtils.k(c.i()));
                jSONObject.put("data_source_type", tb.G());
                jSONObject.put("livePolicy", c.N());
                String str = "player_index";
                Object obj = PatchProxy.apply(objArray, c, k.class, "21");
                int i = (obj != patchProxyRe)? obj.intValue(): c.O.size();
                jSONObject.put(str, i);
                Object obj1 = PatchProxy.apply(objArray, tb, uob, "38");
                boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): tb.b.isLiveDataSourceContainsWebRTC();
                if (b1) {
                   jSONObject.put("source_contains_webrtc", b);
                }
                if (b1) {
                   Object obj2 = PatchProxy.apply(objArray, tb, uob, "39");
                   boolean b2 = (obj2 != patchProxyRe)? obj2.booleanValue(): tb.b.isEnableWebRTCManifest();
                   if (b2) {
                      jSONObject.put("enable_webrtc_param", b);
                   }
                }
                if (b1 && PhotoPlayerConfig.a()) {
                   jSONObject.put("enable_webrtc_conf", b);
                }
                DebugLog.i("liveJson", jSONObject.toString());
                tb.K(jSONObject);
                iKwaiMediaPl.setAppQosStatJson(jSONObject);
             }
          }catch(org.json.JSONException e0){
             DebugLog.e("LiveLogReporterImpl", "fillInInitialQosExtraInfo error"+e0);
          }
       }
    }
}
