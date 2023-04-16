package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$h;
import java.lang.Runnable;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import a2.i0;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView;
import android.widget.FrameLayout;
import xl8.b;
import og1.a;
import java.lang.Boolean;
import y12.b;
import com.kwai.video.waynelive.LivePlayerController;
import crd.b;
import ekd.k1;

public class LiveFloatingWindowManager$h implements Runnable	// class@000b68
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$h(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void run(){
       LiveFloatingWindowManager b;
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager$h.class, "1")) {
          return;
       }
       if (!i9.a(a.a().a())) {
          LiveFloatingWindowManager$h tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, LiveFloatingWindowManager.class, "30")) {
             b.Z(LiveLogTag.FLOATING_WINDOW, "pause");
             tb.z("pause");
             b = tb.b;
             if (b != null && i0.X(b)) {
                b = tb.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoid(null, b, LiveFloatingWindowView.class, "25")) {
                   b.setVisibility(8);
                }
                a.a().d(Boolean.FALSE);
                tb.O.a("pause");
             }
             b = tb.c;
             if (b != null) {
                b.mute();
             }
             b = tb.y;
             if (b != null) {
                b.dispose();
                tb.y = null;
             }
             k1.m(tb.S);
          }
       }
       return;
    }
}
