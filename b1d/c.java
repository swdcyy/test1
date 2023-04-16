package b1d.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.library.widget.scrollview.HorizontalSlideView;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewParent;

public final class c	// class@000316
{
    public HorizontalSlideView a;

    public void c(){
       super();
    }
    public void a(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       c ta = this.a;
       this.a = null;
       if (ta != null && ta.b()) {
          boolean b = true;
          if (p0) {
             c obj = PatchProxy.applyOneRefs(ta, null, uoc, "4");
             if (obj != PatchProxyResult.class) {
                obj = obj.booleanValue();
             }else {
                obj = ta;
                while (true) {
                   if (obj.getVisibility()) {
                   label_003e :
                      obj = false;
                      break ;
                   }else if(obj instanceof RecyclerView){
                      obj = true;
                      break ;
                   }else {
                      ViewParent parent = obj.getParent();
                      if (!parent instanceof View) {
                         goto label_003e ;
                      }else {
                      }
                   }
                }
             }
             if (obj) {
             label_0056 :
                ta.c(b);
             }
          }
          b = false;
          goto label_0056 ;
       }
       return;
    }
    public final void b(HorizontalSlideView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (this.a == p0) {
          return;
       }
       this.a(true);
       this.a = p0;
       return;
    }
    public void c(HorizontalSlideView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (p0 != this.a) {
          this.a(true);
       }
       return;
    }
}
