package bja.u;
import java.util.concurrent.Callable;
import r26.a;
import java.lang.Object;
import r26.c;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import com.yxcorp.gifshow.entity.QPhoto;

public final class u implements Callable	// class@0003f5
{
    public final a b;

    public void u(a p0){
       this.b = p0;
    }
    public final Object call(){
       return y6.r(c.class).LC(this.b, false);
    }
}
