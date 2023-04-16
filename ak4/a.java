package ak4.a;
import u07.t;
import ak4.a$a;
import androidx.fragment.app.FragmentActivity;
import u07.t$a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import fk4.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import android.os.Bundle;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.MutableLiveData;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import xm4.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import android.widget.TextView;
import java.lang.CharSequence;
import java.util.Objects;

public abstract class a extends t	// class@00008e
{
    public PresenterV2 r;
    public a s;
    public FragmentActivity t;

    public void a(a$a p0,FragmentActivity p1){
       super(p0);
       this.t = p1;
       this.s = ViewModelProviders.of(p1).get(a.class);
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.N(p0);
       a tr = this.r;
       if (tr != null) {
          tr.destroy();
       }
       this.r = null;
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.O(p0);
       this.s.p0().setValue(this.g0().C0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, a.class, "6")) {
          FrameLayout uFrameLayout = this.t(R.id.order_confirm_auth_container);
          ViewGroup viewGroup = this.t(R.id.order_confirm_auth_root);
          if (uFrameLayout != null) {
             uFrameLayout.addView(a.e(uFrameLayout, this.h0()));
          }
          if (viewGroup != null) {
             PresenterV2 presenterV2 = new PresenterV2();
             this.r = presenterV2;
             this.e0(presenterV2);
             presenterV2.f(viewGroup);
             Object[] objArray1 = new Object[1];
             ArrayList uArrayList = PatchProxy.apply(objArray, this, a.class, "3");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = new ArrayList();
             }
             objArray1[0] = uArrayList;
             presenterV2.i(objArray1);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          TextView textView = this.t(R.id.order_confirm_submit);
          if (textView != null) {
             textView.setText(this.g0().B0);
          }
       }
       return;
    }
    public t$a b0(){
       return this.g0();
    }
    public abstract void e0(PresenterV2 p0);
    public final FragmentActivity f0(){
       return this.t;
    }
    public a$a g0(){
       c obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.merchant.transaction.live.orderconfirmpanel.authidentity.BaseOrderConfirmAuthIdentityDialog.Builder");
       return obj;
    }
    public abstract int h0();
    public final a i0(){
       return this.s;
    }
}
