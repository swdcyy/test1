package eod.e$e;
import androidx.lifecycle.Observer;
import eod.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jn9.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.template.vb.TextTemplateFoldViewBinderV2$scrollToSelectedTextTemplate$1;
import androidx.recyclerview.widget.RecyclerView;
import msd.a;
import eod.d;

public final class e$e implements Observer	// class@000dbc
{
    public final e b;

    public void e$e(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$e.class, "1")) {
       }else if(p0 == null){
          e$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, e.class, "4")) {
             int i = tb.k.g(p0);
             if (i >= 0) {
                tb.E(i, tb.e, true, new TextTemplateFoldViewBinderV2$scrollToSelectedTextTemplate$1(tb, i));
             }
          }
       }
       return;
    }
}
