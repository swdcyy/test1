package eod.h$f;
import androidx.lifecycle.Observer;
import eod.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jn9.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.template.vb.TextTemplateUnfoldViewBinderV2$scrollToSelectedTextTemplate$1;
import androidx.recyclerview.widget.RecyclerView;
import msd.a;
import eod.d;

public final class h$f implements Observer	// class@000dc6
{
    public final h b;

    public void h$f(h p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$f.class, "1")) {
       }else if(p0 == null){
          h$f tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, h.class, "4")) {
             int i = tb.h.g(p0);
             if (i >= 0) {
                tb.E(i, tb.d, false, new TextTemplateUnfoldViewBinderV2$scrollToSelectedTextTemplate$1(tb, i));
             }
          }
       }
       return;
    }
}
