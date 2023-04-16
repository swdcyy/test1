package com.kuaishou.android.model.mix.x;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;

public class x	// class@000e4e
{

    public void x(){
       super();
    }
    public static QComment a(BaseFeed p0){
       QComment obj = PatchProxy.applyOneRefs(p0, null, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return new QComment();
       }
       obj = new QComment();
       obj.mId = "";
       obj.mUser = r1.T1(p0);
       String str = r1.q0(p0);
       if (TextUtils.x(str)) {
          str = r1.p0(p0);
       }
       obj.mComment = str;
       p0.mIsUserInfo = true;
       return obj;
    }
}
