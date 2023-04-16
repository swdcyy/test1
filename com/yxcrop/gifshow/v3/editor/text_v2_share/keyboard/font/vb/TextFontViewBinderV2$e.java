package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class TextFontViewBinderV2$e implements ViewTreeObserver$OnGlobalLayoutListener	// class@000ba2
{
    public final TextFontViewBinderV2 b;
    public final int c;

    public void TextFontViewBinderV2$e(TextFontViewBinderV2 p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV2$e.class, "1")) {
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
