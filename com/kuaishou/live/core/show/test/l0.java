package com.kuaishou.live.core.show.test.l0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import java.lang.CharSequence;
import e17.i;

public final class l0 implements View$OnClickListener	// class@0011b2
{
    public static final l0 b;

    static {
       l0.b = new l0();
    }
    public void l0(){
       super();
    }
    public final void onClick(View p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("hasShownPkRule", false);
       g.a(uEditor);
       i.d(R.style.arg_RES_7f110668, "ÒÑÇå³ý");
    }
}
