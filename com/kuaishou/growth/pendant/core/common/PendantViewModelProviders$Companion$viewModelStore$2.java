package com.kuaishou.growth.pendant.core.common.PendantViewModelProviders$Companion$viewModelStore$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.ViewModelStore;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PendantViewModelProviders$Companion$viewModelStore$2 extends Lambda implements a	// class@00063b
{
    public static final PendantViewModelProviders$Companion$viewModelStore$2 INSTANCE;

    static {
       PendantViewModelProviders$Companion$viewModelStore$2.INSTANCE = new PendantViewModelProviders$Companion$viewModelStore$2();
    }
    public void PendantViewModelProviders$Companion$viewModelStore$2(){
       super(0);
    }
    public final ViewModelStore invoke(){
       Object obj = PatchProxy.apply(null, this, PendantViewModelProviders$Companion$viewModelStore$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewModelStore();
    }
    public Object invoke(){
       return this.invoke();
    }
}
