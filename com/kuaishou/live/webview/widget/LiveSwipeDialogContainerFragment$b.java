package com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment$b;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout$b;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment;
import java.lang.Object;
import pq3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveSwipeDialogContainerFragment$b implements LiveSwipeDialogContainerLayout$b	// class@001011
{
    public final LiveSwipeDialogContainerFragment a;

    public void LiveSwipeDialogContainerFragment$b(LiveSwipeDialogContainerFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       c.b(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveSwipeDialogContainerFragment$b.class, "1")) {
          return;
       }
       this.a.dismissAllowingStateLoss();
       return;
    }
}
