package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$e;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kod.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;

public final class TextVideoPreviewViewBinder$e implements Runnable	// class@000b2d
{
    public final TextVideoPreviewViewBinder b;

    public void TextVideoPreviewViewBinder$e(TextVideoPreviewViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextVideoPreviewViewBinder$e.class, "1")) {
          return;
       }
       TextVideoPreviewViewBinder$e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, TextVideoPreviewViewBinder.class, "17")) {
          BaseFragment uBaseFragmen = tb.Q().q();
          if (!uBaseFragmen instanceof BaseEditorFragment) {
             uBaseFragmen = objArray;
          }
          if (uBaseFragmen != null) {
             objArray = uBaseFragmen.B;
          }
          if (objArray != null) {
             objArray.f(tb.N);
          }
       }
       return;
    }
}
