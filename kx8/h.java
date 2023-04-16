package kx8.h;
import erd.g;
import com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import rkd.b;
import tkd.b;
import tkd.d;
import ayb.g;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import tra.b;
import java.lang.StringBuilder;
import q87.c;

public final class h implements g	// class@002c3e
{
    public final OperateLazyLoadFragmentContainerNew b;

    public void h(OperateLazyLoadFragmentContainerNew p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.booleanValue();
       if (PatchProxy.isSupport(OperateLazyLoadFragmentContainerNew.class) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, OperateLazyLoadFragmentContainerNew.class, "17") && (b.g() && (d.a(-908290672).sK() && tb.getActivity() != null)))) {
          if (b) {
             tb.getActivity().setRequestedOrientation(1);
          }else {
             tb.getActivity().setRequestedOrientation(tb.y);
          }
       }
       Object[] objArray = new Object[0];
       b.C().w("OperateLazyLoadFragmentContainer", "observeActive active = "+p0, objArray);
       return;
    }
}
