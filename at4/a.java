package at4.a;
import android.view.View$OnClickListener;
import com.kuaishou.recruit.doubleList.question.widget.a;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire$QuestionClickableOption;
import java.lang.Object;
import android.view.View;
import z1.k;
import com.kuaishou.recruit.doubleList.question.widget.RecruitQuestionnaireBannerView$a;
import java.lang.String;

public final class a implements View$OnClickListener	// class@000300
{
    public final a b;
    public final LiveQuestionnaire$QuestionClickableOption c;

    public void a(a p0,LiveQuestionnaire$QuestionClickableOption p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a tc = this.c;
       RecruitQuestionnaireBannerView$a uoa = this.b.g.get();
       if (uoa != null) {
          uoa.a(tc.mLink, tc.mText);
       }
       return;
    }
}
