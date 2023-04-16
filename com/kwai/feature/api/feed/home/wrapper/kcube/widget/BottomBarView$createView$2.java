package com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import ox7.e;
import android.widget.FrameLayout$LayoutParams;
import ox7.e$a;
import android.view.ViewGroup$LayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import lnc.a1;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2;
import android.view.ViewGroup;

public final class BottomBarView$createView$2 extends Lambda implements l	// class@000f4a
{
    public final BottomBarView this$0;

    public void BottomBarView$createView$2(BottomBarView p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomBarView$createView$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setId(R.id.bottom_bar_and_grey_cover_container);
       BottomBarView$createView$2 tthis$0 = this.this$0;
       Integer integer = Integer.valueOf(R.id.bottom_bar_container);
       BottomBarView$createView$2 tthis$01 = this.this$0;
       ViewGroup$LayoutParams layoutParams = tthis$01.d0(e$a.a(tthis$01, p0, null, 1, null));
       ViewGroup$LayoutParams layoutParams1 = layoutParams;
       if (!Edge2EdgeHelper.b()) {
          layoutParams1.height = a1.d(0x7f070bf1);
       }
       p0.setMinimumHeight(a1.d(R.dimen.arg_RES_7f070bf1));
       layoutParams1.gravity = 80;
       tthis$0.U0(p0, integer, layoutParams, new BottomBarView$createView$2$2(this));
       return;
    }
}
