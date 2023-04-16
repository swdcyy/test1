package com.google.android.material.bottomsheet.a$a;
import android.view.View$OnClickListener;
import com.google.android.material.bottomsheet.a;
import java.lang.Object;
import android.view.View;
import android.app.Dialog;

public class a$a implements View$OnClickListener	// class@001664
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       a$a tb = this.b;
       if (tb.e != null && (tb.isShowing() && this.b.e())) {
          this.b.cancel();
       }
    label_0019 :
       return;
    }
}
