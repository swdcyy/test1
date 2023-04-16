package jk9.c$d;
import java.lang.Runnable;
import jk9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import com.kuaishou.android.model.mix.QComment;

public final class c$d implements Runnable	// class@002af9
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$d.class, "1")) {
          return;
       }
       c a = this.b.a;
       if (a != null) {
          if (!a.isRunning()) {
             objArray = a;
          }
          if (objArray != null) {
             objArray.start();
             this.b.j.mHasShowAtTailEasterEgg = true;
          }
       }
       return;
    }
}
