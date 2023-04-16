package a4d.o;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class o extends m	// class@000092
{
    public final EmotionFloatEditorFragment c;

    public void o(EmotionFloatEditorFragment p0,boolean p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       boolean b = (this.c.f1.getVisibility())? true: false;
       this.c.Yi(b);
       this.c.S1.onNext(Boolean.valueOf(b));
       return;
    }
}
