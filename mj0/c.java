package mj0.c;
import java.lang.Object;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Throwable;
import lj0.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.c;
import com.kwai.kxb.update.log.KxbException;
import mu6.e;
import com.kwai.kxb.network.model.BundleResponse;
import bk0.j;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import java.lang.CharSequence;
import ukd.a;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.instance.JsFramework;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;

public final class c	// class@00318a
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(KwaiEmptyStateView p0,Throwable p1,c p2){
       boolean b;
       LaunchModel launchModel;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       a.p(p0, "errorView");
       a.p(p2, "krnContext");
       c obj = PatchProxy.applyOneRefs(p1, this, uoc, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!c.a().b0()){
          obj = PatchProxy.apply(null, null, ExpConfigKt.class, "46");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             d uod = KrnInternalManager.c.a().c();
             b = (uod != null)? uod.getBoolean("krn_low_version_compat_tip_show", 1): true;
          }
          if (b) {
             obj = c.b();
             a.o(obj, "KrnManager.get\(\)");
             if (obj.j()) {
             label_0071 :
                if (p1 instanceof KxbException) {
                   KxbException kxbException = p1;
                   e rawResponse = kxbException.getRawResponse();
                   if (rawResponse != null && rawResponse.result == 1) {
                      e rawResponse1 = kxbException.getRawResponse();
                      if (rawResponse1 != null) {
                         BundleResponse uBundleRespo = rawResponse1.a();
                         if (uBundleRespo != null && uBundleRespo.shouldHandleUpgrade == 1) {
                            b = true;
                         }
                      }
                   }
                }
             }
          }
       }else {
          goto label_0071 ;
       }
    label_0094 :
       b = false;
       if (b) {
          p0.d(0);
          p0.g(R.string.arg_RES_7f104f95);
          p0.f();
          j.b.b("krn_low_version_compat_tip_show", new KrnLogCommonParams(p2, null));
       }else if(!c.a().D() || p1 == null){
          Object obj1 = PatchProxy.applyTwoRefs(p1, p2, this, uoc, "3");
          if (obj1 != patchProxyRe) {
          }else {
             Object[] objArray = new Object[]{p1,p2,launchModel.d()};
             launchModel = p2.m();
             a.o(launchModel, "krnContext.launchModel");
             p1 = a.a(a.h("com.kuaishou.krn.load.LoadErrorParser", "INSTANCE"), "parseError", objArray);
             a.o(p1, "JavaCalls.callMethod\(\n  ¡­chModel.jsFramework\n    \)");
             obj1 = p1;
          }
          p0.h(obj1);
          TextView textView = p0.findViewById(R.id.tv_empty_desc);
          if (textView != null) {
             textView.setMovementMethod(LinkMovementMethod.getInstance());
          }
       }
       return;
    }
}
