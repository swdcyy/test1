package com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeReallySelectChanged$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.BitSet;

public final class FragmentCompositeLifecycleState$observeReallySelectChanged$2 extends Lambda implements a	// class@0017a1
{
    public final FragmentCompositeLifecycleState this$0;

    public void FragmentCompositeLifecycleState$observeReallySelectChanged$2(FragmentCompositeLifecycleState p0){
       this.this$0 = p0;
       super(0);
    }
    public final t invoke(){
       Object obj = PatchProxy.apply(null, this, FragmentCompositeLifecycleState$observeReallySelectChanged$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.h(FragmentCompositeLifecycleState.k).distinctUntilChanged().skip(1);
    }
    public Object invoke(){
       return this.invoke();
    }
}
