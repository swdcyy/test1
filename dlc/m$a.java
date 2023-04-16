package dlc.m$a;
import android.view.View$OnClickListener;
import dlc.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class m$a implements View$OnClickListener	// class@002259
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
