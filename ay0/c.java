package ay0.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import java.lang.Object;
import android.view.View;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import zx0.l0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import dy0.e;

public final class c implements View$OnClickListener	// class@0002c7
{
    public final b b;

    public void c(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       b p = tb.p;
       ClientEvent$ElementPackage obj = null;
       ClientContent$LiveStreamPackage liveStreamPa = (p != null)? p.Z2.a(): obj;
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, obj, l0.class, "5")) {
          obj = new ClientEvent$ElementPackage();
          obj.action2 = "COMMENT_SEND_SUBCARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.G("", 1, obj, uContentPack);
       }
       tb.r.a(false, false);
       return;
    }
}
