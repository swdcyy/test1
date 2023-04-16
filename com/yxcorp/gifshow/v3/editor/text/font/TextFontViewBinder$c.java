package com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;

public final class TextFontViewBinder$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@00142f
{
    public final TextFontViewBinder b;
    public final int c;

    public void TextFontViewBinder$c(TextFontViewBinder p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinder$c.class, "1")) {
          return;
       }
       this.b.E().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.D().N0(this.c);
       this.b.D().J0(this.c);
       return;
    }
}
