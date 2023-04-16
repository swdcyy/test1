package e8a.a;
import com.yxcorp.gifshow.widget.d$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TargetUserPackageV2;
import k2b.u1;
import java.util.Map;
import com.kuaishou.android.model.mix.AtUserItem;
import java.lang.StringBuilder;

public final class a implements d$a	// class@002096
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(View p0,User p1){
       a ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p1, ta, uob, "13")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uElementPack.action2 = "USER_NICKNAME_BUTTON";
          uContentPack.photoPackage = w1.f(ta.g.getEntity());
          ClientContent$TargetUserPackageV2 targetUserPa = new ClientContent$TargetUserPackageV2();
          targetUserPa.identity = p1.getId();
          uContentPack.targetUserPackage = targetUserPa;
          u1.u(1, uElementPack, uContentPack);
          if (!PatchProxy.applyVoidTwoRefs(p1, uContentPack, ta, uob, "14")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "DESCRIPT_AREA_CLICK_AT_FRIEND";
             AtUserItem uAtUserItem = ta.h.get(p1.getId());
             String str = (uAtUserItem != null && uAtUserItem.isCurrentLiving != null)? "YES": "NO";
             uElementPack1.params = "{\"is_live\":\""+str+"\"}";
             uContentPack.photoPackage = w1.f(ta.g.getEntity());
             u1.u(1, uElementPack1, uContentPack);
          }
       }
       return;
    }
}
