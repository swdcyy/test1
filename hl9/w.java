package hl9.w;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import android.view.View$OnTouchListener;

public final class w implements Runnable	// class@0026e1
{
    public final View b;

    public void w(View p0){
       this.b = p0;
    }
    public final void run(){
       this.b.setOnTouchListener(null);
    }
}
