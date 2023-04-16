package ck3.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ck3.m;
import ck3.b;
import java.lang.Object;
import java.lang.String;

public class l extends Accessor	// class@000582
{
    public final b c;
    public final m d;

    public void l(m p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
