package com.yxcorp.gifshow.profile.j;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.profile.i;
import ok.x;
import java.lang.Object;
import mt7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mw4.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import java.lang.StringBuilder;
import oe6.g;

public class j extends ConfigAutoParseJsonConsumer	// class@00135c
{

    public void j(){
       super(i.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("avatarPostConfig", b.e(p0.mAvatarPostConfig));
          uEditor.putInt("BirthdayModifyThresholdBucketMonths", p0.mBirthdayModifyThresholdBucketMonths);
          uEditor.putBoolean(b.d("user")+"enableProfileShowAnimatedCover", p0.mEnableProfileShowAnimatedCover);
          uEditor.putBoolean("enableUserSpecifiedTopPhotoInProfile", p0.mEnableUserSpecifiedTopPhotoInProfile);
          uEditor.putString("profileEditKwaiIdConfig", b.e(p0.mKwaiIdUpdateConfig));
          uEditor.putInt("maxProfileTopPhotoCount", p0.mMaxProfileTopPhotoCount);
          uEditor.putString("photoViewer", b.e(p0.mPhotoGuestConfig));
          uEditor.putString("profileBackground", b.e(p0.mProfileBackgroundConfig));
          uEditor.putString("profileGuideFollowConfig", b.e(p0.mProfileGuideFollowConfig));
          uEditor.putString("profileJustWatchConfig", b.e(p0.mProfileJustWatchConfig));
          uEditor.putString("profileMoodConfig", b.e(p0.mProfileMoodConfig));
          uEditor.putString(b.d("user")+"profileUserTopConfig", b.e(p0.mProfileUserTopConfig));
          uEditor.putString("profileConfig", b.e(p0.mProfileYiTianConfig));
          uEditor.putInt(b.d("user")+"remindNewFriendsCount", p0.mRemindNewFriendsCount);
          uEditor.putInt("showRedHatRedDotFrequency", p0.mShowRedHatRedDotFrequency);
          uEditor.putString("UpdateUserNameTimesText", p0.mUpdateUserNameTimesText);
          uEditor.putInt("userTextMaxLength", p0.mUserTextMaxLength);
          g.a(uEditor);
       }
       return;
    }
}
