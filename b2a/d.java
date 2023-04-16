package b2a.d;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.kwai.library.network.detector.NetworkCheckErrorCode;
import java.lang.Integer;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yb6.d;
import java.util.ArrayList;
import dy6.c;
import dy6.b;
import com.kuaishou.aegon.netcheck.NetcheckTaskController$TaskType;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import tl8.d;
import com.yxcorp.gifshow.model.CDNUrl;
import zp.c0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import u07.t$a;
import android.app.Activity;
import com.yxcorp.gifshow.detail.network.feedback.h;
import w07.l;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class d	// class@000357
{
    public static final ImmutableMap a;

    static {
       d.a = ImmutableMap.builder().c(Integer.valueOf(NetworkCheckErrorCode.RESULT_WEAK_SIGNAL.mInternalValue), a1.p(0x7f105055)).c(Integer.valueOf(NetworkCheckErrorCode.RESULT_BAD_WIFI_GATEWAY.mInternalValue), a1.p(0x7f10504e)).c(Integer.valueOf(NetworkCheckErrorCode.RESULT_SLOW_INTERNET.mInternalValue), a1.p(0x7f105045)).c(Integer.valueOf(NetworkCheckErrorCode.RESULT_NOT_CONNECTED.mInternalValue), a1.p(0x7f105047)).c(Integer.valueOf(NetworkCheckErrorCode.RESULT_BAD_CELLULAR_GATEWAY.mInternalValue), a1.p(0x7f105054)).a();
    }
    public void d(){
       super();
    }
    public static NetworkDetectConfig a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       NetworkDetectConfig obj = PatchProxy.apply(objArray, objArray, uod, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new NetworkDetectConfig();
       obj.id = "local_default";
       obj.mCreateTimestamp = d.a();
       obj.mExpiredTimestamp = d.a() + 0x5265c00;
       ArrayList uArrayList = new ArrayList();
       c uoc = new c();
       uArrayList.add(uoc);
       ArrayList uArrayList1 = new ArrayList();
       uoc.mNetworkDetectTasks = uArrayList1;
       b uob = PatchProxy.apply(objArray, objArray, uod, "8");
       if (uob != patchProxyRe) {
       }else {
          uob = new b();
          uob.mType = NetcheckTaskController$TaskType.LOCAL_NETWORK_CHECK.getType();
          uob.mId = "default_local_network_check";
          uob.mConfig = "{}";
          a.a("default detect local check network config:"+uob.mConfig);
       }
       uArrayList1.add(uob);
       obj.mNetworkDetectTaskGroups = uArrayList;
       return obj;
    }
    public static void b(QPhoto p0,String p1,List p2,String p3){
       b uob;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "7")) {
          return;
       }
       VideoMeta videoMeta = (p0.getEntity() instanceof VideoFeed)? p0.getEntity().a(VideoMeta.class): null;
       if (videoMeta != null) {
          CDNUrl[] uCDNUrlArray = c0.f(videoMeta);
          if (uCDNUrlArray != null && uCDNUrlArray.length > 0) {
             for (int i = 0; i < uCDNUrlArray.length; i = i + 1) {
                String url = uCDNUrlArray[i].getUrl();
                if (PatchProxy.isSupport(d.class)) {
                   uob = PatchProxy.applyFourRefs(url, Integer.valueOf(i), p1, p3, null, d.class, "9");
                   if (uob != PatchProxyResult.class) {
                   label_00b0 :
                      p2.add(uob);
                   }
                }
                uob = new b();
                String str = (TextUtils.x(p3))? "{}": p3;
                uob.mConfig = str;
                uob.mType = NetcheckTaskController$TaskType.SERVER_CHECK.getType();
                uob.mId = "default_server_check_"+p1+"_"+i;
                uob.mTarget = url;
                a.a("default detect server check config:"+uob.mConfig+" url:"+uob.mTarget);
                goto label_00b0 ;
             }
          }
       }
       return;
    }
    public static void c(GifshowActivity p0,String p1,BaseFeed p2,boolean p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, d.class, "4")) {
          return;
       }
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p2, Boolean.valueOf(p3), null, uoa, "6")) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("result_type", Integer.valueOf(p3));
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "JUDGE_RESULT_POPUP";
          uElementPack.action2 = "JUDGE_RESULT_POPUP";
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (p2 != null) {
             uContentPack.photoPackage = w1.f(p2);
          }
          u1.u0(4, uElementPack, uContentPack);
       }
       t$a uoa1 = new t$a(p0);
       uoa1.W0(R.string.arg_RES_7f105043);
       uoa1.z0(p1);
       uoa1.a0(h.a);
       uoa1.S0(R.string.arg_RES_7f105049);
       f.e(uoa1).Y(PopupInterface.a);
       return;
    }
}
