package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$h;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextElementViewBinder$h implements Observer	// class@001406
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$h(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$h.class, "1")) {
       }else {
          a.o(p0, "showLoading");
          if (p0.booleanValue()) {
             this.b.s = new AttrAnimProgressFragment();
             TextElementViewBinder$h tb = this.b;
             TextElementViewBinder s = tb.s;
             if (s != null) {
                s.show(tb.I().getChildFragmentManager(), "load old sub asset");
             }
          }else {
             TextElementViewBinder s1 = this.b.s;
             if (s1 != null) {
                s1.dismiss();
             }
             this.b.s = null;
          }
          Object[] objArray = new Object[0];
          a.D().w("TextElementViewBinder", "mShowOldSubAssetLoadLoading showLoading:"+p0, objArray);
       }
       return;
    }
}
