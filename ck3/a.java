package ck3.a;
import pp.d$a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;

public final class a implements d$a	// class@000577
{
    public final BaseFeed a;
    public final int b;

    public void a(BaseFeed p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Map build(){
       a ta = this.a;
       return ImmutableMap.of("liveStreamId", TextUtils.k(r1.n1(ta)), "userName", TextUtils.k(r1.V1(ta)), "scene", String.valueOf(this.b));
    }
}
