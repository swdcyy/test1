package nd9.t;
import android.view.ViewOutlineProvider;
import nd9.l$d;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class t extends ViewOutlineProvider	// class@003158
{
    public final int a;
    public final int b;
    public final int c;
    public final l$d d;

    public void t(l$d p0,int p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "1")) {
          return;
       }
       p1.setRoundRect(this.a, this.b, (p0.getWidth() - this.a), (p0.getHeight() - this.b), (float)this.c);
       return;
    }
}
