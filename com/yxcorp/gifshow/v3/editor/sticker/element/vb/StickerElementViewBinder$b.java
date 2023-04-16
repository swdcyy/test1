package com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class StickerElementViewBinder$b implements Observer	// class@001233
{
    public final StickerElementViewBinder b;

    public void StickerElementViewBinder$b(StickerElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerElementViewBinder$b.class, "1")) {
       }else {
          a.o(p0, "showLoading");
          if (p0.booleanValue()) {
             this.b.d = new AttrAnimProgressFragment();
             StickerElementViewBinder$b tb = this.b;
             StickerElementViewBinder d = tb.d;
             if (d != null) {
                d.show(tb.h.getChildFragmentManager(), "text close tab");
             }
          }else {
             StickerElementViewBinder d1 = this.b.d;
             if (d1 != null) {
                d1.dismiss();
             }
             this.b.d = null;
          }
          Object[] objArray = new Object[0];
          a.D().w("StickerElementViewBinder", "mShowLoading showLoading:"+p0, objArray);
       }
       return;
    }
}
