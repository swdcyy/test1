package c5c.j;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import crd.b;
import lnc.b9;

public final class j implements g	// class@000529
{
    public final e b;

    public void j(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.R8(tb.u);
       }else {
          tb.u = null;
       }
       b9.a(tb.v);
       return;
    }
}
