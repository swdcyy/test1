package com.kwai.library.widget.specific.misc.CommonPopupView$d;
import java.lang.Runnable;
import com.kwai.library.widget.specific.misc.CommonPopupView;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.widget.specific.misc.CommonPopupView$e;

public class CommonPopupView$d implements Runnable	// class@000a0b
{
    public final CommonPopupView b;

    public void CommonPopupView$d(CommonPopupView p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.getAttachTargetView().removeView(this.b);
       CommonPopupView f = this.b.f;
       if (f != null) {
          f.b();
       }
       return;
    }
}
