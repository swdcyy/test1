package iy9.a$c;
import erd.g;
import iy9.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;

public final class a$c implements g	// class@0028bb
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          p0 = this.b;
          a t = p0.t;
          String photoId = (t != null)? t.getPhotoId(): null;
          if (!PatchProxy.applyVoidOneRefs(photoId, p0, a.class, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GUIDE_LOGIN_POPUP";
             i3 oi3 = i3.f();
             oi3.d("photo_id", photoId);
             uElementPack.params = oi3.e();
             u1.L("", p0.u, 1, uElementPack, null);
          }
          d.a(-1712118428).x00(this.b.x, 206, null, null);
       }
       return;
    }
}
