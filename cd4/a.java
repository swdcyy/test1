package cd4.a;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a extends ViewOutlineProvider	// class@0004f5
{
    public final int a;

    public void a(int p0){
       super();
       this.a = p0;
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       int i = p0.getHeight() + ta;
       float f = (float)ta;
       p1.setRoundRect(0, 0, p0.getWidth(), i, f);
       p0.setClipToOutline(true);
       return;
    }
}
