package com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$observeReallyVisibleChanged$2;
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

public final class FragmentCompositeLifecycleState$observeReallyVisibleChanged$2 extends Lambda implements a	// class@0017a3
{
    public final FragmentCompositeLifecycleState this$0;

    public void FragmentCompositeLifecycleState$observeReallyVisibleChanged$2(FragmentCompositeLifecycleState p0){
       this.this$0 = p0;
       super(0);
    }
    public final t invoke(){
       Object obj = PatchProxy.apply(null, this, FragmentCompositeLifecycleState$observeReallyVisibleChanged$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.h(FragmentCompositeLifecycleState.l).distinctUntilChanged().skip(1);
    }
    public Object invoke(){
       return this.invoke();
    }
}
