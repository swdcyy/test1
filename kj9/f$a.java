package kj9.f$a;
import android.view.ViewOutlineProvider;
import kj9.f;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f$a extends ViewOutlineProvider	// class@002ca9
{
    public final int a;
    public final f b;

    public void f$a(f p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)this.a);
       return;
    }
}
