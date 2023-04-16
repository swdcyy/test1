package bh8.f;
import android.view.View$OnFocusChangeListener;
import bh8.m;
import android.view.View;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import android.os.IBinder;
import android.widget.EditText;
import android.content.Context;
import java.lang.String;
import android.view.inputmethod.InputMethodManager;
import zi8.m1;

public final class f implements View$OnFocusChangeListener	// class@000364
{
    public final m b;
    public final View c;
    public final PlcModel d;

    public void f(m p0,View p1,PlcModel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onFocusChange(View p0,boolean p1){
       InputMethodManager systemServic;
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       String str = "input_method";
       if (!p1) {
          if (tb.e.getWindowToken() != null) {
             systemServic = tb.e.getContext().getSystemService(str);
             if (systemServic != null) {
                systemServic.hideSoftInputFromWindow(tb.e.getWindowToken(), 2);
             }
             tb.f((- m1.a(161.00f)), 0, tc);
          }
       }else if(tb.a == null){
          tb.e.requestFocus();
          systemServic = tb.e.getContext().getSystemService(str);
          if (systemServic != null) {
             systemServic.showSoftInput(tb.e, 1);
          }
          tb.f(0, (- m1.a(161.00f)), tc);
       }
       tb.c(td.j, td.d);
       return;
    }
}
