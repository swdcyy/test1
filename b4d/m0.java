package b4d.m0;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment$c;
import b4d.n0$a;
import java.lang.Object;
import android.view.View;
import com.kwai.emotionsdk.bean.EmotionInfo;
import b4d.n0;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import android.util.Pair;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class m0 implements SearchEmotionGifFragment$c	// class@00037d
{
    public final n0$a a;

    public void m0(n0$a p0){
       this.a = p0;
    }
    public final void a(View p0,EmotionInfo p1){
       m0 ta = this.a;
       if (ta.a.v.isEnableClickPreview()) {
          n0 u = ta.a.u;
          if (u != null) {
             u.onNext(new Pair(p0, p1));
          }else if(ta.a.s.Mh() != null){
             ta.a.s.Mh().b(p1);
          }
       }else {
          goto label_001b ;
       }
       return;
    }
}
