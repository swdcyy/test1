package ged.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.m;
import ged.g;
import java.lang.Object;
import com.yxcorp.plugin.search.utils.f0$c;

public class j extends Accessor	// class@002ac8
{
    public final g c;
    public final m d;

    public void j(m p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
