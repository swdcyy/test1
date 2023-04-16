package com.tachikoma.core.component.text.richtext.c;
import erd.g;
import com.tachikoma.core.component.text.TKText;
import oo8.b;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.TKBaseNativeModule;
import android.graphics.drawable.BitmapDrawable;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class c implements g	// class@000da6
{
    public final TKText b;
    public final b c;

    public void c(TKText p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(p0 == null || (!p0.isRecycled() && !this.b.isDestroy())){
          BitmapDrawable uBitmapDrawa = new BitmapDrawable(this.b.getContext().getResources(), p0);
          p0 = this.c;
          if (p0 != null) {
             p0.a(uBitmapDrawa);
          }
       }
       return;
    }
}
