package com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import lda.a;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.view.CustomAnimationViewPager;
import android.content.Context;
import ox7.e;
import android.widget.FrameLayout$LayoutParams;
import ox7.e$a;
import com.kwai.written.view.IWrittenLayout;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFragmentView$createView$1$5$1;
import android.view.ViewStub;

public final class FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$3 extends Lambda implements l	// class@000ea3
{
    public final a this$0;

    public void FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$3(a p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       IWrittenLayout.j1(this.this$0, p0, Integer.valueOf(R.id.nasa_groot_view_pager), new CustomAnimationViewPager(p0.getContext()), e$a.a(this.this$0, p0, null, 1, null), null, 8, null);
       this.this$0.N0(p0, Integer.valueOf(R.id.more_view_stub), this.this$0.m(new FrameLayout$LayoutParams(-1, -2)), FeaturedMilanoContainerFragmentView$createView$1$5$1.INSTANCE);
       PatchProxy.onMethodExit(FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$3.class, "1");
       return;
    }
}
