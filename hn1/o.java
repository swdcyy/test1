package hn1.o;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;

public final class o	// class@00273c
{

    public static final void a(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, o.class, "1")) {
          return;
       }
       a.p(p0, "playerView");
       a.p(p1, "containerView");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p1.getWidth();
       layoutParams.height = (int)(((float)p1.getWidth() * (float)p3) / (float)p2);
       p0.setLayoutParams(layoutParams);
       return;
    }
}
