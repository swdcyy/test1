package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$a;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import a2.i0;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView;

public class LiveFloatingWindowManager$a implements IMediaPlayer$OnVideoSizeChangedListener	// class@000b61
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$a(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       LiveFloatingWindowManager b;
       LiveFloatingWindowManager$a uoa = LiveFloatingWindowManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       b.d0(LiveLogTag.FLOATING_WINDOW, "onVideoSizeChanged", "videoWidth", Integer.valueOf(p1), "videoHeight", Integer.valueOf(p2));
       b = this.b.b;
       if (b != null && i0.X(b)) {
          this.b.b.m(p1, p2);
       }
       return;
    }
}
