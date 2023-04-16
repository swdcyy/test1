package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class PicTemplateStickerViewBinder$b implements Observer	// class@00139a
{
    public final PicTemplateStickerViewBinder b;

    public void PicTemplateStickerViewBinder$b(PicTemplateStickerViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateStickerViewBinder$b.class, "1")) {
       }else {
          Log.b("PicTemplateStickerViewBinder", "position change: "+p0.get());
          this.b.K(p0.get());
       }
       return;
    }
}
