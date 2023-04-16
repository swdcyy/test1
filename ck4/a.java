package ck4.a;
import ak4.a;
import ck4.a$a;
import androidx.fragment.app.FragmentActivity;
import ak4.a$a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ck4.a$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import fk4.b;
import androidx.lifecycle.ViewModel;
import u07.t$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ek4.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;

public final class a extends a	// class@000489
{

    public void a(a$a p0,FragmentActivity p1){
       super(p0, p1);
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       ViewModelProviders.of(this.f0(), new a$b(this)).get(b.class);
       super.O(p0);
       return;
    }
    public t$a b0(){
       return this.j0();
    }
    public void e0(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "2")) {
          return;
       }
       p0.U7(new b(this.f0(), this));
       PatchProxy.onMethodExit(a.class, "2");
       return;
    }
    public a$a g0(){
       return this.j0();
    }
    public int h0(){
       return 0x7f0d0302;
    }
    public a$a j0(){
       c obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.merchant.transaction.live.orderconfirmpanel.authidentity.phone.OrderConfirmPhoneDialog.Builder");
       return obj;
    }
}
