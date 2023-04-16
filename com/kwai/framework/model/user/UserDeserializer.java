package com.kwai.framework.model.user.UserDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserDeserializer$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.JsonObject;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.robust.PatchProxyResult;
import ekd.k0;
import com.google.gson.JsonElement;
import java.lang.Exception;
import com.google.gson.JsonArray;
import java.lang.reflect.Type;
import com.google.gson.a;
import fg6.a;
import com.google.gson.Gson;
import pa6.q;
import el.a;
import java.util.List;
import com.kwai.framework.model.user.UserDeserializer$d;
import com.kwai.framework.model.user.UserDeserializer$e;
import com.kwai.framework.model.user.UserDeserializer$c;
import com.kwai.framework.model.user.UserDeserializer$b;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.QUserContactName;
import com.kwai.framework.model.user.OpenFriendName;
import com.kwai.framework.model.user.RichTextMeta;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.framework.model.user.RichTextMeta$Param;
import com.kwai.framework.model.user.UserCoverMeta;
import java.lang.Long;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;

public class UserDeserializer implements b	// class@001741
{

    public void UserDeserializer(){
       super();
    }
    public final void a(User p0,UserDeserializer$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserDeserializer.class, "11")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (!PatchProxy.applyVoidOneRefs(p0, p1, UserDeserializer$a.class, "1")) {
          if (p1.c() != null) {
             p0.mId = p1.c();
          }
          if (p1.d() != null) {
             p0.mName = p1.d();
          }
          if (p1.f() != null) {
             p0.mText = p1.f();
          }
          if (p1.e() != null) {
             p0.mSex = p1.e();
          }
          if (p1.a() != null) {
             p0.mAvatar = p1.a();
          }
          if (p1.b() != null) {
             p0.mAvatars = p1.b();
          }
       }
       return;
    }
    public final User$FollowStatus b(JsonObject p0,User p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, UserDeserializer.class, "10");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = "is_followed";
       if (k0.f(p0, str, 0) != 1) {
          String str1 = "isFollowed";
          if (k0.f(p0, str1, 0) == 1 || (k0.f(p0, "following", 0) == 1 || (k0.c(p0, str1, 0) || (k0.c(p0, "isFriendsVisibility", 0) || (k0.c(p0, "following", 0) || (!k0.c(p0, "isFollowing", 0) && !(k0.h(p0, str, "")).equals("1"))))))) {
             if (k0.c(p0, "followRequesting", 0)) {
                return User$FollowStatus.FOLLOW_REQUESTING;
             }else {
                return User$FollowStatus.UNFOLLOW;
             }
          }
       }
    label_0062 :
       return User$FollowStatus.FOLLOWING;
    }
    public final CDNUrl c(JsonObject p0){
       String str = "cdn";
       CDNUrl obj = PatchProxy.applyOneRefs(p0, this, UserDeserializer.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new CDNUrl();
          if (k0.a(p0, str)) {
             obj.mCdn = p0.e0(str).w();
          label_0028 :
             if (k0.a(p0, "url")) {
                obj.mUrl = p0.e0("url").w();
             }
          }else {
             goto label_0028 ;
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return obj;
    }
    public final CDNUrl[] d(JsonObject p0,String p1){
       CDNUrl[] obj = PatchProxy.applyTwoRefs(p0, p1, this, UserDeserializer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          JsonArray jsonArray = p0.e0(p1).q();
          if (jsonArray.size() > 0) {
             obj = new CDNUrl[jsonArray.size()];
             int i = 0;
             while (i < jsonArray.size()) {
                JsonObject jsonObject = jsonArray.e0(i);
                if (jsonObject != null) {
                   obj[i] = this.c(jsonObject);
                }
                i++;
             }
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return obj;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       boolean b;
       String str2;
       JsonObject str2;
       UserExtraInfo userExtraInf;
       User mOpenFriendN;
       UserExtraInfo mRecoTextInf;
       Iterator iterator;
       RichTextMeta$Param param;
       UserCoverMeta userCoverMet;
       String str3;
       String str4;
       JsonObject jsonObject1;
       CDNUrl[] uCDNUrlArray;
       Long longx;
       UserDeserializer userDeserial = UserDeserializer.class;
       User user = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserDeserializer.class, "1");
       if (user != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = p0;
          User user1 = a.b.c(p0, User.class);
          String str = "mFollowStatus";
          String str1 = null;
          user1.mFollowStatus = (k0.h(jsonObject, str, str1) != null)? User$FollowStatus.valueOf(k0.h(jsonObject, str, str1)): this.b(jsonObject, user1);
       }
       return user;
    }
    public final int e(JsonObject p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UserDeserializer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       try{
          i = p0.e0(p1).p();
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return i;
    }
    public final String f(JsonObject p0,String p1){
       String str;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UserDeserializer.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          str = p0.e0(p1).w();
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          str = "";
       }
       return str;
    }
}
