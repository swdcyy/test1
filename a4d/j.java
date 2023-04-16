package a4d.j;
import lnc.c3$a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class j implements c3$a	// class@00008d
{
    public final EmotionFloatEditorFragment a;

    public void j(EmotionFloatEditorFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       j ta = this.a;
       ta.X1 = p0;
       boolean b = ta.ni();
       if (ta.M.mForceNewEditorStyle == null || b) {
          ta.Qi(b);
       }
       ta.J1.onNext(Boolean.valueOf(b));
       return;
    }
}
