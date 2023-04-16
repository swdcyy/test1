package com.yxcorp.plugin.setting.activity.PushSettingsActivity$a;
import erd.g;
import com.yxcorp.plugin.setting.activity.PushSettingsActivity;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.PushStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import fg6.a;
import com.google.gson.Gson;
import oe6.e;

public class PushSettingsActivity$a implements g	// class@000810
{
    public final PushSettingsActivity b;

    public void PushSettingsActivity$a(PushSettingsActivity p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSettingsActivity$a.class, "1")) {
       }else {
          PushSettingsActivity$a tb = this.b;
          tb.z = p0;
          PushSettingsActivity a = tb.A;
          if (a != null) {
             a.dismiss();
          }
          e.n0(a.a.q(p0));
          this.b.v3(true);
       }
       return;
    }
}
