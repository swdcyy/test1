package com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveGuestActivityGuestInfoPopupDialog$a extends m	// class@001176
{
    public final LiveGuestActivityGuestInfoPopupDialog c;

    public void LiveGuestActivityGuestInfoPopupDialog$a(LiveGuestActivityGuestInfoPopupDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGuestActivityGuestInfoPopupDialog$a.class, "1")) {
          return;
       }
       this.c.dismissAllowingStateLoss();
       return;
    }
}
