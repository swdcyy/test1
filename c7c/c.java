package c7c.c;
import com.yxcorp.gifshow.widget.m;
import c7c.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import c7c.b;
import ou7.h$b;
import ou7.h;

public class c extends m	// class@000540
{
    public final d c;

    public void c(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       d.R8(this.c.p);
       h.b(this.c.getContext(), this.c.p, new ClientContent$ContentPackage(), new b(this));
       return;
    }
}
