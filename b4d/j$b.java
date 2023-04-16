package b4d.j$b;
import tyc.u4;
import b4d.j;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.CharSequence;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import ky5.n;

public class j$b extends u4	// class@000376
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       String str = (this.b.u.Bi().isEnableFinishShowWithSpace())? p0.toString(): (p0.toString()).trim();
       boolean b = true;
       if (str.length() > 0) {
          this.b.r.setHint("");
          this.b.S8(b);
       }else {
          j w = this.b.w;
          if (w == null || w.getVisibility() == 8) {
             this.b.R8(b);
          }else {
             j$b tb = this.b;
             n.a(tb.r, tb.C, 0);
          }
       }
       return;
    }
}
