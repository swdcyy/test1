package jz8.i2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import android.view.TextureView;

public class i2 extends Accessor	// class@002a0f
{
    public final n c;
    public final c4 d;

    public void i2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.l2;
    }
    public void set(Object p0){
       this.c.l2 = p0;
    }
}
