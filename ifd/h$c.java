package ifd.h$c;
import qvb.q;
import ifd.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class h$c implements q	// class@00100a
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(h$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, h$c.class, "3")) {
          return;
       }
       if (p0) {
          this.b.P8(true);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(h$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, h$c.class, "1")) {
          return;
       }
       if (p0) {
          this.b.P8(true);
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(h$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, h$c.class, "2")) {
          return;
       }
       if (p0) {
          this.b.p.getViewTreeObserver().addOnGlobalLayoutListener(this.b.t);
       }
       return;
    }
}
