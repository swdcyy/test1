package com.kuaishou.commercial.home.StickerView$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.commercial.home.StickerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class StickerView$a implements ViewTreeObserver$OnPreDrawListener	// class@0014d1
{
    public final StickerView b;

    public void StickerView$a(StickerView p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, StickerView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.m.getViewTreeObserver().removeOnPreDrawListener(this);
       this.b.a();
       this.b.c();
       return true;
    }
}
