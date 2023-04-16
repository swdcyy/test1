package com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import lda.c;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$1;
import android.view.ViewGroup$LayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$2;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$3;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$4;
import com.yxcorp.gifshow.widget.IconifyImageButton;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$5;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$6;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$7;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$8;
import ox7.e;
import ox7.e$a;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$9;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$10;
import android.view.ViewStub;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$11;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$12;

public final class FeaturedMilanoContainerFrontView$createView$1 extends Lambda implements l	// class@000f07
{
    public final c this$0;

    public void FeaturedMilanoContainerFrontView$createView$1(c p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedMilanoContainerFrontView$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setId(R.id.featured_milano_front_view);
       this.this$0.h1(p0, Integer.valueOf(R.id.nasa_live_entry_button), new AppCompatImageView(p0.getContext()), this.this$0.M0(new FrameLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d)), FeaturedMilanoContainerFrontView$createView$1$1.INSTANCE), new FeaturedMilanoContainerFrontView$createView$1$2(this));
       ViewGroup viewGroup = p0;
       this.this$0.h1(viewGroup, Integer.valueOf(R.id.featured_left_login), new TextView(p0.getContext()), this.this$0.M0(new FrameLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f070325), a1.d(R.dimen.arg_RES_7f0702df)), FeaturedMilanoContainerFrontView$createView$1$3.INSTANCE), new FeaturedMilanoContainerFrontView$createView$1$4(this));
       this.this$0.h1(p0, Integer.valueOf(R.id.featured_left_hamburger), new IconifyImageButton(p0.getContext()), this.this$0.M0(new FrameLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d)), FeaturedMilanoContainerFrontView$createView$1$5.INSTANCE), new FeaturedMilanoContainerFrontView$createView$1$6(this));
       this.this$0.h1(viewGroup, Integer.valueOf(R.id.featured_search_layout), new FrameLayout(p0.getContext()), this.this$0.M0(new FrameLayout$LayoutParams(-2, a1.d(R.dimen.arg_RES_7f07030d)), FeaturedMilanoContainerFrontView$createView$1$7.INSTANCE), new FeaturedMilanoContainerFrontView$createView$1$8(this));
       FeaturedMilanoContainerFrontView$createView$1 tthis$0 = this.this$0;
       this.this$0.N0(p0, Integer.valueOf(R.id.series_play_btn_portrait_layout_stub), tthis$0.M0(e$a.b(tthis$0, p0, null, 1, null), FeaturedMilanoContainerFrontView$createView$1$9.INSTANCE), FeaturedMilanoContainerFrontView$createView$1$10.INSTANCE);
       tthis$0 = this.this$0;
       this.this$0.N0(p0, Integer.valueOf(R.id.series_play_btn_landscape_layout_stub), tthis$0.M0(e$a.b(tthis$0, p0, null, 1, null), FeaturedMilanoContainerFrontView$createView$1$11.INSTANCE), FeaturedMilanoContainerFrontView$createView$1$12.INSTANCE);
       return;
    }
}
