package com.kuaishou.growth.pendant.core.common.PendantViewModelProviders$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import android.app.Application;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public final class PendantViewModelProviders$b implements ViewModelProvider$Factory	// class@00063d
{
    public final Application a;
    public final String b;

    public void PendantViewModelProviders$b(Application p0,String p1){
       a.p(p0, "application");
       a.p(p1, "id");
       super();
       this.a = p0;
       this.b = p1;
    }
    public ViewModel create(Class p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, PendantViewModelProviders$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (!AndroidViewModel.class.isAssignableFrom(p0)) {
          throw new RuntimeException("unknown class :"+p0.getName());
       }
       Class[] uClassArray = new Class[]{Application.class,String.class};
       obj = new Object[]{this.a,this.b};
       return p0.getConstructor(uClassArray).newInstance(obj);
    }
}
