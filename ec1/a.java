package ec1.a;
import dp3.a;
import android.view.ViewGroup;
import ec1.b;
import dp3.g;
import bq5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewParent;

public class a extends a	// class@0020d1
{
    public final ViewGroup g;
    public b h;
    public final int i;

    public void a(ViewGroup p0,ViewGroup p1){
       super(p0);
       this.g = p1;
       this.i = 0;
    }
    public void a(ViewGroup p0,ViewGroup p1,b p2,int p3){
       super(p0);
       this.g = p1;
       this.h = p2;
       this.i = p3;
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          super.a(p0);
          if (this.g != null && !PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
             ConstraintLayout$LayoutParams layoutParams = this.getView().getLayoutParams();
             if (this.getView().getPaddingLeft() != p0.r()) {
                this.getView().setPadding(p0.r(), this.getView().getPaddingTop(), this.getView().getPaddingRight(), this.getView().getPaddingBottom());
             }
             this.getView().setLayoutParams(layoutParams);
             a th = this.h;
             ViewGroup viewGroup = 2;
             boolean b = false;
             if (th != null) {
                if (p0.h() == viewGroup) {
                   b = true;
                }
                th.a(b);
             }else if(p0.h() == viewGroup){
                layoutParams.g = this.g.getId();
                ViewGroup parent = this.getView().getParent();
                if (parent != null) {
                   layoutParams.M = (int)((float)parent.getWidth() * 0x3f3d70a4);
                }
             }else {
                layoutParams.g = b;
                layoutParams.M = b;
             }
             this.getView().setLayoutParams(layoutParams);
          }
          if (this.i > null) {
             this.getView().setPadding(this.getView().getPaddingLeft(), this.i, this.getView().getPaddingRight(), this.getView().getPaddingBottom());
          }
       }
       return;
    }
    public void b(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
       }else {
          super.b(p0);
          if (this.i > null && !this.getView().getChildCount()) {
             this.getView().setPadding(this.getView().getPaddingLeft(), 0, this.getView().getPaddingRight(), this.getView().getPaddingBottom());
          }
       }
       return;
    }
}
