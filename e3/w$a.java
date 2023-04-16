package e3.w$a;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import java.lang.Float;
import e3.w;
import java.lang.Object;

public final class w$a extends Property	// class@001ef5
{

    public void w$a(Class p0,String p1){
       super(p0, p1);
    }
    public Float a(View p0){
       return Float.valueOf(w.d(p0));
    }
    public void b(View p0,Float p1){
       w.i(p0, p1.floatValue());
    }
    public Object get(Object p0){
       return this.a(p0);
    }
    public void set(Object p0,Object p1){
       this.b(p0, p1);
    }
}
