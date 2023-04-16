package dwa.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dwa.u;
import dwa.k;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class m extends Accessor	// class@002596
{
    public final k c;
    public final u d;

    public void m(u p0,k p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h;
    }
    public void set(Object p0){
       this.c.h = p0;
    }
}
