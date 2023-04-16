package j5.b;
import com.airbnb.lottie.ex.model.layer.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.Layer;
import android.graphics.RectF;
import java.lang.String;
import com.airbnb.lottie.ex.model.layer.Layer$LayerType;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import a5.e;
import java.lang.Object;
import a5.g;
import e5.b;
import android.view.View;
import e5.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import m5.f;
import java.util.Set;
import java.util.Iterator;
import android.graphics.Rect;
import java.lang.Math;
import java.util.Objects;
import java.lang.Boolean;

public class b extends a	// class@002227
{
    public g A;
    public b B;
    public RectF C;
    public String w;
    public View x;
    public a y;
    public boolean z;

    public void b(f p0,Layer p1){
       g og;
       super(p0, p1);
       this.C = new RectF();
       this.w = this.o.b();
       a to = this.o;
       if (to.e == Layer$LayerType.IMAGE && !TextUtils.isEmpty(to.g)) {
          p1 = to.b;
          if (p1 != null) {
             Map map = p1.g();
             if (map != null) {
                og = map.get(to.g);
             label_0038 :
                this.A = og;
                b uob = this.n.h();
                this.B = uob;
                if (uob != null) {
                   this.x = uob.b(this.w);
                   this.y = this.B.a(this.w);
                }
                return;
             }
          }
       }
       og = null;
       goto label_0038 ;
    }
    public void j(Canvas p0,Matrix p1,int p2){
       if (this.B == null || (this.x != null && this.A != null)) {
          p0.save();
          p0.concat(p1);
          if (this.B.c(this.w)) {
             b tC = this.C;
             p0.saveLayerAlpha(tC.left, tC.top, tC.right, tC.bottom, p2);
             this.x.draw(p0);
             p0.restore();
             this.u(p0.getMatrix(), p2);
             p0.restore();
             return;
          }else {
             float f = f.c();
             int i = (int)((float)this.A.d() * f);
             int i1 = (int)((float)this.A.c() * f);
             this.x.measure(i, i1);
             this.x.layout(0, 0, i, i1);
             b tC1 = this.C;
             tC1.left = 0;
             tC1.top = 0;
             tC1.right = (float)i;
             tC1.bottom = (float)i1;
             this.x.draw(p0);
             this.u(p0.getMatrix(), p2);
             p0.restore();
             this.B.e(this.w);
          }
       }
       return;
    }
    public final void u(Matrix p0,int p1){
       b uob = this;
       b y = uob.y;
       if (y == null) {
          return;
       }
       Map map = y.a();
       if (map == null) {
          return;
       }
       float[] uofloatArray = new float[9];
       p0.getValues(uofloatArray);
       Iterator iterator = map.keySet().iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          Rect rect = uob.y.b(view);
          if (rect == null) {
             rect = new Rect();
          }
          int i = view.getRight() - view.getLeft();
          i = i / 2;
          float f = (float)i;
          int i1 = view.getBottom() - view.getTop();
          i1 = i1 / 2;
          int i2 = view.getRight() - view.getLeft();
          int i3 = view.getBottom() - view.getTop();
          int i4 = 0;
          float f1 = uofloatArray[i4] * uofloatArray[i4];
          float f2 = uofloatArray[3] * uofloatArray[3];
          f1 = f1 + f2;
          float f3 = uofloatArray[1] * uofloatArray[1];
          float f4 = uofloatArray[4] * uofloatArray[4];
          f3 = f3 + f4;
          f4 = (float)i1;
          float f5 = (float)i2 * (float)Math.sqrt((double)f1);
          float f6 = (float)i3 * (float)Math.sqrt((double)f3);
          float f7 = uofloatArray[i4] * f;
          float f8 = uofloatArray[1] * f4;
          f7 = f7 + f8;
          f7 = f7 + uofloatArray[2];
          f = f * uofloatArray[3];
          f8 = uofloatArray[4] * f4;
          f = f + f8;
          f = f + uofloatArray[5];
          f5 = f5 / 2.00f;
          f1 = f7 - f5;
          rect.left = (int)f1;
          f6 = f6 / 2.00f;
          f8 = f - f6;
          rect.top = (int)f8;
          f7 = f7 + f5;
          rect.right = (int)f7;
          f = f + f6;
          rect.bottom = (int)f;
          b y1 = uob.y;
          Objects.requireNonNull(y1);
          y1.e.put(view, rect);
          b y2 = uob.y;
          if (p1 > 0) {
             i4 = true;
          }
          y2.f.put(view, Boolean.valueOf(i4));
       }
       return;
    }
}
