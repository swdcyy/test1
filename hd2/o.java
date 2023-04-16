package hd2.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.pk.m;
import com.kuaishou.live.core.show.pk.k;
import java.lang.Object;
import com.kuaishou.live.core.show.pk.n;

public class o extends Accessor	// class@002d6e
{
    public final k c;
    public final m d;

    public void o(m p0,k p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.E;
    }
    public void set(Object p0){
       this.c.E = p0;
    }
}
