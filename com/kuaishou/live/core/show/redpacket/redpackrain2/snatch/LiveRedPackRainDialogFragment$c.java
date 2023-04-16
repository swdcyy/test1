package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment$c;
import android.view.View$OnTouchListener;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment;
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

public class LiveRedPackRainDialogFragment$c implements View$OnTouchListener	// class@000f19
{
    public final LiveRedPackRainDialogFragment b;

    public void LiveRedPackRainDialogFragment$c(LiveRedPackRainDialogFragment p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveRedPackRainDialogFragment$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (p1.getAction() == 1 && n.N(this.b.w, p1)) {
          LiveRedPackRainDialogFragment$c tb = this.b;
          LiveRedPackRainDialogFragment s = tb.s;
          if (s != 2) {
             if (s != 4 || (tb.C == null || y.d(tb.getActivity()))) {
                this.b.xh();
                this.b.dismissAllowingStateLoss();
             }
             return true;
          }
       }
       return false;
    }
}
