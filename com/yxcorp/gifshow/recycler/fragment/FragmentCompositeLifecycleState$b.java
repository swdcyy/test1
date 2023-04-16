package com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$b;
import erd.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FragmentCompositeLifecycleState$b implements o	// class@00179b
{
    public static final FragmentCompositeLifecycleState$b b;

    static {
       FragmentCompositeLifecycleState$b.b = new FragmentCompositeLifecycleState$b();
    }
    public void FragmentCompositeLifecycleState$b(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, FragmentCompositeLifecycleState$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "fragmentEvent");
          boolean b = (p0 == FragmentEvent.RESUME)? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
