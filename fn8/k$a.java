package fn8.k$a;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import fn8.k;
import java.lang.Object;
import android.view.ScaleGestureDetector;
import java.lang.Math;
import fn8.b;

public class k$a implements ScaleGestureDetector$OnScaleGestureListener	// class@00232b
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public boolean onScale(ScaleGestureDetector p0){
       k$a ta = this.a;
       k c = ta.C;
       ta.C = (double)p0.getScaleFactor() * c;
       long timeDelta = p0.getTimeDelta();
       if (timeDelta - null > 0) {
          ta = this.a;
          ta.D = (ta.C - c) / (double)timeDelta;
       }
       ta = this.a;
       if (Math.abs((this.a.E - p0.getCurrentSpan())) - ta.F >= 0 && ta.k() == 2) {
          this.a.a();
       }
       return true;
    }
    public boolean onScaleBegin(ScaleGestureDetector p0){
       this.a.E = p0.getCurrentSpan();
       return true;
    }
    public void onScaleEnd(ScaleGestureDetector p0){
    }
}
