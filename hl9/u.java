package hl9.u;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import android.view.View$OnClickListener;

public final class u implements Runnable	// class@0026df
{
    public final View b;

    public void u(View p0){
       this.b = p0;
    }
    public final void run(){
       this.b.setOnClickListener(null);
    }
}
