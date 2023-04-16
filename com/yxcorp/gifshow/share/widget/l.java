package com.yxcorp.gifshow.share.widget.l;
import lnc.c3$a;
import java.lang.Object;
import android.app.Dialog;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import android.view.Window;
import lnc.a1;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public final class l implements c3$a	// class@001d2b
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final void apply(Object p0){
       p0.getWindow().setLayout(a1.e(280.00f), -2);
       p0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
       p0.getWindow().setDimAmount(0.30f);
    }
}
