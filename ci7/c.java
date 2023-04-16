package ci7.c;
import ci7.a;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import ci7.b;

public class c	// class@00055f
{
    public final a a;
    public final boolean b;
    public b c;
    public Object d;
    public long e;
    public long f;
    public boolean g;
    public IMediaPlayer$OnLiveAdaptiveQosStatListener h;

    public void c(a p0,boolean p1){
       super();
       this.d = new Object();
       this.e = 2000;
       this.a = p0;
       this.b = p1;
    }
    public void a(boolean p0){
       this.g = p0;
    }
    public void b(IMediaPlayer$OnLiveAdaptiveQosStatListener p0){
       this.h = p0;
    }
    public void c(long p0){
       if (p0 <= 0) {
          return;
       }
       this.e = p0;
       return;
    }
    public void d(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.f = System.currentTimeMillis();
       _monitor_enter(this);
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          _monitor_exit(this);
       }else if(this.c != null){
          _monitor_exit(this);
       }else {
          b uob = new b(1000, this.e, this.a, this.d);
          this.c = uoc;
          uoc.b(this.f);
          this.c.a(this.g);
          this.c.c(this.h);
          _monitor_exit(this);
       }
       return;
    }
    public void e(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "2")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       _monitor_enter(this);
       if (PatchProxy.applyVoid(null, this, uoc, "4")) {
          _monitor_exit(this);
       }else {
          uoc = this.c;
          if (uoc == null) {
             _monitor_exit(this);
          }else {
             uoc.d();
             this.c = null;
             _monitor_exit(this);
          }
       }
       return;
    }
}
