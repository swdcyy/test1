package f82.c;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupJoinButtonInfo;
import d61.c0;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import java.lang.Boolean;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import android.widget.TextView;
import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Throwable;
import z1.a;
import com.yxcorp.retrofit.model.KwaiException;
import e17.i;
import com.kuaishou.live.core.show.fansgroup.c;
import lnc.c3$a;
import lnc.c3;

public class c	// class@0028e7
{
    public static final long a;
    public static final String b;

    static {
       c.a = TimeUnit.MINUTES.toMillis(3);
       c.b = a1.p(0x7f1008f6);
    }
    public void c(){
       super();
    }
    public static String a(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = "GIFT_PANEL";
       if (p0.equals(obj)) {
          return obj;
       }
       if (!p0.equals("RED_PACK_FANS_GROUP_PANEL")) {
          return "UNKNOWN";
       }
       return "FANS_GROUP_RED_PACKET";
    }
    public static String b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a1.p(0x7f10011c)+" "+p0+c.b;
    }
    public static String c(LiveFansGroupInfo p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!c.n(p0)) {
          return c.b(p1);
       }else {
          LiveFansGroupInfo mLiveFansGro = p0.mLiveFansGroupJoinButtonInfo;
          if (c.l(p0)) {
             return c.i(mLiveFansGro, a1.p(0x7f10106f));
          }else {
             return c.i(mLiveFansGro, a1.p(0x7f10011c))+" "+c.j(mLiveFansGro)+c.b;
          }
       }
    }
    public static String d(int p0){
       String obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_normalfan.webp";
       switch (p0){
           case 0:
           case 1:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_potentialfans.webp";
             break;
           case 2:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_popularfan.webp";
             break;
           case 3:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_gloryfans.webp";
             break;
           case 5:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_qianlituan.webp";
             break;
           case 6:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_renqituan.webp";
             break;
           case 7:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_rongyaotuan.webp";
             break;
           case 8:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_wangzhetuan.webp";
             break;
           default:
       }
       return c0.a.b(obj);
    }
    public static String e(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (c.m(p0)) {
          return c.f(p1);
       }else {
          return c.d(p1);
       }
    }
    public static String f(int p0){
       String obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_rongyaotuan_gray.webp";
       switch (p0){
           case 0:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_normalfan_gray.webp";
             break;
           case 1:
           case 7:
           case 2:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_popularfan_gray.webp";
             break;
           case 3:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_gloryfans_text_gray.webp";
             break;
           case 5:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_qianlituan_gray.webp";
             break;
           case 6:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_renqituan_gray.webp";
             break;
           case 8:
             obj = "/udata/pkg/kwai-client-image/live_fansgroup/live_fans_group_wangzhetuan_gray.webp";
             break;
           default:
             goto label_0031 ;
       }
       return c0.a.b(obj);
    }
    public static int g(int p0){
       if (p0 == 5 || (p0 == 6 || p0 == 7)) {
          return 0x7f060622;
       }
       if (p0 != 8) {
          return 0x7f061d96;
       }
       return 0x7f06053a;
    }
    public static int h(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (c.m(p0)) {
          return c.g(p1);
       }else {
          p0 = 0x7f060611;
          switch (p1){
              case 1:
                return 0x7f060d72;
              case 2:
                return 0x7f060d6f;
              case 3:
                return 0x7f060d6c;
              case 5:
              case 7:
              case 6:
                return p0;
              case 8:
                p0 = 0x7f06049a;
                goto label_003a ;
                break;
              default:
             label_0033 :
                return 0x7f061e52;
          }
       }
    }
    public static String i(LiveFansGroupJoinButtonInfo p0,String p1){
       LiveFansGroupJoinButtonInfo mContent;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !TextUtils.x(p0.mContent)) {
          mContent = p0.mContent;
       }
       return mContent;
    }
    public static int j(LiveFansGroupJoinButtonInfo p0){
       if (p0 != null) {
          p0 = p0.mPrice;
          if (p0 > null) {
          label_0008 :
             return p0;
          }
       }
       int i = 1;
       goto label_0008 ;
    }
    public static boolean k(LiveFansGroupInfo p0,LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.mEnableFlashJoin != null && (p1 != null && a.a(p1.mGiftId) != null)))? true: false;
       return b;
    }
    public static boolean l(LiveFansGroupInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!c.n(p0)) {
          return b;
       }
       if (p0.mLiveFansGroupJoinButtonInfo.mJoinType == 2) {
          b = true;
       }
       return b;
    }
    public static boolean m(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
    public static boolean n(LiveFansGroupInfo p0){
       boolean b = (p0 != null && p0.mLiveFansGroupJoinButtonInfo != null)? true: false;
       return b;
    }
    public static void o(TextView p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, c.class, "7")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, ((float)p0.getText().length() * p0.getPaint().getTextSize()), 0, p1, p2, Shader$TileMode.CLAMP);
       p0.getPaint().setShader(v0);
       p0.invalidate();
       return;
    }
    public static void p(Throwable p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "17")) {
          return;
       }
       if (p0 instanceof KwaiException) {
          KwaiException mErrorMessag = p0.mErrorMessage;
          if (p0.mErrorCode == 902) {
             if (TextUtils.x(mErrorMessag)) {
                mErrorMessag = a1.p(R.string.arg_RES_7f101c42);
             }
             i.f(R.style.arg_RES_7f11066a, mErrorMessag, true);
             c3.c(p1, c.a);
             return;
          }else if(TextUtils.x(mErrorMessag)){
             mErrorMessag = a1.p(R.string.arg_RES_7f10225b);
          }
          i.f(R.style.arg_RES_7f11066a, mErrorMessag, true);
       }
       return;
    }
}
