package a4d.q;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$f;

public class q extends m	// class@000094
{
    public final EmotionFloatEditorFragment c;

    public void q(EmotionFloatEditorFragment p0,boolean p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.c.W0.setPressed(true);
       q tc = this.c;
       BaseEditorFragment d = tc.D;
       if (d != null) {
          if (d.a()) {
             this.c.mi();
          }
       }else {
          tc.mi();
       }
       return;
    }
}
