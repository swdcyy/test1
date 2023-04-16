package ey9.b$a;
import qp7.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import qp7.x0;
import ey9.b$b;

public class b$a extends d	// class@00224c
{

    public void b$a(){
       super();
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FrameLayout(this.g.getContext());
    }
    public void q(x0 p0){
    }
}
