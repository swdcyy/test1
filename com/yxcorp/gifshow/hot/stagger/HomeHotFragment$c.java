package com.yxcorp.gifshow.hot.stagger.HomeHotFragment$c;
import vm5.o;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment;
import java.lang.Object;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import e50.i;
import ff6.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.fragment.app.Fragment;
import moc.b;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.repo.a;

public class HomeHotFragment$c implements o	// class@00189b
{
    public final HomeHotFragment a;

    public void HomeHotFragment$c(HomeHotFragment p0){
       this.a = p0;
       super();
    }
    public void a(Intent p0,PhotoDetailParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeHotFragment$c.class, "1")) {
          return;
       }
       p1.getDetailLogParam().addSlideSessionParams(p1.getBaseFeed());
       DetailCommonParam detailCommon = p1.getDetailCommonParam();
       if (this.a.W0.isEnabled()) {
          detailCommon.setRankFetcherId(b.e(new a(this.a.W0), this.a.getViewLifecycleOwner()));
       }
       if (this.a.J != null) {
          detailCommon.setDynamicPrefetcherId(a.b(a.b()).c(this.a.J));
       }
       return;
    }
}
