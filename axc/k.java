package axc.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.ListenKeyboardPopupWindow;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.widget.PopupWindow;
import faa.a;
import java.lang.Throwable;
import q87.c;

public final class k implements Runnable	// class@0002ed
{
    public final ListenKeyboardPopupWindow b;
    public final View c;

    public void k(ListenKeyboardPopupWindow p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       if (this.b.e.isFinishing()) {
          return;
       }
       try{
          this.b.showAtLocation(this.c, 0, 0, 0);
       }catch(android.view.WindowManager$BadTokenException e2){
          a.D().z("ListenKeyboardPopupWindow", "show\(\) ", e2);
       }catch(java.lang.NullPointerException e2){
          a.D().z("ListenKeyboardPopupWindow", "show\(\) ", e2);
       }
       return;
    }
}
