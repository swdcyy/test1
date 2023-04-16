package hl9.v;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import android.view.View$OnLongClickListener;

public final class v implements Runnable	// class@0026e0
{
    public final View b;

    public void v(View p0){
       this.b = p0;
    }
    public final void run(){
       this.b.setOnLongClickListener(null);
    }
}
