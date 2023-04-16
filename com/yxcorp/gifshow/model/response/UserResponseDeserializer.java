package com.yxcorp.gifshow.model.response.UserResponseDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.UsersResponse;
import com.google.gson.JsonObject;
import ekd.k0;
import hlb.i;
import el.a;
import java.util.List;
import hlb.j;
import hlb.k;
import hlb.l;
import hlb.m;
import hlb.n;
import hlb.o;
import hlb.p;
import com.kuaishou.android.model.mix.PhotoRewardCollectStat;
import com.yxcorp.gifshow.model.FollowBackInfo;

public class UserResponseDeserializer implements b	// class@001f6c
{

    public void UserResponseDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       UsersResponse usersRespons = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserResponseDeserializer.class, "1");
       if (usersRespons != PatchProxyResult.class) {
       }else {
          usersRespons = new UsersResponse();
          String str = "pcursor";
          String str1 = "";
          if (k0.a(p0, str)) {
             usersRespons.mCursor = k0.h(p0, str, str1);
          }
          str = "latest_insert_time";
          if (k0.a(p0, str)) {
             usersRespons.mLastInsertTime = k0.g(p0, str, 0);
          }
          str = "contactsUploaded";
          if (k0.a(p0, str)) {
             usersRespons.mContactsUploaded = k0.c(p0, str, false);
          }
          str = "showPublicFollowTip";
          if (k0.a(p0, str)) {
             usersRespons.mShowPublicFollowTip = k0.c(p0, str, false);
          }
          str = "contactsFriendsCount";
          if (k0.a(p0, str)) {
             usersRespons.mContactsFriendsCount = k0.f(p0, str, false);
          }
          str = "enableRelationListOptimize";
          if (k0.a(p0, str)) {
             usersRespons.mEnableRelationListOptimize = k0.c(p0, str, false);
          }
          str = "enableShowUnreadPhotoEntrance";
          if (k0.a(p0, str)) {
             usersRespons.mEnableShowUnreadPhotoEntrance = k0.c(p0, str, false);
          }
          str = "lessInteractionFollowGroup";
          if (k0.a(p0, str)) {
             usersRespons.mLessInteractionFollowGroup = k0.f(p0, str, false);
          }
          str = "extraInfo";
          if (k0.a(p0, str)) {
             usersRespons.mExtraInfo = k0.h(p0, str, str1);
          }
          str = "recoFansCacheKey";
          if (k0.a(p0, str)) {
             usersRespons.mRecoFansCacheKey = k0.h(p0, str, str1);
          }
          str = "prsid";
          if (k0.a(p0, str)) {
             usersRespons.mPrsid = k0.h(p0, str, str1);
          }
          str = "fansCount";
          if (k0.a(p0, str)) {
             usersRespons.fansCount = k0.f(p0, str, false);
          }
          str = "followingCount";
          if (k0.a(p0, str)) {
             usersRespons.followingCount = k0.f(p0, str, false);
          }
          str = "familiarCount";
          if (k0.a(p0, str)) {
             usersRespons.familiarCount = k0.f(p0, str, false);
          }
          str = "users";
          if (k0.a(p0, str)) {
             usersRespons.mUsers = p2.c(k0.e(p0, str), new i(this).getType());
          }else {
             str = "fols";
             if (k0.a(p0, str)) {
                usersRespons.mUsers = p2.c(k0.e(p0, str), new j(this).getType());
             }else {
                str = "likers";
                if (k0.a(p0, str)) {
                   usersRespons.mUsers = p2.c(k0.e(p0, str), new k(this).getType());
                }else if(k0.a(p0, "friends")){
                   usersRespons.mUsers = p2.c(k0.e(p0, "friends"), new l(this).getType());
                }
             }
          }
          str = "favoriteFollowings";
          if (k0.a(p0, str)) {
             usersRespons.mFavoriteFollowings = p2.c(k0.e(p0, str), new m(this).getType());
          }
          str = "latestContactUsers";
          if (k0.a(p0, str)) {
             usersRespons.mLatestContactUsers = p2.c(k0.e(p0, str), new n(this).getType());
          }
          if (k0.a(p0, "friends")) {
             usersRespons.mFriends = p2.c(k0.e(p0, "friends"), new o(this).getType());
          }
          str = "hiddenUserIds";
          if (k0.a(p0, str)) {
             usersRespons.mAbnormalUsers = p2.c(k0.e(p0, str), new p(this).getType());
          }
          str = "actionType";
          if (k0.a(p0, str)) {
             usersRespons.mActionButtonType = k0.f(p0, str, false);
          }
          str = "enableFansSearch";
          if (k0.a(p0, str)) {
             usersRespons.mEnableFansSearch = k0.c(p0, str, false);
          }
          str = "stat";
          if (k0.a(p0, str)) {
             usersRespons.mPhotoRewardCollectStat = p2.c(k0.e(p0, str), PhotoRewardCollectStat.class);
          }
          str = "subTitleStyle";
          if (k0.a(p0, str)) {
             usersRespons.mSubTitleStyle = k0.f(p0, str, false);
          }
          str = "followBackInfo";
          if (k0.a(p0, str)) {
             usersRespons.mFollowBackInfo = p2.c(k0.e(p0, str), FollowBackInfo.class);
          }
       }
       return usersRespons;
    }
}
