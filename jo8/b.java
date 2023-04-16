package jo8.b;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.String;
import java.lang.Class;
import jo8.b$a;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import zp8.a;
import java.lang.Float;
import jo8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.IllegalStateException;
import java.util.Locale;

public final class b extends RecyclerView$r	// class@002987
{
    public final String a;
    public a b;
    public LinearLayoutManager c;
    public int d;
    public int e;
    public b$a f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public static final ViewGroup$MarginLayoutParams l;

    static {
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -1);
       b.l = marginLayout;
       marginLayout.setMargins(0, 0, 0, 0);
    }
    public void b(){
       super();
       this.a = b.class.getSimpleName();
       this.f = new b$a();
       this.i();
    }
    public void a(RecyclerView p0,int p1){
       b$a a;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       if (this.k != null) {
          return;
       }
       b td = this.d;
       if (td != 1 && p1 == 1) {
          this.d = 1;
          td = this.h;
          if (td != -1) {
             this.g = td;
             this.h = -1;
          }else {
             this.g = this.f();
          }
          this.e(1);
          return;
       }else if(td == 1 && p1 == 2){
          if (this.j == null) {
             this.c(this.f(), 0, 0);
          }else {
             this.e(2);
             this.i = true;
             this.j = false;
          }
          return;
       }else if(td == 1 && !p1){
          td = this.e;
          if (td == 1 && this.f.c == null) {
             if (this.j == null) {
                this.c(this.f(), 0, 0);
             }else {
                this.i = true;
                this.j = false;
             }
          }else if(td == 2 && this.j == null){
             a.h(this.a, "RecyclerView sent SCROLL_STATE_SETTLING event without scrolling any further before going to SCROLL_STATE_IDLE");
          }
          if (this.j == null) {
             if (this.i != null) {
                this.j();
                a = this.f.a;
                if (this.g != a) {
                   this.d(a);
                }
             }
             this.e(0);
             this.i();
          }
       }
    label_009a :
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       b$a uoa1;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "4")) {
          return;
       }
       if (this.k != null) {
          return;
       }
       this.j = true;
       b$a uoa = this.j();
       if (p2 <= 0) {
          if (!p2) {
             p1 = (p1 < 0)? 1: 0;
             if (p1 != this.h()) {
             label_003a :
                uoa1 = null;
             label_003d :
                uoa1 = (uoa1 && uoa.c != null)? uoa.a + true: uoa.a;
                if (this.i != null) {
                   this.i = false;
                   this.h = uoa1;
                   if (this.g != uoa1) {
                      this.d(uoa1);
                   }
                }
                this.c(uoa1, uoa.b, uoa.c);
                b th = this.h;
                if (uoa.a == th || (th == -1 && (uoa.c == null && this.e != true))) {
                   this.e(false);
                   this.i();
                }
             label_0076 :
                return;
             }
          }else {
             goto label_003a ;
          }
       }
       uoa1 = 1;
       goto label_003d ;
    }
    public final void c(int p0,float p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, b.class, "12")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public final void d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "11")) {
          return;
       }
       uob = this.b;
       if (uob != null) {
          uob.onPageSelected(p0);
       }
       return;
    }
    public final void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "10")) {
          return;
       }
       if (this.d == 3 && this.e == null) {
          return;
       }
       if (this.e == p0) {
          return;
       }
       this.e = p0;
       uob = this.b;
       if (uob != null) {
          uob.onPageScrollStateChanged(p0);
       }
       return;
    }
    public final int f(){
       b obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj == null) {
          return 0;
       }
       return obj.i0();
    }
    public boolean g(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public final boolean h(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       b = false;
       if (obj == null) {
          return b;
       }
       if (obj.getLayoutDirection() == 1) {
          b = true;
       }
       return b;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.d = 0;
       this.e = 0;
       this.f.a();
       this.g = -1;
       this.h = -1;
       this.i = false;
       this.j = false;
       return;
    }
    public final b$a j(){
       ViewGroup$MarginLayoutParams layoutParams;
       b obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       b tc = this.c;
       if (tc == null) {
          return obj;
       }
       int i = tc.i0();
       obj.a = i;
       if (i == -1) {
          obj.a();
          return obj;
       }else {
          View view = this.c.findViewByPosition(i);
          if (view == null) {
             obj.a();
             return obj;
          }else if(view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams){
             layoutParams = view.getLayoutParams();
          }else {
             layoutParams = b.l;
          }
          int i1 = (!this.c.getOrientation())? 1: 0;
          if (i1) {
             i1 = view.getWidth();
             if (!this.h()) {
                i = view.getLeft();
                layoutParams = layoutParams.leftMargin;
             }else {
                i = (i1 - view.getRight()) + layoutParams.rightMargin;
             label_0076 :
                i = - i;
                obj.c = i;
                if (i >= 0) {
                   float f = (!i1)? 0: (float)i / (float)i1;
                   obj.b = f;
                   return obj;
                }else {
                   Object[] objArray = new Object[]{Integer.valueOf(obj.c)};
                   throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", objArray));
                }
             }
          }else {
             i1 = view.getHeight();
             i = view.getTop();
             layoutParams = layoutParams.topMargin;
          }
          i = i - layoutParams;
          goto label_0076 ;
       }
    }
}
