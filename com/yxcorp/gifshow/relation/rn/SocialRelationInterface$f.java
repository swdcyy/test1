package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;
import com.kwai.framework.model.user.User;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import hcc.j0;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$m;
import androidx.fragment.app.Fragment;
import erd.g;
import com.yxcorp.gifshow.relation.util.c;
import org.json.JSONArray;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.i3;
import dcc.b;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$o;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$p;
import z1.a;
import dcc.b$a;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$q;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$r;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$s;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$t;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$u;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$v;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$c;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$d;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$e;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$f;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$g;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$h;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$i;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$j;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$k;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$l;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$n;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.ArrayList;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$8;
import java.util.List;
import msd.a;
import msd.l;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$10;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$2;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$7;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$1$13;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$6;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$3;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$12;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$11;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$4;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$9;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$5;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$1;
import com.yxcorp.utility.n;
import fg6.a;
import qbc.a;
import com.google.gson.Gson;
import mz6.b;
import android.content.Context;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$a;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$b;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;

public final class SocialRelationInterface$f implements Runnable	// class@00197d
{
    public final SocialRelationInterface b;
    public final User c;
    public final int d;
    public final String e;
    public final Promise f;
    public final JSONObject g;

    public void SocialRelationInterface$f(SocialRelationInterface p0,User p1,int p2,String p3,Promise p4,JSONObject p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       String str12;
       View view;
       String str13;
       SocialRelationInterface$f c;
       String str14;
       String str15;
       String str16;
       String str17;
       String str18;
       String str19;
       String str20;
       String str21;
       String str22;
       b uob6;
       i3 oi31;
       b uob11;
       JSONArray jSONArray1;
       String str25;
       int i3;
       String str26;
       b uob15;
       a uoa;
       Ref$IntRef intRef2;
       String str27;
       int i4;
       Object obj1;
       a uoa2;
       Iterator iterator1;
       b obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, SocialRelationInterface$f.class, "1")) {
          return;
       }
       obj.c.mPosition = obj.d - 1;
       String str = "unfollow";
       if (a.g(str, obj.e) && obj.b.getCurrentActivity() != null) {
          j0.n(obj.c, str);
          c.k(obj.c, obj.b.getCurrentActivity(), objArray, SocialRelationInterface$f$m.b);
          obj.f.resolve("unfollow_confirm");
          return;
       }else {
          JSONArray jSONArray = obj.g.optJSONArray("items");
          if (jSONArray != null) {
             String str1 = "intimating";
             String str2 = "remove_fan";
             String str3 = "favorite";
             String str4 = "intimate";
             String str5 = "black";
             String str6 = "chat";
             String str7 = "delete_intimate";
             String str8 = "report";
             String str9 = "remark";
             String str10 = "activity";
             String str11 = "";
             if (b.a(-1578665399).F()) {
                int i = obj.g.optInt("targetViewReactTag");
                if (i) {
                   str12 = str11;
                   view = obj.b.context.getNativeModule(UIManagerModule.class).resolveView(i);
                }else {
                   str12 = str11;
                   view = null;
                }
                Activity currentActiv = obj.b.getCurrentActivity();
                if (!currentActiv instanceof GifshowActivity) {
                   currentActiv = null;
                }
                if (currentActiv != null && view != null) {
                   i3 oi3 = i3.f();
                   str13 = str9;
                   c = obj.c;
                   str14 = str8;
                   b$a f = b.f;
                   str15 = str7;
                   str16 = str;
                   b uob = f.d(new SocialRelationInterface$f$o(obj, currentActiv), new SocialRelationInterface$f$p(oi3));
                   b uob1 = f.e(new SocialRelationInterface$f$q(obj, currentActiv));
                   str17 = str6;
                   str18 = str5;
                   b uob2 = f.d(new SocialRelationInterface$f$r(obj, currentActiv), new SocialRelationInterface$f$s(oi3));
                   b uob3 = f.a(new SocialRelationInterface$f$t(obj, currentActiv));
                   str19 = str4;
                   b uob4 = f.c(new SocialRelationInterface$f$u(obj, currentActiv));
                   str20 = str3;
                   b uob5 = f.a(new SocialRelationInterface$f$v(obj, currentActiv));
                   str21 = str2;
                   str22 = str1;
                   uob6 = f.b(new SocialRelationInterface$f$c(obj), new SocialRelationInterface$f$d(oi3));
                   String str23 = str10;
                   b uob7 = f.b(new SocialRelationInterface$f$e(obj), new SocialRelationInterface$f$f(oi3));
                   b uob8 = f.a(new SocialRelationInterface$f$i(obj, currentActiv));
                   b uob9 = f.b(new SocialRelationInterface$f$g(obj), new SocialRelationInterface$f$h(oi3));
                   b uob10 = f.f(new SocialRelationInterface$f$j(obj), new SocialRelationInterface$f$k(oi3));
                   obj = f.f(new SocialRelationInterface$f$l(obj), new SocialRelationInterface$f$n(oi3));
                   UserListBubble userListBubb = UserListBubble.class;
                   str10 = "5";
                   if (PatchProxy.isSupport2(userListBubb, str10)) {
                      oi31 = oi3;
                      Object[] objArray1 = new Object[16];
                      objArray1[0] = currentActiv;
                      objArray1[1] = c;
                      objArray1[2] = view;
                      objArray1[3] = jSONArray;
                      objArray1[4] = uob;
                      objArray1[5] = uob1;
                      objArray1[6] = uob2;
                      objArray1[7] = uob3;
                      objArray1[8] = uob4;
                      objArray1[9] = uob5;
                      objArray1[10] = uob6;
                      objArray1[11] = uob7;
                      objArray1[12] = uob9;
                      objArray1[13] = uob8;
                      objArray1[14] = uob10;
                      objArray1[15] = obj;
                      uob11 = obj;
                      if (PatchProxy.applyVoid(objArray1, null, userListBubb, str10)) {
                      label_057d :
                         j0.i(oi31);
                         j0.q(this.c, str12);
                         n.C(currentActiv);
                         return;
                      }
                   }else {
                      uob11 = obj;
                      oi31 = oi3;
                   }
                   a.p(currentActiv, str23);
                   a.p(c, "user");
                   a.p(view, "anchorView");
                   a.p(jSONArray, "menuItems");
                   a.p(uob, "editNicknameCallback");
                   a.p(uob1, "favoriteCallback");
                   a.p(uob2, "sendMessageCallback");
                   a.p(uob3, "unfollowCallback");
                   a.p(uob4, "reportCallback");
                   a.p(uob5, "blockCallback");
                   a.p(uob6, "createIntimateRelationCallback");
                   b uob12 = uob7;
                   a.p(uob12, "createIntimateRelationHasInviteCallback");
                   UserListBubble userListBubb1 = userListBubb;
                   b uob13 = uob9;
                   a.p(uob13, "releaseIntimateRelationCallback");
                   String str24 = str10;
                   b uob14 = uob8;
                   a.p(uob14, "removeFollowerCallback");
                   a.p(uob10, "removeUserListCallback");
                   View view1 = view;
                   a.p(uob11, "reverseRemoveUserListCallback");
                   Ref$IntRef intRef = new Ref$IntRef();
                   intRef.element = 0;
                   ArrayList uArrayList = new ArrayList();
                   Ref$IntRef intRef1 = intRef;
                   int i1 = jSONArray.length();
                   Activity uActivity = currentActiv;
                   i = 0;
                   while (i < i1) {
                      int i2 = i1;
                      JSONObject jSONObject = jSONArray.optJSONObject(i);
                      jSONArray1 = jSONArray;
                      if (jSONObject != null) {
                         str25 = jSONObject.optString("key");
                         if (str25 != null) {
                            switch (str25.hashCode()){
                                case 0xc84ac380:
                                  i3 = i;
                                  str26 = str13;
                                  uob15 = uob11;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$1 oshowPopup$$ = new UserListBubble$showPopup$$inlined$also$lambda$1(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob15, intRef1);
                                     uob11 = uob15;
                                     UserListBubble.a(uArrayList, null, uob, str25);
                                  }else {
                                     uob11 = uob15;
                                  label_055f :
                                     uob15 = 0;
                                  }
                                  break;
                                case 0xc84c5534:
                                  i3 = i;
                                  str26 = str14;
                                  uob15 = uob11;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$5 oshowPopup$$1 = new UserListBubble$showPopup$$inlined$also$lambda$5(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob15, intRef1);
                                     str14 = str26;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob4, str25);
                                  label_0515 :
                                     uob11 = uob15;
                                  label_0517 :
                                     a uoa1 = uoa;
                                  label_0518 :
                                     str26 = str13;
                                  }else {
                                     str14 = str26;
                                  label_051d :
                                     uob11 = uob15;
                                  label_0356 :
                                     str26 = str13;
                                     goto label_055f ;
                                  }
                                  break;
                                case 0xdec88c73:
                                  i3 = i;
                                  str26 = str15;
                                  uob15 = uob11;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$9 oshowPopup$$2 = new UserListBubble$showPopup$$inlined$also$lambda$9(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob15, intRef1);
                                     str15 = str26;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob13, str25);
                                     goto label_0515 ;
                                  }else {
                                     str15 = str26;
                                     goto label_051d ;
                                  }
                                  break;
                                case 0xe934338a:
                                  i3 = i;
                                  str26 = str16;
                                  uob15 = uob11;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$4 oshowPopup$$3 = new UserListBubble$showPopup$$inlined$also$lambda$4(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob15, intRef1);
                                     str16 = str26;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob3, str25);
                                     goto label_0515 ;
                                  }else {
                                     str16 = str26;
                                     goto label_051d ;
                                  }
                                  break;
                                case 0xee1f00c2:
                                  i3 = i;
                                  uob15 = uob11;
                                  if (str25.equals("friendRemove")) {
                                     UserListBubble$showPopup$$inlined$also$lambda$11 oshowPopup$$4 = new UserListBubble$showPopup$$inlined$also$lambda$11(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob15, intRef1);
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob10, str25);
                                     goto label_0515 ;
                                  }else {
                                     goto label_051d ;
                                  }
                                  break;
                                case 0xf894dc08:
                                  i3 = i;
                                  intRef2 = intRef1;
                                  if (str25.equals("friendReverseRemove")) {
                                     UserListBubble$showPopup$$inlined$also$lambda$12 oshowPopup$$5 = new UserListBubble$showPopup$$inlined$also$lambda$12(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob11, intRef2);
                                     intRef1 = intRef2;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob11, str25);
                                     goto label_0517 ;
                                  }else {
                                  label_041b :
                                     intRef1 = intRef2;
                                     goto label_0356 ;
                                  }
                                  break;
                                case 0x2e9358:
                                  i3 = i;
                                  str27 = str17;
                                  intRef2 = intRef1;
                                  if (str25.equals(str27)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$3 oshowPopup$$6 = new UserListBubble$showPopup$$inlined$also$lambda$3(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob11, intRef2);
                                     str17 = str27;
                                     UserListBubble.a(uArrayList, null, uob2, str25);
                                  label_03d5 :
                                     intRef1 = intRef2;
                                     goto label_0518 ;
                                  }else {
                                     str17 = str27;
                                     goto label_041b ;
                                  }
                                  break;
                                case 0x5978fff:
                                  i3 = i;
                                  str27 = str18;
                                  intRef2 = intRef1;
                                  if (str25.equals(str27)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$6 oshowPopup$$7 = new UserListBubble$showPopup$$inlined$also$lambda$6(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob11, intRef2);
                                     str18 = str27;
                                     UserListBubble.a(uArrayList, null, uob5, str25);
                                     goto label_03d5 ;
                                  }else {
                                     str18 = str27;
                                     goto label_041b ;
                                  }
                                  break;
                                case 0x16b3214d:
                                  if (str25.equals("separation_line")) {
                                     intRef2 = intRef1;
                                     i1 = intRef2.element + 1;
                                     intRef2.element = i1;
                                     uArrayList.add(UserListBubble$showPopup$1$13.INSTANCE);
                                  }else {
                                     i4 = 1;
                                  }
                                  i3 = i;
                                  goto label_0356 ;
                                  break;
                                case 0x2235b05f:
                                  str26 = str19;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$7 oshowPopup$$8 = new UserListBubble$showPopup$$inlined$also$lambda$7(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob11, intRef1);
                                     str19 = str26;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob6, str25);
                                  label_0329 :
                                     i3 = i;
                                     i4 = 1;
                                     goto label_0517 ;
                                  }else {
                                     str19 = str26;
                                  }
                                  break;
                                case 0x3ea1c99c:
                                  str26 = str20;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$2 oshowPopup$$9 = new UserListBubble$showPopup$$inlined$also$lambda$2(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob11, intRef1);
                                     str20 = str26;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob1, str25);
                                     goto label_0329 ;
                                  }else {
                                     str20 = str26;
                                  }
                                  break;
                                case 0x417fd0d8:
                                  str26 = str21;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$10 oshowPopup$$10 = new UserListBubble$showPopup$$inlined$also$lambda$10(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob11, intRef1);
                                     str21 = str26;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob14, str25);
                                     goto label_0329 ;
                                  }else {
                                     str21 = str26;
                                  }
                                  break;
                                case 0x6b8b315c:
                                  str26 = str22;
                                  if (str25.equals(str26)) {
                                     UserListBubble$showPopup$$inlined$also$lambda$8 oshowPopup$$11 = new UserListBubble$showPopup$$inlined$also$lambda$8(uArrayList, uob, uob1, c, uob2, uob3, uob4, uob5, uob6, uob12, uob13, uob14, uob10, uActivity, uob11, intRef1);
                                     str22 = str26;
                                     uoa = null;
                                     UserListBubble.a(uArrayList, uoa, uob12, str25);
                                     goto label_0329 ;
                                  }else {
                                     str22 = str26;
                                  }
                                  break;
                                default:
                            }
                            i1 = i3 + 1;
                            i = i1;
                            str13 = str26;
                            i1 = i2;
                            jSONArray = jSONArray1;
                         }
                      }
                      i3 = i;
                      str26 = str13;
                      i4 = 1;
                      goto label_0560 ;
                   }
                   currentActiv = uActivity;
                   UserListBubble.l(currentActiv, view1, uArrayList, intRef1.element);
                   PatchProxy.onMethodExit(userListBubb1, str24);
                   goto label_057d ;
                }else {
                   obj1 = obj;
                   jSONArray1 = jSONArray;
                   str16 = str;
                   str22 = str1;
                   str21 = str2;
                   str20 = str3;
                   str19 = str4;
                   str18 = str5;
                   str17 = str6;
                   str15 = str7;
                   str14 = str8;
                   str26 = str9;
                   str25 = str10;
                   str = str12;
                }
             }else {
                jSONArray1 = jSONArray;
                str16 = str;
                str22 = str1;
                str21 = str2;
                str20 = str3;
                str19 = str4;
                str18 = str5;
                str17 = str6;
                str15 = str7;
                str14 = str8;
                str26 = str9;
                str = str11;
                obj1 = obj;
                str25 = str10;
             }
             ArrayList uArrayList1 = new ArrayList();
             int i5 = jSONArray1.length();
             int i6 = 0;
             while (i6 < i5) {
                JSONArray jSONArray2 = jSONArray1;
                JSONObject jSONObject1 = jSONArray2.optJSONObject(i6);
                if (jSONObject1 != null) {
                   uoa2 = a.a.h(jSONObject1.toString(), a.class);
                   if (uoa2 != null) {
                      uArrayList1.add(uoa2);
                   }
                }
                i6 = i6 + 1;
                jSONArray1 = jSONArray2;
             }
             Activity currentActiv1 = obj1.b.getCurrentActivity();
             if (currentActiv1 != null) {
                uob6 = new b(currentActiv1);
                Iterator iterator = uArrayList1.iterator();
                while (iterator.hasNext()) {
                   uoa2 = iterator.next().key;
                   switch (uoa2.hashCode()){
                       case 0xc84ac380:
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str26)) {
                            str13 = str26;
                            a.o(currentActiv1, str25);
                            obj1.b.addAliasItem(obj1.c, currentActiv1, uob6);
                         }else {
                         label_077a :
                            str13 = str26;
                         }
                         break;
                       case 0xc84c5534:
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str2)) {
                            obj1.b.addReport(uob6);
                            goto label_077a ;
                         }else {
                            goto label_077a ;
                         }
                         break;
                       case 0xdec88c73:
                         iterator1 = iterator;
                         str2 = str15;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str2)) {
                            obj1.b.addDeleteIntimate(uob6);
                         }
                         str13 = str26;
                         str15 = str2;
                      label_0734 :
                         str2 = str14;
                         break;
                       case 0xe934338a:
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str10)) {
                            obj1.b.addUnFollow(uob6);
                         }
                         str13 = str26;
                         iterator1 = iterator;
                         goto label_0734 ;
                         break;
                       case 0x2e9358:
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str9)) {
                            obj1.b.addChat(obj1.c, uob6);
                         }
                         str13 = str26;
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         break;
                       case 0x5978fff:
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str8)) {
                            obj1.b.addBlack(obj1.c, uob6);
                         }
                         str13 = str26;
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         break;
                       case 0x2235b05f:
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str7)) {
                            obj1.b.addIntimate(obj1.c, uob6);
                         }
                         str13 = str26;
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         break;
                       case 0x3ea1c99c:
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str6)) {
                            obj1.b.addFavorite(obj1.c, uob6);
                         }
                         str13 = str26;
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         break;
                       case 0x417fd0d8:
                         str5 = str21;
                         str4 = str22;
                         if (uoa2.equals(str5)) {
                            obj1.b.removeFans(uob6);
                         }
                         str13 = str26;
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         break;
                       case 0x6b8b315c:
                         str4 = str22;
                         if (uoa2.equals(str4)) {
                            obj1.b.addIntimateInviting(uob6);
                         }
                         str13 = str26;
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         break;
                       default:
                         str13 = str26;
                         iterator1 = iterator;
                         str2 = str14;
                         str10 = str16;
                         str9 = str17;
                         str8 = str18;
                         str7 = str19;
                         str6 = str20;
                         str5 = str21;
                         str4 = str22;
                   }
                   str14 = str2;
                   str22 = str4;
                   str21 = str5;
                   str20 = str6;
                   str19 = str7;
                   str18 = str8;
                   str17 = str9;
                   str16 = str10;
                   iterator = iterator1;
                   str26 = str13;
                }
                uob6.l(new SocialRelationInterface$f$a(currentActiv1, obj1, uArrayList1));
                uob6.k(new SocialRelationInterface$f$b(obj1, uArrayList1));
                uob6.q();
                j0.q(obj1.c, str);
             }
          }else {
             obj.f.reject("-3", "item is null");
          }
          return;
       }
    }
}
