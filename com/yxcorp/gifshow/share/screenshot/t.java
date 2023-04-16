package com.yxcorp.gifshow.share.screenshot.t;
import android.content.DialogInterface$OnShowListener;
import java.lang.Object;
import android.content.DialogInterface;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog;
import com.yxcorp.gifshow.util.rx.RxBus;
import uic.a0;

public final class t implements DialogInterface$OnShowListener	// class@001c67
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void onShow(DialogInterface p0){
       RxBus.f.b(new a0(true));
    }
}
