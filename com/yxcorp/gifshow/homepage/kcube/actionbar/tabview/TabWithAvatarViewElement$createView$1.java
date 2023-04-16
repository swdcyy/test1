package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement;
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
import lnc.a1;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1$1;
import android.view.ViewGroup;

public final class TabWithAvatarViewElement$createView$1 extends Lambda implements l	// class@001711
{
    public final TabWithAvatarViewElement this$0;

    public void TabWithAvatarViewElement$createView$1(TabWithAvatarViewElement p0){
       this.this$0 = p0;
       super(1);
    }
    public final View invoke(IWrittenLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabWithAvatarViewElement$createView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return p0.y0(TabAutoSizeLayout.class, new ViewGroup$LayoutParams(-2, a1.d(0x7f070fdf)), new TabWithAvatarViewElement$createView$1$1(this, p0));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
