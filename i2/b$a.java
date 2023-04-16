package i2.b$a;
import i2.b$b;
import android.widget.EditText;
import i2.h;
import android.text.TextWatcher;
import android.text.Editable$Factory;
import i2.c;
import android.text.method.KeyListener;
import i2.f;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import i2.d;
import android.widget.TextView;

public class b$a extends b$b	// class@002164
{
    public final EditText a;
    public final h b;

    public void b$a(EditText p0){
       super();
       this.a = p0;
       h oh = new h(p0);
       this.b = oh;
       p0.addTextChangedListener(oh);
       p0.setEditableFactory(c.getInstance());
    }
    public KeyListener a(KeyListener p0){
       if (p0 instanceof f) {
          return p0;
       }
       return new f(p0);
    }
    public InputConnection b(InputConnection p0,EditorInfo p1){
       if (p0 instanceof d) {
          return p0;
       }
       return new d(this.a, p0, p1);
    }
    public void c(int p0){
       this.b.b(p0);
    }
    public void d(int p0){
       this.b.c(p0);
    }
}
