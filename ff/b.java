package ff.b;
import ff.a;
import android.view.View;
import android.view.animation.Animation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ff.b$a;
import java.lang.Enum;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.StringBuilder;
import ff.i;

public abstract class b extends a	// class@001ff0
{

    public void b(){
       super();
    }
    public Animation b(View p0,int p1,int p2,int p3,int p4){
       a obj;
       float f;
       float f1;
       ScaleAnimation scaleAnimati;
       float f2;
       float alpha;
       b uob = b.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.c;
       if (obj != null) {
          obj = b$a.a[obj.ordinal()];
          String str = null;
          if (obj != i3) {
             if (obj != i2) {
                if (obj != i1) {
                   if (obj == i) {
                      f = (this.f())? 0x3f800000: 0;
                      f1 = (this.f())? 0: 0x3f800000;
                      scaleAnimati = new ScaleAnimation(0x3f800000, 0x3f800000, f, f1, 1, 0, 1, 0x3f000000);
                      return 0x3f800000;
                   }else {
                      throw new IllegalViewOperationException("Missing animation for property : "+this.c);
                   }
                }else if(this.f()){
                   f2 = 0x3f800000;
                }else {
                   f2 = 0;
                }
                float f3 = (this.f())? 0: 0x3f800000;
                scaleAnimati = new ScaleAnimation(f2, f3, 0x3f800000, 0x3f800000, 1, 0x3f000000, 1, 0);
                return 0x3f800000;
             }else if(this.f()){
                f = 0x3f800000;
             }else {
                f = 0;
             }
             f1 = (this.f())? 0: 0x3f800000;
             scaleAnimati = new ScaleAnimation(f, f1, f, f1, 1, 0x3f000000, 1, 0x3f000000);
             return 0x3f800000;
          }else if(this.f()){
             alpha = p0.getAlpha();
          }else {
             alpha = 0;
          }
          if (!this.f()) {
             str = p0.getAlpha();
          }
          return new i(p0, alpha, str);
       }else {
          throw new IllegalViewOperationException("Missing animated property from animation config");
       }
    }
    public boolean d(){
       boolean b = (this.d > null && this.c != null)? true: false;
       return b;
    }
    public abstract boolean f();
}
