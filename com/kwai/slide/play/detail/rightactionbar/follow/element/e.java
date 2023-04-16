package com.kwai.slide.play.detail.rightactionbar.follow.element.e;
import w07.l;
import java.lang.Object;
import com.kwai.library.widget.popup.bubble.a;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import lnc.a1;
import android.graphics.Typeface;

public final class e implements l	// class@001857
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void apply(Object p0){
       p0 = p0.z();
       if (p0 == null) {
       }else {
          p0 = p0.findViewById(R.id.text);
          p0.setIncludeFontPadding(false);
          p0.setPadding(a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f07033f), a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f07033f));
          p0.setTypeface(Typeface.defaultFromStyle(1));
       }
       return;
    }
}
