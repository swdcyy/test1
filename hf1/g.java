package hf1.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.comments.item.f$b;
import com.kuaishou.live.common.core.component.comments.model.LiveAudienceGuideMessage;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.comments.item.f$a;

public final class g implements View$OnClickListener	// class@002687
{
    public final f$b b;
    public final LiveAudienceGuideMessage c;

    public void g(f$b p0,LiveAudienceGuideMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       g tc = this.c;
       this.b.f.accept(tc.mActionUrl, tc.mBizId);
    }
}
