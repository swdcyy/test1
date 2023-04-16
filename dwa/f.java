package dwa.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dwa.h;
import dwa.b;
import java.lang.Object;
import java.lang.String;

public class f extends Accessor	// class@00258f
{
    public final b c;
    public final h d;

    public void f(h p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
