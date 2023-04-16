package com.yxcorp.gifshow.profile.util.a;
import com.yxcorp.gifshow.profile.util.a$a;
import nsd.u;
import com.yxcorp.gifshow.profile.util.a$b;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.ProfilePageInfo;

public final class a	// class@0015d2
{
    public c a;
    public c b;
    public UserProfileResponse c;
    public static final a d;
    public static final a$a e;

    static {
       a.e = new a$a(null);
       Objects.requireNonNull(a$b.b);
       a.d = a$b.a;
    }
    public void a(){
       super();
    }
    public void a(u p0){
       super();
    }
    public static final boolean b(UserProfile p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.e.b(p0);
    }
    public final boolean a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return d.a(-1694791652).v7(p0);
    }
    public final void c(UserProfileResponse p0){
       this.c = p0;
    }
    public final boolean d(UserProfile p0){
       boolean b;
       QCurrentUser obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       int userType = obj.getUserType();
       if (p0 != null) {
          p0 = p0.mProfile;
          if (p0 != null) {
             UserInfo mProfilePage = p0.mProfilePageInfo;
             if (mProfilePage != null && userType == mProfilePage.mUserType) {
                b = true;
             label_002f :
                return b;
             }
          }
       }
       b = false;
       goto label_002f ;
    }
}
