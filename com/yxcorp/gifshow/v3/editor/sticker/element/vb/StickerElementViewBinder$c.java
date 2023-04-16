package com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.Objects;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.a;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedList;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class StickerElementViewBinder$c implements Observer	// class@001234
{
    public final StickerElementViewBinder b;

    public void StickerElementViewBinder$c(StickerElementViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerElementViewBinder$c.class, "1")) {
          return;
       }
       p0 = this.b.E();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, EditDecorationContainerView.class, "36")) {
          Collections.sort(p0.l, a.b);
          for (int i = 0; i < p0.l.size(); i = i + 1) {
             p0.l.get(i).bringToFront();
             p0.l.get(i).setZIndex(i);
          }
       }
       return;
    }
}
