package com.yxcorp.gifshow.init.module.r;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.init.module.DesignWidgetInitModule;
import android.app.Activity;
import e3a.a;
import u07.t$a;
import u07.b;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class r implements View$OnClickListener	// class@0019d7
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final void onClick(View p0){
       Activity uActivity = a.a(p0);
       if (uActivity == null) {
       }else {
          t$a uoa = new t$a(uActivity);
          uoa.W0(R.string.arg_RES_7f105048);
          uoa.y0(R.string.arg_RES_7f105053);
          uoa.S0(R.string.arg_RES_7f1012a9);
          t$a uoa1 = b.d(uoa);
          uoa1.v(true);
          uoa1.o();
          uoa1.Y(PopupInterface.a);
       }
       return;
    }
}
