package g82.v$g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import g82.v;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import android.graphics.Typeface;
import g82.f0;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import java.lang.Integer;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import kg1.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import o07.o;

public class v$g implements PopupInterface$h	// class@002ac0
{
    public final String b;
    public final v c;

    public void v$g(v p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$g.class, "1")) {
          return;
       }
       View view = p0.z();
       view.findViewById(R.id.text).setTypeface(Typeface.create("sans-serif-medium", 0));
       this.c.B.post(new f0(this, view));
       return;
    }
    public void H(c p0,int p1){
       v$g og = v$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "2")) {
          return;
       }
       v$g tb = this.b;
       ClientContent$LiveStreamPackage liveStreamPa = this.c.p.Z2.a();
       if (!PatchProxy.applyVoidTwoRefs(tb, liveStreamPa, null, i.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GAME_LIVE_BUBBLE_SHOW";
          i3 oi3 = i3.f();
          oi3.d("type", "catfish");
          oi3.d("text", tb);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.v0(9, uElementPack, uContentPack, null);
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
