package ck3.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ck3.m;
import ck3.b;
import java.lang.Object;
import java.lang.Boolean;

public class g extends Accessor	// class@00057d
{
    public final b c;
    public final m d;

    public void g(m p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.d);
    }
    public void set(Object p0){
       this.c.d = p0.booleanValue();
    }
}
