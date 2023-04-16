package com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment;
import com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment$b;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout$b;

public class LiveSwipeDialogContainerFragment extends LiveWebViewBaseDialogContainerFragment	// class@001012
{
    public final boolean L;

    public void LiveSwipeDialogContainerFragment(boolean p0){
       super();
       this.L = p0;
    }
    public int getLayoutResId(){
       if (this.L != null) {
          return 0x7f0d0e05;
       }
       return 0x7f0d0e04;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSwipeDialogContainerFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       LiveSwipeDialogContainerLayout liveSwipeDia = p0.findViewById(R.id.swipe_menu_layout);
       if (this.L != null) {
          p0.findViewById(R.id.exit_button).setOnClickListener(new LiveSwipeDialogContainerFragment$a(this));
       }
       liveSwipeDia.setOnScrollListener(new LiveSwipeDialogContainerFragment$b(this));
       return;
    }
}
