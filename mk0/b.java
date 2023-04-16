package mk0.b;
import java.lang.Runnable;
import mk0.c;
import android.view.View;
import java.lang.Object;
import android.app.Activity;
import android.widget.PopupWindow;
import java.lang.StringBuilder;
import java.lang.String;
import ek0.d;

public final class b implements Runnable	// class@00318d
{
    public final c b;
    public final View c;

    public void b(c p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       if (!tb.b.isFinishing()) {
          tb.showAtLocation(tc, 0, 0, 0);
          d.e("execute showAtLocation,parent window: "+tb.c.toString()+" and popupWindow: "+tb.hashCode());
       }
       return;
    }
}
