package com.kwai.tokenshare.presenter.f;
import android.view.View$OnClickListener;
import com.kwai.tokenshare.presenter.h;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eu7.b;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import bu7.n;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Exception;
import lc5.b;
import com.kwai.robust.PatchProxyResult;
import fu7.c;
import brd.t;
import com.kwai.tokenshare.presenter.b;
import io.reactivex.g;
import com.kwai.tokenshare.presenter.c;
import erd.o;
import t45.d;
import brd.z;
import com.kwai.tokenshare.presenter.g;
import erd.g;
import crd.b;

public final class f implements View$OnClickListener	// class@001942
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, h.class, "6")) {
       }else {
          h v = tb.v;
          n.a(v.mUserId, tb.q.mOriginSubBiz, "button", v.mFollowed);
          if (!QCurrentUser.ME.isLogined() || tb.v.mFollowed == null) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             t ot = PatchProxy.apply(objArray, tb, c.class, "1");
             if (ot != patchProxyRe) {
             }else {
                t ot1 = PatchProxy.apply(objArray, tb, c.class, "3");
                if (ot1 != patchProxyRe) {
                }else {
                   ot1 = t.create(new b(tb));
                }
                ot = ot1.flatMap(new c(tb));
             }
             tb.X7(ot.subscribeOn(d.c).observeOn(d.a).subscribe(new g(tb)));
          }else {
             tb.p.c();
             Intent intent = new Intent();
             intent.setAction("android.intent.action.VIEW");
             Uri uri = Uri.parse(tb.v.mActionUrl);
             try{
                intent.setData(uri);
                tb.getContext().startActivity(intent);
             }catch(java.lang.Exception e6){
                String[] stringArray = new String[]{"KwaiTokenDialogFollowPresenter"};
                b.f(e6.getMessage(), stringArray);
             }
          }
       }
    }
}
