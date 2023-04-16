package com.kuaishou.live.core.show.subscribe.helper.LiveAnchorSubscribeFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import e17.i$b;
import e17.i;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;

public class LiveAnchorSubscribeFloatEditorFragment extends FloatEditorFragment	// class@001127
{
    public long w1;

    public void LiveAnchorSubscribeFloatEditorFragment(){
       super();
    }
    public void Uh(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorSubscribeFloatEditorFragment.class, "1")) {
          return;
       }
       if ((SystemClock.elapsedRealtime() - this.w1) - TimeUnit.SECONDS.toMillis(1) > 0) {
          if (this.getDialog() != null) {
             i$b uob = i.m();
             uob.x(R.string.arg_RES_7f101e22);
             uob.p(R.drawable.arg_RES_7f082462);
             uob.n(this.getDialog().getWindow().getDecorView());
             i.z(uob);
          }
          this.w1 = SystemClock.elapsedRealtime();
       }
       return;
    }
}
