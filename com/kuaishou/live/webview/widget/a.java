package com.kuaishou.live.webview.widget.a;
import lnc.c3$a;
import com.kuaishou.live.webview.widget.LiveLandscapeDialogContainerFragment;
import java.lang.Object;
import android.app.Dialog;
import java.util.Objects;
import pq3.a;
import android.content.DialogInterface$OnKeyListener;

public final class a implements c3$a	// class@001018
{
    public final LiveLandscapeDialogContainerFragment a;

    public void a(LiveLandscapeDialogContainerFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       p0.setOnKeyListener(new a(ta));
    }
}
