package nfd.p3;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Object;
import android.text.TextPaint;
import android.text.Layout;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;

public final class p3 implements Runnable	// class@001df2
{
    public final TextView b;
    public final CharSequence c;

    public void p3(TextView p0,CharSequence p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       p3 tb = this.b;
       p3 tc = this.c;
       TextPaint paint = tb.getPaint();
       if (paint == null) {
          tb.setText(tc);
       }else {
          tb.setText(TextUtils.ellipsize(tc, paint, (float)((tb.getWidth() * tb.getMaxLines()) - (int)Layout.getDesiredWidth("¡¡...", paint)), TextUtils$TruncateAt.END));
       }
       return;
    }
}
