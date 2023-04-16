package com.yxcorp.gifshow.share.OperationFactoryAdapter$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.share.OperationFactoryAdapter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import mhc.p1;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.util.List;
import java.lang.Integer;

public final class OperationFactoryAdapter$1 extends FunctionReferenceImpl implements l	// class@001b53
{

    public void OperationFactoryAdapter$1(OperationFactoryAdapter$b p0){
       super(1, p0, OperationFactoryAdapter$b.class, "sortForwardOperation", "sortForwardOperation\(Lcom/yxcorp/gifshow/share/Operation;\)I", 0);
    }
    public final int invoke(p1 p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CallableReference obj = PatchProxy.applyOneRefs(p0, this, OperationFactoryAdapter$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       a.p(p0, "p1");
       obj = this.receiver;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, OperationFactoryAdapter$b.class, "1");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          a.p(p0, "operation");
          i = OperationFactoryAdapter.c.indexOf(p0.M());
       }
       return i;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
