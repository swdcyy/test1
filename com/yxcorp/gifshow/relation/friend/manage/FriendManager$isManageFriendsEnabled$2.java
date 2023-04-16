package com.yxcorp.gifshow.relation.friend.manage.FriendManager$isManageFriendsEnabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.social.startup.relation.model.SocialRelationConfig;
import java.lang.reflect.Type;
import mw4.a;
import xf6.l;

public final class FriendManager$isManageFriendsEnabled$2 extends Lambda implements a	// class@0018b4
{
    public static final FriendManager$isManageFriendsEnabled$2 INSTANCE;

    static {
       FriendManager$isManageFriendsEnabled$2.INSTANCE = new FriendManager$isManageFriendsEnabled$2();
    }
    public void FriendManager$isManageFriendsEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       SocialRelationConfig obj = PatchProxy.apply(null, this, FriendManager$isManageFriendsEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.x(SocialRelationConfig.class);
       boolean b = false;
       if (obj == null || (obj.getEnableManageFriends() == true || l.c("KEY_ENABLE_MANAGE_FRIEND", b))) {
          b = true;
       }
       return b;
    }
}
