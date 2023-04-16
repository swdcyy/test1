package com.yxcorp.gifshow.relation.user.activity.UserListActivity$a;
import com.yxcorp.gifshow.relation.user.model.UserListMode;
import java.lang.Enum;

public class UserListActivity$a	// class@0019e2
{
    public static final int[] a;

    static {
       int[] ointArray = new int[UserListMode.values().length];
       try{
          UserListActivity$a.a = ointArray;
          ointArray[UserListMode.NOTICE_USERS.ordinal()] = 1;
          try{
             UserListActivity$a.a[UserListMode.PHOTO_LIKE_USERS.ordinal()] = 2;
             try{
                UserListActivity$a.a[UserListMode.SAME_FOLLOWERS.ordinal()] = 3;
                try{
                   UserListActivity$a.a[UserListMode.SAME_RELATION.ordinal()] = 4;
                   try{
                      UserListActivity$a.a[UserListMode.PHOTO_DETAIL_SAME_RELATION.ordinal()] = 5;
                      try{
                         UserListActivity$a.a[UserListMode.FRIEND_FOLLOWERS.ordinal()] = 6;
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
