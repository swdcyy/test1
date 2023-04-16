package com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment$c;
import jz6.a;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.a;
import android.view.Window;
import com.kwai.library.widget.popup.common.f;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment$b;

public final class ShareDialogContainerFragment$c extends a	// class@0014a9
{
    public final ShareDialogContainerFragment b;

    public void ShareDialogContainerFragment$c(ShareDialogContainerFragment p0,Context p1,int p2){
       this.b = p0;
       super(p1, p2);
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, ShareDialogContainerFragment$c.class, "1")) {
          return;
       }
       Dialog dialog = this.b.getDialog();
       a.m(dialog);
       a.o(dialog, "dialog!!");
       Window window = dialog.getWindow();
       a.m(window);
       f.y(window);
       ShareDialogContainerFragment t = this.b.t;
       if (t != null) {
          a.m(t);
          if (t.b()) {
             return;
          }
       }
       super.cancel();
       return;
    }
}
