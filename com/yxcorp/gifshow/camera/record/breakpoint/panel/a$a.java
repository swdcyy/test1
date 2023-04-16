package com.yxcorp.gifshow.camera.record.breakpoint.panel.a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import rc9.a;
import com.kwai.video.player.KsMediaPlayer;

public class a$a implements Runnable	// class@000db7
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       k1.m(this);
       a$a tb = this.b;
       a e = tb.e;
       if (e.i != null) {
          tb.f.seekTo((tb.g + (long)e.e));
       }
       return;
    }
}
