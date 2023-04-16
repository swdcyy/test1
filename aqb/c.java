package aqb.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import aqb.i;
import aqb.a;
import java.lang.Object;
import brd.t;

public class c extends Accessor	// class@0002be
{
    public final a c;
    public final i d;

    public void c(i p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
