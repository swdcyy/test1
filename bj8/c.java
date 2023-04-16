package bj8.c;
import java.lang.Runnable;
import bj8.d;
import java.lang.Object;
import android.view.View;
import android.view.Window;
import bj8.b;
import zi8.d1;

public final class c implements Runnable	// class@000378
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       if (tb.b.getDecorView() != null) {
          tb.b.getDecorView().setSystemUiVisibility(tb.d);
          d1.g(new b(tb), 20);
       }
       return;
    }
}
