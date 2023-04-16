package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter$a;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter$ProfilePymkAction;
import java.lang.Enum;

public class UserProfilePymkPresenter$a	// class@001530
{
    public static final int[] a;

    static {
       int[] ointArray = new int[UserProfilePymkPresenter$ProfilePymkAction.values().length];
       try{
          UserProfilePymkPresenter$a.a = ointArray;
          ointArray[UserProfilePymkPresenter$ProfilePymkAction.PYMK_SHOW_CONSTANT_FOLLOW.ordinal()] = 1;
          try{
             UserProfilePymkPresenter$a.a[UserProfilePymkPresenter$ProfilePymkAction.PYMK_SHOW_CONSTANT_UNFOLLOW.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
