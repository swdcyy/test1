package bia.e;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class e implements Comparator	// class@0003c4
{

    public void e(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p1.mLiveToastRank), Integer.valueOf(p0.mLiveToastRank));
    }
}
