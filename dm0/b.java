package dm0.b;
import com.yxcorp.gifshow.widget.m;
import dm0.a;
import com.kuaishou.protobuf.ad.brand.activity.nano.WidgetInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import android.app.Activity;
import vq5.d;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;

public final class b extends m	// class@001fbd
{
    public final a c;
    public final WidgetInfo d;

    public void b(a p0,WidgetInfo p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       LoginParams loginParams = null;
       if (!mE.isLogined()) {
          d.a(-1712118428).x00(this.c.getContext(), 0, loginParams, loginParams);
          return;
       }else {
          b td = this.d;
          if (td != null) {
             WidgetInfo jumpUrl = td.jumpUrl;
             if (jumpUrl != null) {
                b tc = this.c;
                a x = tc.x;
                if (x != null) {
                   x.r4(jumpUrl, tc.getActivity());
                }
                td = this.c;
                Objects.requireNonNull(td);
                if (!PatchProxy.applyVoid(loginParams, td, a.class, "9")) {
                   u1.B(new ClickMetaData().setLogPage(td.v).setType(1).setElementPackage(td.S8()));
                }
             }
          }
          return;
       }
    }
}
