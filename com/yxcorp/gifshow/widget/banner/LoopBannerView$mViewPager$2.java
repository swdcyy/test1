package com.yxcorp.gifshow.widget.banner.LoopBannerView$mViewPager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;

public final class LoopBannerView$mViewPager$2 extends Lambda implements a	// class@001951
{
    public final LoopBannerView this$0;

    public void LoopBannerView$mViewPager$2(LoopBannerView p0){
       this.this$0 = p0;
       super(0);
    }
    public final RecyclerViewPager invoke(){
       View obj = PatchProxy.apply(null, this, LoopBannerView$mViewPager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.findViewById(R.id.pager);
       a.o(obj, "findViewById\(R.id.pager\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
