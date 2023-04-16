package f19.h;
import lnc.a1;
import java.lang.Object;
import xe5.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.view.View;
import f19.i;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public final class h	// class@002289
{
    public static final int a;
    public static final h b;

    static {
       h.b = new h();
       h.a = a1.d(0x7f070bf1);
    }
    public void h(){
       super();
    }
    public final int a(r p0){
       r obj = PatchProxy.applyOneRefs(p0, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "param");
       obj = (p0.L != null)? p0.M: p0.E;
       float f = (float)p0.i;
       int i = (p0.J != null)? 0: p0.n;
       return (int)(f - ((float)i * obj));
    }
    public final void b(View p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       a.p(p1, "textureViewParam");
       ViewGroup$LayoutParams layoutParams = null;
       ViewGroup$LayoutParams layoutParams1 = (p0 != null)? p0.getLayoutParams(): layoutParams;
       if (layoutParams1 instanceof FrameLayout$LayoutParams) {
          layoutParams = layoutParams1;
       }
       if (layoutParams != null) {
          layoutParams.width = p1.a;
          layoutParams.height = p1.b;
          layoutParams.gravity = p1.c;
          layoutParams.topMargin = p1.d;
          layoutParams.leftMargin = 0;
          layoutParams.rightMargin = 0;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
}
