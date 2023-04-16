package com.yxcorp.gifshow.pymk.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.social.startup.relation.model.PymkConfig;
import com.kwai.framework.model.user.UserExtraInfo;
import brd.a0;
import java.lang.Integer;
import com.yxcorp.gifshow.pymk.a;
import io.reactivex.i;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import mw4.a;
import brd.c0;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import x6c.n;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import x6c.l;
import jga.f$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import android.app.Application;
import o56.a;
import x6c.k;
import android.content.Context;
import ou7.h$b;
import ou7.h;

public class b	// class@0016af
{

    public void b(){
       super();
    }
    public static boolean a(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (b.g() > 0)? true: false;
       return b;
    }
    public static boolean b(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (b.h() == PymkConfig.PYMK_STYLE_WITH_FEED)? true: false;
       return b;
    }
    public static boolean c(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (b.h() == PymkConfig.PYMK_STYLE_USER_LIST)? true: false;
       return b;
    }
    public static a0 d(UserExtraInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e(p0, 9);
    }
    public static a0 e(UserExtraInfo p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a0.k(new a(p0, p1));
    }
    public static int f(){
       Object obj = PatchProxy.apply(null, null, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = b.g();
       if (i == 2) {
          return 0x7f102bb0;
       }
       if (i != 3) {
          return 0x7f1005f5;
       }
       return 0x7f104088;
    }
    public static int g(){
       Object obj = PatchProxy.apply(null, null, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("pymkCloseBtnType", 0);
    }
    public static int h(){
       PymkConfig obj = PatchProxy.apply(null, null, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.s(PymkConfig.class);
       int pYMK_STYLE_D = (obj == null)? PymkConfig.PYMK_STYLE_DEFAULT: obj.mPymkStyle;
       return pYMK_STYLE_D;
    }
    public static void i(UserExtraInfo p0,c0 p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, b.class, "9")) {
          return;
       }
       a0.B(RichTextMetaExt.f(p0.mRecoTextInfo, p2)).Q(new n(p1));
       return;
    }
    public static boolean j(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(p0.getThirdPartyName()) ^ 0x01);
    }
    public static void k(TextView p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "5")) {
          return;
       }
       if (p1.getFollowStatus() == User$FollowStatus.FOLLOWING) {
          p0.setText(f.a(p1));
       }else {
          p0.setText(p1.mName);
       }
       return;
    }
    public static b l(TextView p0,User p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.k(p0, p1);
       return p1.observable().subscribe(new l(p0, p1));
    }
    public static void m(f$a p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "6")) {
          return;
       }
       if (b.j(p1)) {
          p0.q(true);
          p0.d(null);
       }
       return;
    }
    public static void n(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "11")) {
          return;
       }
       if (User$FollowStatus.FOLLOW_REQUESTING == p1.getFollowStatus()) {
          return;
       }
       String thirdPartyNa = p1.getThirdPartyName();
       if (TextUtils.x(thirdPartyNa) ^ 0x01) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
          profilePacka.visitedUid = p1.getId();
          uContentPack.profilePackage = profilePacka;
          h.c(p0, p1, a.b().getString(R.string.arg_RES_7f1002fc), thirdPartyNa, uContentPack, new k(p1));
       }
       return;
    }
}
