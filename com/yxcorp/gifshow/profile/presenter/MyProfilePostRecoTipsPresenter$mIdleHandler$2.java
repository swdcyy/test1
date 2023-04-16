package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mIdleHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;
import android.os.MessageQueue$IdleHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mIdleHandler$2$a;

public final class MyProfilePostRecoTipsPresenter$mIdleHandler$2 extends Lambda implements a	// class@001431
{
    public final MyProfilePostRecoTipsPresenter this$0;

    public void MyProfilePostRecoTipsPresenter$mIdleHandler$2(MyProfilePostRecoTipsPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final MessageQueue$IdleHandler invoke(){
       Object obj = PatchProxy.apply(null, this, MyProfilePostRecoTipsPresenter$mIdleHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MyProfilePostRecoTipsPresenter$mIdleHandler$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
