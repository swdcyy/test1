package a1d.k$d;
import erd.g;
import a1d.k;
import java.lang.Object;
import com.yxcorp.login.http.response.SmsSendResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.EditText;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.TextView;
import android.content.res.Resources;
import v0d.m$b;
import v0d.m;

public class k$d implements g	// class@000035
{
    public final k b;

    public void k$d(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, k.class, "15")) {
             k a = p0.A;
             if (a != null) {
                a.requestFocus();
                n.b0(p0.getContext(), p0.A, true);
             }
          }
          p0 = this.b.B;
          if (p0 != null) {
             p0.setEnabled(false);
             p0 = this.b;
             p0.B.setTextColor(p0.l8().getColor(R.color.arg_RES_7f061eed));
             p0 = this.b;
             p0.G.b(60, p0.J);
          }
       }
       return;
    }
}
