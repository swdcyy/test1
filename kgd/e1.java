package kgd.e1;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.i0$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.util.Objects;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import com.yxcorp.plugin.setting.entries.holder.i0;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import pgd.y;
import k2b.e0;
import sgd.b;
import wa5.e;
import com.kuaishou.weapon.i.WeaponHI;

public final class e1 implements SlipSwitchButton$b	// class@001789
{
    public final i0$a a;

    public void e1(i0$a p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       e1 ta = this.a;
       Objects.requireNonNull(ta);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("disable_setting_privacy_clip", (p1 ^ 0x01));
       g.a(uEditor);
       j.d(ta.q.e, p1);
       b.k(ta.q.a, "CLIPBOARD_READ", y.a(p0.getSwitch()));
       WeaponHI.setClipClose(e.f());
    }
}
