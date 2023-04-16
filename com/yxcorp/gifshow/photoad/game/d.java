package com.yxcorp.gifshow.photoad.game.d;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import z1.a;
import com.yxcorp.gifshow.photoad.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.detail.plc.helper.i;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import oxb.b;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import oxb.c;
import f4a.o;
import f4a.l;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import yka.c;
import com.yxcorp.gifshow.photoad.game.c;
import s59.u;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.photoad.game.GameCenterDownloadProcessor$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mxb.j0;
import mxb.i0;
import mxb.j;
import java.lang.Integer;
import yx.j0;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.photoad.game.e;

public class d	// class@000f92
{

    public void d(){
       super();
    }
    public static void a(Activity p0,AdDataWrapper p1,GameCenterDownloadParams p2,a p3,e[] p4){
       Object[] objArray;
       boolean b;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       boolean i = 1;
       i obj = null;
       if (PatchProxy.isSupport(d.class)) {
          objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, obj, d.class, "1")) {
             return;
          }
       }
       Object obj1 = obj;
       c obj2 = PatchProxy.applyFourRefs(p0, p1, p2, p4, null, d.class, "4");
       if (obj2 != PatchProxyResult.class) {
          obj = obj2;
       }else if(!PatchProxy.applyVoidTwoRefs(oobject1, oobject2, obj1, d.class, "5") && h.n().l(p1.getUrl()) == null){
          d.b(p1, p2);
       }
       b uob = new b(oobject2);
       obj2 = PatchProxy.apply(obj1, obj1, d.class, "8");
       if (obj2 != PatchProxyResult.class) {
       }else {
          obj2 = new c();
       }
       i oi = new i(p0, obj2, uob, p1, null, "104");
       GameCenterPlugin gameCenterPl = d.a(-1986139969);
       gameCenterPl.clearDownloadListeners(oobject2.mDownloadUrl);
       GameCenterDownloadParams mDownloadUrl = oobject2.mDownloadUrl;
       GameCenterDownloadParams mDownloadId = oobject2.mDownloadId;
       c uoc = PatchProxy.applyOneRefs(oobject4, obj1, d.class, "9");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(oobject4);
       }
       gameCenterPl.registerGameCenterDownloadListener(mDownloadUrl, mDownloadId, uoc);
       gameCenterPl.registerGameCenterDownloadListener(oobject2.mDownloadUrl, oobject2.mDownloadId, new u(p1.getUrl(), oobject2));
       if (oobject instanceof FragmentActivity) {
          oobject.getLifecycle().addObserver(new GameCenterDownloadProcessor$1(oobject2));
       }
       obj = v17;
       GameCenterDownloadParams$DownloadInfo uDownloadInf = d.a(-1986139969).gameDownloadProgress(oobject2);
       obj2 = PatchProxy.applyTwoRefs(obj, uDownloadInf, obj1, d.class, "3");
       if (obj2 != PatchProxyResult.class) {
          b = obj2.booleanValue();
       }else {
          obj2 = PatchProxy.applyOneRefs(uDownloadInf, obj1, i.class, "14");
          b = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): TextUtils.n(i.n(uDownloadInf), "complete");
          if (b) {
             obj.j(obj1, obj1);
             b = true;
          }else {
             b = false;
          }
       }
       if (b) {
          i0.a().b(p1.getAdLogWrapper(), 37);
          if (oobject3 != null) {
             oobject3.accept(Integer.valueOf(6));
          }
          return;
       }else {
          obj2 = PatchProxy.applyThreeRefs(obj, uDownloadInf, p3, null, d.class, "2");
          if (obj2 != PatchProxyResult.class) {
             i = obj2.booleanValue();
          }else if(i.k(uDownloadInf)){
             obj.a();
          }else if(!obj.d(obj1)){
             if (oobject3 != null) {
                oobject3.accept(Integer.valueOf(12));
             }
             obj.i(obj1);
          }else {
             i = false;
          }
          i = true;
          if (i) {
             return;
          }else {
             objArray = new Object[0];
             j0.c("GameCenterProcessor", "can not process game center task", objArray);
             return;
          }
       }
    }
    public static void b(AdDataWrapper p0,GameCenterDownloadParams p1){
       d uod = d.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uod, "6")) {
          return;
       }
       GameCenterPlugin gameCenterPl = d.a(-1986139969);
       String str = "GAME_DOWNLOAD_LOGGER_REGISTER_ID"+p1.mDownloadUrl;
       if (!PatchProxy.applyVoidOneRefs(str, obj, uod, "7")) {
          GameCenterPlugin gameCenterPl1 = d.a(-1986139969);
          if (gameCenterPl1.isAvailable()) {
             gameCenterPl1.clearDownloadListeners(str);
          }
       }
       gameCenterPl.registerGameCenterDownloadListener(str, p1.mDownloadId, new e(p0));
       return;
    }
}
