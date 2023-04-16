package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble;
import java.lang.Object;
import java.util.List;
import msd.a;
import dcc.b;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import z1.a;
import java.lang.Runnable;
import kotlin.jvm.internal.a;
import ekd.k1;
import android.view.View;
import dcc.d;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$e;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import dcc.a;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$d;
import k07.j$a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.yxcorp.gifshow.widget.popup.a;
import com.kwai.library.widget.popup.common.c$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$b;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$c;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.User;
import java.util.ArrayList;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$1;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$2;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$3;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$4;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$5;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$6;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFollowingList$7;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$1;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$2;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$3;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$4;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$5;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$6;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$7;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$8;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$9;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$10;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$11;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$12;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$13;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$14;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$15;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopupForFriendsList$16;

public final class UserListBubble	// class@001a3d
{
    public static final UserListBubble a;

    static {
       UserListBubble.a = new UserListBubble();
    }
    public void UserListBubble(){
       super();
    }
    public static final void a(List p0,a p1,b p2,l p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, UserListBubble.class, "7")) {
          return;
       }
       if (p1 == null || p1.invoke().booleanValue()) {
          b e = p2.e;
          if (e != null) {
             e.accept(Boolean.TRUE);
          }
          p0.add(p3);
       }else {
          b e1 = p2.e;
          if (e1 != null) {
             e1.accept(Boolean.FALSE);
          }
       }
       return;
    }
    public static final void b(boolean p0,Runnable p1){
       UserListBubble userListBubb = UserListBubble.class;
       if (PatchProxy.isSupport(userListBubb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, userListBubb, "1")) {
          return;
       }
       a.p(p1, "runnable");
       if (p0) {
          k1.r(p1, 300);
       }else {
          p1.run();
       }
       return;
    }
    public static final d c(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f1003b7, 0x7f082205);
    }
    public static final d d(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f1010b9, 0x7f082207);
    }
    public static final d e(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f1010b9, 0x7f082207);
    }
    public static final d f(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f1046bb, 0x7f08221a);
    }
    public static final d g(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f1010ba, 0x7f082222);
    }
    public static final d h(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f104277, 0x7f082223);
    }
    public static final d i(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f10428f, 0x7f082226);
    }
    public static final d j(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f104651, 0x7f082228);
    }
    public static final d k(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, UserListBubble.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, 0x7f104f05, 0x7f082208);
    }
    public static final void l(GifshowActivity p0,View p1,List p2,int p3){
       boolean b;
       if (PatchProxy.isSupport(UserListBubble.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, UserListBubble.class, "6")) {
          return;
       }
       int i = (((p2.size() - p3) * a1.d(0x7f0700f4)) + (p3 * a1.d(0x7f0700f2))) + a1.e(4.00f);
       p3 = n.j(p0);
       int[] ointArray = n.o(p1);
       if (!ointArray[1]) {
          return;
       }
       int i1 = ((ointArray[1] + p1.getHeight()) + i) - (p3 - (int)((float)p3 * 0x3d75c28f));
       p3 = (n.A(p0) + a1.d(0x7f070fdc)) - (ointArray[1] - i);
       if (i1 >= 0) {
          if (p3 >= 0) {
             if (p3 < i1) {
                i = i - p3;
             }else {
                i = i - i1;
             }
          }
          b = false;
       label_0077 :
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          UserListBubble$e uoe = new UserListBubble$e(objectRef, ointArray, p1);
          p1.getViewTreeObserver().addOnGlobalLayoutListener(uoe);
          a uoa = new a(p2, new UserListBubble$d(p1, uoe));
          j$a uoa1 = new j$a(p0);
          uoa1.K0(KwaiBubbleOption.e);
          uoa1.B(false);
          uoa1.m0(uoa);
          uoa1.o0(p1);
          uoa1.z(1);
          uoa1.A(1);
          uoa1.M(uoa);
          uoa1.v0(false);
          BubbleInterface$Position bOTTOM = (b)? BubbleInterface$Position.BOTTOM: BubbleInterface$Position.TOP;
          uoa1.D0(bOTTOM);
          uoa1.L(new UserListBubble$a(i, ointArray, p1, b));
          uoa1.G(new UserListBubble$b(b));
          uoa1.O(UserListBubble$c.a);
          objectRef.element = uoa1.X();
          return;
       }
       b = true;
       goto label_0077 ;
    }
    public static final void m(GifshowActivity p0,View p1,User p2,b p3,b p4,b p5,b p6,b p7){
       if (PatchProxy.isSupport2(UserListBubble.class, "3")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, UserListBubble.class, "3")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "anchorView");
       a.p(p2, "user");
       a.p(p3, "editNicknameCallback");
       a.p(p4, "favoriteCallback");
       a.p(p5, "unfollowCallback");
       a.p(p6, "reportCallback");
       a.p(p7, "blockCallback");
       ArrayList uArrayList = new ArrayList();
       UserListBubble.a(uArrayList, new UserListBubble$showPopupForFollowingList$1(p2), p3, new UserListBubble$showPopupForFollowingList$2(p3));
       UserListBubble.a(uArrayList, null, p4, new UserListBubble$showPopupForFollowingList$3(p2, p4));
       uArrayList.add(UserListBubble$showPopupForFollowingList$4.INSTANCE);
       UserListBubble.a(uArrayList, null, p5, new UserListBubble$showPopupForFollowingList$5(p5));
       UserListBubble.a(uArrayList, null, p6, new UserListBubble$showPopupForFollowingList$6(p6));
       UserListBubble.a(uArrayList, null, p7, new UserListBubble$showPopupForFollowingList$7(p7));
       UserListBubble.l(p0, p1, uArrayList, 1);
       PatchProxy.onMethodExit(UserListBubble.class, "3");
       return;
    }
    public static final void n(GifshowActivity p0,View p1,User p2,b p3,boolean p4,b p5,b p6,b p7,boolean p8,b p9,b p10,b p11,b p12,b p13){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p5;
       object oobject5 = p6;
       object oobject6 = p7;
       object oobject7 = p9;
       object oobject8 = p10;
       object oobject9 = p11;
       object oobject10 = p12;
       object oobject11 = p13;
       UserListBubble userListBubb = UserListBubble.class;
       Object obj = null;
       if (PatchProxy.isSupport2(userListBubb, "2")) {
          Object[] objArray = new Object[14];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = oobject4;
          objArray[6] = oobject5;
          objArray[7] = oobject6;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = oobject7;
          objArray[10] = oobject8;
          objArray[11] = oobject9;
          objArray[12] = oobject10;
          objArray[13] = oobject11;
          if (PatchProxy.applyVoid(objArray, obj, userListBubb, "2")) {
             return;
          }
       }else {
          int i = 2;
       }
       a.p(oobject, "activity");
       a.p(oobject1, "anchorView");
       a.p(oobject2, "user");
       a.p(oobject3, "editNicknameCallback");
       a.p(oobject4, "createIntimateRelationCallback");
       a.p(oobject5, "createIntimateRelationHasInviteCallback");
       a.p(oobject6, "releaseIntimateRelationCallback");
       a.p(oobject7, "sendMessageCallback");
       a.p(oobject8, "favoriteCallback");
       a.p(oobject9, "unfollowCallback");
       a.p(oobject10, "removeUserListCallback");
       a.p(oobject11, "reverseRemoveUserListCallback");
       ArrayList uArrayList = new ArrayList();
       UserListBubble userListBubb1 = userListBubb;
       UserListBubble.a(uArrayList, new UserListBubble$showPopupForFriendsList$1(oobject2), oobject3, new UserListBubble$showPopupForFriendsList$2(oobject3));
       boolean b = p4;
       if (b && (p2.isFriend() && oobject2.mIntimateRelationType <= null)) {
          UserListBubble.a(uArrayList, new UserListBubble$showPopupForFriendsList$3(oobject2), oobject5, new UserListBubble$showPopupForFriendsList$4(oobject5));
          UserListBubble.a(uArrayList, new UserListBubble$showPopupForFriendsList$5(oobject2), oobject4, new UserListBubble$showPopupForFriendsList$6(oobject4));
       }
    label_00eb :
       UserListBubble.a(uArrayList, new UserListBubble$showPopupForFriendsList$7(oobject2, p8), oobject7, new UserListBubble$showPopupForFriendsList$8(oobject7));
       UserListBubble.a(uArrayList, null, oobject8, new UserListBubble$showPopupForFriendsList$9(oobject2, oobject8));
       uArrayList.add(UserListBubble$showPopupForFriendsList$10.INSTANCE);
       UserListBubble.a(uArrayList, null, oobject10, new UserListBubble$showPopupForFriendsList$11(oobject2, oobject, oobject10));
       UserListBubble.a(uArrayList, null, oobject11, new UserListBubble$showPopupForFriendsList$12(oobject2, oobject, oobject11));
       uArrayList.add(UserListBubble$showPopupForFriendsList$13.INSTANCE);
       UserListBubble.a(uArrayList, new UserListBubble$showPopupForFriendsList$14(b, oobject2), oobject6, new UserListBubble$showPopupForFriendsList$15(oobject6));
       UserListBubble.a(uArrayList, null, oobject9, new UserListBubble$showPopupForFriendsList$16(oobject9));
       UserListBubble.l(oobject, oobject1, uArrayList, 2);
       PatchProxy.onMethodExit(userListBubb1, "2");
       return;
    }
}
