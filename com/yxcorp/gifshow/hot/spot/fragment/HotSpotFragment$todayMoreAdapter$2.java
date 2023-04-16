package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayMoreAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.lang.Object;
import yua.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yua.a;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import k2b.e0;

public final class HotSpotFragment$todayMoreAdapter$2 extends Lambda implements a	// class@00183b
{
    public final HotSpotFragment this$0;

    public void HotSpotFragment$todayMoreAdapter$2(HotSpotFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment$todayMoreAdapter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RecyclerView recyclerView = this.this$0.h0();
       a.o(recyclerView, "recyclerView");
       return new d(this.this$0.ei(), this.this$0.ai(), recyclerView, this.this$0);
    }
}
