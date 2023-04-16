package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$2;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import fvc.d;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$2$1;
import msd.l;

public final class TextStyleViewBinder$2 implements View$OnClickListener	// class@0014d3
{
    public final TextStyleViewBinder b;

    public void TextStyleViewBinder$2(TextStyleViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStyleViewBinder$2.class, "1")) {
          return;
       }
       TextStyleAttrs value = this.b.m.W0().getValue();
       if (value != null && !value.b()) {
          TextStyleViewBinder g = this.b.g;
          a.o(g, "toastContainer");
          d.b.c(R.string.arg_RES_7f100c99, g);
          return;
       }else {
          this.b.m.a1(1, new TextStyleViewBinder$2$1(this));
          return;
       }
    }
}
