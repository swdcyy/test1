package com.yxcorp.plugin.setting.activity.g;
import sfc.a;
import com.yxcorp.plugin.setting.activity.PushSilenceSettingActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton;

public class g extends a	// class@000823
{
    public final PushSilenceSettingActivity c;

    public void g(PushSilenceSettingActivity p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.b(p0);
       g tc = this.c;
       tc.z.setSwitch(tc.J);
       return;
    }
}
