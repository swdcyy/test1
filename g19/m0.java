package g19.m0;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.ad.detail.presenter.side.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class m0 extends m	// class@0023c9
{
    public final l c;

    public void m0(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "1")) {
          return;
       }
       this.c.Y8("click_nickname");
       return;
    }
}
