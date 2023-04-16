package a1d.f;
import android.view.View$OnClickListener;
import a1d.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import android.text.Editable;
import android.widget.EditText;
import wkd.b;
import m1d.a;
import m1d.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import brd.t;
import cjd.e;
import erd.o;
import a1d.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e17.i;

public final class f implements View$OnClickListener	// class@000024
{
    public final k b;

    public void f(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, k.class, "9")) {
       }else if(tb.D == null || tb.F != null){
          i.a(R.style.arg_RES_7f11066a, 0x7f10481c);
       }else if(TextUtils.x(tb.u.getText()) || TextUtils.x(tb.z.getText())){
          String str = TextUtils.G(tb.z).toString();
          a uoa = b.a(0x5cfaafff);
          String str1 = PatchProxy.apply(objArray, objArray, e.class, "6");
          if (str1 != PatchProxyResult.class) {
          }else {
             str1 = e.a()+"/oauth2/sms/native/send";
          }
          tb.X7(uoa.O(str1, str).map(new e()).subscribe(tb.I, new i(tb)));
       }
       return;
    }
}
