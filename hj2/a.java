package hj2.a;
import android.view.View$OnClickListener;
import hj2.e;
import java.lang.Object;
import android.view.View;
import hj2.e$a;

public final class a implements View$OnClickListener	// class@002daa
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e f = this.b.F;
       if (f != null) {
          f.a();
       }
       return;
    }
}
