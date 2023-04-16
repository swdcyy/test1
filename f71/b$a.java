package f71.b$a;
import java.lang.Object;
import nsd.u;
import com.kwai.framework.model.user.UserInfo;
import f71.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Long;
import com.kuaishou.live.bridge.LiveKrnUserInfoExtra;
import com.kwai.framework.model.user.UserExtraInfo;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;

public final class b$a	// class@0022c7
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final b a(UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userInfo");
       UserInfo mId = p0.mId;
       a.o(mId, "userInfo.mId");
       long l = Long.parseLong(mId);
       UserInfo mName = p0.mName;
       a.o(mName, "userInfo.mName");
       UserInfo mSex = p0.mSex;
       UserInfo mHeadUrls = p0.mHeadUrls;
       p0 = p0.mExtraInfo;
       UserExtraInfo userExtraInf = null;
       UserExtraInfo mRoleInfos = (p0 != null)? p0.mRoleInfos: userExtraInf;
       if (p0 != null) {
          userExtraInf = p0.mBase64Segments;
       }
       b uob = new b(l, mName, mSex, mHeadUrls, new LiveKrnUserInfoExtra(mRoleInfos, userExtraInf));
       return obj;
    }
}
