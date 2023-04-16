package cdd.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cdd.c;
import cdd.g$a;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;

public class a extends Accessor	// class@00052b
{
    public final g$a c;
    public final c d;

    public void a(c p0,g$a p1){
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
