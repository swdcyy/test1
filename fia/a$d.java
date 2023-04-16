package fia.a$d;
import tyc.k3;
import fia.a;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$d implements k3	// class@0028e7
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public final void onDispatchTouchEvent(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       a.o(p0, "it");
       if (p0.getAction() == 1) {
          this.a.X8();
       }
       return;
    }
}
