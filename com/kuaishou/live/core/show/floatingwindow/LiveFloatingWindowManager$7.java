package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$7;
import android.content.BroadcastReceiver;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.l;
import tj3.e;
import tj3.i;

public class LiveFloatingWindowManager$7 extends BroadcastReceiver	// class@000b60
{
    public final LiveFloatingWindowManager a;

    public void LiveFloatingWindowManager$7(LiveFloatingWindowManager p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       LiveFloatingWindowManager$7 ta;
       LiveFloatingWindowManager d;
       l ol;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFloatingWindowManager$7.class, "1")) {
          return;
       }
       int i = 6;
       String str = "DARK_VIEW";
       if (("android.intent.action.SCREEN_ON").equals(p1.getAction())) {
          ta = this.a;
          ta.Z = true;
          if (ta.Y == null) {
             d = ta.d;
             if (d != null) {
                ol = d.n();
                ol.i(str);
                ol.h(i);
                this.a.d.z();
             }
          }
       }else if(("android.intent.action.SCREEN_OFF").equals(p1.getAction())){
          ta = this.a;
          boolean b = false;
          ta.Z = b;
          ta.Y = b;
          d = ta.d;
          if (d != null) {
             ol = d.n();
             ol.i("BRIGHT_VIEW");
             if (this.a.Y != null) {
                i = 1;
             }
             ol.h(i);
             this.a.d.z();
             this.a.d.h().p(3);
          }
       }else if(("android.intent.action.USER_PRESENT").equals(p1.getAction())){
          ta = this.a;
          ta.Y = true;
          ta.Z = true;
          d = ta.d;
          if (d != null) {
             ol = d.n();
             if (this.a.Z != null) {
                str = "BRIGHT_VIEW";
             }
             ol.i(str);
             ol.h(10);
             this.a.d.z();
             this.a.d.h().p(true);
          }
       }
       return;
    }
}
