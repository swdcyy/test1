package com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import lp3.e;
import o63.c;
import java.util.Map;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import o63.a;
import lp3.c;
import android.net.Uri;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.krn.model.LaunchModel$b;
import wkd.b;
import r63.c;
import java.util.List;
import java.util.Iterator;
import r63.c$a;
import xp5.g;
import com.kwai.framework.model.user.QCurrentUser;
import qrd.p;
import java.util.Set;
import java.util.Map$Entry;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Bundle;
import android.os.Parcelable;
import qrd.l1;
import androidx.fragment.app.Fragment;
import s63.d;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion$newInstance$1$2;
import msd.a;
import crd.a;
import ik0.g;
import o63.k;
import s63.a;
import f55.a;
import com.kwai.bridge.context.AbsBridgeContext;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion$a;
import ik0.a;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kuaishou.krn.delegate.c$b;
import com.kuaishou.krn.delegate.c;
import js6.a;

public final class LiveKrnFragment$Companion	// class@001d56
{

    public void LiveKrnFragment$Companion(){
       super();
    }
    public void LiveKrnFragment$Companion(u p0){
       super();
    }
    public static LiveKrnFragment c(LiveKrnFragment$Companion p0,LiveKrnPageKey p1,e p2,c p3,Map p4,boolean p5,int p6,Object p7){
       LiveKrnFragment liveKrnFragm;
       if (p6 & 0x08) {
          p4 = null;
       }
       int i = 0;
       if (p6 & 0x10) {
          p5 = false;
       }
       Objects.requireNonNull(p0);
       LiveKrnFragment$Companion uCompanion = LiveKrnFragment$Companion.class;
       if (PatchProxy.isSupport(uCompanion)) {
          Object[] objArray = new Object[]{p1,p2,p3,p4,Boolean.valueOf(p5)};
          liveKrnFragm = PatchProxy.apply(objArray, p0, uCompanion, "3");
          if (liveKrnFragm != PatchProxyResult.class) {
          label_0082 :
             return liveKrnFragm;
          }
       }
       a.p(p1, "pageKey");
       a.p(p2, "serviceManager");
       a.p(p3, "container");
       c uoc = p2.a(a.class);
       a.o(uoc, "serviceManager.getServic¡­ridgeService::class.java\)");
       LiveKrnDialogData liveKrnDialo = new LiveKrnDialogData(Uri.parse(uoc.Nc(p1, p4)), null, 2, null);
       if (!liveKrnDialo.t()) {
          b.B(LiveLogTag.LIVE_KRN_DIALOG, "bundleId/componentName Îª¿Õ£º"+liveKrnDialo);
       }
       liveKrnFragm = p0.b(liveKrnDialo, p2, p3, p5);
       goto label_0082 ;
    }
    public final LaunchModel$b a(LiveKrnDialogData p0,e p1,boolean p2){
       c obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveKrnFragment$Companion.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveKrnFragment$Companion.class, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "data");
       a.p(p1, "serviceManager");
       obj = b.a(0x6e3ea8b);
       String str = p0.e();
       Map map = p0.j();
       Objects.requireNonNull(obj);
       c uoc = c.class;
       if (!PatchProxy.applyVoidTwoRefs(str, map, obj, uoc, "3")) {
          List list = PatchProxy.applyOneRefs(str, obj, uoc, "4");
          if (list == patchProxyRe) {
             list = obj.a.get(str);
          }
          if (list != null) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().a(str, map);
             }
          }
       }
       obj = p1.a(a.class);
       a.o(obj, "serviceManager.getServic¡­ridgeService::class.java\)");
       c uoc1 = p1.a(g.class);
       a.o(uoc1, "serviceManager.getServic¡­eInfoManager::class.java\)");
       str = obj.I4();
       LaunchModel$b uob = new LaunchModel$b();
       uob.e("liveId", obj.getLiveId());
       uob.e("pageId", str);
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       uob.e("uId", mE.getId());
       uob.e("anchorId", uoc1.d());
       uob.e("liveStreamId", uoc1.getLiveStreamId());
       b = false;
       uob.f("enableBackBtnHandler", b);
       uob.b("enableKeyboardListening", b);
       uob.e("containerSource", "LiveKrnFragment");
       String str1 = "1";
       if (p2) {
          uob.e("themeStyle", str1);
       }
       Object[] objArray = null;
       Boolean uBoolean = PatchProxy.apply(objArray, p0, LiveKrnDialogData.class, "13");
       if (uBoolean == patchProxyRe) {
          uBoolean = p0.n.getValue();
       }
       uob.f("showErrorBackIconInHalf", uBoolean.booleanValue());
       Iterator iterator = p0.j().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uob.e(key, uEntry.getValue());
       }
       String str2 = PatchProxy.apply(objArray, p0, LiveKrnDialogData.class, "7");
       if (str2 == patchProxyRe) {
          str2 = p0.h.getValue();
       }
       if (str2 != null) {
          if (PatchProxy.applyOneRefs(str2, uob, LaunchModel$b.class, str1) != patchProxyRe) {
          }else {
             JsFramework[] jsFrameworkA = JsFramework.values();
             int len = jsFrameworkA.length;
             while (b < len) {
                object oobject = jsFrameworkA[b];
                if ((oobject.name()).equalsIgnoreCase(str2)) {
                   uob.f = oobject;
                }
                b = b + 1;
             }
          }
       }
       uob.i(p0.e());
       uob.j(p0.f());
       return uob;
    }
    public final LiveKrnFragment b(LiveKrnDialogData p0,e p1,c p2,boolean p3){
       if (PatchProxy.isSupport(LiveKrnFragment$Companion.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, LiveKrnFragment$Companion.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "data");
       a.p(p1, "serviceManager");
       a.p(p2, "container");
       LaunchModel launchModel = this.a(p0, p1, p3).h();
       a.o(launchModel, "launchModel");
       return this.d(p1, p2, launchModel);
    }
    public final LiveKrnFragment d(e p0,c p1,LaunchModel p2){
       c obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveKrnFragment$Companion.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "serviceManager");
       a.p(p1, "container");
       a.p(p2, "launchModel");
       obj = p0.a(a.class);
       a.o(obj, "serviceManager.getServic¡­ridgeService::class.java\)");
       LiveKrnFragment liveKrnFragm = new LiveKrnFragment();
       liveKrnFragm.G = p0;
       liveKrnFragm.F = p1;
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("rn_launch_model", p2);
       liveKrnFragm.setArguments(uBundle);
       d uod = new d(obj, new LiveKrnFragment$Companion$newInstance$1$2(liveKrnFragm), liveKrnFragm.D, liveKrnFragm);
       Iterator iterator = obj.fc();
       while (iterator.hasNext()) {
          k ok = iterator.next();
          String nameSpace = ok.getNameSpace();
          String commandName = ok.getCommandName();
          String nameSpace1 = ok.getNameSpace();
          uod.m(nameSpace, commandName, new a(nameSpace1, ok.getCommandName()));
       }
       liveKrnFragm.C = uod;
       liveKrnFragm.setCloseHandler(new LiveKrnFragment$Companion$a(p0, p1, p2, obj));
       c uoc = c.a().b("KDS_BRIDGE_CONTEXT", liveKrnFragm.C).a();
       a.o(uoc, "KrnDelegateConfig.builde¡­ext\)\n            .build\(\)");
       liveKrnFragm.setKrnDelegateConfig(uoc);
       return liveKrnFragm;
    }
    public final void e(LiveKrnFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnFragment$Companion.class, "7")) {
          return;
       }
       a.p(p0, "$this$sendOutsideClickEvent");
       a.b.X8(p0, "onFloatingMaskClick", "");
       return;
    }
}
