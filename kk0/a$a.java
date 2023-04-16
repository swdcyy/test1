package kk0.a$a;
import java.lang.Object;
import kk0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;

public class a$a	// class@002d58
{
    public int a;
    public int b;
    public int c;
    public int d;
    public Drawable e;

    public void a$a(){
       super();
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public a$a b(Drawable p0){
       this.e = p0;
       return this;
    }
    public a$a c(int p0){
       this.d = p0;
       return this;
    }
    public a$a d(int p0){
       this.a = p0;
       return this;
    }
    public a$a e(int p0){
       this.b = p0;
       return this;
    }
    public a$a f(int p0){
       this.c = p0;
       return this;
    }
}
