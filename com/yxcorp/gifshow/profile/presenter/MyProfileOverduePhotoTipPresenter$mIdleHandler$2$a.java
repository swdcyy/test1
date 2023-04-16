package com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$mIdleHandler$2$a;
import android.os.MessageQueue$IdleHandler;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$mIdleHandler$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter;

public final class MyProfileOverduePhotoTipPresenter$mIdleHandler$2$a implements MessageQueue$IdleHandler	// class@00141e
{
    public final MyProfileOverduePhotoTipPresenter$mIdleHandler$2 a;

    public void MyProfileOverduePhotoTipPresenter$mIdleHandler$2$a(MyProfileOverduePhotoTipPresenter$mIdleHandler$2 p0){
       this.a = p0;
       super();
    }
    public final boolean queueIdle(){
       Object obj = PatchProxy.apply(null, this, MyProfileOverduePhotoTipPresenter$mIdleHandler$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.this$0.R8();
       return false;
    }
}
