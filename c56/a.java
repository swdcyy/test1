package c56.a;
import c56.a$c;
import java.lang.Object;
import c56.a$b;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.graphics.PointF;
import java.lang.Boolean;
import c56.a$a;

public class a	// class@00064c
{
    public boolean a;
    public final a$c b;
    public final a$b c;
    public boolean d;

    public void a(a$c p0){
       super();
       this.c = new a$b();
       this.b = p0;
    }
    public final float a(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)Math.sqrt((double)(((p0.getX(1) - p0.getX(0)) * (p0.getX(1) - p0.getX(0))) + ((p0.getY(1) - p0.getY(0)) * (p0.getY(1) - p0.getY(0)))));
    }
    public final PointF b(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PointF(((p0.getX(1) + p0.getX(0)) / 2.00f), ((p0.getY(1) + p0.getY(0)) / 2.00f));
    }
    public boolean c(MotionEvent p0){
       PointF obj1;
       boolean b1;
       a tc;
       a$a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       a obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.d == null) {
          return b;
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked != 1) {
          a uoa1 = 2;
          if (actionMasked != uoa1) {
             if (actionMasked != 3) {
                if (actionMasked != 5) {
                   if (actionMasked == 6) {
                   label_0124 :
                      if (this.a != null) {
                         if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
                            this.b.c(this.c);
                         }
                         this.a = b;
                         return true;
                      }
                   }
                }else if(this.a == null){
                   obj1 = PatchProxy.applyOneRefs(p0, this, uoa, "2");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      this.c.a.a = this.b(p0);
                      this.c.b.a = this.b(p0);
                      this.c.c.a = this.b(p0);
                      tc = this.c;
                      float f = this.a(p0);
                      tc.c.b = f;
                      tc.b.b = f;
                      tc.a.b = f;
                      b1 = true;
                   }
                   if (b1) {
                      this.b.a(this.c);
                      this.a = true;
                      return true;
                   }
                }
             }else {
                goto label_0124 ;
             }
          }else if(p0.getPointerCount() == uoa1 && this.a != null){
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
                PointF pointF = this.b(p0);
                obj1 = this.b(p0);
                if (Math.abs((pointF.x - this.c.c.a.x)) - 0x40400000 >= 0) {
                   obj = this.c;
                   a = obj.c.a;
                   obj.b.a.x = a.x;
                   a.x = obj1.x;
                   b = 1;
                }
                if (Math.abs((pointF.y - this.c.c.a.y)) - 0x40400000 >= 0) {
                   tc = this.c;
                   a$a a1 = tc.c.a;
                   tc.b.a.y = a1.y;
                   a1.y = obj1.y;
                   b = 1;
                }
                if (this.a(p0) - this.c.a.b > 0 && Math.abs((this.a(p0) - this.c.c.b)) - 0x40400000 >= 0) {
                   tc = this.c;
                   a$b c = tc.c;
                   tc.b.b = c.b;
                   c.b = this.a(p0);
                   b = 1;
                }
                if (b != null) {
                   this.b.b(this.c);
                }
             }
             return true;
          }
       }else {
          goto label_0124 ;
       }
       return b;
    }
}
