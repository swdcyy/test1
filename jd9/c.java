package jd9.c;
import u07.t;
import jd9.c$a;
import nsd.u;
import u07.t$a;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;

public final class c extends t	// class@002a5c
{
    public final CoverVideoView r;
    public static final c$a s;

    static {
       c.s = new c$a(null);
    }
    public void c(t$a p0,CoverVideoView p1){
       a.p(p0, "builder");
       a.p(p1, "coverVideoView");
       super(p0);
       this.r = p1;
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       super.N(p0);
       Object[] objArray = new Object[0];
       a.D().w("LipSycnhGuideDialog", "dismiss popup", objArray);
       this.r.i();
       return;
    }
    public void O(Bundle p0){
       ViewParent parent;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.O(p0);
       Object[] objArray = new Object[0];
       a.D().w("LipSycnhGuideDialog", "onShow popup", objArray);
       objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          View view = this.t(R.id.icon);
          if (view != null) {
             parent = view.getParent();
          }
          if (parent instanceof ViewGroup) {
             int i = parent.indexOfChild(view);
             if (i != -1) {
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = a1.e(186.00f);
                layoutParams.width = a1.e(145.00f);
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   layoutParams.topMargin = a1.e(40.00f);
                }
                parent.removeView(view);
                parent.addView(this.r, i, layoutParams);
             }
          }
       }
    label_006d :
       this.r.l();
       return;
    }
}
