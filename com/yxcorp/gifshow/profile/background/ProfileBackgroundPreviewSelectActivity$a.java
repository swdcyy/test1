package com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity$a;
import java.lang.Object;
import nsd.u;
import android.app.Activity;
import java.util.ArrayList;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import z5c.k0;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Boolean;
import java.lang.Long;
import kotlin.jvm.internal.a;
import android.content.Intent;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class ProfileBackgroundPreviewSelectActivity$a	// class@00122b
{

    public void ProfileBackgroundPreviewSelectActivity$a(){
       super();
    }
    public void ProfileBackgroundPreviewSelectActivity$a(u p0){
       super();
    }
    public static void f(ProfileBackgroundPreviewSelectActivity$a p0,Activity p1,ArrayList p2,boolean p3,boolean p4,String p5,BaseFeed p6,User p7,int p8,Object p9){
       boolean b = (p8 & 0x08)? false: p4;
       p0.e(p1, p2, p3, b, null, null, null);
       return;
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewSelectActivity$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (k0.u())? 0x7f0100e8: 0x7f01010d;
       return i;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewSelectActivity$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (k0.u())? 0x7f0100e7: 0x7f010105;
       return i;
    }
    public final void c(Activity p0,ProfileBgVideoInfo p1,boolean p2,String p3,long p4){
       ProfileBackgroundPreviewSelectActivity$a a;
       ProfileBackgroundPreviewSelectActivity$a uoa = ProfileBackgroundPreviewSelectActivity$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "videoInfo");
       Intent intent = new Intent(p0, ProfileBackgroundPreviewSelectActivity.class);
       SerializableHook.putExtra(intent, "PROFILE_PREVIEW_VIDEO_INFO", p1);
       intent.putExtra("from_mine", p2);
       if (p3 != null) {
          intent.putExtra("PROFILE_PREVIEW_PHOTO_LAST_UID", p3);
       }
       intent.putExtra("PROFILE_PREVIEW_VIDEO_PROGRESS", p4);
       a = ProfileBackgroundPreviewSelectActivity.A;
       intent.putExtra("activityCloseEnterAnimation", a.a());
       p0.startActivity(intent);
       p0.overridePendingTransition(a.b(), R.anim.arg_RES_7f0100e5);
       return;
    }
    public final void d(Activity p0,String p1,String p2,BaseFeed p3){
       ProfileBackgroundPreviewSelectActivity$a a;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ProfileBackgroundPreviewSelectActivity$a.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "localPath");
       Intent intent = new Intent(p0, ProfileBackgroundPreviewSelectActivity.class);
       intent.putExtra("PROFILE_PREVIEW_IMAGE_LOCAL_PATH", p1);
       intent.putExtra("from_mine", true);
       if (p2 != null) {
          intent.putExtra("PROFILE_PREVIEW_PHOTO_LAST_UID", p2);
       }
       if (p3 != null) {
          SerializableHook.putExtra(intent, "PROFILE_PREVIEW_PHOTO_FEED", p3);
       }
       a = ProfileBackgroundPreviewSelectActivity.A;
       intent.putExtra("activityCloseEnterAnimation", a.a());
       p0.startActivity(intent);
       p0.overridePendingTransition(a.b(), R.anim.arg_RES_7f0100e5);
       return;
    }
    public final void e(Activity p0,ArrayList p1,boolean p2,boolean p3,String p4,BaseFeed p5,User p6){
       ProfileBackgroundPreviewSelectActivity$a a;
       ProfileBackgroundPreviewSelectActivity$a uoa = ProfileBackgroundPreviewSelectActivity$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "headerUrls");
       Intent intent = new Intent(p0, ProfileBackgroundPreviewSelectActivity.class);
       SerializableHook.putExtra(intent, "PROFILE_PREVIEW_IMAGE_URLS", p1);
       intent.putExtra("PROFILE_PREVIEW_IMAGE_DEFAULT", p2);
       intent.putExtra("from_mine", p3);
       if (p4 != null) {
          intent.putExtra("PROFILE_PREVIEW_PHOTO_LAST_UID", p4);
       }
       if (p5 != null) {
          SerializableHook.putExtra(intent, "PROFILE_PREVIEW_PHOTO_FEED", p5);
       }
       if (p6 != null) {
          SerializableHook.putExtra(intent, "PROFILE_PREVIEW_PHOTO_USER", p6);
       }
       a = ProfileBackgroundPreviewSelectActivity.A;
       intent.putExtra("activityCloseEnterAnimation", a.a());
       p0.startActivity(intent);
       p0.overridePendingTransition(a.b(), R.anim.arg_RES_7f0100e5);
       return;
    }
}
