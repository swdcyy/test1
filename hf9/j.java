package hf9.j;
import java.lang.Runnable;
import hf9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.d0;
import android.view.View;

public final class j implements Runnable	// class@002649
{
    public final f b;

    public void j(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       f a;
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       if (this.b.f2()) {
          a = this.b.A;
          if (a != null) {
             a.callOnClick();
          }
       }else {
          a = this.b.B;
          if (a != null) {
             a.callOnClick();
          }
       }
       return;
    }
}
