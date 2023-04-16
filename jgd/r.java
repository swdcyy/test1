package jgd.r;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import jgd.q;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;

public class r implements SlipSwitchButton$b	// class@0016ee
{
    public j a;

    public void r(){
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, or, "1")) {
          return;
       }
       if (p1 == QCurrentUser.ME.isScreenshotFeedbackDisabled()) {
          this.a.l(p0, "disable_screenshot_feedback", (p1 ^ 0x01), new q(p1));
       }
       return;
    }
}
