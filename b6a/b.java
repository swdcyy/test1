package b6a.b;
import java.lang.Object;
import com.yxcorp.gifshow.relation.select.model.SelectUsersResponse$FriendsListResponse;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import ekd.n0;
import ekd.f0;
import lu7.f;
import java.util.Objects;

public final class b	// class@000380
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final ContactTargetItem a(SelectUsersResponse$FriendsListResponse p0){
       User obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "response");
       obj = p0.getUser();
       a.m(obj);
       String name = obj.getName();
       if (name != null) {
          name = StringsKt__StringsKt.o5(name).toString();
          if (name != null) {
          label_002e :
             name = n0.d(name);
             User user = p0.getUser();
             a.m(user);
             String str = f.a(user);
             a.o(str, "UserExt.getAliasName\(response.user!!\)");
             Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
             str = n0.d(StringsKt__StringsKt.o5(str).toString());
             User user1 = p0.getUser();
             a.m(user1);
             user1.mPlatform = 0;
             ContactTargetItem uContactTarg = new ContactTargetItem();
             User user2 = p0.getUser();
             a.m(user2);
             uContactTarg.mId = user2.getId();
             uContactTarg.mSection = p0.getSection();
             uContactTarg.mName = name;
             uContactTarg.mNamePinyin = f0.d(name);
             uContactTarg.mAliasName = str;
             uContactTarg.mAliasNamePinyin = f0.d(str);
             uContactTarg.mUser = p0.getUser();
             return uContactTarg;
          }
       }
       name = "";
       goto label_002e ;
    }
}
