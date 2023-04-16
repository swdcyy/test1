package com.yxcorp.plugin.setting.activity.e;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.activity.PushSettingsActivity$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.activity.PushSettingsActivity;

public class e implements View$OnClickListener	// class@000821
{
    public final PushSettingsActivity$b b;

    public void e(PushSettingsActivity$b p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.b.b.u3();
       return;
    }
}
