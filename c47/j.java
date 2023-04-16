package c47.j;
import android.view.ViewOutlineProvider;
import com.kwai.live.gzone.commandlottery.a;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j extends ViewOutlineProvider	// class@0004d5
{
    public final int a;
    public final a b;

    public void j(a p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, (p0.getWidth() + this.a), p0.getHeight(), (float)this.a);
       return;
    }
}
