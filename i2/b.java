package i2.b;
import android.widget.EditText;
import java.lang.Object;
import z1.h;
import i2.b$a;
import android.text.method.KeyListener;
import i2.b$b;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import java.lang.String;

public final class b	// class@002166
{
    public final b$b a;
    public int b;
    public int c;

    public void b(EditText p0){
       super();
       this.b = Integer.MAX_VALUE;
       this.c = 0;
       h.h(p0, "editText cannot be null");
       this.a = new b$a(p0);
    }
    public int a(){
       return this.c;
    }
    public KeyListener b(KeyListener p0){
       h.h(p0, "keyListener cannot be null");
       return this.a.a(p0);
    }
    public int c(){
       return this.b;
    }
    public InputConnection d(InputConnection p0,EditorInfo p1){
       if (p0 == null) {
          return null;
       }
       return this.a.b(p0, p1);
    }
    public void e(int p0){
       this.c = p0;
       this.a.c(p0);
    }
    public void f(int p0){
       h.e(p0, "maxEmojiCount should be greater than 0");
       this.b = p0;
       this.a.d(p0);
    }
}
