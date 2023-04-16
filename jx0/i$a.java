package jx0.i$a;
import yb1.f;
import jx0.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class i$a extends f	// class@002c29
{
    public final i h;

    public void i$a(i p0){
       this.h = p0;
       super();
    }
    public View H(){
       return this.h.Q;
    }
    public int g(){
       return this.h.Y;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       this.h.h9();
       return;
    }
    public void o(boolean p0){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, i$a.class, "3")) {
          return;
       }
       p0.V0 = false;
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       this.h.V0 = true;
       return;
    }
}
