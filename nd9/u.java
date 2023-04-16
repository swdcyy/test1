package nd9.u;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import nd9.x;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import o07.n;

public final class u implements PopupInterface$f	// class@003159
{
    public final x b;
    public final int c;

    public void u(x p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, u.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.g(p1, this.c, p2, false);
       this.b.b(view);
       this.b.c();
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
