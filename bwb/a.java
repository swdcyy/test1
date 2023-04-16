package bwb.a;
import java.lang.Runnable;
import bwb.c$a;
import android.graphics.Bitmap;
import java.lang.Object;

public final class a implements Runnable	// class@0004c9
{
    public final c$a b;
    public final Bitmap c;

    public void a(c$a p0,Bitmap p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       if (tb != null) {
          tb.a(tc);
       }
       return;
    }
}
