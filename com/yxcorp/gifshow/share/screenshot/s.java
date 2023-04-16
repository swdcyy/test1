package com.yxcorp.gifshow.share.screenshot.s;
import android.content.DialogInterface$OnCancelListener;
import java.lang.Object;
import android.content.DialogInterface;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog;
import com.yxcorp.gifshow.util.rx.RxBus;
import uic.a0;

public final class s implements DialogInterface$OnCancelListener	// class@001c66
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final void onCancel(DialogInterface p0){
       RxBus.f.b(new a0(false));
    }
}
