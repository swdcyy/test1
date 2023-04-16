package h33.f;
import erd.g;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.ContactsEmptyException;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import h33.p;
import u07.u;
import h33.s;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public final class f implements g	// class@002c21
{
    public final y b;
    public final SlipSwitchButton c;

    public void f(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 instanceof ContactsEmptyException && !ContactPermissionHolder.f()) {
          p0 = new d(tb.b);
          p0.b1(KwaiDialogOption.d);
          p0.W0(R.string.arg_RES_7f104233);
          int i = (tb.e())? 0x7f103e24: 0x7f104231;
          p0.y0(i);
          p0.S0(R.string.arg_RES_7f104232);
          p0.Q0(R.string.cancel);
          p0.t0(new p(tb, tc));
          p0.u0(new s(tb, tc));
          p0.z(false);
          j.d(p0);
       }
       return;
    }
}
