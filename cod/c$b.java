package cod.c$b;
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
import ynd.c;
import god.b;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class c$b implements View$OnClickListener	// class@000351
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       b a;
       TextStyleValue value1;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       TextStyleAttrs value = this.b.c.v0().getValue();
       if (value != null && !value.b()) {
          c k = this.b.k;
          a.o(k, "toastContainer");
          TextTemplateConstantV2.m.f(R.string.arg_RES_7f100c99, k);
          return;
       }else {
          c$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, c.class, "4")) {
             MutableLiveData mutableLiveD = tb.c.s0();
             value1 = mutableLiveD.getValue();
             if (value1 != null) {
                int i = (value1.h() + 1) % 3;
                TextStyleValue value2 = mutableLiveD.getValue();
                if (value2 != null) {
                   value2.k(i);
                }
                mutableLiveD.setValue(mutableLiveD.getValue());
             }
          }
          c uoc = this.b.c.p0();
          if (uoc != null) {
             uoc.a(-1, this.b.c.s0().getValue());
          }
          a = b.a;
          value1 = this.b.c.s0().getValue();
          Integer integer = (value1 != null)? Integer.valueOf(value1.h()): null;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(integer, a, b.class, "7")) {
             if (integer != null && !integer.intValue()) {
                str = "left";
             }else if(integer != null && integer.intValue() == 1){
                str = "center";
             }else {
                str = 2;
                str = (integer != null && integer.intValue() == str)? "right": "unknown";
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ALIGN_TEXT";
             uElementPack.params = "align_type: "+str;
             u1.u(1, uElementPack, null);
          }
          return;
       }
    }
}
