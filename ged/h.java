package ged.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.m;
import ged.g;
import java.lang.Object;
import android.graphics.Rect;

public class h extends Accessor	// class@002ac6
{
    public final g c;
    public final m d;

    public void h(m p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
