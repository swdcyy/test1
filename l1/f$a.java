package l1.f$a;
import java.lang.String;
import java.lang.Object;
import java.util.HashSet;
import android.os.Bundle;
import java.lang.IllegalArgumentException;
import l1.f;
import java.lang.CharSequence;
import java.util.Set;

public final class f$a	// class@0024f3
{
    public final String a;
    public final Set b;
    public final Bundle c;
    public CharSequence d;
    public CharSequence[] e;
    public boolean f;
    public int g;

    public void f$a(String p0){
       super();
       this.b = new HashSet();
       this.c = new Bundle();
       this.f = true;
       this.g = 0;
       if (p0 == null) {
          throw new IllegalArgumentException("Result key can\'t be null");
       }
       this.a = p0;
       return;
    }
    public f$a a(Bundle p0){
       if (p0 != null) {
          this.c.putAll(p0);
       }
       return this;
    }
    public f b(){
       f uof = new f(this.a, this.d, this.e, this.f, this.g, this.c, this.b);
       return v8;
    }
    public f$a c(boolean p0){
       this.f = p0;
       return this;
    }
    public f$a d(CharSequence[] p0){
       this.e = p0;
       return this;
    }
    public f$a e(int p0){
       this.g = p0;
       return this;
    }
    public f$a f(CharSequence p0){
       this.d = p0;
       return this;
    }
}
