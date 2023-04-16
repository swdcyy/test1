package b4d.a$a;
import qk5.b;
import b4d.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.emotionsdk.bean.EmotionInfo;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import android.util.Pair;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.CharSequence;
import android.widget.EditText;
import java.util.List;

public class a$a implements b	// class@00034c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0,EmotionInfo p1,int p2,View p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a$a.class, "1")) {
          return;
       }
       if (this.a.s.isEnableClickPreview()) {
          a r = this.a.r;
          if (r != null) {
             r.onNext(new Pair(p3, p1));
          }else if(this.a.q.Mh() != null){
             this.a.q.Mh().b(p1);
          }
       }else {
          goto label_0034 ;
       }
       this.a.t.setText("");
       return;
    }
    public void b(List p0){
    }
}
