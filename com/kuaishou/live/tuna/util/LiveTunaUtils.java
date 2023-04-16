package com.kuaishou.live.tuna.util.LiveTunaUtils;
import com.kuaishou.live.tuna.util.LiveTunaUtils$NEED_REPORT_PERFORMANCE$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import android.content.Context;
import vq5.d;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.tuna.button.ActionParams;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import android.net.Uri;
import xkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.live.tuna.util.LiveTunaUtils$routeForLive$1;
import c15.b;
import cq3.a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public final class LiveTunaUtils	// class@000fdf
{
    public static final p a;
    public static final LiveTunaUtils b;

    static {
       LiveTunaUtils.b = new LiveTunaUtils();
       LiveTunaUtils.a = s.c(LiveTunaUtils$NEED_REPORT_PERFORMANCE$2.INSTANCE);
    }
    public void LiveTunaUtils(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, LiveTunaUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LiveTunaUtils.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(TunaButtonModel p0,Context p1,d p2,KsgLogTunaLiveTag p3){
       JumpUrlModel mKrnUrl;
       String jumpUrl;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LiveTunaUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p1, "context");
       a.p(p3, "logTag");
       obj = "";
       if (p0 != null) {
          TunaButtonModel mActionParam = p0.mActionParams;
          if (mActionParam != null) {
             ActionParams mJumpUrlMode = mActionParam.mJumpUrlModel;
             if (mJumpUrlMode != null) {
                mKrnUrl = mJumpUrlMode.mKrnUrl;
                if (mKrnUrl != null) {
                label_0034 :
                   if (p0 != null) {
                      jumpUrl = p0.getJumpUrl();
                      if (jumpUrl != null) {
                         obj = jumpUrl;
                      }
                   }
                   a.o(obj, "tunaButtonModel?.jumpUrl ?: \"\"");
                   boolean b = false;
                   if (LiveTunaUtils.c(mKrnUrl, p1, p2, p3) || LiveTunaUtils.c(obj, p1, p2, p3)) {
                      b = true;
                   }
                   return b;
                }
             }
          }
       }
       mKrnUrl = obj;
       goto label_0034 ;
    }
    public static final boolean c(String p0,Context p1,d p2,KsgLogTunaLiveTag p3){
       boolean b1;
       Object obj = p1;
       d uod = p2;
       Object obj1 = p3;
       String obj2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LiveTunaUtils.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       obj2 = "scheme";
       a.p(p0, obj2);
       a.p(obj, "context");
       a.p(obj1, "logTag");
       Object obj3 = PatchProxy.applyOneRefs(p0, null, LiveTunaUtils.class, "5");
       boolean b = false;
       if (obj3 != PatchProxyResult.class) {
          b1 = obj3.booleanValue();
       }else {
          a.p(p0, obj2);
          Uri uri = b.g(p0);
          b1 = (uri != null)? TextUtils.n(uri.getScheme(), "kwailive"): false;
       }
       if (b1) {
          if (!PatchProxy.applyVoidFourRefs(p2, p0, p1, p3, null, LiveTunaUtils.class, "4")) {
             if (uod) {
                b = uod.r4(p0, obj);
             }
             if (!b) {
                obj1.appendTag("LiveTunaUtils");
                b.d(obj1, new LiveTunaUtils$routeForLive$1(uod, p0));
                if (!PatchProxy.applyVoid(null, null, LiveTunaUtils.class, "6")) {
                   k1.o(a.b);
                }
             }
          }
       label_0092 :
          return true;
       }else {
          return b;
       }
    }
    public static final CDNUrl[] d(UserInfos$PicUrl[] p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.applyOneRefs(p0, objArray, LiveTunaUtils.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = 1;
       if (p0 != null) {
          i = (!p0.length)? 1: 0;
          if (!i) {
             obj = null;
          }
       }
       if (!obj) {
          obj = new ArrayList();
          i = p0.length;
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             object oobject = p0[i1];
             CDNUrl uCDNUrl = PatchProxy.applyOneRefs(oobject, objArray, LiveTunaUtils.class, "8");
             if (uCDNUrl != patchProxyRe) {
             }else {
                a.p(oobject, "pic");
                uCDNUrl = new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern);
             }
             obj.add(uCDNUrl);
          }
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          Object[] objArray1 = obj.toArray(uCDNUrlArray);
          Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
          objArray = objArray1;
       }
       return objArray;
    }
}
