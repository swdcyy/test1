package com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$d;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FragmentCompositeLifecycleState$d implements r	// class@00179d
{
    public static final FragmentCompositeLifecycleState$d b;

    static {
       FragmentCompositeLifecycleState$d.b = new FragmentCompositeLifecycleState$d();
    }
    public void FragmentCompositeLifecycleState$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FragmentCompositeLifecycleState$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0 == FragmentEvent.DESTROY)? true: false;
       }
       return b;
    }
}
