package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$b;
import pn9.b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.ProgressBar;
import android.widget.FrameLayout;
import android.view.ViewGroup;

public final class TextFontViewBinderV3$b extends b	// class@000c55
{
    public final TextFontViewBinderV3 c;

    public void TextFontViewBinderV3$b(TextFontViewBinderV3 p0,View p1){
       this.c = p0;
       super(p1);
    }
    public RecyclerView D(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinderV3$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.D();
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV3$b.class, "2")) {
          return;
       }
       this.c.d.setVisibility(8);
       this.c.e.setVisibility(8);
       this.c.j.setVisibility(0);
       this.c.D().setVisibility(0);
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV3$b.class, "4")) {
          return;
       }
       this.c.d.setVisibility(8);
       this.c.e.setVisibility(0);
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV3$b.class, "3")) {
          return;
       }
       this.c.d.setVisibility(0);
       this.c.e.setVisibility(8);
       return;
    }
}
