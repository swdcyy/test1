package eub.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eub.h;
import eub.i$a;
import java.lang.Object;
import java.lang.Boolean;

public class f extends Accessor	// class@00281f
{
    public final i$a c;
    public final h d;

    public void f(h p0,i$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.e);
    }
}
