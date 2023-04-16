package com.kuaishou.live.basic.dialog.LiveDialogContainerFragment$a;
import java.lang.Runnable;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.View;

public class LiveDialogContainerFragment$a implements Runnable	// class@000cc2
{
    public final LiveDialogContainerFragment b;

    public void LiveDialogContainerFragment$a(LiveDialogContainerFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment$a.class, "1")) {
          return;
       }
       Dialog dialog = this.b.getDialog();
       if (dialog != null) {
          dialog.getWindow().getDecorView().setVisibility(0);
          dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103d9);
       }
       return;
    }
}
