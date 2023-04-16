package n21.k;
import android.view.View$OnClickListener;
import n21.o;
import n21.e;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import n21.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public final class k implements View$OnClickListener	// class@003292
{
    public final o b;
    public final e c;

    public void k(o p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       e g;
       k tb = this.b;
       k tc = this.c;
       ClientContent$LiveStreamPackage liveStreamPa = tb.r.a();
       String str = tc.e();
       int i = tc.f();
       String str1 = TextUtils.k(tc.c());
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, str, Integer.valueOf(i), str1, null, g.class, "2")) {
          u1.u(1, g.b(), g.a(liveStreamPa, str, i, str1));
       }
       g = tc.g;
       if (g != null) {
          tb.s.r4(g, tb.getContext());
       }
       return;
    }
}
