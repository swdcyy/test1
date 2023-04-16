package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$ColorsViewHolder$bind$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$b;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import fvc.d;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$ColorsViewHolder$bind$1$1;
import msd.l;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import huc.s;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class TextStyleViewBinder$ColorsViewHolder$bind$1 implements View$OnClickListener	// class@0014d5
{
    public final TextStyleViewBinder$b b;
    public final TextStyleDataManager$a c;

    public void TextStyleViewBinder$ColorsViewHolder$bind$1(TextStyleViewBinder$b p0,TextStyleDataManager$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStyleViewBinder$ColorsViewHolder$bind$1.class, "1")) {
          return;
       }
       TextStyleAttrs value = this.b.b.m.W0().getValue();
       if (value != null && !value.c()) {
          TextStyleViewBinder g = this.b.b.g;
          a.o(g, "toastContainer");
          d.b.c(R.string.arg_RES_7f100c98, g);
          return;
       }else if(this.c.b != null){
          return;
       }else {
          this.b.b.m.a1(1, new TextStyleViewBinder$ColorsViewHolder$bind$1$1(this));
          TextStyleViewBinder$b b = this.b.b;
          TextStyleViewBinder$ColorsViewHolder$bind$1 tc = this.c;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(tc, b, TextStyleViewBinder.class, "11")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SELECT_TEXT_COLOR";
             uElementPack.params = "text_color: "+s.a(tc.a.c);
             u1.u(1, uElementPack, null);
          }
          return;
       }
    }
}
