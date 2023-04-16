package jf1.e0;
import android.text.style.ClickableSpan;
import jf1.f0;
import com.kuaishou.recruit.questionmessage.LiveRecruitQuestionMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o81.f;

public class e0 extends ClickableSpan	// class@002b66
{
    public final LiveRecruitQuestionMessage b;
    public final f0 c;

    public void e0(f0 p0,LiveRecruitQuestionMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       f0 a = this.c.a;
       if (a != null) {
          a.b(this.b, p0);
       }
       return;
    }
}
