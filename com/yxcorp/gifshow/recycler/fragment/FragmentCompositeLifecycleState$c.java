package com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState$c;
import erd.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FragmentCompositeLifecycleState$c implements o	// class@00179c
{
    public static final FragmentCompositeLifecycleState$c b;

    static {
       FragmentCompositeLifecycleState$c.b = new FragmentCompositeLifecycleState$c();
    }
    public void FragmentCompositeLifecycleState$c(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, FragmentCompositeLifecycleState$c.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "objects");
          int len = p0.length;
          int i = 0;
          while (true) {
             if (i < len) {
                int i1 = a.g(Boolean.TRUE, p0[i]) ^ 0x01;
                if (i1) {
                   uBoolean = Boolean.FALSE;
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                uBoolean = Boolean.TRUE;
                break ;
             }
          }
       }
       return uBoolean;
    }
}
