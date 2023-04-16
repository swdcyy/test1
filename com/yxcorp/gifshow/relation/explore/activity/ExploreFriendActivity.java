package com.yxcorp.gifshow.relation.explore.activity.ExploreFriendActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import com.yxcorp.gifshow.relation.explore.activity.ExploreFriendActivityTablet;
import android.content.Context;
import com.yxcorp.gifshow.relation.explore.model.TabConfig;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.explore.model.TabConfig$TabInfo;
import ki5.b;
import tkd.b;
import tkd.d;
import mv5.b;
import java.util.List;
import hcc.h0;
import wkd.b;
import ncc.g;
import com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import kha.a;
import mw4.a;
import com.yxcorp.gifshow.relation.explore.fragment.GalleryCarouseFragment;
import com.yxcorp.gifshow.relation.explore.fragment.GalleryBigCardFragment;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.Number;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import fac.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.b5;
import android.os.Bundle;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.api.social.relation.model.ExploreFriendParams;
import java.lang.Exception;
import android.net.Uri;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import ekd.w0;
import java.lang.Integer;
import java.lang.Throwable;
import g7c.e;
import dac.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;

public class ExploreFriendActivity extends GifshowActivity	// class@0017ec
{
    public String A;
    public ExploreFriendParams B;
    public final ExploreFriendTabHostFragment y;
    public TabConfig z;
    public static final int C;

    public void ExploreFriendActivity(){
       super();
       this.y = new ExploreFriendTabHostFragment();
    }
    public static Class u3(){
       ExploreFriendActivity uExploreFrie = ExploreFriendActivity.class;
       Object obj = PatchProxy.apply(null, null, uExploreFrie, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.g()) {
          uExploreFrie = ExploreFriendActivityTablet.class;
       }
       return uExploreFrie;
    }
    public static TabConfig v3(Context p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(ExploreFriendActivity.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, ExploreFriendActivity.class, "8");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       TabConfig tabConfig = new TabConfig(1);
       tabConfig.mForceUseExploreFriendsStyle = true;
       boolean b = false;
       tabConfig.mNeedRequestContactPermission = b;
       tabConfig.mNotChangeStatusBarColor = true;
       String str = "friend";
       tabConfig.tabIds.add(new TabConfig$TabInfo(str, b.b().c(R.string.arg_RES_7f1010a2), d.a(0x3ee97dc2).DP()));
       if (p2 && (h0.a("enableNewFriendPageInPYMKContainer", b) && b.a(-83154551).m())) {
          tabConfig.tabIds.add(new TabConfig$TabInfo("newFans", b.b().c(R.string.arg_RES_7f10408d), NewFansListRnContainerFragment.class));
       }
    label_0084 :
       tabConfig.tabIds.add(new TabConfig$TabInfo("recommend", b.b().c(R.string.arg_RES_7f1010e4), ExploreFriendFragment.class));
       if (p1) {
          str = "recommend";
       }
       tabConfig.indexId = str;
       return tabConfig;
    }
    public static TabConfig w3(Context p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ExploreFriendActivity uExploreFrie = ExploreFriendActivity.class;
       Object obj = null;
       TabConfig obj1 = PatchProxy.applyOneRefs(p0, obj, uExploreFrie, "10");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new TabConfig(0);
       if (h0.a("enableNewFriendPageInPYMKContainer", 0) && b.a(-83154551).m()) {
          obj1.tabIds.add(new TabConfig$TabInfo("newFans", b.b().c(R.string.arg_RES_7f10408d), NewFansListRnContainerFragment.class));
       }
       TabConfig tabIds = obj1.tabIds;
       TabConfig$TabInfo tabInfo = PatchProxy.applyOneRefs(p0, obj, uExploreFrie, "11");
       if (tabInfo != patchProxyRe) {
       }else {
          b uob = 2;
          int i = 0x7f1041b5;
          if (a.d() == uob && !b.f()) {
             int i1 = a.r();
             tabInfo = (i1 == 1 || i1 == uob)? new TabConfig$TabInfo("recommend", b.b().c(i), GalleryBigCardFragment.class): new TabConfig$TabInfo("recommend", b.b().c(i), GalleryCarouseFragment.class);
          }else {
             tabInfo = new TabConfig$TabInfo("recommend", b.b().c(i), ExploreFriendFragment.class);
          }
       }
       tabIds.add(tabInfo);
       obj1.tabIds.add(new TabConfig$TabInfo("contact", b.b().c(R.string.arg_RES_7f100120), ExploreFriendContactFragment.class));
       obj1.indexId = "recommend";
       return obj1;
    }
    public int M(){
       return 3;
    }
    public int f(){
       ExploreFriendActivity obj = PatchProxy.apply(null, this, ExploreFriendActivity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj == null)? 0: obj.f();
       return i;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendActivity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ExploreFriendActivity uExploreFrie = ExploreFriendActivity.class;
       Object obj = PatchProxy.apply(null, this, uExploreFrie, "13");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (this.z.mNotChangeStatusBarColor == null) {
          Object obj1 = PatchProxy.apply(null, this, uExploreFrie, "12");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(a.a() && (("recommend").equalsIgnoreCase(this.z.indexId) || TextUtils.x(this.z.indexId))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             return this.getResources().getColor(0x7f061a2a);
          }
       }
       return super.getStatusColor();
    }
    public String getUrl(){
       ExploreFriendActivity obj = PatchProxy.apply(null, this, ExploreFriendActivity.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String str = (obj == null)? "ks://profile/pymk": obj.getUrl();
       return str;
    }
    public boolean isCustomImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b5.a(this);
    }
    public String o(){
       ExploreFriendActivity obj = PatchProxy.apply(null, this, ExploreFriendActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String str = (obj == null)? super.o(): obj.o();
       return str;
    }
    public void onCreate(Bundle p0){
       Bundle uBundle;
       String str1;
       ExploreFriendActivity tB;
       e uoe;
       String str = "tab_config";
       ExploreFriendActivity uExploreFrie = ExploreFriendActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uExploreFrie, "14")) {
          return;
       }
       Intent intent = this.getIntent();
       try{
          uBundle = new Bundle();
          this.z = j0.e(this.getIntent(), str);
          this.A = j0.e(this.getIntent(), "userIds");
          if (intent.getExtras() != null) {
             this.B = SerializableHook.getSerializable(intent.getExtras(), "exploreFriendParams");
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       if (this.z == null) {
          TabConfig tabConfig = PatchProxy.applyOneRefs(intent, this, uExploreFrie, "17");
          if (tabConfig != PatchProxyResult.class) {
          }else {
             str1 = null;
             Uri data1 = intent.getData();
             String str3 = "recommend";
             if (data1 != null) {
                if (("recommendfriend").equalsIgnoreCase(data1.getHost())) {
                   tabConfig = ExploreFriendActivity.v3(this, false, false);
                }else {
                   String encodedPath = data1.getEncodedPath();
                   if (!TextUtils.x(encodedPath)) {
                      if (encodedPath.indexOf(str3) == 1) {
                         str1 = str3;
                      }else if(encodedPath.indexOf("addressbook") == 1){
                         str1 = "contact";
                      }
                   }
                }
             }
             if (!TextUtils.x(str1)) {
                str3 = str1;
             }
             tabConfig = ExploreFriendActivity.w3(this);
             tabConfig.indexId = str3;
          }
          this.z = tabConfig;
       }
       super.onCreate(p0);
       w9.a(this);
       Uri data = intent.getData();
       if (data != null && data.isHierarchical()) {
          str1 = w0.a(data, "userIds");
          String str2 = w0.a(data, "recoPortal");
          if (!TextUtils.x(str1)) {
             uBundle.putString("userIds", str1);
          }
          if (!TextUtils.x(str2)) {
             try{
                uBundle.putInt("recoPortal", Integer.valueOf(str2).intValue());
             }catch(java.lang.NumberFormatException e10){
                e.b("redhat", "portal invalid ", e10);
             }
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendActivity.class, "16")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
    }
}
