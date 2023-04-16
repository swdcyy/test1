package com.yxcorp.gifshow.dialog.kem.h$b$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.dialog.kem.h$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public final class h$b$b implements View$OnClickListener	// class@001abb
{
    public final h$b b;

    public void h$b$b(h$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h$b$b.class, "1")) {
          return;
       }
       h$b.c(this.b).q(3);
       PatchProxy.onMethodExit(h$b$b.class, "1");
       return;
    }
}
