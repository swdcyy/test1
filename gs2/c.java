package gs2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView$b;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;

public final class c implements View$OnClickListener	// class@002b91
{
    public final LiveVoicePartyStageView$b b;

    public void c(LiveVoicePartyStageView$b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.o2(true);
    }
}
