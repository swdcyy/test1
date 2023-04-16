package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class TextFontViewBinderV3$f implements ViewTreeObserver$OnGlobalLayoutListener	// class@000c59
{
    public final TextFontViewBinderV3 b;
    public final int c;

    public void TextFontViewBinderV3$f(TextFontViewBinderV3 p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV3$f.class, "1")) {
          return;
       }
       if (this.b.D().getWidth() && (this.b.D().getHeight() && this.b.D().getChildCount())) {
          this.b.D().getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.E(this.c);
       }
    label_0044 :
       return;
    }
}
