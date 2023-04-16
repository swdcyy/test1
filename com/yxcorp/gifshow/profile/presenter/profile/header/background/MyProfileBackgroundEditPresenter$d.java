package com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$d;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class MyProfileBackgroundEditPresenter$d implements g	// class@001499
{
    public final MyProfileBackgroundEditPresenter b;

    public void MyProfileBackgroundEditPresenter$d(MyProfileBackgroundEditPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileBackgroundEditPresenter$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, MyProfileBackgroundEditPresenter.class, "6")) {
             p0.W8();
          }
       }
       return;
    }
}
