package ged.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.m;
import ged.g;
import java.lang.Object;
import java.lang.Integer;

public class i extends Accessor	// class@002ac7
{
    public final g c;
    public final m d;

    public void i(m p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.d);
    }
    public void set(Object p0){
       this.c.d = p0.intValue();
    }
}
