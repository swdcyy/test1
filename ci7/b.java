package ci7.b;
import ci7.a;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.Timer;
import ci7.b$a;
import java.util.TimerTask;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import org.json.JSONException;
import com.kwai.video.player.IMediaPlayer;

public class b	// class@00055e
{
    public a a;
    public IMediaPlayer$OnLiveAdaptiveQosStatListener b;
    public Object c;
    public Timer d;
    public TimerTask e;
    public int f;
    public boolean g;
    public boolean h;
    public long i;
    public final long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public long s;

    public void b(long p0,long p1,a p2,Object p3){
       super();
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.i = p0;
       this.j = p1;
       this.a = p2;
       this.c = p3;
       this.g = false;
       this.f = 0;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 0;
    }
    public void a(boolean p0){
       this.h = p0;
    }
    public void b(long p0){
       this.n = p0;
    }
    public void c(IMediaPlayer$OnLiveAdaptiveQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       this.g = true;
       this.b = p0;
       this.m = System.currentTimeMillis();
       this.d = new Timer();
       b$a uoa = new b$a(this);
       this.e = uoa;
       b ti = this.i;
       this.d.schedule(uoa, ti, ti);
       long l = System.currentTimeMillis();
       this.k = l;
       this.l = l;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       this.g = false;
       b te = this.e;
       if (te != null) {
          te.cancel();
          this.e = null;
       }
       te = this.d;
       if (te != null) {
          te.cancel();
          this.d = null;
       }
       long l = System.currentTimeMillis();
       this.e((l - this.l));
       this.l = l;
       return;
    }
    public void e(long p0){
       b obj;
       JSONObject jSONObject;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (this.a.isMediaPlayerValid()) {
          if (PatchProxy.isSupport(uob)) {
             obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uob, "4");
             if (obj != PatchProxyResult.class) {
             }else {
             label_0035 :
                obj = this.c;
                _monitor_enter(obj);
                AppLiveAdaptiveRealtimeInfo appLiveAdapt = this.a.getAppLiveAdaptiveRealtimeInfo();
                if (appLiveAdapt == null) {
                   _monitor_exit(obj);
                   obj = null;
                }else {
                   try{
                      jSONObject = new JSONObject();
                      jSONObject.put("play_url", this.a.getKflvVideoPlayingUrl());
                      jSONObject.put("play_start_time", this.n);
                      jSONObject.put("tick_start", this.m);
                      jSONObject.put("stream_id", this.a.getStreamId());
                      jSONObject.put("server_ip", this.a.getServerAddress());
                      jSONObject.put("v_buf_time", appLiveAdapt.videoBufferTime);
                      jSONObject.put("a_buf_time", appLiveAdapt.audioBufferTime);
                      long l = this.s + 1;
                      this.s = l;
                      jSONObject.put("index", l);
                      if (this.h != null) {
                         jSONObject.put("bandwidth_current", appLiveAdapt.bandwidthCurrent);
                         jSONObject.put("bandwidth_fragment", appLiveAdapt.bandwidthFragment);
                         jSONObject.put("bitrate_downloading", appLiveAdapt.bitrateDownloading);
                         jSONObject.put("bitrate_playing", appLiveAdapt.bitratePlaying);
                         jSONObject.put("current_buffer", appLiveAdapt.currentBufferMs);
                         jSONObject.put("estimated_buffer", appLiveAdapt.estimateBufferMs);
                         jSONObject.put("predicted_buffer", appLiveAdapt.predictedBufferMs);
                         jSONObject.put("switch_time_gap", appLiveAdapt.repSwitchGapTime);
                         jSONObject.put("cached_tag_duration", appLiveAdapt.cachedTagDurationMs);
                         jSONObject.put("cached_total_duration", appLiveAdapt.cachedTotalDurationMs);
                         jSONObject.put("switch_cnt", (appLiveAdapt.repSwitchCnt - this.r));
                         this.r = appLiveAdapt.repSwitchCnt;
                         jSONObject.put("switch_point_v_buf_time", appLiveAdapt.repSwitchPointVideoBufferTime);
                         AppLiveAdaptiveRealtimeInfo curRepReadSt = appLiveAdapt.curRepReadStartTime;
                         if (this.p - curRepReadSt) {
                            b uob1 = null;
                            if (!curRepReadSt - uob1) {
                               this.f = 0;
                            }
                            AppLiveAdaptiveRealtimeInfo curRepFirstD = appLiveAdapt.curRepFirstDataTime;
                            if (!curRepFirstD - uob1) {
                               jSONObject.put("cur_rep_first_data_time", ((long)(this.f + 1) * this.o));
                               this.f = this.f + 1;
                            }else {
                               long l1 = curRepFirstD - curRepReadSt;
                               this.q = l1;
                               jSONObject.put("cur_rep_first_data_time", l1);
                               jSONObject.put("cur_rep_switch_time", this.q);
                               this.f = 0;
                               this.p = curRepReadSt;
                            }
                         }else {
                            jSONObject.put("cur_rep_first_data_time", this.q);
                            jSONObject.put("cur_rep_switch_time", 0);
                         }
                      }
                   }catch(org.json.JSONException e10){
                      e10.printStackTrace();
                   }
                   _monitor_exit(obj);
                   obj = jSONObject;
                }
             }
          }else {
             goto label_0035 ;
          }
          b tb = this.b;
          if (tb != null && obj != null) {
             tb.onLiveAdaptiveQosStat(this.a, obj);
          }
          this.m = System.currentTimeMillis();
       }
       return;
    }
}
