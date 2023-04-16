package com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement;
import android.view.ViewGroup;
import com.kwai.written.view.IWrittenLayout;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.home.block.topbar.view.BlockTabView;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$createView$1$1;

public final class HomeBlockViewElement$createView$1 extends Lambda implements l	// class@001653
{
    public final ViewGroup $container;
    public final HomeBlockViewElement this$0;

    public void HomeBlockViewElement$createView$1(HomeBlockViewElement p0,ViewGroup p1){
       this.this$0 = p0;
       this.$container = p1;
       super(1);
    }
    public final View invoke(IWrittenLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeBlockViewElement$createView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       Objects.requireNonNull(HomeBlockViewElement.q);
       return p0.y0(BlockTabView.class, new ViewGroup$LayoutParams(-2, HomeBlockViewElement.p), new HomeBlockViewElement$createView$1$1(this));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
