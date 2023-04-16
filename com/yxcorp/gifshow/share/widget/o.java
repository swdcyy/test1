package com.yxcorp.gifshow.share.widget.o;
import lnc.c3$a;
import java.lang.Object;
import android.app.Dialog;
import com.yxcorp.gifshow.share.widget.KwaiUploadShareDialog;
import android.view.Window;
import lnc.a1;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public final class o implements c3$a	// class@001d2e
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final void apply(Object p0){
       p0.getWindow().setLayout(a1.e(280.00f), -2);
       p0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
       p0.getWindow().setDimAmount(0.30f);
    }
}
