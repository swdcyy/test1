package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$b;
import ft5.d;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController;
import java.lang.Object;
import ft5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;

public final class TheaterHalfScreenPlayControlsViewController$b implements d	// class@00199b
{
    public final TheaterHalfScreenPlayControlsViewController a;

    public void TheaterHalfScreenPlayControlsViewController$b(TheaterHalfScreenPlayControlsViewController p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       c.a(this, p0, p1);
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, TheaterHalfScreenPlayControlsViewController$b.class, "2")) {
          return;
       }
       this.a.P2().setVisibility(0);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, TheaterHalfScreenPlayControlsViewController$b.class, "1")) {
          return;
       }
       this.a.P2().setVisibility(8);
       return;
    }
}
