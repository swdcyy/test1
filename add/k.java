package add.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import add.e0;
import com.yxcorp.plugin.search.result.a;
import java.lang.Object;
import java.lang.Boolean;

public class k extends Accessor	// class@0000ed
{
    public final a c;
    public final e0 d;

    public void k(e0 p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.r);
    }
    public void set(Object p0){
       this.c.r = p0.booleanValue();
    }
}
