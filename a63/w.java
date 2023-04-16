package a63.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a63.a0;
import a63.a$a;
import java.lang.Object;
import java.lang.Integer;

public class w extends Accessor	// class@000067
{
    public final a$a c;
    public final a0 d;

    public void w(a0 p0,a$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.intValue();
    }
}
