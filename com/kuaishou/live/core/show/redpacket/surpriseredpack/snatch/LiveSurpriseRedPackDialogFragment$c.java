package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment$c;
import android.view.View$OnTouchListener;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.n;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveSurpriseRedPackDialogFragment$c implements View$OnTouchListener	// class@000fa3
{
    public final LiveSurpriseRedPackDialogFragment b;

    public void LiveSurpriseRedPackDialogFragment$c(LiveSurpriseRedPackDialogFragment p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveSurpriseRedPackDialogFragment$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (p1.getAction() != 1 || !n.N(this.b.v, p1)) {
          return false;
       }
       if (y.d(this.b.getActivity())) {
          this.b.dismissAllowingStateLoss();
       }
       return true;
    }
}
