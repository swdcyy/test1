package com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$7;
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
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import java.lang.Integer;
import ox7.e;
import android.widget.FrameLayout$LayoutParams;
import ox7.e$a;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFragmentView$createView$1$11$1;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFragmentView$createView$1$11$2;
import android.view.ViewGroup;
import com.kwai.component.photo.detail.slide.widget.SlideSkeletonView;
import android.content.Context;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFragmentView$createView$1$11$3;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFragmentView$createView$1$11$4;
import android.view.ViewStub;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public final class FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$7 extends Lambda implements l	// class@000ea7
{
    public final a this$0;

    public void FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$7(a p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$7.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.this$0.P(p0);
       FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$7 tthis$0 = this.this$0;
       this.this$0.w0(p0, Integer.valueOf(R.id.nasa_first_play_root_view), tthis$0.M0(tthis$0.o(e$a.a(tthis$0, p0, null, 1, null)), FeaturedMilanoContainerFragmentView$createView$1$11$1.INSTANCE), FeaturedMilanoContainerFragmentView$createView$1$11$2.INSTANCE);
       FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$7 tthis$01 = this.this$0;
       ViewGroup$LayoutParams layoutParams = tthis$01.M0(tthis$01.m(new FrameLayout$LayoutParams(-1, -2)), FeaturedMilanoContainerFragmentView$createView$1$11$3.INSTANCE);
       IWrittenLayout.i1(this.this$0, p0, new SlideSkeletonView(p0.getContext()), layoutParams, null, 4, null);
       tthis$0 = this.this$0;
       this.this$0.N0(p0, Integer.valueOf(R.id.connect_failed_view_stub), tthis$0.o(e$a.a(tthis$0, p0, null, 1, null)), FeaturedMilanoContainerFragmentView$createView$1$11$4.INSTANCE);
       tthis$01 = this.this$0;
       FrameLayout$LayoutParams layoutParams1 = tthis$01.o(e$a.a(tthis$01, p0, null, 1, null));
       IWrittenLayout.j1(this.this$0, p0, Integer.valueOf(R.id.slide_play_first_empty_placeholder_view), this.this$0.P(new KwaiLoadingView(p0.getContext())), layoutParams1, null, 8, null);
       PatchProxy.onMethodExit(FeaturedMilanoContainerFragmentView$createView$$inlined$apply$lambda$7.class, "1");
       return;
    }
}
