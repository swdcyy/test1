package com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt$a;
import fk2.b;
import android.view.View;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class StickerhelperKt$a implements b	// class@00189c
{
    public final View b;

    public void StickerhelperKt$a(View p0){
       this.b = p0;
       super();
    }
    public final boolean Q0(Rect p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, StickerhelperKt$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new int[2];
       this.b.getLocationInWindow(obj);
       return p0.intersects(obj[0], obj[1], (obj[0] + this.b.getWidth()), (obj[1] + this.b.getHeight()));
    }
}
