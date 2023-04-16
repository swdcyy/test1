package com.yxcorp.gifshow.v3.f$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lwc.h;
import lwc.g;

public class f$a implements ViewModelProvider$Factory	// class@001520
{

    public void f$a(){
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new h(new g());
    }
}
