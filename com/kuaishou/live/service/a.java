package com.kuaishou.live.service.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.service.ServiceHolderImpl$b;
import java.lang.Object;
import com.kuaishou.live.service.ServiceHolderImpl$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.service.ServiceHolderImpl;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;

public final class a implements Observer	// class@000f8a
{
    public final ServiceHolderImpl$b b;

    public void a(ServiceHolderImpl$b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          LiveData liveData = this.b.c();
          Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.kuaishou.live.service.ServiceHolderImpl.HolderState<T>>");
          liveData.setValue(p0);
       }
       return;
    }
}
