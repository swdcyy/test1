package ged.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.f;
import ged.b;
import java.lang.Object;
import com.yxcorp.plugin.search.utils.f0$c;

public class d extends Accessor	// class@002ac2
{
    public final b c;
    public final f d;

    public void d(f p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
