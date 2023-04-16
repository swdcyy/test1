package com.yxcorp.gifshow.growth.kwaibubble.KwaiBubbleManager;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fg6.a;
import com.yxcorp.gifshow.growth.kwaibubble.model.KemKwaiBubbleDialogModel;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import rn.c;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.activity.kwaibubble.base.KwaiPopSwitchConfig;
import java.util.ArrayList;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import com.yxcorp.gifshow.growth.kwaibubble.KwaiBubbleManager$a;
import rn.e;
import zn.b;
import com.yxcorp.gifshow.growth.kwaibubble.model.KemTKDialogModel;
import qn.l;
import rn.b;
import qrd.l1;
import rn.a;
import rn.e$a;
import com.yxcorp.gifshow.growth.kwaibubble.KwaiBubbleManager$showKwaiBubbleDialog$2;
import msd.a;
import tb7.b;
import ao.e;

public final class KwaiBubbleManager	// class@00141e
{
    public static final KwaiBubbleManager a;

    static {
       KwaiBubbleManager.a = new KwaiBubbleManager();
    }
    public void KwaiBubbleManager(){
       super();
    }
    public final void a(JsonObject p0){
       KwaiBubbleManager$a obj1;
       boolean b;
       e$a a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBubbleManager.class, str)) {
          return;
       }
       a.p(p0, "jsonObject");
       Object[] obj = a.a.c(p0, KemKwaiBubbleDialogModel.class);
       a.o(obj, "Gsons.KWAI_GSON.fromJson¡­ogModel::class.java\n    \)");
       c c = c.c;
       int showType = obj.getShowType();
       Objects.requireNonNull(c);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(showType), c, uoc, "2");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(c.a.getSwitch()){
             ArrayList enableList = c.a.getEnableList();
             if (enableList != null && enableList.contains(Integer.valueOf(showType)) == true) {
                b = true;
             }
          }
          b = false;
       }else {
          goto label_0047 ;
       }
       if (!b) {
          obj = new Object[0];
          KwaiPopLog.e.D("showKwaiBubbleDialog switch false", obj);
          return;
       }else {
          obj1 = new KwaiBubbleManager$a(obj);
          showType = obj.getShowType();
          if (showType) {
             if (showType == 1) {
                b uob = new b(obj.getTkDialog().getBundleId(), obj.getTkDialog().getParams());
                uob.t(obj.getTkDialog().getViewKey());
                uob.p(true);
                uob.k(obj1);
                b.j(new KwaiBubbleManager$showKwaiBubbleDialog$2(e.a.a(uob)));
             }
          }else {
             a = e.a;
             e uoe = new e(obj.getLinkUrl(), p0);
             String activityId = obj.getActivityId();
             if (!PatchProxy.applyVoidOneRefs(activityId, uoe, e.class, str)) {
                a.p(activityId, "<set-?>");
                uoe.r = activityId;
             }
             uoe.k(obj1);
             uoe.m(true);
             uoe.s = obj.getUseWebShow();
             a uoa = a.a(uoe);
             if (uoa != null) {
                uoa.build();
             }
          }
          return;
       }
    }
}
