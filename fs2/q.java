package fs2.q;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvSingModeBottomDialogFragment;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;

public final class q implements ViewTreeObserver$OnGlobalLayoutListener	// class@0029b8
{
    public final VoicePartyKtvSingModeBottomDialogFragment b;
    public final LiveCameraView c;
    public final double d;

    public void q(VoicePartyKtvSingModeBottomDialogFragment p0,LiveCameraView p1,double p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       int measuredHeig = this.c.getMeasuredHeight();
       double d = (double)this.c.getMeasuredWidth();
       q td = this.d;
       if (td - ((double)measuredHeig / d) < 0) {
          measuredHeig = (int)(d * td);
       }
       ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
       layoutParams.height = measuredHeig;
       this.c.setLayoutParams(layoutParams);
       q tb = this.b;
       if (tb.H == KtvSingMode.VIDEO) {
          tb.xh();
       }
       return;
    }
}
