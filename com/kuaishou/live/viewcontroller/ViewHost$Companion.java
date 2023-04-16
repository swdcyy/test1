package com.kuaishou.live.viewcontroller.ViewHost$Companion;
import java.lang.Object;
import com.kuaishou.live.viewcontroller.ViewHost;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import eq3.a;
import com.kuaishou.live.viewcontroller.ViewHost$Companion$forNoView$1;
import msd.a;
import android.view.View;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewHost$Companion$forView$1;

public final class ViewHost$Companion	// class@000fe7
{
    public static final ViewHost$Companion a;

    static {
       ViewHost$Companion.a = new ViewHost$Companion();
    }
    public void ViewHost$Companion(){
       super();
    }
    public final ViewHost a(){
       Object obj = PatchProxy.apply(null, this, ViewHost$Companion.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(ViewHost$Companion$forNoView$1.INSTANCE);
    }
    public final ViewHost b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewHost$Companion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       return new a(new ViewHost$Companion$forView$1(p0));
    }
}
