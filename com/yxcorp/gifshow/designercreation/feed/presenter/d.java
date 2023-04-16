package com.yxcorp.gifshow.designercreation.feed.presenter.d;
import erd.o;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$p;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import u2c.d;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;

public final class d implements o	// class@0012f8
{
    public final ProfileCreationScrollSizePresenter$p b;

    public void d(ProfileCreationScrollSizePresenter$p p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       int i = p0.intValue();
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          uod = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uod, "1");
          if (uod != PatchProxyResult.class) {
          label_002f :
             return uod;
          }
       }
       ProfileCreationScrollSizePresenter$p b = this.b.b;
       uod = new d(b.t, (i + b.X8()));
       goto label_002f ;
    }
}
