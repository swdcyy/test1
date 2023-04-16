package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.written.view.IWrittenLayout;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.IconifyImageButton;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$createView$1$1$1;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public final class MenuViewElement$createView$1$1 extends Lambda implements l	// class@0016fc
{
    public final IWrittenLayout $this_buildView;

    public void MenuViewElement$createView$1$1(IWrittenLayout p0){
       this.$this_buildView = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MenuViewElement$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setId(R.id.left_btn_parent);
       this.$this_buildView.g1(p0, new IconifyImageButton(p0.getContext()), this.$this_buildView.o(new FrameLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d))), MenuViewElement$createView$1$1$1.INSTANCE);
       return;
    }
}
