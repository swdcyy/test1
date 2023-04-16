package com.kuaishou.live.webview.widget.LiveRoundCornerDialogContainerFragment;
import com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.webview.widget.LiveRoundCornerDialogContainerFragment$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.webview.widget.LiveRoundCornerWebViewLayout;
import lnc.a1;

public class LiveRoundCornerDialogContainerFragment extends LiveWebViewBaseDialogContainerFragment	// class@00100e
{
    public final int L;
    public final boolean M;

    public void LiveRoundCornerDialogContainerFragment(){
       super(0, 0);
    }
    public void LiveRoundCornerDialogContainerFragment(int p0,boolean p1){
       super();
       this.L = p0;
       this.M = p1;
    }
    public int getLayoutResId(){
       if (this.M != null) {
          return 0x7f0d0dbb;
       }
       return 0x7f0d0dba;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRoundCornerDialogContainerFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.M != null) {
          p0.findViewById(R.id.exit_button).setOnClickListener(new LiveRoundCornerDialogContainerFragment$a(this));
       }
       if (p0 instanceof LiveRoundCornerWebViewLayout) {
          LiveRoundCornerDialogContainerFragment tL = this.L;
          if (tL >= null) {
             p0.setTopRadius(a1.e((float)tL));
          }
       }
       return;
    }
}
