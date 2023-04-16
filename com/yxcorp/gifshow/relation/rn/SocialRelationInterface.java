package com.yxcorp.gifshow.relation.rn.SocialRelationInterface;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import android.app.Activity;
import java.lang.Boolean;
import android.content.Context;
import mz6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lu7.f;
import java.lang.StringBuilder;
import mz6.a;
import mz6.a$a;
import java.lang.CharSequence;
import mz6.b$d;
import wh5.c;
import hcc.j0;
import v6d.a;
import lnc.a1;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.framework.model.user.QCurrentUser;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.helper.a;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.util.c;
import brd.t;
import mac.j;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$b;
import sfc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$d;
import ou7.h$b;
import ou7.h;
import java.util.Objects;
import y8c.g;
import com.kwai.component.misc.report.ReportInfo;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$e;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.Promise;
import org.json.JSONObject;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import ekd.k1;
import java.lang.Exception;
import java.lang.Throwable;
import java.util.ArrayList;
import a17.g;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.util.List;
import a17.c$a;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$g;
import a17.b$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import bi5.a;

public final class SocialRelationInterface extends KrnBridge	// class@00197f
{
    public final ReactApplicationContext context;

    public void SocialRelationInterface(ReactApplicationContext p0){
       a.p(p0, "context");
       super(p0);
       this.context = p0;
    }
    public static void onClickFavorite$default(SocialRelationInterface p0,User p1,Activity p2,Boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.onClickFavorite(p1, p2, p3);
       return;
    }
    public final void addAliasItem(User p0,Context p1,b p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SocialRelationInterface.class, "25")) {
          return;
       }
       if (p0.mIsHiddenUser == null) {
          String str = f.c(p0);
          if (f.i(p0)) {
             str1 = p1.getString(0x7f103941)+"£º"+p0.mName;
          }else {
             str1 = p1.getString(R.string.arg_RES_7f103f5e);
             a.o(str1, "it.getString\(R.string.profile_more_set_alias_name\)");
          }
          a uoa = a.z.a();
          a.m(str);
          uoa.h(str);
          uoa.c(R.drawable.arg_RES_7f081e27);
          uoa.i(1);
          uoa.j(str1);
          uoa.k(R.color.arg_RES_7f061da9);
          uoa.m(R.dimen.no);
          uoa.e(R.string.arg_RES_7f1046bb);
          p2.a(uoa.a());
       }
       return;
    }
    public final void addBlack(User p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "20")) {
          return;
       }
       a uoa = a.z.a();
       uoa.i(0);
       int i = (p0.isBlocked())? 0x7f104ef9: 0x7f1003b7;
       uoa.e(i);
       uoa.o(R.color.arg_RES_7f060751);
       uoa.g(R.string.arg_RES_7f1003b7);
       p1.a(uoa.a());
       return;
    }
    public final void addChat(User p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "23")) {
          return;
       }
       if (p0.mIsHiddenUser == null && c.e()) {
          a uoa = a.z.a();
          uoa.g(R.string.arg_RES_7f104651);
          uoa.e(R.string.arg_RES_7f104651);
          p1.a(uoa.a());
       }
       return;
    }
    public final void addDeleteIntimate(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "17")) {
          return;
       }
       a uoa = a.z.a();
       uoa.o(R.color.arg_RES_7f060751);
       uoa.g(R.string.arg_RES_7f10427d);
       uoa.e(R.string.arg_RES_7f10427d);
       p0.a(uoa.a());
       j0.l("friendship_remove");
       return;
    }
    public final void addFavorite(User p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "24")) {
          return;
       }
       int i = (p0.mFavorited != null)? 0x7f100e57: 0x7f100e53;
       a uoa = a.z.a();
       uoa.g(i);
       uoa.e(i);
       p1.a(uoa.a());
       return;
    }
    public final void addIntimate(User p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "19")) {
          return;
       }
       a uoa = a.z.a();
       uoa.g(R.string.arg_RES_7f10091d);
       uoa.e(R.string.arg_RES_7f10091d);
       uoa.f((a.f() ^ 1));
       p1.a(uoa.a());
       a.l(1);
       j0.l("friendship_invite");
       return;
    }
    public final void addIntimateInviting(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "18")) {
          return;
       }
       a uoa = a.z.a();
       uoa.g(R.string.arg_RES_7f10091d);
       uoa.i(1);
       String str = a1.p(R.string.arg_RES_7f105147);
       a.o(str, "CommonUtil.string\(com.yx¡­string.waiting_for_agree\)");
       uoa.j(str);
       uoa.k(R.color.arg_RES_7f061da9);
       uoa.m(R.dimen.no);
       uoa.e(R.string.arg_RES_7f105147);
       p0.a(uoa.a());
       j0.l("friendship_inviting");
       return;
    }
    public final void addReport(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "21")) {
          return;
       }
       a uoa = a.z.a();
       uoa.i(0);
       uoa.e(R.string.arg_RES_7f10428f);
       uoa.o(R.color.arg_RES_7f060751);
       uoa.g(R.string.arg_RES_7f10428f);
       p0.a(uoa.a());
       return;
    }
    public final void addUnFollow(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "22")) {
          return;
       }
       a uoa = a.z.a();
       uoa.i(0);
       uoa.g(R.string.arg_RES_7f104f05);
       uoa.e(R.string.arg_RES_7f104f05);
       uoa.o(R.color.arg_RES_7f060751);
       p0.a(uoa.a());
       return;
    }
    public final void createIntimateRelation(User p0,boolean p1){
       SocialRelationInterface socialRelati = SocialRelationInterface.class;
       if (PatchProxy.isSupport(socialRelati) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, socialRelati, "14")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       a.b(this.getCurrentActivity(), new IntimateRelationDialogParams(mE.getId()).setTargetId(p0.mId).setHasInvited(p1).setSource(1301).setStyle(0), null);
       return;
    }
    public String getName(){
       return "SocialRelationInterface";
    }
    public final void onClickBlock(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "8")) {
          return;
       }
       c.i(p0, p1, SocialRelationInterface$a.b);
       j0.n(p0, "pull_to_blacklist");
       return;
    }
    public final void onClickChat(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "11")) {
          return;
       }
       c.h(p0, p1);
       j0.n(p0, "click_message");
       return;
    }
    public final void onClickCreateIntimate(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "7")) {
          return;
       }
       this.createIntimateRelation(p0, false);
       j0.n(p0, "friendship_invite");
       return;
    }
    public final void onClickCreateIntimateHasInvite(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "6")) {
          return;
       }
       this.createIntimateRelation(p0, true);
       j0.n(p0, "friendship_inviting");
       return;
    }
    public final void onClickFavorite(User p0,Activity p1,Boolean p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SocialRelationInterface.class, "12")) {
          return;
       }
       String str = "";
       if (p0.mFavorited == null) {
          j.a(p1, p0, true, false, str).subscribe(SocialRelationInterface$b.b, new a());
          if (p2 != null) {
             str1 = (p2.booleanValue())? "certain": "cancel";
          }else {
             str1 = null;
          }
          j0.o(p0, "special_follow", str1);
       }else {
          j.b(p1, p0, true, false, str).subscribe(new SocialRelationInterface$c(p0), new a());
          j0.n(p0, "special_unfollow");
       }
       return;
    }
    public final void onClickIntimateRelease(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "5")) {
          return;
       }
       this.removeIntimateRelation(p0);
       j0.n(p0, "friendship_remove");
       return;
    }
    public final void onClickRemark(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "13")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
       profilePacka.visitedUid = p0.getId();
       uContentPack.profilePackage = profilePacka;
       h.b(p1, p0, uContentPack, SocialRelationInterface$d.a);
       j0.n(p0, "set_remark_name");
       return;
    }
    public final void onClickRemoveFollower(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "4")) {
          return;
       }
       Objects.requireNonNull(p1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       c.j(p1, p0, null);
       j0.n(p0, "remove");
       return;
    }
    public final void onClickRemoveFriends(User p0,boolean p1){
       SocialRelationInterface socialRelati = SocialRelationInterface.class;
       if (PatchProxy.isSupport(socialRelati) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, socialRelati, "3")) {
          return;
       }
       String str = (p1)? "certain": "cancel";
       j0.o(p0, "removed_friends", str);
       return;
    }
    public final void onClickReport(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "9")) {
          return;
       }
       Objects.requireNonNull(p1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       ReportInfo reportInfo = new ReportInfo();
       reportInfo.mRefer = p1.getUrl();
       reportInfo.mPreRefer = p1.U2();
       reportInfo.mSourceType = "user";
       reportInfo.mReportedUserId = p0.getId();
       ReportActivity.P3(p1, WebEntryUrls.k, reportInfo);
       j0.n(p0, "inform_user");
       return;
    }
    public final void onClickReverseRemoveFriends(User p0,boolean p1){
       SocialRelationInterface socialRelati = SocialRelationInterface.class;
       if (PatchProxy.isSupport(socialRelati) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, socialRelati, "2")) {
          return;
       }
       String str = (p1)? "certain": "cancel";
       j0.o(p0, "reverse_removed", str);
       return;
    }
    public final void onClickUnfollow(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "10")) {
          return;
       }
       c.k(p0, p1, null, SocialRelationInterface$e.b);
       j0.n(p0, "unfollow");
       return;
    }
    public final void popup(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationInterface.class, "1")) {
          return;
       }
       a.p(p0, "json");
       a.p(p1, "promise");
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       try{
          this.reportAndCheck(name, "popup", reactApplica);
          JSONObject jSONObject = new JSONObject(p0);
          String str = jSONObject.optString("popupAction");
          int i = jSONObject.optInt("index");
          User user = a.a.h(jSONObject.optString("user"), User.class);
          User user1 = user;
          if (user1 != null) {
             SocialRelationInterface$f uof = new SocialRelationInterface$f(this, user1, i, str, p1, jSONObject);
             k1.o(user);
          }else {
             p1.reject("-2", "user is null");
          }
       }catch(java.lang.Exception e11){
          e11.printStackTrace();
          p1.reject(e11);
       }
       return;
    }
    public final void removeFans(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "16")) {
          return;
       }
       a uoa = a.z.a();
       uoa.i(0);
       uoa.g(R.string.arg_RES_7f104277);
       uoa.o(R.color.arg_RES_7f060751);
       p0.a(uoa.a());
       return;
    }
    public final void removeIntimateRelation(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface.class, "15")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       String str = a1.p(R.string.arg_RES_7f10427d);
       a.o(str, "CommonUtil.string\(R.stri¡­remove_intimate_relation\)");
       uArrayList.add(new g(str, SheetItemStatus.Highlight));
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv != null) {
          c$a uoa = new c$a(currentActiv);
          uoa.j0(uArrayList);
          uoa.l0(R.string.arg_RES_7f10427e);
          uoa.h0(a1.p(R.string.cancel));
          uoa.i0(new SocialRelationInterface$g(currentActiv, uArrayList, p0));
          f.a(uoa).Y(PopupInterface.a);
       }
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SocialRelationInterface.class, "26")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
}
