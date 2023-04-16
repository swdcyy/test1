package elb.i;
import tl8.g;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.String;

public final class i implements g	// class@002751
{
    public final HotSurveyActionDetailSurvey a;

    public void i(HotSurveyActionDetailSurvey p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       p0.getExtraMap().putExtra("feed_survey_meta", this.a);
    }
}
