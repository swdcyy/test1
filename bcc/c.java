package bcc.c;
import u07.u;
import com.yxcorp.gifshow.relation.user.adapter.c$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y8c.g;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.util.f;
import java.util.Objects;
import com.yxcorp.gifshow.relation.user.adapter.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class c implements u	// class@000442
{
    public final c$a b;

    public void c(c$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       c tb = this.b;
       f.c(tb.getActivity(), tb.r, tb.q);
       c$a s = tb.s;
       c$a q = tb.q;
       Objects.requireNonNull(s);
       if (PatchProxy.applyVoidOneRefs(q, s, c.class, "10")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "DELETE_OR_BLOCK_TOAST";
          i3 oi3 = i3.f();
          oi3.d("click_area", "confirm");
          oi3.d("type", "delete");
          uElementPack.params = oi3.e();
          new ClientEvent$UrlPackage().page = 86;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = TextUtils.I(q.mId);
          userPackage.index = q.mPosition + 1;
          uContentPack.userPackage = userPackage;
          u1.M("id_2447273", s.B, 1, uElementPack, uContentPack, null);
       }
       return;
    }
}