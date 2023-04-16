package ek2.c$a;
import ek2.b;
import ek2.c;
import java.lang.Object;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.follow.a;
import com.kwai.framework.model.user.User;
import p91.m;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kuaishou.live.core.show.stayinfo.Content;
import com.kuaishou.live.core.show.stayinfo.ActionButton;
import android.content.Context;
import android.app.Dialog;
import ek2.d;
import ek2.e;
import ek2.f;
import android.content.DialogInterface$OnDismissListener;

public final class c$a implements b	// class@002745
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public boolean a(StayInfo p0,View$OnClickListener p1,View$OnClickListener p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "stayInfo";
       a.p(p0, obj);
       String str = "onPositiveClickListener";
       a.p(p1, str);
       String str1 = "onNegativeClickListener";
       a.p(p2, str1);
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, ta, c.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, obj);
          a.p(p1, str);
          a.p(p2, str1);
          Activity activity = ta.getActivity();
          if (activity != null) {
             c m = ta.M;
             a.o(m, "mBasicContext");
             User user = m.I();
             a uoa = new a(activity, user, HeadImageSize.MIDDLE, p0.b().c(), p0.b().a().b(), p0.b().b());
             ta.K = v8;
             v8.setCanceledOnTouchOutside(false);
             m = ta.K;
             if (m != null) {
                m.b(new d(ta, p0, p1, p2));
             }
             m = ta.K;
             if (m != null) {
                m.a(new e(ta, p0, p1, p2));
             }
             m = ta.K;
             if (m != null) {
                m.setOnDismissListener(new f(ta, p0, p1, p2));
             }
             c k = ta.K;
             if (k != null) {
                k.show();
             }
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
}
