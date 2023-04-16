package bja.v;
import java.util.concurrent.Callable;
import r26.c;
import r26.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public final class v implements Callable	// class@0003f6
{
    public final c b;
    public final a c;

    public void v(c p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       return this.b.LC(this.c, false);
    }
}
