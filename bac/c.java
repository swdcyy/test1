package bac.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.g;
import bac.i$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c extends Accessor	// class@0003fb
{
    public final i$a c;
    public final g d;

    public void c(g p0,i$a p1){
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
