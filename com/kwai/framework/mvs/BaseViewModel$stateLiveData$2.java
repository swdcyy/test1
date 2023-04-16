package com.kwai.framework.mvs.BaseViewModel$stateLiveData$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.mvs.BaseViewModel;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseViewModel$stateLiveData$2 extends Lambda implements a	// class@001783
{
    public final BaseViewModel this$0;

    public void BaseViewModel$stateLiveData$2(BaseViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final MutableLiveData invoke(){
       Object obj = PatchProxy.apply(null, this, BaseViewModel$stateLiveData$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MutableLiveData(this.this$0.h);
    }
    public Object invoke(){
       return this.invoke();
    }
}
