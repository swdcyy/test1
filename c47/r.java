package c47.r;
import android.content.DialogInterface$OnShowListener;
import com.kwai.live.gzone.commandlottery.d;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import c47.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import f37.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class r implements DialogInterface$OnShowListener	// class@0004dd
{
    public final d b;

    public void r(d p0){
       this.b = p0;
       super();
    }
    public void onShow(DialogInterface p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, str)) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.b.q.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, a.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_REMIND_POP";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(4, uElementPack, uContentPack);
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"gzone_command_lottery_notice_dialog_showed", true);
       g.a(uEditor);
       return;
    }
}
