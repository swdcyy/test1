package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement$createView$1;
import java.lang.Object;
import com.kwai.kcube.ext.widget.TabAutoSizeLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import zsa.a;
import android.view.View;

public final class SimpleTabViewElement$createView$1$1 extends Lambda implements l	// class@001709
{
    public final SimpleTabViewElement$createView$1 this$0;

    public void SimpleTabViewElement$createView$1$1(SimpleTabViewElement$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabAutoSizeLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleTabViewElement$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setClipChildren(false);
       p0.setClipToPadding(false);
       SimpleTabViewElement$createView$1$1 tthis$0 = this.this$0;
       Context context = tthis$0.$container.getContext();
       a.o(context, "container.context");
       IconifyRadioButtonNew iconifyRadio = tthis$0.this$0.w(context);
       iconifyRadio.setId(R.id.textView);
       p0.addView(iconifyRadio);
       return;
    }
}
