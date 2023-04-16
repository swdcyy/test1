package jq9.n;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;

public class n	// class@002b52
{

    public static boolean a(BaseFeed p0){
       return p0 instanceof CoronaBannerFeed;
    }
    public static boolean b(BaseFeed p0){
       return p0 instanceof CoronaSubChannelFeed;
    }
    public static boolean c(BaseFeed p0){
       return p0 instanceof CoronaTitleFeed;
    }
    public static boolean d(BaseFeed p0){
       return p0 instanceof CoronaTubeFeed;
    }
    public static boolean e(BaseFeed p0){
       return p0 instanceof CoronaZoneFeed;
    }
}
