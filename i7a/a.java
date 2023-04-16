package i7a.a;
import pvb.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Configuration;
import kotlin.jvm.internal.a;
import android.view.View;
import rkd.b;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;

public final class a extends a	// class@0027b8
{
    public View q;
    public View r;
    public View s;
    public View t;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.S8();
       return;
    }
    public void R8(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "newConfig");
       this.S8();
       a tr = this.r;
       if (tr != null) {
          tr.requestLayout();
       }
       this.V8(this.s);
       if (this.t == null) {
          tr = this.s;
          View view = (tr != null)? tr.findViewById(R.id.nasa_groot_view_pager): null;
          this.t = view;
       }
       this.V8(this.t);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          b.i(tq, 0, 0, 6, null);
       }
       return;
    }
    public final void V8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (p0 != null) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          int i = -1;
          if (p0.getLayoutParams() instanceof ConstraintLayout$LayoutParams) {
             layoutParams = p0.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             int i1 = 1;
             int i2 = (layoutParams.d != i)? 1: 0;
             int i3 = (layoutParams.e != i)? 1: 0;
             i2 = i2 | i3;
             ConstraintLayout$LayoutParams f = layoutParams.f;
             int i4 = (f != i)? 1: 0;
             i3 = (f != i)? 1: 0;
             i2 = (i2 & (i3 | i4))? 0: -1;
             layoutParams.width = i2;
             i2 = (layoutParams.h != i)? 1: 0;
             i3 = (layoutParams.i != i)? 1: 0;
             i2 = i2 | i3;
             i3 = (layoutParams.k != i)? 1: 0;
             if (layoutParams.j == i) {
                i1 = 0;
             }
             if (i2 & (i1 | i3)) {
                i = 0;
             }
             layoutParams.height = i;
          }else {
             layoutParams.width = i;
             layoutParams.height = i;
          }
          p0.setTop(0);
          p0.setLeft(0);
          p0.requestLayout();
       }
       return;
    }
    public void doBindView(View p0){
       ViewParent parent;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.q = p0.findViewById(0x7f0a1123);
          this.r = p0.findViewById(0x7f0a3e7f);
          while (p0 != null) {
             if (p0.getId() == 0x7f0a2d6f) {
                this.s = p0;
                break ;
             }else if(p0.getParent() instanceof View){
                parent = p0.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
             }else {
                parent = null;
             }
          }
       }
       return;
    }
}
