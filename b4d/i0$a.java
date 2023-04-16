package b4d.i0$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;
import b4d.i0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.EditText;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public class i0$a implements BaseEditorFragment$b	// class@000372
{
    public final i0 a;

    public void i0$a(i0 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       i0$a uoa = i0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       this.a.u.setText(p1);
       this.a.r.qi();
       if (this.a.r.Jh() != null) {
          this.a.r.Jh().a(p0, p1);
       }
       return;
    }
    public void b(int p0,String p1){
       i0$a uoa = i0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (this.a.r.Jh() != null) {
          this.a.r.Jh().b(p0, p1);
       }
       return;
    }
}
