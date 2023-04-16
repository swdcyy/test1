package com.kuaishou.live.core.show.floatingwindow.e$e;
import mq5.d$b;
import com.kuaishou.live.core.show.floatingwindow.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import t02.a0;
import com.kuaishou.live.core.show.floatingwindow.z;

public class e$e implements d$b	// class@000b7f
{
    public final e a;

    public void e$e(e p0){
       this.a = p0;
       super();
    }
    public String a(){
       return "FLOATING_WINDOW";
    }
    public boolean b(){
       LiveFloatingWindowManager obj = PatchProxy.apply(null, this, e$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(0x432c5e03);
       if (this.a.O != null) {
          if (obj.o().booleanValue() && (obj.q(this.a.D) && this.a.x.v0())) {
             b.Z(LiveLogTag.FLOATING_WINDOW, "block releasePlayerController, playerController using by LiveFloatingWindow");
             return true;
          }
       }else if(obj.o().booleanValue() && obj.q(this.a.D)){
          b.Z(LiveLogTag.FLOATING_WINDOW, "block releasePlayerController, playerController using by LiveFloatingWindow");
          return true;
       }
       Activity activity = this.a.getActivity();
       if (e.m(activity) && z.g(this.a.w, activity)) {
          b.Z(LiveLogTag.FLOATING_WINDOW, "block releasePlayerController, player controller will be used by FloatingWindow");
          return true;
       }else {
          return false;
       }
    }
}
