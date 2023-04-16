package at4.e;
import android.view.View$OnClickListener;
import com.kuaishou.recruit.doubleList.question.widget.RecruitQuestionnaireBannerView;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import com.kuaishou.recruit.doubleList.question.widget.RecruitQuestionnaireBannerView$a;

public final class e implements View$OnClickListener	// class@000304
{
    public final RecruitQuestionnaireBannerView b;
    public final LiveQuestionnaire c;

    public void e(RecruitQuestionnaireBannerView p0,LiveQuestionnaire p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       e tc = this.c;
       RecruitQuestionnaireBannerView k = this.b.k;
       if (k != null) {
          k.a(tc.mRouteUrl, "");
       }
       return;
    }
}
