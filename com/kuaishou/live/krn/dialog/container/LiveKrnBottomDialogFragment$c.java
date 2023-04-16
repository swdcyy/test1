package com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$c;
import s63.e;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment;
import android.content.Context;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kwai.library.widget.popup.common.f;

public final class LiveKrnBottomDialogFragment$c extends e	// class@001d48
{
    public final LiveKrnBottomDialogFragment c;

    public void LiveKrnBottomDialogFragment$c(LiveKrnBottomDialogFragment p0,Context p1,int p2,a p3){
       this.c = p0;
       super(p1, p2, p3);
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, LiveKrnBottomDialogFragment$c.class, "1")) {
          return;
       }
       Dialog dialog = this.c.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             f.y(window);
          }
       }
       super.cancel();
       return;
    }
}
