package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$mAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView;
import java.lang.Object;
import x1b.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import y8c.g;

public final class NearbyHeaderFunctionEntranceView$mAdapter$2 extends Lambda implements a	// class@001ab9
{
    public final NearbyHeaderFunctionEntranceView this$0;

    public void NearbyHeaderFunctionEntranceView$mAdapter$2(NearbyHeaderFunctionEntranceView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NearbyHeaderFunctionEntranceView$mAdapter$2 obj = PatchProxy.apply(objArray, this, NearbyHeaderFunctionEntranceView$mAdapter$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.apply(objArray, obj, NearbyHeaderFunctionEntranceView.class, "8");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a();
          uoa.n1("nearby_header_NEARBY_HEAD_FUNCTION_ITEM_CALLBACK", obj.f);
          uoa.n1("ADAPTER", uoa);
       }
       return uoa;
    }
}
