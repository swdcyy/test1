package com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl;

public final class SlidePlayTrafficViewModelImpl$a implements ViewModelProvider$Factory	// class@0014f3
{

    public void SlidePlayTrafficViewModelImpl$a(){
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayTrafficViewModelImpl$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       return new SlidePlayTrafficViewModelImpl();
    }
}
