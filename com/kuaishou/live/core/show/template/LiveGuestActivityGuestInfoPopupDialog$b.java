package com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import hl2.j;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveGuestActivityGuestInfoPopupDialog$b extends m	// class@001177
{
    public final LiveGuestActivityGuestInfoPopupDialog c;

    public void LiveGuestActivityGuestInfoPopupDialog$b(LiveGuestActivityGuestInfoPopupDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGuestActivityGuestInfoPopupDialog$b.class, "1")) {
          return;
       }
       LiveGuestActivityGuestInfoPopupDialog$b tc = this.c;
       tc.A.a(tc.w, tc.x);
       this.c.dismissAllowingStateLoss();
       return;
    }
}
