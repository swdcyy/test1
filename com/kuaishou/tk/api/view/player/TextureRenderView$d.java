package com.kuaishou.tk.api.view.player.TextureRenderView$d;
import java.lang.Runnable;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.TextureView;
import android.view.View$MeasureSpec;

public final class TextureRenderView$d implements Runnable	// class@000fb4
{
    public final TextureRenderView b;

    public void TextureRenderView$d(TextureRenderView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextureRenderView$d.class, "1")) {
          return;
       }
       this.b.getWidth();
       this.b.getHeight();
       TextureRenderView$d tb = this.b;
       tb.measure(View$MeasureSpec.makeMeasureSpec((tb.getWidth() / 2), 0x40000000), View$MeasureSpec.makeMeasureSpec((this.b.getHeight() * 8), 0x40000000));
       tb = this.b;
       tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       return;
    }
}
