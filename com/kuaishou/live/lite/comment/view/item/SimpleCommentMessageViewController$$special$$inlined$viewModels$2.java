package com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$$special$$inlined$viewModels$2;
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

public final class SimpleCommentMessageViewController$$special$$inlined$viewModels$2 extends Lambda implements a	// class@00081d
{
    public final a $ownerProducer;

    public void SimpleCommentMessageViewController$$special$$inlined$viewModels$2(a p0){
       this.$ownerProducer = p0;
       super(0);
    }
    public final ViewModelStore invoke(){
       ViewModelStore obj = PatchProxy.apply(null, this, SimpleCommentMessageViewController$$special$$inlined$viewModels$2.class, "1");
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
