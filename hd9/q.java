package hd9.q;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.BlurMaskFilter;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import lnc.a1;
import qrd.l1;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Path;
import android.graphics.RectF;
import java.lang.Boolean;
import android.view.ViewParent;
import java.util.Objects;

public final class q	// class@002628
{
    public boolean a;
    public int b;
    public final Paint c;
    public final ViewGroup d;

    public void q(ViewGroup p0){
       a.p(p0, "sampleView");
       super();
       this.d = p0;
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       paint.setStyle(Paint$Style.FILL);
       paint.setMaskFilter(new BlurMaskFilter(p0.getResources().getDimension(R.dimen.arg_RES_7f07031d), BlurMaskFilter$Blur.OUTER));
       paint.setColor(a1.a(R.color.arg_RES_7f062040));
       this.b = a1.d(0x7f07034b);
       this.c = paint;
    }
    public final void a(Canvas p0){
       Path path;
       Object obj = this;
       Object obj1 = p0;
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, oq, "3")) {
          return;
       }
       a.p(obj1, "canvas");
       if (obj.a == null) {
          return;
       }
       float f = (float)obj.d.getPaddingLeft();
       float f1 = (float)obj.d.getPaddingTop();
       float f2 = ((float)obj.d.getWidth() - (float)obj.d.getPaddingLeft()) - (float)obj.d.getPaddingRight();
       float f3 = ((float)obj.d.getHeight() - (float)obj.d.getPaddingTop()) - (float)obj.d.getPaddingBottom();
       q b = obj.b;
       float f4 = (float)b;
       float f5 = (float)b;
       float f6 = (float)b;
       float f7 = (float)b;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(oq)) {
          Object[] objArray = new Object[]{Float.valueOf(f),Float.valueOf(f1),Float.valueOf(f2),Float.valueOf(f3),Float.valueOf(f4),Float.valueOf(f5),Float.valueOf(f6),Float.valueOf(f7)};
          path = PatchProxy.apply(objArray, obj, oq, "4");
          if (path != PatchProxyResult.class) {
          label_0111 :
             path.offset(0, 0);
             obj1.drawPath(path, obj.c);
             return;
          }
       }
       path = new Path();
       path.moveTo(0, f4);
       float f8 = (float)i1;
       if (f4 - f8 > 0) {
          path.arcTo(new RectF(0, 0, (f4 * 2.00f), (f4 * 2.00f)), -180.00f, 90.00f);
       }
       path.lineTo((f2 - f5), 0);
       if (f5 - f8 > 0) {
          f5 = f5 * 2.00f;
          RectF rectF = new RectF((f2 - f5), 0, f2, f5);
          path.arcTo(rectF, -90.00f, 90.00f);
       }
       path.lineTo(f2, (f3 - f6));
       if (f6 - f8 > 0) {
          f5 = (float)2 * f6;
          f6 = f2 - f5;
          path.arcTo(new RectF(f6, (f3 - f5), f2, f3), 0, 90.00f);
       }
       path.lineTo(f7, f3);
       if (f7 - f8 > 0) {
          f7 = f7 * 2.00f;
          path.arcTo(new RectF(0, (f3 - f7), f7, f3), 90.00f, 90.00f);
       }
       path.offset(f, f1);
       path.close();
       goto label_0111 ;
    }
    public final void b(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "5")) {
          return;
       }
       this.a = p0;
       if (p0) {
          ViewParent parent = this.d.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.setClipChildren(false);
       }
       this.d.invalidate();
       return;
    }
}
