package c12.p;
import of5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;

public class p extends c	// class@0004aa
{
    public static String sLivePresenterClassName = "LiveSideBarRecyclerViewPresenter";

    public void p(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       super.F8();
       if (!e.s(this.getActivity())) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.topMargin = layoutParams.topMargin + a1.d(0x7f070307);
          this.p.setLayoutParams(layoutParams);
       }
       return;
    }
}
