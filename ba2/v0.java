package ba2.v0;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2$a;

public final class v0 implements View$OnClickListener	// class@0003b0
{
    public final LiveNormalRankNoticeViewV2 b;
    public final TopDistrictRank c;

    public void v0(LiveNormalRankNoticeViewV2 p0,TopDistrictRank p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       this.b.i.b(this.c.descriptionV2);
    }
}
