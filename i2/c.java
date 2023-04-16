package i2.c;
import android.text.Editable$Factory;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import java.lang.CharSequence;
import android.text.Editable;
import androidx.emoji.widget.a;

public final class c extends Editable$Factory	// class@002167
{
    public static final Object a;
    public static Editable$Factory b;
    public static Class c;

    static {
       c.a = new Object();
    }
    public void c(){
       super();
       c.c = c.class.getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
    }
    public static Editable$Factory getInstance(){
       if (c.b == null) {
          Object a = c.a;
          _monitor_enter(a);
          if (c.b == null) {
             c.b = new c();
          }
          _monitor_exit(a);
       }
       return c.b;
    }
    public Editable newEditable(CharSequence p0){
       Class c = c.c;
       if (c != null) {
          return a.c(c, p0);
       }
       return super.newEditable(p0);
    }
}
