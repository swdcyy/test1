package a4d.k;
import lnc.c3$a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class k implements c3$a	// class@00008e
{
    public final EmotionFloatEditorFragment a;

    public void k(EmotionFloatEditorFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       k ta = this.a;
       ta.Z1 = p0;
       boolean b = ta.ni();
       if (ta.M.mForceNewEditorStyle == null || b) {
          ta.Qi(b);
       }
       ta.J1.onNext(Boolean.valueOf(b));
       return;
    }
}
