package k3.f;
import java.lang.String;
import k3.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.List;
import androidx.work.a;

public abstract class f	// class@002471
{
    public static final String a;

    static {
       f.a = h.f("InputMerger");
    }
    public void f(){
       super();
    }
    public static f a(String p0){
       try{
          return Class.forName(p0).newInstance();
       }catch(java.lang.Exception e0){
          Throwable[] throwableArr = new Throwable[]{e0};
          h.c().b(f.a, "Trouble instantiating + "+p0, throwableArr);
          return null;
       }
    }
    public abstract a b(List p0);
}
