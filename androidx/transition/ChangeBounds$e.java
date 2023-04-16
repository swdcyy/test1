package androidx.transition.ChangeBounds$e;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import android.graphics.PointF;
import java.lang.Math;
import e3.w;
import java.lang.Object;

public final class ChangeBounds$e extends Property	// class@0009a7
{

    public void ChangeBounds$e(Class p0,String p1){
       super(p0, p1);
    }
    public void a(View p0,PointF p1){
       w.h(p0, p0.getLeft(), p0.getTop(), Math.round(p1.x), Math.round(p1.y));
    }
    public Object get(Object p0){
       return null;
    }
    public void set(Object p0,Object p1){
       this.a(p0, p1);
    }
}
