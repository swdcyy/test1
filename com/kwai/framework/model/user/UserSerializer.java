package com.kwai.framework.model.user.UserSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Boolean;

public class UserSerializer implements i	// class@001772
{

    public void UserSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonElement jsonElement = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserSerializer.class, "1");
       if (jsonElement != PatchProxyResult.class) {
       }else {
          jsonElement = a.b.y(p0, p1);
          jsonElement.c0("userId", p0.mId);
          jsonElement.z0("isFriend");
          jsonElement.a0("isFriend", Integer.valueOf(p0.mFriend));
          User mPhotoList = p0.mPhotoList;
          if (mPhotoList != null) {
             jsonElement.G("photos", p2.a(mPhotoList));
          }
          boolean b = false;
          boolean b1 = (p0.mFollowStatus == User$FollowStatus.FOLLOW_REQUESTING)? true: false;
          jsonElement.H("followRequesting", Boolean.valueOf(b1));
          if (p0.mFollowStatus == User$FollowStatus.FOLLOWING) {
             b = true;
          }
          jsonElement.H("isFollowing", Boolean.valueOf(b));
       }
       return jsonElement;
    }
}
