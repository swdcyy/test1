package com.kuaishou.live.viewcontroller.dialog.DialogViewController$b;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DialogViewController$b implements DialogInterface$OnDismissListener	// class@000fef
{
    public final DialogViewController b;

    public void DialogViewController$b(DialogViewController p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogViewController$b.class, "1")) {
          return;
       }
       this.b.V2();
       return;
    }
}
