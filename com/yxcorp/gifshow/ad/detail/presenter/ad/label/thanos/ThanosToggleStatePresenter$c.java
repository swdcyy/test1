package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter$c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter;
import java.lang.Object;
import vz8.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ToggleState;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.view.View;

public final class ThanosToggleStatePresenter$c implements g	// class@0015c5
{
    public final ThanosToggleStatePresenter b;

    public void ThanosToggleStatePresenter$c(ThanosToggleStatePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosToggleStatePresenter$c.class, "1")) {
       }else if(p0.a() == ToggleState.TOGGLE_STATE_CARD_TO_INFO){
          p0 = this.b;
          Objects.requireNonNull(p0);
          ThanosToggleStatePresenter thanosToggle = ThanosToggleStatePresenter.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, thanosToggle, "6")) {
             Object obj = PatchProxy.apply(objArray, p0, thanosToggle, "8");
             boolean b = true;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(p0.t < ThanosToggleStatePresenter.v){
                User obj1 = PatchProxy.apply(objArray, p0, thanosToggle, "9");
                if (obj1 != PatchProxyResult.class) {
                   i = obj1.intValue();
                }else {
                   thanosToggle = p0.p;
                   if (thanosToggle == null) {
                      a.S("mPhoto");
                   }
                   obj1 = thanosToggle.getUser();
                   if (obj1 != null) {
                      obj1 = obj1.mVerifiedDetail;
                      if (obj1 != null) {
                         i = obj1.mIconType;
                      }
                   }
                   i = null;
                }
                if (i != b && i != 2) {
                label_006d :
                   if (b) {
                      p0 = p0.s;
                      if (p0 == null) {
                         a.S("mToggleStateView");
                      }
                      p0.setVisibility(0);
                   }
                }
             }
          label_006c :
             b = false;
             goto label_006d ;
          }
       }
       return;
    }
}
