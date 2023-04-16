package j5.e;
import com.airbnb.lottie.ex.model.layer.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.Layer;
import i5.i;
import java.lang.String;
import java.util.List;
import c5.d;
import java.util.Collections;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Canvas;
import g5.d;

public class e extends a	// class@00222a
{
    public final d w;

    public void e(f p0,Layer p1){
       super(p0, p1);
       d uod = new d(p0, this, new i("__container", p1.a, false));
       this.w = uod;
       uod.b(Collections.emptyList(), Collections.emptyList());
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       super.c(p0, p1, p2);
       this.w.c(p0, this.m, p2);
    }
    public void j(Canvas p0,Matrix p1,int p2){
       this.w.a(p0, p1, p2);
    }
    public void q(d p0,int p1,List p2,d p3){
       this.w.g(p0, p1, p2, p3);
    }
}
