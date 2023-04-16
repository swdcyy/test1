package a3.c$b$a;
import android.content.Context;
import java.lang.Object;
import a3.c$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.String;
import a3.c$a;

public class c$b$a	// class@000016
{
    public Context a;
    public String b;
    public c$a c;
    public boolean d;

    public void c$b$a(Context p0){
       super();
       this.a = p0;
    }
    public c$b a(){
       if (this.c == null) {
          throw new IllegalArgumentException("Must set a callback to create the configuration.");
       }
       if (this.a == null) {
          throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
       }
       if (this.d == null || !TextUtils.isEmpty(this.b)) {
          return new c$b(this.a, this.b, this.c, this.d);
       }
       throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
    }
    public c$b$a b(c$a p0){
       this.c = p0;
       return this;
    }
    public c$b$a c(String p0){
       this.b = p0;
       return this;
    }
    public c$b$a d(boolean p0){
       this.d = p0;
       return this;
    }
}
