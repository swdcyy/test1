package hj2.c;
import android.view.View$OnClickListener;
import hj2.e;
import java.lang.Object;
import android.view.View;
import hj2.e$a;

public final class c implements View$OnClickListener	// class@002dac
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e f = this.b.F;
       if (f != null) {
          f.b();
       }
       return;
    }
}
