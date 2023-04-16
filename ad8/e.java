package ad8.e;
import java.lang.Runnable;
import ad8.g;
import ma8.g;
import java.lang.Object;
import ma8.i;
import qc8.a;
import android.text.Editable;
import android.widget.EditText;
import java.lang.String;
import bd8.a;

public final class e implements Runnable	// class@00007c
{
    public final g b;
    public final g c;

    public void e(g p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       tb.z.f.b(tb.e, tb.d, tb.s.getText().toString(), this.c);
    }
}
