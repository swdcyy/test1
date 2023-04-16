package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$1;
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
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$1$1;
import msd.l;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class TextStyleViewBinder$1 implements View$OnClickListener	// class@0014d1
{
    public final TextStyleViewBinder b;

    public void TextStyleViewBinder$1(TextStyleViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       Integer integer;
       String str1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStyleViewBinder$1.class, str)) {
          return;
       }
       TextStyleAttrs value = this.b.m.W0().getValue();
       if (value != null && !value.d()) {
          TextStyleViewBinder g = this.b.g;
          a.o(g, "toastContainer");
          d.b.c(R.string.arg_RES_7f100c99, g);
          return;
       }else {
          this.b.m.a1(1, new TextStyleViewBinder$1$1(this));
          TextStyleViewBinder$1 tb = this.b;
          Pair value1 = tb.m.U0(tb.i).getValue();
          if (value1 != null) {
             TextStyleValue first = value1.getFirst();
             if (first != null) {
                integer = Integer.valueOf(first.i());
             label_0065 :
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(integer, tb, TextStyleViewBinder.class, str)) {
                   if (integer != null && !integer.intValue()) {
                      str1 = "no_text_padding";
                   }else if(integer != null && integer.intValue() == 1){
                      str1 = "full_text_padding";
                   }else {
                      str1 = 2;
                      if (integer != null && integer.intValue() == str1) {
                         str1 = "stroke";
                      }else {
                         str1 = 3;
                         str1 = (integer != null && integer.intValue() == str1)? "neon_lamp": "unknown";
                      }
                   }
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "EDIT_TEXT_STYLE_TRANS";
                   uElementPack.params = "style_type: "+str1;
                   u1.u(1, uElementPack, null);
                }
                return;
             }
          }
          integer = null;
          goto label_0065 ;
       }
    }
}
