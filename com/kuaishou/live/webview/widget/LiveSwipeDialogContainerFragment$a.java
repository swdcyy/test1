package com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveSwipeDialogContainerFragment$a extends m	// class@001010
{
    public final LiveSwipeDialogContainerFragment c;

    public void LiveSwipeDialogContainerFragment$a(LiveSwipeDialogContainerFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSwipeDialogContainerFragment$a.class, "1")) {
          return;
       }
       this.c.dismiss();
       return;
    }
}
