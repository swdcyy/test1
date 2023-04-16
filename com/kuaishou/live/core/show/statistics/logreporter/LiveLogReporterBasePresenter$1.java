package com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$1;
import android.content.BroadcastReceiver;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Boolean;
import tj3.e;
import tj3.l;

public class LiveLogReporterBasePresenter$1 extends BroadcastReceiver	// class@00109c
{
    public final LiveLogReporterBasePresenter a;

    public void LiveLogReporterBasePresenter$1(LiveLogReporterBasePresenter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       LiveLogReporterBasePresenter$1 ta;
       l ol;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLogReporterBasePresenter$1.class, "1")) {
          return;
       }
       if (b.a(0x432c5e03).o().booleanValue()) {
          return;
       }
       if (!this.a.p.e()) {
          return;
       }
       int i = 6;
       String str = "DARK_VIEW";
       if (("android.intent.action.SCREEN_ON").equals(p1.getAction())) {
          ta = this.a;
          ta.H = true;
          if (ta.G == null) {
             ol = ta.p.n();
             ol.i(str);
             ol.h(i);
             this.a.p.z();
          }
       }else if(("android.intent.action.SCREEN_OFF").equals(p1.getAction())){
          ta = this.a;
          ta.H = false;
          ol = ta.p.n();
          ol.i("BRIGHT_VIEW");
          if (this.a.G != null) {
             i = 1;
          }
          ol.h(i);
          this.a.p.z();
          ol.G = false;
       }else if(("android.intent.action.USER_PRESENT").equals(p1.getAction())){
          ta = this.a;
          ta.G = true;
          ol = ta.p.n();
          if (this.a.H != null) {
             str = "BRIGHT_VIEW";
          }
          ol.i(str);
          ol.h(10);
          this.a.p.z();
          ol.H = true;
       }
       return;
    }
}
