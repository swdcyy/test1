package at4.d;
import android.view.View$OnClickListener;
import com.kuaishou.recruit.doubleList.question.widget.RecruitQuestionnaireBannerView;
import java.lang.Object;
import android.view.View;
import com.kuaishou.recruit.doubleList.question.widget.RecruitQuestionnaireBannerView$a;

public final class d implements View$OnClickListener	// class@000303
{
    public final RecruitQuestionnaireBannerView b;

    public void d(RecruitQuestionnaireBannerView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       RecruitQuestionnaireBannerView k = this.b.k;
       if (k != null) {
          k.b();
       }
       return;
    }
}
