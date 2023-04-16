package cy9.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import cy9.g$a;
import android.view.View$OnClickListener;

public class g extends PresenterV2	// class@001e38
{
    public View p;
    public View q;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       this.q.setOnClickListener(new g$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a3f8e);
       this.q = p0.findViewById(0x7f0a3f8d);
       return;
    }
}
