package com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView$c;
import erd.g;
import com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class LiveNinePatchBackgroundView$c implements g	// class@00173f
{
    public final LiveNinePatchBackgroundView b;

    public void LiveNinePatchBackgroundView$c(LiveNinePatchBackgroundView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNinePatchBackgroundView$c.class, "1")) {
       }else {
          this.b.setBackground(p0);
       }
       return;
    }
}
