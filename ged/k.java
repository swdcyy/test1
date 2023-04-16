package ged.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.m;
import ged.g;
import java.lang.Object;
import android.graphics.Rect;

public class k extends Accessor	// class@002ac9
{
    public final g c;
    public final m d;

    public void k(m p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
