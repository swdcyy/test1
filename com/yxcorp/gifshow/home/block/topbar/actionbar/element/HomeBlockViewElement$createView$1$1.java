package com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$createView$1;
import java.lang.Object;
import com.yxcorp.gifshow.home.block.topbar.view.BlockTabView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement;
import android.view.View;

public final class HomeBlockViewElement$createView$1$1 extends Lambda implements l	// class@001652
{
    public final HomeBlockViewElement$createView$1 this$0;

    public void HomeBlockViewElement$createView$1$1(HomeBlockViewElement$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(BlockTabView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockViewElement$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setClipChildren(false);
       p0.setClipToPadding(false);
       HomeBlockViewElement$createView$1$1 tthis$0 = this.this$0;
       Context context = tthis$0.$container.getContext();
       a.o(context, "container.context");
       TextView textView = tthis$0.this$0.w(context);
       textView.setId(R.id.textView);
       p0.addView(textView);
       return;
    }
}
