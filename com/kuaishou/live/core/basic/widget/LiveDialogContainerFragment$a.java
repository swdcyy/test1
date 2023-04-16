package com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$a;
import jz6.a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kwai.library.widget.popup.common.f;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;

public class LiveDialogContainerFragment$a extends a	// class@0008fa
{
    public final LiveDialogContainerFragment b;

    public void LiveDialogContainerFragment$a(LiveDialogContainerFragment p0,Context p1,int p2){
       this.b = p0;
       super(p1, p2);
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment$a.class, "1")) {
          return;
       }
       f.y(this.b.getDialog().getWindow());
       LiveDialogContainerFragment w = this.b.w;
       if (w != null && w.b()) {
          return;
       }
       super.cancel();
       return;
    }
}
