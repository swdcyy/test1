package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.written.view.IWrittenLayout;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$createView$1$1;
import android.widget.FrameLayout;

public final class MenuViewElement$createView$1 extends Lambda implements l	// class@0016fd
{
    public static final MenuViewElement$createView$1 INSTANCE;

    static {
       MenuViewElement$createView$1.INSTANCE = new MenuViewElement$createView$1();
    }
    public void MenuViewElement$createView$1(){
       super(1);
    }
    public final View invoke(IWrittenLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MenuViewElement$createView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$receiver");
       return p0.T(new ViewGroup$LayoutParams(-2, -2), new MenuViewElement$createView$1$1(p0));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
