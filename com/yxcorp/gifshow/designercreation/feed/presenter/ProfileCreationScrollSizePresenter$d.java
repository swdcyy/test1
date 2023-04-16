package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$d;
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

public final class ProfileCreationScrollSizePresenter$d implements o	// class@0012e5
{
    public final ProfileCreationScrollSizePresenter b;

    public void ProfileCreationScrollSizePresenter$d(ProfileCreationScrollSizePresenter p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       d uod1;
       int i = p0.intValue();
       ProfileCreationScrollSizePresenter$d uod = ProfileCreationScrollSizePresenter$d.class;
       if (PatchProxy.isSupport(uod)) {
          uod1 = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uod, "1");
          if (uod1 != PatchProxyResult.class) {
          label_002d :
             return uod1;
          }
       }
       ProfileCreationScrollSizePresenter$d tb = this.b;
       uod1 = new d(tb.t, (i + tb.X8()));
       goto label_002d ;
    }
}
