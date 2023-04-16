package com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView$d;
import erd.g;
import com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class LiveNinePatchBackgroundView$d implements g	// class@001740
{
    public final LiveNinePatchBackgroundView b;
    public final Drawable c;

    public void LiveNinePatchBackgroundView$d(LiveNinePatchBackgroundView p0,Drawable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNinePatchBackgroundView$d.class, "1")) {
       }else {
          this.b.setBackground(this.c);
       }
       return;
    }
}
