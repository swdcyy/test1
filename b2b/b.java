package b2b.b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;

public final class b extends m	// class@000350
{
    public final NearbyFunctionMatchView c;

    public void b(NearbyFunctionMatchView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       NearbyFunctionMatchView k = tc.K;
       if (k != null) {
          NearbyHeaderFunctionEntranceView$a mItemClickLi = tc.getMItemClickListener();
          if (mItemClickLi != null) {
             mItemClickLi.r6(k.mLinkUrl, String.valueOf(k.mMomentType), k.mType, k.mMomentUserId);
          }
       }
       return;
    }
}
