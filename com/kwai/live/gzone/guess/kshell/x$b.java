package com.kwai.live.gzone.guess.kshell.x$b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.guess.kshell.x;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s57.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import oq5.a;
import java.lang.CharSequence;
import android.widget.TextView;
import q57.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import k2b.u1;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import k67.b;

public class x$b extends m	// class@000d7d
{
    public final x c;

    public void x$b(x p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$b.class, "1")) {
          return;
       }
       x y0 = this.c.Y0;
       if (y0 != null) {
          y0.setVisibility(8);
       }
       y0 = this.c.D;
       if (y0 != null) {
          y0.c(false);
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.G.a();
       boolean b = this.c.w.H2();
       String str = String.valueOf(this.c.C.getText());
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, Boolean.valueOf(b), Boolean.TRUE, str, null, a.class, "15")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GUESS_PENDENT";
          i3 oi3 = i3.f();
          oi3.c("ui_type", Integer.valueOf(2));
          oi3.d("pendent_type", str);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.screenPackage = a.a(b);
          u1.u(1, uElementPack, uContentPack);
       }
       y0 = this.c.F;
       if (y0 != null) {
          y0.jm(LiveGzoneAudienceFeatureEntranceItem.GUESS, LiveGzoneTabSource.GUESS);
       }
       return;
    }
}
