package ekd.f$g;
import android.animation.TypeEvaluator;
import android.graphics.PointF;
import java.lang.Object;
import java.lang.Math;

public class f$g implements TypeEvaluator	// class@000d3e
{
    public PointF a;
    public PointF b;

    public void f$g(PointF p0,PointF p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       f$g og = this;
       float f = p0;
       PointF pointF = p1;
       PointF pointF1 = p2;
       double d = (double)(0x3f800000 - f);
       double d1 = (double)f;
       return new PointF((float)(((((double)pointF.x * Math.pow(d, 3.00f)) + ((double)((og.a.x * 3.00f) * f) * Math.pow(d, 2.00f))) + (((double)(og.b.x * 3.00f) * Math.pow(d1, 2.00f)) * d)) + ((double)pointF1.x * Math.pow(d1, 3.00f))), (float)(((((double)pointF.y * Math.pow(d, 3.00f)) + ((double)((og.a.y * 3.00f) * f) * Math.pow(d, 2.00f))) + (((double)(og.b.y * 3.00f) * Math.pow(d1, 2.00f)) * d)) + ((double)pointF1.y * Math.pow(d1, 3.00f))));
    }
}
