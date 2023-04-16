package cdc.a;
import java.lang.Object;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig$FriendsGuidePopup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import zcc.k;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig;
import java.lang.Boolean;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig$MoreActionEntrance;
import java.util.Collection;
import ekd.q;

public final class a	// class@00057d
{

    public void a(){
       super();
    }
    public static FriendTabStartupConfig$FriendsGuidePopup a(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x78443100).a().mFriendsGuidePopup;
    }
    public static boolean b(){
       boolean b;
       FriendTabStartupConfig obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(0x78443100).a().mMoreActionEntrance;
       b = (obj != null && !q.f(obj.mMoreActions))? true: false;
       return b;
    }
}
