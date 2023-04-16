package h43.e;
import com.kuaishou.live.bottombar.component.widget.d;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import h43.e$a;
import android.view.View$OnClickListener;
import z61.b;

public class e extends d	// class@002c3e
{
    public View k;

    public void e(){
       super();
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d(p0, 0x7f0d0545, p1, false);
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.k = p0;
       p0.setOnClickListener(new e$a(this));
       return;
    }
    public void F(b p0){
    }
}
