package cd8.b;
import cd8.f;
import com.mini.js.jscomponent.keyboard.KeyboardHeightCalculatePopupWindow$a;
import ma8.i;
import android.widget.EditText;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import cd8.f$a;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import cd8.a;
import java.lang.Runnable;
import zi8.d1;

public class b implements f, KeyboardHeightCalculatePopupWindow$a	// class@0003f3
{
    public final EditText a;
    public f$a b;
    public final i c;

    public void b(i p0,EditText p1,int p2){
       super();
       this.c = p0;
       this.a = p1;
       p1.setInputType((p1.getInputType() | p2));
    }
    public void a(boolean p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       uob = this.b;
       if (uob == null) {
          return;
       }
       if (p0) {
          uob.d(this, p1);
       }else {
          uob.h(this);
       }
       return;
    }
    public void p2(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.clearFocus();
       InputMethodManager systemServic = this.a.getContext().getSystemService("input_method");
       if (systemServic != null) {
          systemServic.hideSoftInputFromWindow(this.a.getWindowToken(), 0);
       }
       return;
    }
    public void q2(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       d1.f(new a(this));
       return;
    }
    public void r2(f$a p0){
       this.b = null;
    }
    public void s2(f$a p0){
       this.b = p0;
    }
}
