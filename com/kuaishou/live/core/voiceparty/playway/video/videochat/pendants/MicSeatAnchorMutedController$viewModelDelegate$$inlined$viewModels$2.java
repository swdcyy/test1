package com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.ViewModelStore;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.a;

public final class MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$2 extends Lambda implements a	// class@0018ee
{
    public final a $ownerProducer;

    public void MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$2(a p0){
       this.$ownerProducer = p0;
       super(0);
    }
    public final ViewModelStore invoke(){
       ViewModelStore obj = PatchProxy.apply(null, this, MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$ownerProducer.invoke().getViewModelStore();
       a.o(obj, "ownerProducer\(\).viewModelStore");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
