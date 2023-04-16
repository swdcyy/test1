package a1d.o0;
import android.view.View$OnClickListener;
import a1d.q0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.authorization.AuthActivity;
import com.kwai.feature.api.social.login.model.AuthSource;
import im8.f;
import w0d.e;
import java.lang.Integer;
import java.util.HashMap;
import com.google.common.collect.Maps;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyAppPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.ArrayList;
import w0d.g;

public final class o0 implements View$OnClickListener	// class@000043
{
    public final q0 b;

    public void o0(q0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q0 e;
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, q0.class, "4")) {
       }else {
          Activity uActivity = tb.getActivity();
          int value = tb.w.getValue();
          q0 x = tb.x;
          String str = tb.r.get();
          q0 v = tb.v;
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             Object[] objArray1 = new Object[]{uActivity,Integer.valueOf(value),x,str,v};
             if (PatchProxy.applyVoid(objArray1, objArray, uoe, "8")) {
             label_0090 :
                tb.t.add(tb.r.get());
                e = tb.E;
                if (e != null) {
                   e.I0();
                }
             }
          }
          HashMap hashMap = Maps.s();
          hashMap.put("authorized_login_source", Integer.valueOf(value));
          hashMap.put("authorized_scopes", x);
          hashMap.put("authorized_popup_scope", str);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.params = a.a.q(hashMap);
          uElementPack.action2 = "CLICK_REFUSE";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$ThirdPartyAppPackage thirdPartyAp = new ClientContent$ThirdPartyAppPackage();
          uContentPack.thirdPartyAppPackage = thirdPartyAp;
          thirdPartyAp.id = v;
          u1.M("2461395", uActivity, 1, uElementPack, uContentPack, null);
          goto label_0090 ;
       }
       return;
    }
}
