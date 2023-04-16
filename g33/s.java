package g33.s;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.util.Objects;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class s implements SlipSwitchButton$b	// class@002a5d
{
    public final LiveSettingsActivity a;

    public void s(LiveSettingsActivity p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       s ta = this.a;
       Objects.requireNonNull(ta);
       SharedPreferences a = e.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putBoolean("is_live_treasure_box_switch_on", p1);
       g.a(uEditor);
       if (p1) {
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putLong("live_treasure_box_next_show_time", -1);
          g.a(uEditor1);
       }
       LiveSettingsActivity liveSettings = LiveSettingsActivity.class;
       if (!PatchProxy.isSupport(liveSettings) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), ta, liveSettings, "14")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x761f;
          uElementPack.status = p1 ^ 1;
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
