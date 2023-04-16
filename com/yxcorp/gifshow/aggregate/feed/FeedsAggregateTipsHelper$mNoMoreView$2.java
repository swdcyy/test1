package com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper$mNoMoreView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import i2b.a;
import lnc.a1;

public final class FeedsAggregateTipsHelper$mNoMoreView$2 extends Lambda implements a	// class@00192e
{
    public final FeedsAggregateTipsHelper this$0;

    public void FeedsAggregateTipsHelper$mNoMoreView$2(FeedsAggregateTipsHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       View obj = PatchProxy.apply(null, this, FeedsAggregateTipsHelper$mNoMoreView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.i(this.this$0.n.h0(), R.layout.arg_RES_7f0d093d);
       obj.setPadding(0, a1.e(20.00f), 0, a1.e(40.00f));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
