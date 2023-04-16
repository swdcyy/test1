package com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$1;
import android.view.View;
import msd.q;
import com.yxcorp.gifshow.util.l;
import java.lang.Integer;
import android.content.Context;
import ox7.e;
import android.widget.FrameLayout$LayoutParams;
import ox7.e$a;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$2;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$3;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$4;
import com.google.android.material.tabs.KCubeTabLayout;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$5;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$6;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$7;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarShootView;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$8;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$9;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$10;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$11;
import ox7.l;
import ox7.l$a;
import ox7.n;
import android.view.ViewStub;
import ox7.n$a;

public final class BottomBarView$createView$2$2 extends Lambda implements l	// class@000f49
{
    public final BottomBarView$createView$2 this$0;

    public void BottomBarView$createView$2$2(BottomBarView$createView$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomBarView$createView$2$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setClipChildren(false);
       l.b(p0, BottomBarView$createView$2$2$1.INSTANCE);
       this.this$0.this$0.h1(p0, Integer.valueOf(R.id.bottom_bar_color_bg), new View(p0.getContext()), e$a.a(this.this$0.this$0, p0, null, 1, null), BottomBarView$createView$2$2$2.INSTANCE);
       this.this$0.this$0.h1(p0, Integer.valueOf(R.id.bottom_bar_url_light_bg), new KwaiImageView(p0.getContext()), e$a.a(this.this$0.this$0, p0, null, 1, null), BottomBarView$createView$2$2$3.INSTANCE);
       this.this$0.this$0.h1(p0, Integer.valueOf(R.id.bottom_bar_url_dark_bg), new KwaiImageView(p0.getContext()), e$a.a(this.this$0.this$0, p0, null, 1, null), BottomBarView$createView$2$2$4.INSTANCE);
       BottomBarView$createView$2 this$0 = this.this$0.this$0;
       ViewGroup$LayoutParams layoutParams = this$0.M0(this$0.b0(p0, BottomBarView$createView$2$2$5.INSTANCE), BottomBarView$createView$2$2$6.INSTANCE);
       this.this$0.this$0.h1(p0, Integer.valueOf(R.id.tab_layout), new KCubeTabLayout(p0.getContext()), layoutParams, BottomBarView$createView$2$2$7.INSTANCE);
       Context context = p0.getContext();
       a.o(context, "context");
       BottomBarShootView uBottomBarSh = new BottomBarShootView(context);
       IWrittenLayout.j1(this.this$0.this$0, p0, Integer.valueOf(R.id.shoot_container), uBottomBarSh, this.this$0.this$0.z(p0, BottomBarView$createView$2$2$8.INSTANCE), null, 8, null);
       BottomBarView$createView$2 this$01 = this.this$0.this$0;
       this.this$0.this$0.w0(p0, Integer.valueOf(R.id.bottom_bar_top_divider), this$01.M0(this$01.b0(p0, BottomBarView$createView$2$2$9.INSTANCE), BottomBarView$createView$2$2$10.INSTANCE), BottomBarView$createView$2$2$11.INSTANCE);
       BottomBarView$createView$2 this$02 = this.this$0.this$0;
       this$02.P(l$a.b(this$02, p0, Integer.valueOf(R.id.shadow), e$a.a(this.this$0.this$0, p0, null, 1, null), null, 4, null));
       n$a.a(this.this$0.this$0, p0, Integer.valueOf(R.id.follow_selector_bottom_mask_view_stub_nasa), e$a.a(this.this$0.this$0, p0, null, 1, null), null, 4, null);
       n$a.a(this.this$0.this$0, p0, Integer.valueOf(R.id.block_selector_bottom_mask_view_stub_nasa), e$a.a(this.this$0.this$0, p0, null, 1, null), null, 4, null);
       return;
    }
}
