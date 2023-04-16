package cod.c$a;
import android.view.View$OnClickListener;
import cod.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.util.List;
import java.util.Collection;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import ynd.c;
import god.b;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class c$a implements View$OnClickListener	// class@000350
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       b a;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       TextStyleAttrs value = this.b.c.v0().getValue();
       if (value != null && !value.d()) {
          c k = this.b.k;
          a.o(k, "toastContainer");
          TextTemplateConstantV2.m.f(R.string.arg_RES_7f100c99, k);
          return;
       }else {
          c$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, c.class, "3")) {
             MutableLiveData mutableLiveD = tb.c.s0();
             TextStyleValue value2 = mutableLiveD.getValue();
             if (value2 != null) {
                int i = value2.i();
                value = tb.c.v0().getValue();
                List list = (value != null)? value.a(): null;
                int i1 = (list == null || list.isEmpty())? 1: 0;
                if (!i1) {
                   i = list.get(((i + 1) % list.size())).intValue();
                }
                TextStyleValue value3 = mutableLiveD.getValue();
                if (value3 != null) {
                   value3.j();
                }
                value3 = mutableLiveD.getValue();
                if (value3 != null) {
                   value3.l(i);
                }
                value3 = mutableLiveD.getValue();
                if (value3 != null) {
                   TextStyleValue.c(value3, null, 1, null);
                }
                mutableLiveD.setValue(mutableLiveD.getValue());
             }
          }
          c uoc = this.b.c.p0();
          if (uoc != null) {
             uoc.a(-1, this.b.c.s0().getValue());
          }
          a = b.a;
          TextStyleValue value1 = this.b.c.s0().getValue();
          Integer integer = (value1 != null)? Integer.valueOf(value1.i()): null;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(integer, a, b.class, "5")) {
             if (integer != null && !integer.intValue()) {
                str = "no_text_padding";
             }else if(integer != null && integer.intValue() == 1){
                str = "full_text_padding";
             }else {
                str = 2;
                if (integer != null && integer.intValue() == str) {
                   str = "stroke";
                }else {
                   str = 3;
                   str = (integer != null && integer.intValue() == str)? "neon_lamp": "unknown";
                }
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "EDIT_TEXT_STYLE_TRANS";
             uElementPack.params = "style_type: "+str;
             u1.u(1, uElementPack, null);
          }
          return;
       }
    }
}
