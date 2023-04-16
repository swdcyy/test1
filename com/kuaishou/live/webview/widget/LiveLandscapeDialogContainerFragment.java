package com.kuaishou.live.webview.widget.LiveLandscapeDialogContainerFragment;
import com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kuaishou.live.webview.widget.b;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import pq3.b;
import com.kuaishou.live.webview.widget.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.kuaishou.live.webview.widget.LiveLandscapeDialogContainerFragment$a;
import androidx.fragment.app.c$b;
import androidx.fragment.app.e;

public class LiveLandscapeDialogContainerFragment extends LiveWebViewBaseDialogContainerFragment	// class@00100c
{
    public DialogContainerFragment$b L;
    public View M;
    public Fragment N;
    public int O;
    public float P;
    public static final int Q;

    public void LiveLandscapeDialogContainerFragment(){
       super();
       this.O = -1;
       this.P = 0xbf800000;
    }
    public int Dh(){
       return 0x7f11055e;
    }
    public void Lh(DialogContainerFragment$b p0){
       this.L = p0;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLandscapeDialogContainerFragment.class, "2")) {
          return;
       }
       Dialog dialog = this.getDialog();
       Window window = (dialog != null)? dialog.getWindow(): null;
       c3.c(window, b.a);
       super.onActivityCreated(p0);
       c3.c(window, new b(this));
       c3.c(dialog, new a(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLandscapeDialogContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.M = a.g(p0, 0x7f0d04ac, p1, false);
       LiveLandscapeDialogContainerFragment tL = this.L;
       if (tL != null) {
          this.N = tL.a();
          this.getChildFragmentManager().registerFragmentLifecycleCallbacks(new LiveLandscapeDialogContainerFragment$a(this), false);
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.v(R.id.content_fragment, this.N);
          uoe.o();
       }
       return this.M;
    }
}
