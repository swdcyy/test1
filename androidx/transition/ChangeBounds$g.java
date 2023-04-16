package androidx.transition.ChangeBounds$g;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import android.graphics.PointF;
import java.lang.Math;
import e3.w;
import java.lang.Object;

public final class ChangeBounds$g extends Property	// class@0009a9
{

    public void ChangeBounds$g(Class p0,String p1){
       super(p0, p1);
    }
    public void a(View p0,PointF p1){
       int i = Math.round(p1.x);
       int i1 = Math.round(p1.y);
       w.h(p0, i, i1, (p0.getWidth() + i), (p0.getHeight() + i1));
    }
    public Object get(Object p0){
       return null;
    }
    public void set(Object p0,Object p1){
       this.a(p0, p1);
    }
}
