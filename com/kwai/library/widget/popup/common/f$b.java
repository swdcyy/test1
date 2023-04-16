package com.kwai.library.widget.popup.common.f$b;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.kwai.library.widget.popup.common.e;
import java.lang.String;
import android.app.Application;
import android.view.inputmethod.InputMethodManager;

public class f$b implements Runnable	// class@000999
{
    public final WeakReference b;

    public void f$b(View p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void run(){
       View view = this.b.get();
       if (view == null) {
          return;
       }
       view.requestFocus();
       InputMethodManager systemServic = e.a.getSystemService("input_method");
       if (systemServic != null) {
          systemServic.showSoftInput(view, 1);
       }
       return;
    }
}
