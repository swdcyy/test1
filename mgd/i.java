package mgd.i;
import erd.g;
import com.yxcorp.plugin.setting.fontscale.FontScaleSettingsFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wgc.d;
import xgc.f;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.plugin.setting.fontscale.FontScaleFollowSystemStatus;
import e17.i;

public final class i implements g	// class@001d1d
{
    public final FontScaleSettingsFragment b;

    public void i(FontScaleSettingsFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.w != null) {
             p0 = p0.v;
             if (p0 != null) {
                p0 = p0.h();
                if (p0 != null) {
                   p0 = p0.f;
                   if (p0 != null) {
                      p0 = p0.findViewById(R.id.switch_btn);
                      if (p0 != null) {
                         p0.g(false, true, false);
                      }
                   }
                }
             }
             this.b.gh(FontScaleFollowSystemStatus.CLOSE_AUTO);
             i.a(R.style.arg_RES_7f11066a, 0x7f101046);
          }
       }
       return;
    }
}
