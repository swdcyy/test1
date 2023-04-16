package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$concatAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import androidx.recyclerview.widget.ConcatAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.ConcatAdapter$Config$a;
import androidx.recyclerview.widget.ConcatAdapter$Config;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import vua.a;
import java.util.Objects;
import yua.e;
import qrd.p;
import yua.a;
import yua.d;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import wua.b;

public final class HotSpotFragment$concatAdapter$2 extends Lambda implements a	// class@001833
{
    public final HotSpotFragment this$0;

    public void HotSpotFragment$concatAdapter$2(HotSpotFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final ConcatAdapter invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ConcatAdapter$Config$a obj = PatchProxy.apply(objArray, this, HotSpotFragment$concatAdapter$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ConcatAdapter$Config$a();
       obj.b(false);
       ConcatAdapter$Config uConfig = obj.a();
       a.o(uConfig, "ConcatAdapter.Config.Bui¡­ypes\(false\)\n    }.build\(\)");
       RecyclerView$Adapter[] uAdapterArra = new RecyclerView$Adapter[6];
       uAdapterArra[0] = this.this$0.Zh();
       int i = 1;
       HotSpotFragment$concatAdapter$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj1 = PatchProxy.apply(objArray, tthis$0, HotSpotFragment.class, "5");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.Y.getValue();
       }
       uAdapterArra[i] = obj1;
       uAdapterArra[2] = this.this$0.ei();
       tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj2 = PatchProxy.apply(objArray, tthis$0, HotSpotFragment.class, "7");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = tthis$0.U0.getValue();
       }
       uAdapterArra[3] = obj2;
       uAdapterArra[4] = this.this$0.ci();
       uAdapterArra[5] = this.this$0.bi();
       return new ConcatAdapter(uConfig, uAdapterArra);
    }
    public Object invoke(){
       return this.invoke();
    }
}
