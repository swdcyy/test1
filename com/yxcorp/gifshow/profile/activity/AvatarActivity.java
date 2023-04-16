package com.yxcorp.gifshow.profile.activity.AvatarActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n3d.a;
import java.lang.Boolean;
import android.content.Intent;
import rkd.b;
import com.yxcorp.gifshow.profile.activity.AvatarActivityTablet;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.model.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.yxcorp.gifshow.profile.common.model.ProfilePendant;
import x2c.a;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import h3c.g;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.profile.fragment.AvatarFragmentV1;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment;
import android.os.Bundle;

public class AvatarActivity extends SingleFragmentActivity	// class@0011f2
{
    public BaseFragment y;

    public void AvatarActivity(){
       super();
    }
    public static void A3(GifshowActivity p0,User p1,UserProfile p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, AvatarActivity.class, "1")) {
          return;
       }
       AvatarActivity.B3(p0, p1, p2, false, true, null);
       return;
    }
    public static void B3(GifshowActivity p0,User p1,UserProfile p2,boolean p3,boolean p4,a p5){
       AvatarActivity uAvatarActiv = AvatarActivity.class;
       if (PatchProxy.isSupport(uAvatarActiv)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uAvatarActiv, "2")) {
             return;
          }
       }
       if (b.g()) {
          uAvatarActiv = AvatarActivityTablet.class;
       }
       Intent intent = new Intent(p0, uAvatarActiv);
       SerializableHook.putExtra(intent, "user", p1);
       if (p2 != null) {
          UserProfile mProfile = p2.mProfile;
          if (mProfile != null) {
             if (mProfile.mBigHeadUrls != null) {
                SerializableHook.putExtra(intent, "bigAvatars", new ArrayList(Arrays.asList(p2.mProfile.mBigHeadUrls)));
             }
             ProfilePendant profilePenda = a.e(p2);
             if (profilePenda != null) {
                SerializableHook.putExtra(intent, "pendantInfo", profilePenda);
             }
          }
       }
       if (p2 != null) {
          intent.putExtra("defaultHead", p2.mIsDefaultHead);
          SerializableHook.putExtra(intent, "statusInfo", a.f(p2));
       }
       intent.putExtra("showKwaiId", p3);
       intent.putExtra("showModifyAlias", p4);
       intent.addFlags(0x4000000);
       if (g.a()) {
          intent.putExtra("activityCloseEnterAnimation", R.anim.arg_RES_7f0100e8);
       }
       p0.t1(intent, 101, p5);
       if (g.a()) {
          p0.overridePendingTransition(R.anim.arg_RES_7f0100e7, 0x7f0100e5);
       }
       return;
    }
    public int M(){
       return 1;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, AvatarActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
       if (this.getIntent() != null) {
          Serializable serializable = SerializableHook.getSerializableExtra(this.getIntent(), "user");
          if (serializable instanceof User) {
             profilePacka.visitedUid = TextUtils.k(serializable.getId());
          }
       }
       obj.profilePackage = profilePacka;
       return obj;
    }
    public int getPage(){
       return 265;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AvatarActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://gifshowprofile/avatar";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AvatarActivity.class, "5")) {
          return;
       }
       super.onDestroy();
       this.y = null;
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarActivity.class, "4")) {
          return;
       }
       super.onNewIntent(p0);
       AvatarActivity ty = this.y;
       if (ty != null) {
          ty.y2(p0);
       }
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, AvatarActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.y = (g.a())? new AvatarFragmentV1(): new AvatarFragment();
       this.y.setArguments(this.getIntent().getExtras());
       return this.y;
    }
    public boolean y3(){
       return true;
    }
}
