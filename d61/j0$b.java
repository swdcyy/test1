package d61.j0$b;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.view.TouchDelegate;

public class j0$b implements Runnable	// class@001f25
{
    public final View b;
    public final int c;
    public final View d;

    public void j0$b(View p0,int p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, j0$b.class, "1")) {
          return;
       }
       Rect rect = new Rect();
       this.b.getHitRect(rect);
       j0$b tc = this.c;
       rect.top = rect.top - tc;
       rect.bottom = rect.bottom + tc;
       rect.left = rect.left - tc;
       rect.right = rect.right + tc;
       this.d.setTouchDelegate(new TouchDelegate(rect, this.b));
       return;
    }
}
