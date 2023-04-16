package led.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import led.l;
import led.m$a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;

public class i extends Accessor	// class@001c24
{
    public final m$a c;
    public final l d;

    public void i(l p0,m$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
