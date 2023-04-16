package com.yxcorp.gifshow.relation.user.fragment.UserListRnFragment$a;
import com.yxcorp.gifshow.relation.user.model.UserListMode;
import java.lang.Enum;

public class UserListRnFragment$a	// class@001a0e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[UserListMode.values().length];
       try{
          UserListRnFragment$a.a = ointArray;
          ointArray[UserListMode.FRIEND_FOLLOWERS.ordinal()] = 1;
          try{
             UserListRnFragment$a.a[UserListMode.NOTICE_USERS.ordinal()] = 2;
             try{
                UserListRnFragment$a.a[UserListMode.SAME_RELATION.ordinal()] = 3;
                try{
                   UserListRnFragment$a.a[UserListMode.SAME_FOLLOWERS.ordinal()] = 4;
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
