package fd1.m;
import bq5.d;
import fd1.l;
import fd1.d$c;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class m implements d	// class@0022fb
{
    public final d$c a;
    public final LiveQuestionnaire b;
    public final l c;

    public void m(l p0,d$c p1,LiveQuestionnaire p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       m tb = this.b;
       this.a.a(tb.mQuestionnaireId, tb.mQuestionId);
       return;
    }
}
