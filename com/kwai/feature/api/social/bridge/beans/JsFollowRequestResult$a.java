package com.kwai.feature.api.social.bridge.beans.JsFollowRequestResult$a;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Enum;

public class JsFollowRequestResult$a	// class@001094
{
    public static final int[] a;

    static {
       int[] ointArray = new int[User$FollowStatus.values().length];
       try{
          JsFollowRequestResult$a.a = ointArray;
          ointArray[User$FollowStatus.FOLLOWING.ordinal()] = 1;
          try{
             JsFollowRequestResult$a.a[User$FollowStatus.FOLLOW_REQUESTING.ordinal()] = 2;
             try{
                JsFollowRequestResult$a.a[User$FollowStatus.UNFOLLOW.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
