package cxb.i;
import erd.o;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.video.c;
import brd.t;

public final class i implements o	// class@002094
{
    public final List b;
    public final String c;
    public final String d;
    public final float e;

    public void i(List p0,String p1,String p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       return p0.NB(this.b, this.c, this.d, this.e);
    }
}
