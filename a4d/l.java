package a4d.l;
import lnc.c3$a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.view.View;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class l implements c3$a	// class@00008f
{
    public final EmotionFloatEditorFragment a;

    public void l(EmotionFloatEditorFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       l ta = this.a;
       ta.Z1 = p0;
       boolean b = ta.ni();
       if (ta.M.mForceNewEditorStyle == null || b) {
          ta.Y0.setEnabled(b);
       }
       ta.K1.onNext(Boolean.FALSE);
       return;
    }
}
