package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$j;
import android.view.SurfaceHolder$Callback;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import android.view.SurfaceHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.Surface;

public final class VodTheaterPlayer$j implements SurfaceHolder$Callback	// class@0019d0
{
    public final VodTheaterPlayer b;

    public void VodTheaterPlayer$j(VodTheaterPlayer p0){
       this.b = p0;
       super();
    }
    public void surfaceChanged(SurfaceHolder p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(VodTheaterPlayer$j.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VodTheaterPlayer$j.class, "2")) {
          return;
       }
       a.p(p0, "holder");
       this.b.w(p0.getSurface());
       return;
    }
    public void surfaceCreated(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer$j.class, "1")) {
          return;
       }
       a.p(p0, "holder");
       this.b.w(p0.getSurface());
       return;
    }
    public void surfaceDestroyed(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer$j.class, "3")) {
          return;
       }
       a.p(p0, "holder");
       this.b.w(p0.getSurface());
       return;
    }
}
