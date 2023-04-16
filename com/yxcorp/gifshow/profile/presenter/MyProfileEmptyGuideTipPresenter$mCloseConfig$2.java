package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$mCloseConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import u3c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class MyProfileEmptyGuideTipPresenter$mCloseConfig$2 extends Lambda implements a	// class@001410
{
    public static final MyProfileEmptyGuideTipPresenter$mCloseConfig$2 INSTANCE;

    static {
       MyProfileEmptyGuideTipPresenter$mCloseConfig$2.INSTANCE = new MyProfileEmptyGuideTipPresenter$mCloseConfig$2();
    }
    public void MyProfileEmptyGuideTipPresenter$mCloseConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter$mCloseConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("profileUserGuideCloseConfig", c.class, new c());
    }
}
