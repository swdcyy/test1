package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$d;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;

public final class ProfileHeaderStatusPresenter$d implements g	// class@0014d5
{
    public final ProfileHeaderStatusPresenter b;

    public void ProfileHeaderStatusPresenter$d(ProfileHeaderStatusPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       ProfileHeaderStatusPresenter$d uod = ProfileHeaderStatusPresenter$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "1")) {
          KsLogProfileStatusTag sTATUS_PUBLI = KsLogProfileStatusTag.STATUS_PUBLISH;
          String str = "ProfileHeaderStatusPresenter";
          sTATUS_PUBLI.appendTag(str);
          g.e(sTATUS_PUBLI, "activity visible:"+b);
          ProfileHeaderStatusPresenter$d tb = this.b;
          tb.L = b;
          if (!b) {
             if (!PatchProxy.applyVoid(null, tb, ProfileHeaderStatusPresenter.class, "24")) {
                b = tb.B;
                if (b != null) {
                   b = b.getController();
                   if (b != null) {
                      b = b.getAnimatable();
                      if (b != null && b.isRunning()) {
                         g.e(sTATUS_PUBLI.appendTag(str), "stop animation");
                         b.stop();
                      }
                   }
                }
             }
          }else {
             tb.S8();
          }
       }
       return;
    }
}
