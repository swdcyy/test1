package bh8.c;
import android.view.View$OnClickListener;
import bh8.m;
import android.view.View;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import android.widget.EditText;
import android.content.Context;
import java.lang.String;
import android.view.inputmethod.InputMethodManager;
import zi8.m1;

public final class c implements View$OnClickListener	// class@000361
{
    public final m b;
    public final View c;
    public final PlcModel d;

    public void c(m p0,View p1,PlcModel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       if (tb.a == null) {
          tb.e.requestFocus();
          InputMethodManager systemServic = tb.e.getContext().getSystemService("input_method");
          if (systemServic != null) {
             systemServic.showSoftInput(tb.e, 1);
          }
          tb.f(0, (- m1.a(94.00f)), tc);
       }
       tb.c(td.j, td.d);
       return;
    }
}
