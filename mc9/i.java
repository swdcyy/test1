package mc9.i;
import erd.o;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import java.lang.Object;
import java.lang.Throwable;
import ic9.a;
import java.lang.Float;
import brd.t;

public final class i implements o	// class@002e48
{
    public final c b;

    public void i(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = (this.b.h != null)? t.just(Float.valueOf(a.i)): t.error(p0);
       return p0;
    }
}
