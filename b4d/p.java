package b4d.p;
import android.widget.TextView$OnEditorActionListener;
import b4d.q;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;

public final class p implements TextView$OnEditorActionListener	// class@000386
{
    public final q a;

    public void p(q p0){
       this.a = p0;
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       boolean b;
       p ta = this.a;
       if (p1 == ta.p.mImeOptions) {
          ta.q.qi();
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
