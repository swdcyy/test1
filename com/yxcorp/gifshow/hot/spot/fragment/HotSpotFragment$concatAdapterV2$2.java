package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$concatAdapterV2$2;
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
import yua.f;
import qrd.p;
import com.yxcorp.gifshow.hot.spot.adapter.today.TodayListWrapperAdapterV2;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import wua.b;

public final class HotSpotFragment$concatAdapterV2$2 extends Lambda implements a	// class@001834
{
    public final HotSpotFragment this$0;

    public void HotSpotFragment$concatAdapterV2$2(HotSpotFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final ConcatAdapter invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ConcatAdapter$Config$a obj = PatchProxy.apply(objArray, this, HotSpotFragment$concatAdapterV2$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ConcatAdapter$Config$a();
       obj.b(false);
       ConcatAdapter$Config uConfig = obj.a();
       a.o(uConfig, "ConcatAdapter.Config.Bui¡­ypes\(false\)\n    }.build\(\)");
       RecyclerView$Adapter[] uAdapterArra = new RecyclerView$Adapter[5];
       uAdapterArra[0] = this.this$0.Zh();
       int i = 1;
       HotSpotFragment$concatAdapterV2$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj1 = PatchProxy.apply(objArray, tthis$0, HotSpotFragment.class, "8");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.V0.getValue();
       }
       uAdapterArra[i] = obj1;
       tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj2 = PatchProxy.apply(objArray, tthis$0, HotSpotFragment.class, "10");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = tthis$0.X0.getValue();
       }
       uAdapterArra[2] = obj2;
       uAdapterArra[3] = this.this$0.ci();
       uAdapterArra[4] = this.this$0.bi();
       return new ConcatAdapter(uConfig, uAdapterArra);
    }
    public Object invoke(){
       return this.invoke();
    }
}
