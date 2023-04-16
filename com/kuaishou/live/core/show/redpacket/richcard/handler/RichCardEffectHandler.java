package com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler;
import android.app.Activity;
import uw1.m;
import o63.a;
import z1.k;
import java.lang.String;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import zs6.a;
import com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import bi2.e;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import java.lang.Long;
import com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo;
import java.util.HashMap;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import com.kwai.kds.krn.api.resource.ResourceDir;
import com.yxcorp.gifshow.util.v;
import qkd.b;
import js6.b;
import java.lang.StackTraceElement;
import java.lang.Exception;
import q87.c;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uw1.f;
import yh2.d;
import com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler$showEffect$1;
import msd.l;
import o63.d;

public final class RichCardEffectHandler	// class@000f7d
{
    public final String a;
    public boolean b;
    public a c;
    public a$a d;
    public final Activity e;
    public final m f;
    public final a g;
    public k h;
    public final String i;
    public final String j;
    public final a k;
    public final a l;

    public void RichCardEffectHandler(Activity p0,m p1,a p2,k p3,String p4,String p5,a p6,a p7){
       a.p(p1, "redPacketService");
       a.p(p2, "liveJsBridgeService");
       a.p(p3, "holder");
       a.p(p4, "visitorId");
       a.p(p5, "liveStreamId");
       a.p(p6, "tryShowRedPacket");
       a.p(p7, "cancelActivityRedPacketAutoShowTask");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
       this.k = p6;
       this.l = p7;
       this.a = "RichCardEffectHandler"+"[liveStreamId = "+p5+']';
       this.c = new a();
       this.d = new RichCardEffectHandler$a(this);
    }
    public final a a(){
       return this.k;
    }
    public final boolean b(){
       return this.b;
    }
    public final void c(){
       long l;
       String bundleId;
       c uoc;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RichCardEffectHandler.class, "5")) {
          return;
       }
       boolean b = false;
       this.b = b;
       this.k.invoke();
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       g og = h.e().a();
       if (og != null) {
          RichCardInfo richCardInfo = og.b();
          if (richCardInfo != null) {
             Long freeCardShow = richCardInfo.getFreeCardShowEndTime();
             if (freeCardShow != null) {
                l = freeCardShow.longValue();
             label_0035 :
                g og1 = h.e().a();
                if (og1 != null) {
                   EffectInfo uEffectInfo = og1.c();
                   if (uEffectInfo != null) {
                      bundleId = uEffectInfo.getBundleId();
                      if (bundleId != null) {
                      label_0050 :
                         HashMap hashMap = new HashMap();
                         String str = "bundleId";
                         hashMap.put(str, bundleId);
                         bundleId = "url";
                         LiveRichCardStateManager obj = PatchProxy.applyOneRefs(hashMap, objArray, a.class, "8");
                         if (obj != PatchProxyResult.class) {
                            obj.booleanValue();
                         }else if(hashMap.containsKey(str)){
                            try{
                               File uFile = new File(ResourceDir.a()+"/resourceDownload/"+hashMap.get(str));
                               if (uFile.exists()) {
                                  if (hashMap.containsKey(bundleId)) {
                                     String str1 = hashMap.get(bundleId);
                                     File[] uFileArray = uFile.listFiles();
                                     int len = uFileArray.length;
                                     int i = 0;
                                     while (i < len) {
                                        object oobject = uFileArray[i];
                                        if ((oobject.getName()).startsWith(v.h(str1))) {
                                           b.q(oobject);
                                           break ;
                                        }
                                        i = i + 1;
                                     }
                                  }else {
                                     b.p(uFile);
                                  }
                               }
                            }catch(java.lang.Exception e1){
                               Object[] objArray1 = new Object[b];
                               b.c.t("KrnResourceDownload", e1.getStackTrace().toString(), objArray1);
                            }
                         }else {
                            Object[] objArray2 = new Object[b];
                            b.c.t("KrnResourceDownload", "传入bundleId", objArray2);
                         }
                      }
                   }
                }
                bundleId = "";
                goto label_0050 ;
             }
          }
       }
       l = 0;
       goto label_0035 ;
    }
    public final void d(String p0){
       String krnUrl;
       Long freeCardShow;
       Map map;
       if (PatchProxy.applyVoidOneRefs(p0, this, RichCardEffectHandler.class, "4")) {
          return;
       }
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       g og = h.e().a();
       String str = null;
       if (og != null) {
          EffectInfo uEffectInfo = og.c();
          if (uEffectInfo != null) {
             krnUrl = uEffectInfo.getKrnUrl();
          label_0026 :
             g og1 = h.e().a();
             if (og1 != null) {
                RichCardInfo richCardInfo = og1.b();
                if (richCardInfo != null) {
                   freeCardShow = richCardInfo.getFreeCardShowEndTime();
                label_003e :
                   this.f.D0();
                   b.P(h.f().appendTag(this.a), "[showEffect] begin start show effect");
                   if (TextUtils.x(krnUrl) || TextUtils.x(p0)) {
                      b.c0(h.f(), "[showEffect] url is null", "url", krnUrl);
                      d.a("特效 -- url = "+p0);
                      this.k.invoke();
                      return;
                   }else {
                      StringBuilder str1 = krnUrl+"&videoUrl="+p0+"&activityBiz=";
                      f uof = this.h.get();
                      if (uof != null) {
                         map = uof.i();
                         if (map != null) {
                            str = map.get("activity_biz");
                         }
                      }
                      map = str1+str;
                      if (freeCardShow == null) {
                         b.c0(h.f(), "[showEffect] cardId is null", "freeCardShowEndTime", freeCardShow);
                         d.a("特效 -- freeCardShowEndTime == null");
                         this.k.invoke();
                         return;
                      }else {
                         this.b = true;
                         this.l.invoke();
                         h.g(freeCardShow.longValue(), true);
                         d.a("展示特效krn");
                         b.S(h.f().appendTag(this.a), "[RichCardEffectHandler][showEffect] liveJsBridgeService.showKrnPage", "url", map);
                         this.g.af(map, new RichCardEffectHandler$showEffect$1(this));
                         return;
                      }
                   }
                }
             }
             freeCardShow = str;
             goto label_003e ;
          }
       }
       krnUrl = str;
       goto label_0026 ;
    }
}
