package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mIdleHandler$2$a;
import android.os.MessageQueue$IdleHandler;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mIdleHandler$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;

public final class MyProfilePostRecoTipsPresenter$mIdleHandler$2$a implements MessageQueue$IdleHandler	// class@001430
{
    public final MyProfilePostRecoTipsPresenter$mIdleHandler$2 a;

    public void MyProfilePostRecoTipsPresenter$mIdleHandler$2$a(MyProfilePostRecoTipsPresenter$mIdleHandler$2 p0){
       this.a = p0;
       super();
    }
    public final boolean queueIdle(){
       Object obj = PatchProxy.apply(null, this, MyProfilePostRecoTipsPresenter$mIdleHandler$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.this$0.W8();
       return false;
    }
}
