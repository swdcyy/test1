package jz8.t3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;

public class t3 extends Accessor	// class@002a52
{
    public final n c;
    public final c4 d;

    public void t3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.o;
    }
    public void set(Object p0){
       this.c.o = p0;
    }
}
