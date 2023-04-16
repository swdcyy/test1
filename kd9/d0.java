package kd9.d0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.frame.f;
import com.yxcorp.gifshow.camera.record.frame.f$a;
import com.yxcorp.gifshow.camera.record.frame.FrameModeInfo;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import android.widget.TextView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import oe6.e;
import com.yxcorp.gifshow.camera.record.frame.f$b;

public final class d0 implements View$OnClickListener	// class@002c4b
{
    public final f b;
    public final f$a c;
    public final FrameModeInfo d;

    public void d0(f p0,f$a p1,FrameModeInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       Object[] objArray1;
       d0 tb = this.b;
       d0 td = this.d;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().s("FramePanelListAdapter", "onClick", objArray);
       if (!this.c.c.isEnabled()) {
          objArray1 = new Object[0];
          a.D().s("FramePanelListAdapter", "frame is invalid, show toast", objArray1);
          int i = (PostExperimentUtils.p())? 0x7f103146: 0x7f103145;
          i.d(R.style.arg_RES_7f11066a, a1.p(i));
       }else if(td.mFrameMode == e.k()){
          objArray1 = new Object[0];
          a.D().s("FramePanelListAdapter", "has select this frame", objArray1);
       }else {
          f h = tb.h;
          if (h != null) {
             h.a(td);
          }
       }
       return;
    }
}
