package l31.a$a;
import cy1.a$b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import b61.a;

public class a$a extends a$b	// class@002e6a
{

    public void a$a(List p0,List p1){
       super(p0, p1);
    }
    public boolean a(int p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       UserInfo userInfo = this.a.get(p0);
       UserInfo userInfo1 = this.b.get(p1);
       boolean b = (userInfo.mId).equals(userInfo1.mId);
       boolean b1 = true;
       if (b) {
          UserInfo mExtraInfo = userInfo.mExtraInfo;
          if (mExtraInfo == null && userInfo1.mExtraInfo == null) {
             userInfo = 1;
          label_007f :
             if (!b || !userInfo) {
                b1 = false;
             }
             return b1;
          }else if(mExtraInfo != null && userInfo1.mExtraInfo != null){
             boolean b2 = mExtraInfo.isTopPayingUser();
             boolean b3 = userInfo1.mExtraInfo.isTopPayingUser();
             userInfo = userInfo.mExtraInfo;
             userInfo1 = userInfo1.mExtraInfo;
             userInfo = (userInfo.mOffline == userInfo1.mOffline && (b2 == b3 && !a.b(userInfo.mRoleInfos, userInfo1.mRoleInfos)))? 1: 0;
             if (!userInfo || (!b2 || this.e() == this.d())) {
             }
          }
       }
       userInfo = 0;
       goto label_007f ;
    }
}
