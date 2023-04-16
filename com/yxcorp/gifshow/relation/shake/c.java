package com.yxcorp.gifshow.relation.shake.c;
import my6.e;
import java.lang.Object;
import com.kwai.library.push.model.InAppEvent;
import xbc.e;
import xbc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kwai.library.push.model.InAppEvent$Event;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.social.startup.relation.model.SocialShakeConfig;
import com.kwai.social.startup.relation.model.EntranceConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;

public final class c implements e	// class@0019d7
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(InAppEvent p0){
       e uoe = e.class;
       String str = "6";
       Activity obj = PatchProxy.applyOneRefs(p0, null, c.class, str);
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 == null || p0.b == null){
          obj = ActivityContext.g().e();
          p0 = p0.a;
          if (p0 == InAppEvent$Event.CLICK_BTN || p0 == InAppEvent$Event.CLICK_NOTICE) {
             SocialShakeConfig socialShakeC = c.a();
             String jumpUrl = (socialShakeC.getEntranceConfig() != null)? socialShakeC.getEntranceConfig().getJumpUrl(): null;
             c.b(jumpUrl, obj);
             if (obj instanceof GifshowActivity && !PatchProxy.applyVoidOneRefs(obj, null, uoe, "7")) {
                a.p(obj, "page");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                jumpUrl.elementPackage = uElementPack;
                uElementPack.action2 = "SHAKE_IT_POPUP";
                u1.L("3378082", obj, b, uElementPack, null);
             }
          }else if(p0 == InAppEvent$Event.ON_ENTER){
             c.c();
             if (obj instanceof GifshowActivity) {
                if (!PatchProxy.applyVoidOneRefs(obj, null, uoe, str)) {
                   a.p(obj, "page");
                   ClientEvent$ElementPackage uElementPack2 = new ClientEvent$ElementPackage();
                   p0.elementPackage = uElementPack2;
                   uElementPack2.action2 = "SHAKE_IT_POPUP";
                   u1.C0("3378081", obj, 4, uElementPack2, null);
                }
                if (!PatchProxy.applyVoidOneRefs(obj, null, uoe, "1")) {
                   a.p(obj, "page");
                   ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                   uElementPack1.action2 = "SHAKE_DEVICE_BUTTON";
                   u1.L("3378124", obj, b, uElementPack1, null);
                }
             }
          }
       }
       b = false;
       return b;
    }
}
