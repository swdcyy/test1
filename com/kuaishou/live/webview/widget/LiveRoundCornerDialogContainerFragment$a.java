package com.kuaishou.live.webview.widget.LiveRoundCornerDialogContainerFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.webview.widget.LiveRoundCornerDialogContainerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveRoundCornerDialogContainerFragment$a extends m	// class@00100d
{
    public final LiveRoundCornerDialogContainerFragment c;

    public void LiveRoundCornerDialogContainerFragment$a(LiveRoundCornerDialogContainerFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRoundCornerDialogContainerFragment$a.class, "1")) {
          return;
       }
       this.c.dismiss();
       return;
    }
}
