package gn9.h;
import u07.u;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gn9.i;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import android.net.Uri;
import android.content.Intent;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import gn9.c;
import android.content.Context;
import n3d.a;
import com.kwai.library.widget.popup.common.c;

public final class h implements u	// class@0024d3
{
    public final Activity b;

    public void h(Activity p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       i a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "<anonymous parameter 1>");
       a = i.a;
       h tb = this.b;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(tb, a, i.class, "2")) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (qCurrentUser.isLogined()) {
             Uri uri = Uri.parse("kwai://krn?bundleId=FeedSchoolTab&componentName=Identification&source=SCHOOL_MAP");
             a.o(uri, "Uri.parse\(IDENTIFICATION_SCHEME\)");
             Intent intent = new Intent();
             intent.setAction("android.intent.action.VIEW");
             intent.setData(uri);
             tb.startActivity(intent);
          }else {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f103078));
             LoginParams loginParams = uoa.a();
             a.o(loginParams, "LoginParams.LoginParamBu¡­eneral\)\)\n        .build\(\)");
             d.a(-1712118428).x00(tb, 144, loginParams, new c(tb));
          }
       }
       p0.o();
       return;
    }
}
