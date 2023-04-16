package bx9.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bx9.g;
import bx9.i$c;
import java.lang.Object;
import android.app.Activity;

public class b extends Accessor	// class@0004fc
{
    public final i$c c;
    public final g d;

    public void b(g p0,i$c p1){
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
