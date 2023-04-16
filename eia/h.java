package eia.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eia.o;
import eia.a;
import java.lang.Object;
import java.lang.Integer;

public class h extends Accessor	// class@002690
{
    public final a c;
    public final o d;

    public void h(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.k);
    }
}
