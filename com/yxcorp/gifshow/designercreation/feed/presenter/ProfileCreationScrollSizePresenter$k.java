package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$k;
import erd.o;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import u2c.d;

public final class ProfileCreationScrollSizePresenter$k implements o	// class@0012ec
{
    public final ProfileCreationScrollSizePresenter b;

    public void ProfileCreationScrollSizePresenter$k(ProfileCreationScrollSizePresenter p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       d uod;
       int i = p0.intValue();
       ProfileCreationScrollSizePresenter$k ok = ProfileCreationScrollSizePresenter$k.class;
       if (PatchProxy.isSupport(ok)) {
          uod = PatchProxy.applyOneRefs(Integer.valueOf(i), this, ok, "1");
          if (uod != PatchProxyResult.class) {
          label_002d :
             return uod;
          }
       }
       ProfileCreationScrollSizePresenter$k tb = this.b;
       uod = new d(tb.t, (i + tb.X8()));
       goto label_002d ;
    }
}
