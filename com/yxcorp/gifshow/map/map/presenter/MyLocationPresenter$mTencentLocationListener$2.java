package com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$mTencentLocationListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MyLocationPresenter$mTencentLocationListener$2 extends Lambda implements a	// class@001cc4
{
    public final MyLocationPresenter this$0;

    public void MyLocationPresenter$mTencentLocationListener$2(MyLocationPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final MyLocationPresenter$a invoke(){
       Object obj = PatchProxy.apply(null, this, MyLocationPresenter$mTencentLocationListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MyLocationPresenter$a(this.this$0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
