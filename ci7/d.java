package ci7.d;
import ci7.a;
import java.lang.Object;
import ci7.f;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.Timer;
import ci7.d$a;
import java.util.TimerTask;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONException;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Exception;

public class d	// class@000561
{
    public a a;
    public final long b;
    public f c;
    public IMediaPlayer$OnQosStatListener d;
    public Object e;
    public Timer f;
    public TimerTask g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;

    public void d(long p0,long p1,a p2,Object p3){
       super();
       this.k = 0;
       this.l = 0;
       this.n = 0;
       this.m = p0;
       this.b = p1;
       this.a = p2;
       this.e = p3;
       this.h = false;
       this.i = true;
       this.j = false;
       this.c = new f(p2);
    }
    public void a(IMediaPlayer$OnQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.h = true;
       this.d = p0;
       this.n = System.currentTimeMillis();
       this.f = new Timer();
       d$a uoa = new d$a(this);
       this.g = uoa;
       d tm = this.m;
       this.f.schedule(uoa, tm, tm);
       long l = System.currentTimeMillis();
       this.k = l;
       this.l = l;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       this.h = false;
       d tg = this.g;
       if (tg != null) {
          tg.cancel();
          this.g = null;
       }
       tg = this.f;
       if (tg != null) {
          tg.cancel();
          this.f = null;
       }
       this.j = true;
       long l = System.currentTimeMillis();
       this.k = l;
       this.c.b((l - this.k));
       this.c((l - this.l));
       this.l = l;
       this.c.a();
       return;
    }
    public void c(long p0){
       JSONObject jSONObject;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uod, "3")) {
          return;
       }
       if (this.a.isMediaPlayerValid()) {
          if (PatchProxy.isSupport(uod)) {
             jSONObject = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uod, "4");
             if (jSONObject != PatchProxyResult.class) {
             }else {
             label_0034 :
                uod = this.e;
                _monitor_enter(uod);
                int i = (this.i != null)? 1: 0;
                int i1 = (this.j != null)? 1: 0;
                if (this.i != null) {
                   this.i = false;
                }
                String liveRealTime = this.a.getLiveRealTimeQosJson(i, i1, this.n, p0, this.b);
                if (liveRealTime != null) {
                   try{
                      _monitor_exit(uod);
                      jSONObject = new JSONObject(liveRealTime);
                   }catch(org.json.JSONException e14){
                      e14.printStackTrace();
                   }
                   _monitor_exit(jSONObject);
                   jSONObject = null;
                }else {
                   goto label_0066 ;
                }
             }
          }else {
             goto label_0034 ;
          }
          d td = this.d;
          if (td != null && jSONObject != null) {
             try{
                td.onQosStat(this.a, jSONObject);
             }catch(java.lang.Exception e14){
                e14.printStackTrace();
             }
          }
       }
       return;
    }
}
