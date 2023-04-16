package com.kuaishou.live.audience.component.gift.DrawingGiftGallery$b;
import android.view.View$OnKeyListener;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery$d;

public class DrawingGiftGallery$b implements View$OnKeyListener	// class@000ad6
{
    public final DrawingGiftGallery b;

    public void DrawingGiftGallery$b(DrawingGiftGallery p0){
       this.b = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(DrawingGiftGallery$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, DrawingGiftGallery$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 4 && !p2.getAction()) {
          this.b.d.b();
          return true;
       }else {
          return false;
       }
    }
}
