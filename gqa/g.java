package gqa.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gqa.i;
import gqa.e;
import java.lang.Object;
import java.lang.String;

public class g extends Accessor	// class@002b6a
{
    public final e c;
    public final i d;

    public void g(i p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
