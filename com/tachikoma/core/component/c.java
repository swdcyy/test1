package com.tachikoma.core.component.c;
import android.view.View$OnClickListener;
import com.tachikoma.core.component.e;
import java.lang.Object;
import android.view.View;
import wo8.e;
import java.lang.String;
import sp8.b$a;

public final class c implements View$OnClickListener	// class@000d65
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       if (tb.i != null) {
       }else {
          tb.dispatchEvent("tap", new e(tb));
       }
       return;
    }
}
