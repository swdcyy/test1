package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$showPopup$$inlined$also$lambda$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import dcc.b;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.Ref$IntRef;
import android.view.View;
import dcc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dcc.d;
import com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble;

public final class UserListBubble$showPopup$$inlined$also$lambda$3 extends Lambda implements l	// class@001a1b
{
    public final GifshowActivity $activity$inlined;
    public final b $blockCallback$inlined;
    public final b $createIntimateRelationCallback$inlined;
    public final b $createIntimateRelationHasInviteCallback$inlined;
    public final b $editNicknameCallback$inlined;
    public final b $favoriteCallback$inlined;
    public final Ref$IntRef $gapCount$inlined;
    public final List $items$inlined;
    public final b $releaseIntimateRelationCallback$inlined;
    public final b $removeFollowerCallback$inlined;
    public final b $removeUserListCallback$inlined;
    public final b $reportCallback$inlined;
    public final b $reverseRemoveUserListCallback$inlined;
    public final b $sendMessageCallback$inlined;
    public final b $unfollowCallback$inlined;
    public final User $user$inlined;

    public void UserListBubble$showPopup$$inlined$also$lambda$3(List p0,b p1,b p2,User p3,b p4,b p5,b p6,b p7,b p8,b p9,b p10,b p11,b p12,GifshowActivity p13,b p14,Ref$IntRef p15){
       int i = this;
       i.$items$inlined = p0;
       i.$editNicknameCallback$inlined = p1;
       i.$favoriteCallback$inlined = p2;
       i.$user$inlined = p3;
       i.$sendMessageCallback$inlined = p4;
       i.$unfollowCallback$inlined = p5;
       i.$reportCallback$inlined = p6;
       i.$blockCallback$inlined = p7;
       i.$createIntimateRelationCallback$inlined = p8;
       i.$createIntimateRelationHasInviteCallback$inlined = p9;
       i.$releaseIntimateRelationCallback$inlined = p10;
       i.$removeFollowerCallback$inlined = p11;
       i.$removeUserListCallback$inlined = p12;
       i.$activity$inlined = p13;
       i.$reverseRemoveUserListCallback$inlined = p14;
       i.$gapCount$inlined = p15;
       super(1);
    }
    public final c invoke(View p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, UserListBubble$showPopup$$inlined$also$lambda$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       PatchProxy.onMethodExit(UserListBubble$showPopup$$inlined$also$lambda$3.class, "1");
       return UserListBubble.j(p0, this.$sendMessageCallback$inlined);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
