package b2b.c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMomentCommonView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;

public final class c extends m	// class@000351
{
    public final NearbyFunctionMomentCommonView c;

    public void c(NearbyFunctionMomentCommonView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       NearbyFunctionMomentCommonView g = tc.G;
       if (g != null) {
          NearbyHeaderFunctionEntranceView$a mItemClickLi = tc.getMItemClickListener();
          if (mItemClickLi != null) {
             mItemClickLi.r6(g.mLinkUrl, String.valueOf(g.mMomentType), g.mType, g.mMomentUserId);
          }
       }
       return;
    }
}
