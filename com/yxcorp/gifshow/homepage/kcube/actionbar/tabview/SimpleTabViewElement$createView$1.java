package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement;
import android.view.ViewGroup;
import com.kwai.written.view.IWrittenLayout;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.kcube.ext.widget.TabAutoSizeLayout;
import android.view.ViewGroup$LayoutParams;
import zsa.a;
import java.util.Objects;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement$createView$1$1;

public final class SimpleTabViewElement$createView$1 extends Lambda implements l	// class@00170a
{
    public final ViewGroup $container;
    public final SimpleTabViewElement this$0;

    public void SimpleTabViewElement$createView$1(SimpleTabViewElement p0,ViewGroup p1){
       this.this$0 = p0;
       this.$container = p1;
       super(1);
    }
    public final View invoke(IWrittenLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleTabViewElement$createView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       Objects.requireNonNull(a.q);
       return p0.y0(TabAutoSizeLayout.class, new ViewGroup$LayoutParams(-2, a.p), new SimpleTabViewElement$createView$1$1(this));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
