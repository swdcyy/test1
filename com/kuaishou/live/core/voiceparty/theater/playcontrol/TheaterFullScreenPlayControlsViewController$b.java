package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$b;
import gp2.q;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController;
import java.lang.Object;
import op2.f;
import op2.j;
import op2.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import d61.y;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;

public final class TheaterFullScreenPlayControlsViewController$b implements q	// class@00198b
{
    public final TheaterFullScreenPlayControlsViewController b;

    public void TheaterFullScreenPlayControlsViewController$b(TheaterFullScreenPlayControlsViewController p0){
       this.b = p0;
       super();
    }
    public void B(int p0,f p1){
       i.b(this, p0, p1);
    }
    public void P(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterFullScreenPlayControlsViewController$b.class, "1")) {
          return;
       }
       a.p(p0, "info");
       if (y.d(this.b.B2()) != p0.h()) {
          this.b.W2();
       }
       return;
    }
    public void W(){
       i.i(this);
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, TheaterFullScreenPlayControlsViewController$b.class, "2")) {
          return;
       }
       this.b.W2();
       return;
    }
    public void k(TheaterDisplayMode p0){
       i.a(this, p0);
    }
    public void onPause(){
       i.c(this);
    }
    public void onProgress(long p0,long p1){
       i.f(this, p0, p1);
    }
    public void onResume(){
       i.h(this);
    }
    public void p(){
       i.e(this);
    }
    public void y(LiveQualityItem p0,List p1){
       i.g(this, p0, p1);
    }
}
