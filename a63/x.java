package a63.x;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a63.a0;
import a63.a$a;
import java.lang.Object;
import com.yxcorp.gifshow.model.PreviewModel;

public class x extends Accessor	// class@000068
{
    public final a$a c;
    public final a0 d;

    public void x(a0 p0,a$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
