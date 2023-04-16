package d59.d;
import android.view.View$OnClickListener;
import d59.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import im8.f;
import c59.l;
import java.util.Objects;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import nsd.u;
import d59.g;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.DialogFragment;
import java.lang.Throwable;
import yx.j0;

public final class d implements View$OnClickListener	// class@002047
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       c r = this.b.r;
       if (r == null) {
          a.S("mMKPageJsonInfo");
       }
       l ol = r.get();
       FragmentActivity uFragmentAct = null;
       String str = (ol != null)? ol.a(): uFragmentAct;
       d tb = this.b;
       if (str == null) {
          str = "";
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(str, tb, c.class, "11")) {
          BottomSheetContainerFragment uBottomSheet = new BottomSheetContainerFragment();
          Activity activity = tb.getActivity();
          a.m(activity);
          BottomSheetContainerFragment$a uoa = new BottomSheetContainerFragment$a(0, 0, ((n.j(activity) / 10) * 8), 0, false, false, false, 59, null);
          uBottomSheet.Xg(new g(tb, str));
          uBottomSheet.Wg(v13);
          Activity activity1 = tb.getActivity();
          if (activity1 instanceof GifshowActivity) {
             uFragmentAct = activity1;
          }
          if (uFragmentAct != null) {
             try{
                uBottomSheet.show(uFragmentAct.getSupportFragmentManager(), "ad_mk_debug");
             }catch(java.lang.IllegalStateException e15){
                j0.b("AdMKDebugToolPresenter", "Please check if activity state ok", e15);
             }
          }
       }
    }
}
