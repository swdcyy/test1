package e3.w$b;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import android.graphics.Rect;
import a2.i0;
import java.lang.Object;

public final class w$b extends Property	// class@001ef6
{

    public void w$b(Class p0,String p1){
       super(p0, p1);
    }
    public Rect a(View p0){
       return i0.u(p0);
    }
    public void b(View p0,Rect p1){
       i0.z0(p0, p1);
    }
    public Object get(Object p0){
       return this.a(p0);
    }
    public void set(Object p0,Object p1){
       this.b(p0, p1);
    }
}
