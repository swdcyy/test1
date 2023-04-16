package com.kuaishou.live.common.core.component.chat.apply.LiveChatModeChoiceDialogHelper;
import xp5.i;
import android.app.Activity;
import com.kuaishou.live.common.core.component.chat.apply.LiveChatModeChoiceDialogHelper$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;

public class LiveChatModeChoiceDialogHelper	// class@001032
{
    public final Activity a;
    public final LiveChatModeChoiceDialogHelper$a b;
    public final i c;
    public Dialog d;

    public void LiveChatModeChoiceDialogHelper(i p0,Activity p1,LiveChatModeChoiceDialogHelper$a p2){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveChatModeChoiceDialogHelper.class, "2")) {
          return;
       }
       LiveChatModeChoiceDialogHelper td = this.d;
       if (td != null && td.isShowing()) {
          this.d.dismiss();
       }
       return;
    }
}
