package nfd.q3;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class q3 extends ViewOutlineProvider	// class@001df8
{
    public final int a;

    public void q3(int p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q3.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, (p0.getWidth() + this.a), p0.getHeight(), (float)this.a);
       return;
    }
}
