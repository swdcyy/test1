package c56.b;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.ViewConfiguration;
import java.lang.Math;
import java.util.Iterator;
import java.util.List;
import c56.c;
import c56.b$a;
import c56.b$b;
import java.lang.Integer;

public class b	// class@00064f
{
    public final Context a;
    public int b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public b$a j;
    public b$b k;
    public final List l;

    public void b(Context p0){
       super();
       this.l = new ArrayList();
       this.a = p0;
    }
    public boolean a(MotionEvent p0){
       boolean b;
       b tj;
       boolean b3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.b == null) {
          this.b = ViewConfiguration.get(this.a).getScaledTouchSlop();
       }
       int actionMasked = p0.getActionMasked();
       b = false;
       if (actionMasked) {
          b uob1 = 3;
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == uob1) {
                label_00d3 :
                   if (this.i == 2) {
                      tj = this.j;
                      if (tj != null) {
                         boolean b1 = (p0.getAction() == uob1)? true: false;
                         tj.a(b1);
                      }
                   }
                   if (this.i == 1) {
                      tj = this.k;
                      if (tj != null) {
                         boolean b2 = (p0.getAction() == uob1)? true: false;
                         tj.a(b2);
                      }
                   }
                   this.i = -1;
                }
             }else {
                float f = Math.abs((p0.getX() - this.e));
                float f1 = Math.abs((p0.getY() - this.f));
                if (this.c != null || (this.d != null && (this.i == -1 && Math.max(f, f1) - (float)this.b >= 0))) {
                   if (f - f1 >= 0 && this.d != null) {
                      this.b(p0, 2);
                   }else if(f1 - f >= 0 && this.c != null){
                      Object obj1 = PatchProxy.applyOneRefs(p0, this, uob, "3");
                      if (obj1 != patchProxyRe) {
                         b3 = obj1.booleanValue();
                      }else {
                         Iterator iterator = this.l.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               if (iterator.next().a(p0)) {
                                  b3 = true;
                               }
                            }else {
                               b3 = false;
                            }
                         }
                      }
                      if (!b3) {
                         this.b(p0, 1);
                      }
                   }
                }
                if (this.i == 2) {
                   tj = this.j;
                   if (tj != null) {
                      tj.b(this.g, p0.getX(), p0.getY());
                   }
                }
                if (this.i == 1) {
                   tj = this.k;
                   if (tj != null) {
                      tj.b(this.g, this.h, p0.getX(), p0.getY());
                   }
                }
             }
          }else {
             goto label_00d3 ;
          }
       }else {
          this.i = -1;
          this.e = p0.getX();
          this.f = p0.getY();
       }
    label_010c :
       if (this.i != -1) {
          b = true;
       }
       return b;
    }
    public final void b(MotionEvent p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.i = p1;
       this.g = p0.getX();
       this.h = p0.getY();
       return;
    }
}
