package an6.a$b;
import android.view.View$OnClickListener;
import an6.a;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$b implements View$OnClickListener	// class@0000e2
{
    public final a b;
    public final Drawable c;
    public final ViewGroup d;

    public void a$b(a p0,Drawable p1,ViewGroup p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
          return;
       }
       this.b.n().callOnClick();
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
}
