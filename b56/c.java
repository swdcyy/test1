package b56.c;
import b56.g0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import lnc.a1;
import java.lang.Float;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class c implements g0	// class@0003f9
{
    public ConstraintLayout a;
    public View b;
    public View c;
    public TextView d;
    public TextView e;

    public void c(){
       super();
    }
    public boolean a(){
       return false;
    }
    public void b(View p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          this.a = p0.findViewById(0x7f0a45ce);
          this.b = p0.findViewById(0x7f0a45e5);
          this.c = p0.findViewById(0x7f0a45c8);
          this.d = p0.findViewById(0x7f0a45c9);
          this.e = p0.findViewById(0x7f0a45cf);
       }
       int i = 0x7f070271;
       Object[] objArray = null;
       if (p1) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             this.c(40.00f, a1.d(R.dimen.arg_RES_7f070295), a1.e(160.00f), a1.d(R.dimen.arg_RES_7f070295), a1.d(i));
          }
       }else if(PatchProxy.applyVoid(objArray, this, uoc, "3")){
          this.c(24.00f, a1.d(i), a1.e(96.00f), a1.d(i), a1.d(R.dimen.arg_RES_7f070334));
       }
       return;
    }
    public final void c(float p0,int p1,int p2,int p3,int p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             return;
          }
       }
       ViewGroup$MarginLayoutParams layoutParams = this.b.getLayoutParams();
       layoutParams.height = p3;
       layoutParams.bottomMargin = p4 + p1;
       this.b.setLayoutParams(layoutParams);
       c tc = this.c;
       ViewGroup$LayoutParams layoutParams1 = tc.getLayoutParams();
       layoutParams1.width = p2;
       tc.setLayoutParams(layoutParams1);
       this.d.setTextSize(p0);
       ViewGroup$MarginLayoutParams layoutParams2 = this.d.getLayoutParams();
       layoutParams2.rightMargin = p1;
       this.d.setLayoutParams(layoutParams2);
       this.e.setTextSize(p0);
       ViewGroup$MarginLayoutParams layoutParams3 = this.e.getLayoutParams();
       layoutParams3.leftMargin = p1;
       this.e.setLayoutParams(layoutParams3);
       return;
    }
}
