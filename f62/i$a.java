package f62.i$a;
import com.yxcorp.gifshow.widget.m;
import f62.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u52.t;
import com.kwai.framework.model.user.UserInfo;
import j62.a;
import z52.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import u52.u;

public class i$a extends m	// class@0028b5
{
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a tc = this.c;
       tc.q.b.b(tc.p, tc.r, 135);
       i$a tc1 = this.c;
       u.f(this.c.q.a.a(), (tc1.s + 1), tc1.p.mId, "USER", tc1.r.a);
       return;
    }
}
