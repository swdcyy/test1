package com.yxcorp.gifshow.detail.network.feedback.h;
import w07.l;
import java.lang.Object;
import u07.t;
import b2a.d;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import lnc.a1;

public final class h implements l	// class@0015c2
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final void apply(Object p0){
       p0 = p0.z().findViewById(R.id.content);
       if (p0 != null) {
          p0.setGravity(3);
          p0.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f6a));
       }
       return;
    }
}
