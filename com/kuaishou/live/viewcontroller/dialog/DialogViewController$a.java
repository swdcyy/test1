package com.kuaishou.live.viewcontroller.dialog.DialogViewController$a;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DialogViewController$a implements DialogInterface$OnCancelListener	// class@000fee
{
    public final DialogViewController b;

    public void DialogViewController$a(DialogViewController p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogViewController$a.class, "1")) {
          return;
       }
       this.b.V2();
       return;
    }
}
