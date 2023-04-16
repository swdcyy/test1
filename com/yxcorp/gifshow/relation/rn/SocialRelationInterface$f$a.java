package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$a;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import java.util.ArrayList;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;
import java.lang.Boolean;
import com.facebook.react.bridge.Promise;

public final class SocialRelationInterface$f$a implements DialogInterface$OnClickListener	// class@001967
{
    public final Activity b;
    public final SocialRelationInterface$f c;
    public final ArrayList d;

    public void SocialRelationInterface$f$a(Activity p0,SocialRelationInterface$f p1,ArrayList p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       SocialRelationInterface$f$a tc;
       SocialRelationInterface$f$a tb;
       String str;
       if (PatchProxy.isSupport2(SocialRelationInterface$f$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, SocialRelationInterface$f$a.class, "1")) {
          return;
       }
       if (p1 == 0x7f1046bb) {
          tc = this.c;
          tb = this.b;
          a.o(tb, "activity");
          tc.b.onClickRemark(tc.c, tb);
          str = "remark";
       }else if(p1 == 0x7f100e53 || p1 == 0x7f100e57){
          tc = this.c;
          SocialRelationInterface$f$a tb1 = this.b;
          a.o(tb1, "activity");
          SocialRelationInterface.onClickFavorite$default(tc.b, tc.c, tb1, null, 4, null);
          str = "favorite";
       }else if(p1 == 0x7f104651){
          tc = this.c;
          tb = this.b;
          a.o(tb, "activity");
          tc.b.onClickChat(tc.c, tb);
          str = "chat";
       }else if(p1 == 0x7f104f05){
          tc = this.c;
          tb = this.b;
          a.o(tb, "activity");
          tc.b.onClickUnfollow(tc.c, tb);
          str = "unfollow";
       }else if(p1 == 0x7f10428f){
          tc = this.c;
          tb = this.b;
          a.o(tb, "activity");
          tc.b.onClickReport(tc.c, tb);
          str = "report";
       }else if(p1 == 0x7f1003b7){
          tc = this.c;
          tb = this.b;
          a.o(tb, "activity");
          tc.b.onClickBlock(tc.c, tb);
          str = "black";
       }else if(p1 == 0x7f10091d){
          tc = this.c;
          tc.b.onClickCreateIntimate(tc.c);
          str = "intimate";
       }else if(p1 == 0x7f105147){
          tc = this.c;
          tc.b.onClickCreateIntimateHasInvite(tc.c);
          str = "intimating";
       }else if(p1 == 0x7f10427d){
          tc = this.c;
          tc.b.onClickIntimateRelease(tc.c);
          str = "delete_intimate";
       }else if(p1 == 0x7f104277){
          tc = this.c;
          tb = this.b;
          a.o(tb, "activity");
          tc.b.onClickRemoveFollower(tc.c, tb);
          str = "remove_fan";
       }else {
          str = "";
       }
       this.c.f.resolve(str);
       PatchProxy.onMethodExit(SocialRelationInterface$f$a.class, "1");
       return;
    }
}
