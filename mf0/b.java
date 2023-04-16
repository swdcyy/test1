package mf0.b;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import com.kuaishou.growth.pendant.model.PendantExpandButtonTextConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.model.PendantExpandButtonConfig;
import java.util.Map;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import ekd.j;
import com.kuaishou.growth.pendant.model.PendantActiveParams;
import java.lang.Boolean;
import yb6.d;
import java.lang.StringBuilder;
import mf0.a;
import com.kwai.framework.model.user.QCurrentUser;

public final class b	// class@00315d
{

    public static final PendantExpandButtonTextConfig a(TaskParamsV2 p0){
       PendantExpandButtonConfig mExpandButto;
       Map textConfigMa;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "32");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(p0, "$this$findExpandButtonTextConfig");
       if (b.k(p0)) {
          mExpandButto = p0.getMExpandButtonConfig();
          if (mExpandButto != null) {
             textConfigMa = mExpandButto.getTextConfigMap();
             if (textConfigMa != null) {
                obj = textConfigMa.get("EXTRA_VIDEO_TEXT");
             }
          }
       }else if(b.i(p0)){
          if (b.o(p0)) {
             mExpandButto = p0.getMExpandButtonConfig();
             if (mExpandButto != null) {
                textConfigMa = mExpandButto.getTextConfigMap();
                if (textConfigMa != null) {
                   obj = textConfigMa.get("UN_DOUBLE_TEXT");
                }
             }
          }else if(b.j(p0)){
             mExpandButto = p0.getMExpandButtonConfig();
             if (mExpandButto != null) {
                textConfigMa = mExpandButto.getTextConfigMap();
                if (textConfigMa != null) {
                   obj = textConfigMa.get("IN_DOUBLE_TEXT");
                }
             }
          }
       }else {
          mExpandButto = p0.getMExpandButtonConfig();
          if (mExpandButto != null) {
             textConfigMa = mExpandButto.getTextConfigMap();
             if (textConfigMa != null) {
                obj = textConfigMa.get("COMMON_TEXT");
             }
          }
       }
       return obj;
    }
    public static final String b(TaskParamsV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getBizId");
       String mBizId = p0.getMBizId();
       if (mBizId == null) {
          mBizId = "";
       }
       return mBizId;
    }
    public static final CDNUrl[] c(TaskParamsV2 p0){
       String str;
       CDNUrl[] uCDNUrlArray = null;
       CDNUrl[] obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getCompleteForegroundIconCdnUrls");
       obj = p0.getMCompleteForegroundIconCdnUrls();
       int i = 1;
       if (obj != null) {
          obj = (!obj.length)? 1: 0;
          if (!obj) {
             str = null;
          label_0029 :
             if (!str) {
                return p0.getMCompleteForegroundIconCdnUrls();
             }else {
                str = p0.getMCompleteForegroundIconUrl();
                CDNUrl uCDNUrl = (str == null || !str.length())? 1: null;
                if (!uCDNUrl) {
                   uCDNUrlArray = new CDNUrl[i];
                   uCDNUrlArray[0] = new CDNUrl("", p0.getMCompleteForegroundIconUrl());
                }
                return uCDNUrlArray;
             }
          }
       }
       str = 1;
       goto label_0029 ;
    }
    public static final CDNUrl[] d(TaskParamsV2 p0){
       Object[] objArray;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       CDNUrl[] uCDNUrlArray = null;
       CDNUrl[] obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, uob, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$getCompleteImageCdnUrls");
       obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, uob, "19");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "$this$getCompleteBackgroundIconCdnUrls");
          obj = p0.getMCompleteBackgroundIconCdnUrls();
          if (obj != null) {
             objArray = (!obj.length)? 1: 0;
             if (!objArray) {
                obj = null;
             label_003b :
                if (!obj) {
                   objArray = p0.getMCompleteBackgroundIconCdnUrls();
                }else {
                   String mCompleteBac = p0.getMCompleteBackgroundIconUrl();
                   obj = (mCompleteBac == null || !mCompleteBac.length())? 1: null;
                   if (!obj) {
                      objArray = new CDNUrl[]{new CDNUrl("", p0.getMCompleteBackgroundIconUrl())};
                   }else {
                      objArray = uCDNUrlArray;
                   }
                }
             }
          }
          obj = 1;
          goto label_003b ;
       }
       if (j.h(obj)) {
          Object obj1 = PatchProxy.applyOneRefs(p0, uCDNUrlArray, uob, "18");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             a.p(p0, "$this$getCompleteIconCdnUrls");
             CDNUrl[] mCompleteIco = p0.getMCompleteIconCdnUrls();
             if (mCompleteIco != null) {
                mCompleteIco = (!mCompleteIco.length)? 1: 0;
                if (!mCompleteIco) {
                   str = null;
                label_008d :
                   if (!str) {
                      objArray = p0.getMCompleteIconCdnUrls();
                   }else {
                      str = p0.getMCompleteIconUrl();
                      CDNUrl uCDNUrl = (str == null || !str.length())? 1: null;
                      if (!uCDNUrl) {
                         uCDNUrlArray = new CDNUrl[]{new CDNUrl("", p0.getMCompleteIconUrl())};
                      }
                      objArray = uCDNUrlArray;
                   }
                }
             }
             str = 1;
             goto label_008d ;
          }
       }
       return obj;
    }
    public static final CDNUrl[] e(TaskParamsV2 p0){
       CDNUrl[] uCDNUrlArray = null;
       String obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getIconCdnUrls");
       if (b.m(p0)) {
          obj = b.f(p0);
          CDNUrl uCDNUrl = (obj == null || !obj.length())? 1: null;
          if (!uCDNUrl) {
             uCDNUrlArray = new CDNUrl[]{new CDNUrl("", b.f(p0))};
          }else {
          label_003f :
             CDNUrl[] mIconCdnUrls = p0.getMIconCdnUrls();
             if (mIconCdnUrls != null) {
                mIconCdnUrls = (!mIconCdnUrls.length)? 1: 0;
                if (!mIconCdnUrls) {
                   obj = null;
                label_0051 :
                   if (!obj) {
                      uCDNUrlArray = p0.getMIconCdnUrls();
                   }else {
                      obj = p0.getMIconUrl();
                      uCDNUrl = (obj == null || !obj.length())? 1: null;
                      if (!uCDNUrl) {
                         uCDNUrlArray = new CDNUrl[]{new CDNUrl("", p0.getMIconUrl())};
                      }
                   }
                }
             }
             obj = 1;
             goto label_0051 ;
          }
       }else {
          goto label_003f ;
       }
       return uCDNUrlArray;
    }
    public static final String f(TaskParamsV2 p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getInactiveWidgetIconCdnUrl");
       PendantActiveParams mActiveWidPa = p0.getMActiveWidgetParams();
       if (mActiveWidPa != null) {
          str = mActiveWidPa.getInactiveWidgetIconCdnUrl();
       }
       return str;
    }
    public static final String g(TaskParamsV2 p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       String obj = PatchProxy.applyOneRefs(p0, null, uob, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$getTaskIdentify");
       obj = p0.getMTaskIdentify();
       String str = b.y(p0);
       int i = 0;
       int i1 = (obj == null || !obj.length())? 1: 0;
       if (i1) {
          if (str == null || !str.length()) {
             i = 1;
          }
          if (!i) {
             obj = str;
          }else {
             Object obj1 = PatchProxy.applyOneRefs(p0, null, uob, "1");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                a.p(p0, "$this$reportToken");
                String mReportToken = p0.getMReportToken();
                if (mReportToken == null) {
                   mReportToken = "";
                }
                obj = mReportToken;
             }
          }
       }
       return obj;
    }
    public static final String h(TaskParamsV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getWidgetQueueType");
       String mWidQueueTyp = p0.getMWidgetQueueType();
       if (mWidQueueTyp == null) {
          mWidQueueTyp = "DEFAULT_WIDGET_QUEUE";
       }
       return mWidQueueTyp;
    }
    public static final boolean i(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isDoubleExp");
       b = (b.j(p0) || b.o(p0))? true: false;
       return b;
    }
    public static final boolean j(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isPendantDoubleState");
       b = (p0.getMWidgetStatus() == 4)? true: false;
       return b;
    }
    public static final boolean k(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isPendantExtraRwdState");
       b = (p0.getMWidgetStatus() == 5)? true: false;
       return b;
    }
    public static final boolean l(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isPendantHasClosed");
       b = (!p0.getMWidgetStatus())? true: false;
       return b;
    }
    public static final boolean m(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isPendantNeedActive");
       b = (p0.getMWidgetStatus() == 2)? true: false;
       return b;
    }
    public static final boolean n(TaskParamsV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isPendantSlideBarOpened");
       return p0.getMIsSideBarOpen();
    }
    public static final boolean o(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isPendantUndoubleState");
       b = (p0.getMWidgetStatus() == 3)? true: false;
       return b;
    }
    public static final boolean p(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isSupportAbsorb");
       b = (b.x(p0) || a.g(p0.getMEventId(), "widget_browse_behind_detail_page_ui_finished"))? true: false;
       return b;
    }
    public static final boolean q(TaskParamsV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isSupportTask");
       return b.r(p0.getMEventId());
    }
    public static final boolean r(String p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          switch (p0.hashCode()){
              case 0x899af197:
                if (!p0.equals("widget_comment_photo")) {
                }
                break;
              case 0xa642ac65:
                if (!p0.equals("widget_like_photo")) {
                }
                break;
              case 0xc0f98c52:
                if (!p0.equals("widget_browse_behind_detail_page_ui_unlogin")) {
                }
                break;
              case 0x31185ba:
                if (!p0.equals("profile_setting")) {
                }
                break;
              case 0x7012d35:
                if (!p0.equals("widget_following_live")) {
                }
                break;
              case 0xdf75c29:
                if (!p0.equals("watch_video_complete_in_red_packet_dialog")) {
                }
                break;
              case 0x3cc64256:
                if (!p0.equals("widget_following")) {
                }
                break;
              case 0x42a1c8d0:
                if (!p0.equals("widget_browse_behind_detail_page_ui_finished")) {
                }
                break;
              case 0x637df57c:
                if (!p0.equals("authorized_contact")) {
                }
                break;
              case 0x7e4f8bd2:
                if (!p0.equals("widget_browse_behind_detail_page")) {
                }
                break;
              default:
          }
       label_0079 :
          b = true;
       label_007c :
          return b;
       }
    }
    public static final boolean s(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isTaskComplete");
       b = (p0.getMCurrentCount() >= p0.getMTargetCount())? true: false;
       return b;
    }
    public static final boolean t(TaskParamsV2 p0){
       boolean b;
       long l;
       long mExpireTimeM;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uob, "41");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       a.p(p0, "$this$isTaskExpire");
       b = true;
       int i = 1;
       if (b.w(p0)) {
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, uob, "42");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
             a.p(p0, "$this$isNewTaskExpire");
             l = d.a();
             mExpireTimeM = p0.getMExpireTimeMillis();
             if (i - mExpireTimeM <= 0 && l - mExpireTimeM >= 0) {
                a.c("task expired, server time="+l+", expireTime="+p0.getMExpireTimeMillis());
             }else {
                b = false;
             }
          }
          return b;
       }else {
          l = d.a();
          mExpireTimeM = p0.getMWidgetExpireTime();
          if (i - mExpireTimeM > 0 || l - mExpireTimeM < 0) {
             return false;
          }
          a.c("task expired, server time="+l+", expireTime="+p0.getMWidgetExpireTime());
          return b;
       }
    }
    public static final boolean u(TaskParamsV2 p0){
       boolean b;
       QCurrentUser obj = PatchProxy.applyOneRefs(p0, null, b.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isUiComplete");
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       b = (obj.isLogined() && a.g(p0.getMEventId(), "widget_browse_behind_detail_page_ui_finished"))? true: false;
       return b;
    }
    public static final boolean v(TaskParamsV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null) {
          return b;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          int i = 1;
          String str = (!b.g(p0).length())? 1: null;
          if (!str) {
             str = p0.getMEventId();
             if (str != null && str.length()) {
                i = 0;
             }
             if (!i) {
             label_0048 :
                if (p0.getMActivityTask()) {
                   a.c("isValidParam false, mActivityTask is true");
                   return b;
                }else if(b.t(p0)){
                   b = b.q(p0);
                }
                return b;
             }
          }
          return b;
       }else {
          goto label_0048 ;
       }
    }
    public static final boolean w(TaskParamsV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isWatchVideoCompleteTask");
       return a.g(p0.getMEventId(), "watch_video_complete_in_red_packet_dialog");
    }
    public static final boolean x(TaskParamsV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isWatchVideoTask");
       return a.g(p0.getMEventId(), "widget_browse_behind_detail_page");
    }
    public static final String y(TaskParamsV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$taskReportToken");
       return p0.getMTaskReportToken();
    }
}
