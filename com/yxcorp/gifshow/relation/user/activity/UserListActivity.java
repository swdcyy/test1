package com.yxcorp.gifshow.relation.user.activity.UserListActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import com.yxcorp.gifshow.entity.QPhoto;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.relation.user.model.UserListMode;
import java.util.Map;
import ekd.w0;
import android.net.Uri$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import brd.t;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import acc.b;
import erd.g;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import java.lang.StringBuilder;
import java.lang.Enum;
import ekd.n0;
import crd.b;
import lnc.b9;
import lnc.b5;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.user.activity.UserListActivity$a;
import ekd.i;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import acc.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import java.lang.Integer;
import ekd.j0;
import java.lang.Exception;
import acc.c;

public class UserListActivity extends SingleFragmentActivity	// class@0019e3
{
    public b A;
    public BaseFragment y;
    public UserListParam z;
    public static final int B;

    public void UserListActivity(){
       super();
       this.z = new UserListParam();
    }
    public static Uri A3(QPhoto p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, UserListActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("title", r1.g1(p0.mEntity, R.string.arg_RES_7f101cc0, "likes_title_new"));
       return UserListActivity.B3(UserListMode.PHOTO_LIKE_USERS, p0.getPhotoId(), obj);
    }
    public static Uri B3(UserListMode p0,String p1,Map p2){
       Uri$Builder obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, UserListActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = w0.f("ks://users").buildUpon();
       obj.appendPath(p0.mUriPath);
       Uri$Builder uBuilder = obj;
       if (!TextUtils.x(p1)) {
          uBuilder.appendPath(p1);
       }
       if (p2 != null) {
          Iterator iterator = p2.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             uBuilder.appendQueryParameter(key, uEntry.getValue());
          }
       }
       return uBuilder.build();
    }
    public static void D3(Context p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, UserListActivity.class, "4")) {
          return;
       }
       Intent intent = new Intent(p0, UserListActivity.class);
       intent.setData(p1);
       if (!p0 instanceof Activity) {
          intent.addFlags(0x10000000);
       }
       p0.startActivity(intent);
       return;
    }
    public static void E3(Context p0,UserListMode p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, UserListActivity.class, "3")) {
          return;
       }
       UserListActivity.D3(p0, UserListActivity.B3(p1, p2, p3));
       return;
    }
    public t C3(){
       Bundle obj = PatchProxy.apply(null, this, UserListActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       SerializableHook.putSerializable(obj, "userListParam", this.z);
       return this.z.mMode.createFragment(this).doOnNext(new b(obj));
    }
    public int M(){
       return 1;
    }
    public int f(){
       UserListActivity obj = PatchProxy.apply(null, this, UserListActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public int getPage(){
       UserListActivity obj = PatchProxy.apply(null, this, UserListActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int page = (obj != null)? obj.getPage(): 0;
       return page;
    }
    public String getPageParams(){
       UserListActivity obj = PatchProxy.apply(null, this, UserListActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String pageParams = (obj != null)? obj.getPageParams(): "";
       return pageParams;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, UserListActivity.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       StringBuilder obj = PatchProxy.apply(null, this, UserListActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ks://users";
       UserListActivity tz = this.z;
       if (tz == null || tz.mMode == null) {
          return obj;
       }
       char c = '/';
       obj = obj+c+n0.d(this.z.mMode.name());
       if (!TextUtils.x(this.z.mUserId)) {
          obj = obj+c+this.z.mUserId;
       }
       if (!TextUtils.x(this.z.mPhotoId)) {
          obj = obj+c+this.z.mPhotoId;
       }
       return obj;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserListActivity.class, "18")) {
          return;
       }
       super.onCreate(p0);
       this.startImmersiveMode();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, UserListActivity.class, "19")) {
          return;
       }
       super.onDestroy();
       b9.a(this.A);
       return;
    }
    public void startImmersiveMode(){
       int b;
       UserListActivity userListActi = UserListActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userListActi, "20")) {
          return;
       }
       if (b5.a(this)) {
          return;
       }
       UserListParam obj = PatchProxy.apply(objArray, this, userListActi, "21");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          userListActi = this.z;
          if (userListActi != null) {
             obj = userListActi.mMode;
             if (obj != null) {
                b = UserListActivity$a.a[obj.ordinal()];
                if (b == 1 || (b == 4 || b == 6)) {
                   b = true;
                }
             }
          }
          b = false;
       }
       i.i(this, this.getStatusColor(), this.isDarkImmersiveMode(), b);
       return;
    }
    public Fragment u3(){
       return null;
    }
    public boolean y3(){
       return true;
    }
    public void z3(){
       UserListActivity tz1;
       UserListActivity userListActi = UserListActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userListActi, "11")) {
          return;
       }
       int i = 1;
       if (!QCurrentUser.me().isLogined()) {
          if (!PatchProxy.applyVoid(objArray, this, userListActi, "12")) {
             d.a(-1712118428).ne(this, this.getUrl(), "followers", 50, null, null, null, null, null).K(i).w(new a(this));
          }
          return;
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Intent obj = PatchProxy.apply(objArray, this, userListActi, "10");
          if (obj != patchProxyRe) {
             i = obj.booleanValue();
          }else {
             obj = this.getIntent();
             if (obj != null) {
                if (obj.getData() != null) {
                   Uri data = obj.getData();
                   if (!PatchProxy.applyVoidOneRefs(data, this, userListActi, "9")) {
                      this.z.mUri = data.toString();
                      String str = "kwai";
                      if (str.equals(data.getScheme()) && ("followers").equals(data.getHost())) {
                         userListActi = this.z;
                         userListActi.mMode = UserListMode.FOLLOWER;
                         userListActi.mUserId = QCurrentUser.me().getId();
                      }else if(str.equals(data.getScheme()) && ("followings").equals(data.getHost())){
                         UserListActivity tz = this.z;
                         UserListMode userListMode = PatchProxy.applyOneRefs(data, this, userListActi, "8");
                         if (userListMode != patchProxyRe) {
                         }else {
                            String str1 = w0.a(data, "tab");
                            if (!TextUtils.x(str1)) {
                               if (("follow").equalsIgnoreCase(str1)) {
                                  userListMode = UserListMode.FOLLOWING_IN_GROUP;
                               }else if(("friend").equalsIgnoreCase(str1)){
                                  userListMode = UserListMode.FRIEND_IN_GROUP;
                               }else if(("fan").equalsIgnoreCase(str1)){
                                  userListMode = UserListMode.FOLLOWER_IN_GROUP;
                               }
                            }
                            userListMode = UserListMode.FOLLOWER_IN_GROUP;
                         }
                         tz.mMode = userListMode;
                         this.z.mUserId = QCurrentUser.me().getId();
                      }else {
                         List pathSegments = data.getPathSegments();
                         if (!q.f(pathSegments)) {
                            String str2 = pathSegments.get(0);
                            String str3 = "type";
                            str = w0.a(data, str3);
                            String str4 = w0.a(data, "style");
                            if ((UserListMode.NOTICE_USERS.mUriPath).equals(str2) && (("missu").equals(str) || (("72").equals(str) && ("2").equals(str4)))) {
                               this.z.mMode = UserListMode.MISSU_USERS;
                            }else {
                               UserListMode[] userListMode1 = UserListMode.values();
                               int len = userListMode1.length;
                               int i1 = 0;
                               while (i1 < len) {
                                  object oobject = userListMode1[i1];
                                  if ((oobject.mUriPath).equalsIgnoreCase(str2)) {
                                     this.z.mMode = oobject;
                                     break ;
                                  }
                                  i1 = i1 + 1;
                               }
                               UserListParam mMode = this.z.mMode;
                               if (mMode != null) {
                                  int i2 = UserListActivity$a.a[mMode.ordinal()];
                                  if (i2 != i) {
                                     if (i2 != 2) {
                                        if (i2 != 3) {
                                           if (i2 != 4) {
                                              if (i2 != 5) {
                                                 tz1 = this.z;
                                                 if (pathSegments.size() > i) {
                                                    objArray = pathSegments.get(i);
                                                 }
                                                 tz1.mUserId = objArray;
                                              }else {
                                                 this.z.mTitle = w0.a(data, "title");
                                                 this.z.mCount = w0.a(data, "count");
                                                 this.z.mPhotoId = w0.a(data, "photoId");
                                                 this.z.mReason = w0.a(data, "reason");
                                                 this.z.mSource = w0.a(data, "source");
                                              }
                                           }else {
                                              this.z.mTitle = w0.a(data, "title");
                                              this.z.mUserId = w0.a(data, "user");
                                              this.z.mPageType = w0.a(data, "pageType");
                                              this.z.mScene = w0.a(data, "scene");
                                              this.z.mPhotoId = w0.a(data, "photoId");
                                           }
                                        }else {
                                           this.z.mUserId = w0.a(data, "user");
                                           tz1 = this.z;
                                           if (tz1.mUserId == null) {
                                              if (pathSegments.size() > i) {
                                                 objArray = pathSegments.get(i);
                                              }
                                              tz1.mUserId = objArray;
                                           }
                                        }
                                     }else {
                                        tz1 = this.z;
                                        if (pathSegments.size() > i) {
                                           objArray = pathSegments.get(i);
                                        }
                                        tz1.mPhotoId = objArray;
                                        this.z.mUserId = QCurrentUser.me().getId();
                                        this.z.mTitle = TextUtils.i(w0.a(data, "title"), a1.p(0x7f101cc0));
                                     }
                                  }else {
                                     this.z.mQueryUrl = w0.a(data, "queryUrl");
                                     userListActi = this.z;
                                     String str5 = w0.a(data, "title");
                                     try{
                                        userListActi.mTitle = str5;
                                        this.z.mNoticeType = Integer.valueOf(w0.a(data, str3)).intValue();
                                     }catch(java.lang.Exception e0){
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }else {
                   try{
                      this.z = j0.e(this.getIntent(), "userListParam");
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                }
             }
          }
          if (!i) {
             return;
          }else {
             this.A = this.C3().subscribe(new c(this));
             return;
          }
       }
    }
}
