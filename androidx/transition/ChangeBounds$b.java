package androidx.transition.ChangeBounds$b;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.PointF;
import java.lang.Math;
import java.lang.Object;

public final class ChangeBounds$b extends Property	// class@0009a4
{
    public Rect a;

    public void ChangeBounds$b(Class p0,String p1){
       super(p0, p1);
       this.a = new Rect();
    }
    public PointF a(Drawable p0){
       p0.copyBounds(this.a);
       ChangeBounds$b ta = this.a;
       return new PointF((float)ta.left, (float)ta.top);
    }
    public void b(Drawable p0,PointF p1){
       p0.copyBounds(this.a);
       this.a.offsetTo(Math.round(p1.x), Math.round(p1.y));
       p0.setBounds(this.a);
    }
    public Object get(Object p0){
       return this.a(p0);
    }
    public void set(Object p0,Object p1){
       this.b(p0, p1);
    }
}
