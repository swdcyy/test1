package bua.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bua.g;
import bua.d;
import java.lang.Object;
import java.lang.Boolean;

public class e extends Accessor	// class@000475
{
    public final d c;
    public final g d;

    public void e(g p0,d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.u;
    }
    public void set(Object p0){
       this.c.u = p0;
    }
}
