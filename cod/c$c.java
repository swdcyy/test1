package cod.c$c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import cod.c;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import android.view.ViewGroup;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a$a;

public final class c$c implements PostListComponentView$a	// class@000352
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public boolean a(b p0,View p1,String p2){
       TextStyleAttrs obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       obj = this.a.c.v0().getValue();
       if (obj == null || obj.c()) {
          return PostListComponentView$a$a.a(this, p0, p1, p2);
       }
       c k = this.a.k;
       a.o(k, "toastContainer");
       TextTemplateConstantV2.m.f(R.string.arg_RES_7f100c98, k);
       return true;
    }
}
