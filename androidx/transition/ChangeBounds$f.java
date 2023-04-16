package androidx.transition.ChangeBounds$f;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import android.graphics.PointF;
import java.lang.Math;
import e3.w;
import java.lang.Object;

public final class ChangeBounds$f extends Property	// class@0009a8
{

    public void ChangeBounds$f(Class p0,String p1){
       super(p0, p1);
    }
    public void a(View p0,PointF p1){
       w.h(p0, Math.round(p1.x), Math.round(p1.y), p0.getRight(), p0.getBottom());
    }
    public Object get(Object p0){
       return null;
    }
    public void set(Object p0,Object p1){
       this.a(p0, p1);
    }
}
