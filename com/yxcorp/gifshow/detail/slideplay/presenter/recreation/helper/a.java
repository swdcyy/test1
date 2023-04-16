package com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.a;
import w07.l;
import java.lang.Object;
import com.kwai.library.widget.popup.bubble.a;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import lnc.a1;

public final class a implements l	// class@001863
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void apply(Object p0){
       p0 = p0.z();
       if (p0 == null) {
       }else {
          p0 = p0.findViewById(R.id.text);
          if (p0 != null) {
             p0.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f70));
             p0.setCompoundDrawablePadding(0);
             p0.setPadding(a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.pv), a1.d(R.dimen.arg_RES_7f07034b), a1.d(R.dimen.pv));
          }
       }
       return;
    }
}
