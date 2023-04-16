package a4d.p;
import uid.e$a;
import com.yxcorp.plugin.emotion.fragment.e0;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import lnc.c3$a;
import io.reactivex.subjects.PublishSubject;

public final class p implements e$a	// class@000093
{
    public final e0 a;

    public void p(e0 p0){
       this.a = p0;
    }
    public final void a(QMedia p0){
       p ta = this.a;
       ta.c.a2.apply(p0);
       if (p0 != null) {
          ta.c.L1.onNext(p0);
       }
       return;
    }
}
