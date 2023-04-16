package ne1.k;
import java.lang.String;
import com.kwai.framework.abtest.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import p02.r;
import java.lang.Number;
import java.lang.reflect.Type;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import f61.b;
import lnc.a1;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser;
import android.graphics.drawable.Drawable;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import va1.n0;
import w51.a;
import o56.c;
import o56.a;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import z47.d;
import ak5.j;
import jl5.f;
import rnc.i;
import xp5.i;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;

public final class k	// class@0032f3
{
    public static Boolean a;
    public static Boolean b;
    public static boolean c;
    public static boolean d;

    static {
       k.c = f.a("enableNewCommentTextColor2");
       k.d = f.a("enableNewCommentTextColor3");
    }
    public void k(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, k.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r.a();
    }
    public static boolean b(){
       return k.c;
    }
    public static boolean c(){
       return k.d;
    }
    public static int d(){
       String obj = PatchProxy.apply(null, null, k.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = f.b("commentListPrefixIconsOpt", String.class, "");
       int i = Integer.MAX_VALUE;
       if (!TextUtils.isEmpty(obj)) {
          try{
             i = Integer.parseInt(obj);
          }catch(java.lang.NumberFormatException e0){
             b.Z(LiveLogTag.COMMENT, "getCommentPrefixIconLimitedCount parseInt fail: "+e0);
          }
       }
    }
    public static int e(){
       Object obj = PatchProxy.apply(null, null, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (b.b()) {
          return (int)((float)k.h() * 0.40f);
       }
       return a1.e(10.00f);
    }
    public static Drawable f(QLiveMessage p0,LiveCommentBackgroundParser p1,int p2){
       LiveFeedBackground obj;
       Drawable uDrawable;
       if (PatchProxy.isSupport(k.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, k.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0.mLiveAudienceState;
       obj = null;
       LiveAudienceState liveAudience = (p0 != null)? p0.feedBackground: obj;
       if (liveAudience != null) {
          uDrawable = p1.b(liveAudience.resPackId, liveAudience.iconPath, p2, k.b());
       }
       return uDrawable;
    }
    public static int g(){
       Object obj = PatchProxy.apply(null, null, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070778);
    }
    public static int h(){
       Object obj = PatchProxy.apply(null, null, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n0.f();
    }
    public static boolean i(){
       boolean i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, objArray, k.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = k.a;
       if (obj != null) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.apply(objArray, objArray, a.class, "81");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(!a.a().c()){
          i = 0;
       }else {
          i = l.e("live_comment_enable_background", b);
       }
       int i1 = 1;
       if (!i) {
          i = a.t().u("SOURCE_LIVE").d("disableLiveCommentDynamicBackground", b) ^ i1;
       }else if(i == i1){
          b = 1;
       }
       i = b;
       k.a = Boolean.valueOf(i);
       return i;
    }
    public static boolean j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.k(p0, null);
    }
    public static boolean k(String p0,String[] p1){
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyTwoRefs(p0, p1, null, k.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       obj = new d();
       obj.d(p1);
       int b1 = j.o().u(p0, b, p0.length(), obj);
       if (!b1) {
          b1 = PatchProxy.applyOneRefs(p0, null, k.class, "10");
          if (b1 != patchProxyRe) {
             b2 = b1.booleanValue();
          }else if(!TextUtils.isEmpty(p0)){
             b1 = 0;
             while (true) {
                if (b1 < p0.length()) {
                   if (i.e(p0.charAt(b1))) {
                      b2 = true;
                   }else {
                      b1++;
                   }
                }
             }
             return b;
          }
          b2 = false;
          if (!b2) {
          }
       }
       b = true;
       goto label_0062 ;
    }
    public static boolean l(){
       Boolean obj = PatchProxy.apply(null, null, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = k.b;
       if (obj != null) {
          return obj.booleanValue();
       }
       obj = Boolean.valueOf((a.t().u("SOURCE_LIVE").d("disableCommentZoneRichTextMessage", false) ^ 0x01));
       k.b = obj;
       return obj.booleanValue();
    }
    public static void m(i p0,GiftMessage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, k.class, "12")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "COMMENT_SECTION_SEND_GIFT_NOTICE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0.a();
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.totalCount = p1.mCount;
       giftPackage.identity = String.valueOf(p1.mGiftId);
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       QLiveMessage mUser = p1.mUser;
       if (mUser != null) {
          userPackage.identity = mUser.mId;
       }
       uContentPack.giftPackage = giftPackage;
       uContentPack.userPackage = userPackage;
       u1.B(new ClickMetaData().setLogPage(p0.getPage()).setType(1).setContentPackage(uContentPack).setElementPackage(uElementPack));
       return;
    }
}
