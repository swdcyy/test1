package ko8.c;
import androidx.viewpager2.widget.ViewPager2$h;
import ko8.a;
import com.tachikoma.core.bridge.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ko8.b;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import tx4.y;
import java.lang.Throwable;
import wp8.a;
import java.lang.Float;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c extends ViewPager2$h	// class@002bd4
{
    public JsValueRef a;
    public JsValueRef b;
    public JsValueRef c;
    public a d;
    public b e;
    public boolean f;
    public d g;
    public long h;
    public long i;
    public boolean j;

    public void c(a p0,d p1){
       super();
       this.h = 400;
       this.d = p0;
       this.g = p1;
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "6")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       uoc = this.e;
       if (uoc != null) {
          uoc.onPageScrollStateChanged(p0);
       }
       uoc = this.c;
       if (uoc == null) {
          return;
       }else {
          V8Function v8Function = uoc.get();
          if (!y.a(v8Function)) {
             return;
          }else {
             String str = "settling";
             int i = 1;
             if (p0 != i) {
                if (p0 != 2) {
                   str = "idle";
                }
             }else if(this.j != null){
                str = "dragging";
             }
             Object[] objArray = new Object[i];
             objArray[0] = str;
             v8Function.call(null, objArray);
             return;
          }
       }
    }
    public void b(int p0,float p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, c.class, "5")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       c te = this.e;
       if (te != null) {
          te.onPageScrolled(p0, p1, p2);
       }
       c tb = this.b;
       if (tb == null) {
          return;
       }else {
          V8Function v8Function = tb.get();
          if (!y.a(v8Function)) {
             return;
          }else {
             long l = System.currentTimeMillis();
             if (p1 && (p1 - 0x3f800000 && (l - this.i) - this.h <= 0)) {
                return;
             }else {
                this.i = l;
                Object[] objArray = new Object[]{Integer.valueOf(this.d(p0)),Float.valueOf(p1)};
                v8Function.call(null, objArray);
                return;
             }
          }
       }
    }
    public void c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "4")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       uoc = this.e;
       if (uoc != null) {
          uoc.onPageSelected(p0);
       }
       uoc = this.a;
       if (uoc == null) {
          return;
       }else {
          V8Function v8Function = uoc.get();
          if (!y.a(v8Function)) {
             return;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(this.d(p0))};
             v8Function.call(null, objArray);
             return;
          }
       }
    }
    public final int d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uoc = this.d;
       if (uoc == null) {
          return p0;
       }else {
          return uoc.getRealPosition(p0);
       }
    }
    public void e(){
       this.f = true;
    }
    public void f(long p0){
       this.h = p0;
    }
}
