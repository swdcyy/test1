package com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$8;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1;
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
import android.view.ViewStub;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$8$1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import lnc.a1;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$8$2;

public final class FeaturedMilanoContainerFrontView$createView$1$8 extends Lambda implements l	// class@000f05
{
    public final FeaturedMilanoContainerFrontView$createView$1 this$0;

    public void FeaturedMilanoContainerFrontView$createView$1$8(FeaturedMilanoContainerFrontView$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedMilanoContainerFrontView$createView$1$8.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.this$0.this$0.P(p0);
       IWrittenLayout.j1(this.this$0.this$0, p0, Integer.valueOf(R.id.featured_search_stub), new ViewStub(p0.getContext(), null), this.this$0.this$0.M0(new FrameLayout$LayoutParams(-2, -1), FeaturedMilanoContainerFrontView$createView$1$8$1.INSTANCE), null, 8, null);
       IWrittenLayout.j1(this.this$0.this$0, p0, Integer.valueOf(R.id.featured_search_bubble_stub), new ViewStub(p0.getContext(), null), this.this$0.this$0.M0(new FrameLayout$LayoutParams(-2, a1.d(R.dimen.arg_RES_7f0702fe)), FeaturedMilanoContainerFrontView$createView$1$8$2.INSTANCE), null, 8, null);
       return;
    }
}
