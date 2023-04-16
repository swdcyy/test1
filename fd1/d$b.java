package fd1.d$b;
import com.yxcorp.gifshow.widget.m;
import fd1.d;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fd1.g;
import fd1.e;
import fd1.f;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import fd1.d$c;

public class d$b extends m	// class@0022ee
{
    public final String c;
    public final d d;

    public void d$b(d p0,String p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       d$b td = this.d;
       d b = td.b;
       td.c.b(b.mQuestionnaireId, b.mQuestionId, k0.c(p0, g.a, e.a, f.a).or(""), b.mIsSubmitAnswer, Optional.fromNullable(this.c).or(""));
       return;
    }
}
