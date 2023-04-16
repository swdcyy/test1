package bwc.l$a;
import com.yxcorp.gifshow.widget.m;
import bwc.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import ekd.j0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.mixed.model.b;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collections;
import a17.c$a;
import bwc.k;
import a17.b$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class l$a extends m	// class@0004af
{
    public final l c;

    public void l$a(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       GifshowActivity activity = this.c.getActivity();
       if (activity == null) {
          return;
       }
       boolean b = j0.a(activity.getIntent(), "use_long_video_limit", false);
       b uob = ViewModelProviders.of(activity).get(b.class);
       if (b) {
          boolean b1 = true;
          if (uob.u0() - (double)((float)LongVideoLocalProject.e(b1) / 1000.00f) > 0) {
             c$a uoa = new c$a(activity);
             uoa.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f103c3a), SheetItemStatus.Primary)));
             uoa.h0(a1.p(R.string.cancel));
             Object[] objArray = new Object[b1];
             objArray[0] = String.valueOf(LongVideoLocalProject.f());
             uoa.m0(R.string.arg_RES_7f1045fe, objArray);
             uoa.i0(new k(this, b, uob));
             f.a(uoa).Y(PopupInterface.a);
          label_008e :
             return;
          }
       }
       this.c.P8(b, uob);
       goto label_008e ;
    }
}
