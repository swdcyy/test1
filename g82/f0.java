package g82.f0;
import java.lang.Runnable;
import g82.v$g;
import android.view.View;
import java.lang.Object;
import g82.v;
import android.widget.RelativeLayout;
import lnc.a1;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import oe6.g;
import g82.g0;
import android.view.View$OnClickListener;

public final class f0 implements Runnable	// class@002a9c
{
    public final v$g b;
    public final View c;

    public void f0(v$g p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f0 tb = this.b;
       f0 tc = this.c;
       int[] ointArray = new int[2];
       tb.c.B.getLocationOnScreen(ointArray);
       tc.setTranslationX((((float)ointArray[0] - ((float)tc.getWidth() / 2.00f)) + (float)a1.e(15.00f)));
       tc.findViewById(R.id.arrow).setX((((float)tc.getWidth() / 2.00f) - (float)a1.e(5.00f)));
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"LiveGzoneGiftSendTipHasShowed", true);
       g.a(uEditor);
       tc.setOnClickListener(new g0(tb));
    }
}
