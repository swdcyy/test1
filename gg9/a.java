package gg9.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;
import gg9.a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Float;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Integer;

public class a	// class@002473
{
    public final View a;
    public ViewGroup b;
    public ViewGroup$LayoutParams c;

    public void a(View p0){
       super();
       this.a = p0;
    }
    public View a(){
       return this.a;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.a.getParent() != null && (this.c != null && this.b != null)) {
          this.a.getParent().removeView(this.a);
          this.b.addView(this.a, this.c);
       }
    label_0032 :
       return;
    }
    public void c(ConstraintLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.c = null;
       this.b = null;
       float rotation = this.a.getRotation();
       this.a.setRotation(0);
       int[] ointArray = n.p(this.a);
       if (ointArray[0] || ointArray[1]) {
          this.d(p0, ointArray, rotation);
       }else {
          this.a.getViewTreeObserver().addOnGlobalLayoutListener(new a$a(this, p0, rotation));
       }
       return;
    }
    public void d(ConstraintLayout p0,int[] p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, a.class, "2")) {
          return;
       }
       this.c = this.a.getLayoutParams();
       ViewGroup parent = this.a.getParent();
       this.b = parent;
       if (this.c != null && parent != null) {
          parent.removeView(this.a);
          a tc = this.c;
          ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(tc.width, tc.height);
          layoutParams.q = p0.getId();
          layoutParams.h = p0.getId();
          layoutParams.leftMargin = p1[0];
          layoutParams.topMargin = p1[1];
          if (this.a.getTag(0x7f0a445c) != null) {
             int i = this.a.getTag(R.id.view_screen_top).intValue();
             if (i > 0) {
                layoutParams.topMargin = i;
             }
          }
          p0.addView(this.a, layoutParams);
          this.a.setRotation(p2);
       }
       return;
    }
}
