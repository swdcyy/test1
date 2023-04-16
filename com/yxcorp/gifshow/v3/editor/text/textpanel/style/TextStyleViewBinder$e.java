package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public final class TextStyleViewBinder$e implements ViewTreeObserver$OnGlobalLayoutListener	// class@0014da
{
    public final TextStyleViewBinder b;
    public final int c;
    public final boolean d;

    public void TextStyleViewBinder$e(TextStyleViewBinder p0,int p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TextStyleViewBinder$e.class, "1")) {
          return;
       }
       this.b.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.D(this.c, this.d);
       return;
    }
}
