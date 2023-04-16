package g31.k$a;
import android.view.ViewOutlineProvider;
import g31.k;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.topbar.d;

public class k$a extends ViewOutlineProvider	// class@002412
{
    public final int a;
    public final k b;

    public void k$a(k p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$a.class, "1")) {
          return;
       }
       k$a ta = this.a;
       p1.setRoundRect(0, 0, this.b.c.d9(), ta, ((float)ta / 2.00f));
       return;
    }
}
