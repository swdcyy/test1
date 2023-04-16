package ohc.a;
import mhc.n1;
import ohc.a$a;
import nsd.u;
import uo7.k;
import rq4.d;
import ohc.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import com.kwai.framework.model.feed.BaseFeed;
import zic.m0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Throwable;
import java.util.Map;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Integer;
import com.kuaishou.android.model.mix.SummaryViewModel;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.yxcorp.utility.TextUtils;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import java.lang.CharSequence;
import fg6.a;
import ohc.a$b;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.HashMap;
import java.lang.RuntimeException;
import ohc.b;
import uo7.h0;
import mhc.d2;
import android.util.Log;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import mhc.j2;
import k2b.u1;
import zic.f;
import zic.x0;

public class a extends n1	// class@003952
{
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(){
       super();
    }
    public void f(k p0,d p1){
       this.r(p0, p1);
    }
    public void j(k p0,d p1,boolean p2){
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "2")) {
          a.p(p0, "conf");
          a.p(p1, "dsUserShareClientLog");
          Activity uActivity = p0.k();
          Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          m0.g(p1, p2, uActivity, p0.K().mEntity);
       }
       return;
    }
    public void l(k p0,ShareInitResponse$SharePanelElement p1){
       this.t(p0, p1);
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       this.u(p0, p1, p2);
    }
    public void o(k p0,ShareInitResponse$SharePanelElement p1){
       this.v(p0, p1);
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       this.w(p0, p1);
    }
    public void q(Map p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       String str = "extra";
       a.p(p0, str);
       String str1 = "photo";
       a.p(p1, str1);
       a$a b = a.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, b, a$a.class, "1")) {
          a.p(p0, str);
          a.p(p1, str1);
          PhotoMeta photoMeta = p1.getPhotoMeta();
          if (photoMeta != null) {
             p0.put("share_with_sdk", Integer.valueOf(1));
             p0.put("reco_photo_type", Integer.valueOf(photoMeta.mRecoType));
             photoMeta = photoMeta.mFeedBottomRightSummary;
             if (photoMeta != null) {
                p0.put("remark_id", Integer.valueOf(photoMeta.mType));
             }
          }
       }
       return;
    }
    public void r(k p0,d p1){
       ShareAnyResponse$ShareObject mShareUrl;
       String str;
       Map map;
       int a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "log");
       int i = 2;
       p1.d = i;
       ShareAnyResponse$ShareObject shareObject = null;
       if (p0.r() != null) {
          ShareAnyResponse shareAnyResp = p0.r();
          a.m(shareAnyResp);
          if (shareAnyResp.mShareAnyData != null) {
             shareAnyResp = p0.r();
             a.m(shareAnyResp);
             ShareAnyResponse$ShareAnyData mShareObject = shareAnyResp.mShareAnyData.mShareObject;
          label_0037 :
             p1.j = TextUtils.I(p0.K().getUserId());
             p1.k = TextUtils.I(p0.K().getPhotoId());
             int i1 = 0;
             if (!p0.K().isVideoType()) {
                i = (p0.K().isImageType())? 3: 0;
             }
          label_006c :
             p1.g = i;
             i = 1;
             if (mShareObject != null) {
                if (TextUtils.x(mShareObject.mShareUrl) ^ i) {
                   shareObject = mShareObject;
                }
                if (shareObject != null) {
                   mShareUrl = shareObject.mShareUrl;
                   if (mShareUrl != null) {
                   label_008e :
                      p1.q = mShareUrl;
                      str = TextUtils.I(p0.K().getExpTag());
                      try{
                         p1.p = str;
                         map = a.a.i(p1.v, new a$b().getType());
                         if (map == null) {
                            map = new HashMap();
                         }
                      }catch(com.google.gson.JsonSyntaxException e1){
                         e1.printStackTrace();
                         map = new HashMap();
                      }
                      a = (p0.P != null)? b.a: b.b;
                      map.put("is_long_press_share", Integer.valueOf(a));
                      if (p0.L() == -1) {
                         map.put("is_client_share_id", Integer.valueOf(i));
                      }
                      if (p0.L() < i) {
                         i1 = 1;
                      }
                      map.put("evoked_by_prefetch", Integer.valueOf(i1));
                      String searchSessio = p0.K().getSearchSessionId();
                      if (searchSessio != null) {
                         map.put("search_session_id", searchSessio);
                      }
                      this.q(map, p0.K());
                      p1.v = new Gson().q(map);
                      return;
                   }
                }
             }
          label_0082 :
             str = TextUtils.I(p0.K().getVideoUrl());
             goto label_008e ;
          }
       }
       mShareUrl = shareObject;
       goto label_0037 ;
    }
    public final void s(k p0,int p1,String p2,Throwable p3){
       ShareAnyResponse$ShareObject mShareUrl;
       String stackTraceSt;
       QPhoto mEntity;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a.class, "8")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p2, "actUrl");
       p2 = new h0(p2).c();
       String str = d2.b(p2);
       int i = d2.a(p2);
       ShareAnyResponse shareAnyResp = p0.r();
       if (shareAnyResp != null) {
          shareAnyResp = shareAnyResp.mShareAnyData;
          if (shareAnyResp != null) {
             ShareAnyResponse$ShareAnyData mShareMethod = shareAnyResp.mShareMethod;
          label_0044 :
             int i1 = d2.c(mShareMethod);
             shareAnyResp = p0.r();
             String str1 = "";
             if (shareAnyResp != null) {
                shareAnyResp = shareAnyResp.mShareAnyData;
                if (shareAnyResp != null) {
                   mShareMethod = shareAnyResp.mShareObject;
                   if (mShareMethod != null) {
                      mShareUrl = mShareMethod.mShareUrl;
                      if (mShareUrl != null) {
                      label_005e :
                         String str2 = "conf.photo.mEntity";
                         ShareAnyResponse$ShareObject shareObject = 23;
                         if (p0.p() && i != shareObject) {
                            if (p3 != null) {
                               stackTraceSt = Log.getStackTraceString(p3);
                               if (stackTraceSt != null) {
                               label_0074 :
                                  a.o(stackTraceSt, "throwable?.let { Log.get\x20\x02ckTraceString\(it\) } ?: \"\"\x00");
                                  mEntity = p0.K().mEntity;
                                  a.o(mEntity, str2);
                                  u1.f0(j2.b(mEntity, mShareUrl, "", 2, p1, i, i1, stackTraceSt));
                                  f.d(p0.K().mEntity, mShareUrl, str, p1, false, false, stackTraceSt);
                               }
                            }
                            stackTraceSt = str1;
                            goto label_0074 ;
                         }else if(i == shareObject && p1 == 2){
                            QPhoto mEntity1 = p0.K().mEntity;
                            a.o(mEntity1, str2);
                            u1.f0(j2.b(mEntity1, mShareUrl, "", 2, 2, i, i1, null));
                         }
                         return;
                      }
                   }
                }
             }
             mShareUrl = str1;
             goto label_005e ;
          }
       }
       shareAnyResp = null;
       goto label_0044 ;
    }
    public void t(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       p1 = p1.mActionUrl;
       a.o(p1, "panelElement.mActionUrl");
       this.s(p0, 3, p1, null);
       return;
    }
    public void u(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "6")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       a.p(p2, "throwable");
       p1 = p1.mActionUrl;
       a.o(p1, "panelElement.mActionUrl");
       this.s(p0, 4, p1, p2);
       return;
    }
    public void v(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       x0.b(p1);
       p1 = p1.mActionUrl;
       a.o(p1, "panelElement.mActionUrl");
       this.s(p0, 1, p1, null);
       return;
    }
    public void w(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       p1 = p1.mActionUrl;
       a.o(p1, "panelElement.mActionUrl");
       this.s(p0, 2, p1, null);
       return;
    }
}
