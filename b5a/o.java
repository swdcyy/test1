package b5a.o;
import android.view.View$OnClickListener;
import b5a.q;
import java.lang.Object;
import android.view.View;
import b5a.k;

public final class o implements View$OnClickListener	// class@000374
{
    public final q b;

    public void o(q p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       tb.c();
       q m = tb.m;
       if (m != null) {
          m.a();
       }
       return;
    }
}
