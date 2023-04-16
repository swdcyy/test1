package hl9.a0;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.Object;
import android.text.Layout;
import java.lang.Math;

public final class a0 implements Runnable	// class@0026c1
{
    public final TextView b;

    public void a0(TextView p0){
       this.b = p0;
    }
    public final void run(){
       a0 tb = this.b;
       if (tb.getLayout() == null) {
       }else {
          tb.scrollTo(0, tb.getLayout().getLineTop(Math.max(0, (tb.getLineCount() - 4))));
       }
       return;
    }
}
