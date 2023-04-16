package ci7.e;
import ci7.a;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ci7.d;
import java.lang.System;
import org.json.JSONObject;
import com.kwai.video.player.IMediaPlayer;
import org.json.JSONException;

public class e	// class@000562
{
    public d a;
    public final a b;
    public final boolean c;
    public IMediaPlayer$OnQosStatListener d;
    public long e;
    public String f;

    public void e(a p0,boolean p1){
       super();
       this.e = 0x2710;
       this.b = p0;
       this.c = p1;
       this.f = null;
    }
    public void a(IMediaPlayer$OnQosStatListener p0){
       this.d = p0;
    }
    public void b(String p0){
       d e;
       d d;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "1")) {
          return;
       }
       e f = obj.f;
       if (f != null && !obj1.equals(f)) {
          f = obj.a;
          if (f != null) {
             Objects.requireNonNull(f);
             if (!PatchProxy.applyVoid(null, f, d.class, "5") && f.a.isMediaPlayerValid()) {
                e = f.e;
                _monitor_enter(e);
                String liveRealTime = f.a.getLiveRealTimeQosJson(0, 0, f.n, (System.currentTimeMillis() - f.l), -1);
                if (liveRealTime != null) {
                   try{
                      JSONObject jSONObject = new JSONObject(liveRealTime);
                      d = f.d;
                      if (d != null) {
                         d.onQosStat(f.a, jSONObject);
                      }
                   }catch(org.json.JSONException e0){
                      e0.printStackTrace();
                   }
                }
             }
          }
       }
       obj.f = obj1;
       return;
    }
    public void c(long p0){
       if (p0 <= 0) {
          return;
       }
       this.e = p0;
       return;
    }
    public void d(String p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "2")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       _monitor_enter(this);
       if (PatchProxy.applyVoid(null, this, uoe, "4")) {
          _monitor_exit(this);
       }else if(this.a != null){
          _monitor_exit(this);
       }else {
          d uod = new d(1000, this.e, this.b, new Object());
          this.a = this.a;
          this.a.a(this.d);
          _monitor_exit(this);
       }
       return;
    }
    public void e(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "3")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       _monitor_enter(this);
       if (PatchProxy.applyVoid(null, this, uoe, "5")) {
          _monitor_exit(this);
       }else {
          uoe = this.a;
          if (uoe == null) {
             _monitor_exit(this);
          }else {
             uoe.b();
             this.a = null;
             _monitor_exit(this);
          }
       }
       return;
    }
}
