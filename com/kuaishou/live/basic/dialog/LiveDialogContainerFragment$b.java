package com.kuaishou.live.basic.dialog.LiveDialogContainerFragment$b;
import jz6.a;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kwai.library.widget.popup.common.f;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment$c;

public class LiveDialogContainerFragment$b extends a	// class@000cc3
{
    public final LiveDialogContainerFragment b;

    public void LiveDialogContainerFragment$b(LiveDialogContainerFragment p0,Context p1,int p2){
       this.b = p0;
       super(p1, p2);
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment$b.class, "1")) {
          return;
       }
       f.y(this.b.getDialog().getWindow());
       LiveDialogContainerFragment t = this.b.t;
       if (t != null && t.b()) {
          return;
       }
       super.cancel();
       return;
    }
}
