package mh.a$a;
import d6a.a;
import mh.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wt5.g;
import au5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.FragmentActivity;
import tkd.b;
import tkd.d;
import vt5.c;
import nh.a;
import ok.x;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM$a;

public final class a$a extends a	// class@002687
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       b.e().h(this.b.getActivity(), null);
       return;
    }
    public void i2(){
       int b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       b.e().h(this.b.getActivity(), this.b.P8());
       Activity activity = this.b.getActivity();
       if (activity instanceof FragmentActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          b = d.a(0x2e5315fc).eJ(this.b.getActivity(), this.b.P8());
          boolean b1 = this.b.R8();
          Object obj = a.a.get();
          a.o(obj, "mEnableHidePendantWithSerialAutoPlay.get\(\)");
          if (obj.booleanValue() && b) {
             if (!b1) {
                a t = this.b.t;
                b = (t != null)? t.c(): -1;
                if (b != 3) {
                   b = false;
                label_0078 :
                   PendantPlayerStateVM.Companion.a(objArray).notifyAutoPlayerState(b);
                }
             }
             b = true;
             goto label_0078 ;
          }else {
             PendantPlayerStateVM.Companion.a(objArray).notifyAutoPlayerState(b1);
          }
       }
       return;
    }
}
