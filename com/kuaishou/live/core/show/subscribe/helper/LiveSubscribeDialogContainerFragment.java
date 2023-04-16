package com.kuaishou.live.core.show.subscribe.helper.LiveSubscribeDialogContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public class LiveSubscribeDialogContainerFragment extends LiveDialogContainerFragment	// class@001128
{
    public boolean A;
    public boolean B;

    public void LiveSubscribeDialogContainerFragment(){
       super();
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeDialogContainerFragment.class, "1")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.setCancelable(this.A);
          dialog.setCanceledOnTouchOutside(this.B);
       }
       return;
    }
    public float yh(){
       return 0x3f000000;
    }
}
