package com.kuaishou.live.common.core.component.hotspot.slide.SlideSwitchLayout;
import android.widget.ViewSwitcher;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class SlideSwitchLayout extends ViewSwitcher	// class@00144a
{
    public HashMap b;

    public void SlideSwitchLayout(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void SlideSwitchLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, SlideSwitchLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getChildCount() >= 2)? true: false;
       return b;
    }
}
