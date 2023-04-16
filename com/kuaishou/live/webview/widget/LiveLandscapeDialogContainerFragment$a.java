package com.kuaishou.live.webview.widget.LiveLandscapeDialogContainerFragment$a;
import androidx.fragment.app.c$b;
import com.kuaishou.live.webview.widget.LiveLandscapeDialogContainerFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveLandscapeDialogContainerFragment$a extends c$b	// class@00100b
{
    public final LiveLandscapeDialogContainerFragment a;

    public void LiveLandscapeDialogContainerFragment$a(LiveLandscapeDialogContainerFragment p0){
       this.a = p0;
       super();
    }
    public void n(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLandscapeDialogContainerFragment$a.class, "1")) {
          return;
       }
       this.a.dismissAllowingStateLoss();
       return;
    }
}
