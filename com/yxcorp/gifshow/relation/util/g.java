package com.yxcorp.gifshow.relation.util.g;
import org.json.JSONObject;
import rq4.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import fg6.a;
import hcc.g0;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.utility.SystemUtil;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.util.Collection;
import ekd.q;
import rq4.n;

public final class g	// class@001a5a
{

    public static final r a(JSONObject p0){
       r or = null;
       Object obj = PatchProxy.applyOneRefs(p0, or, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "jsonObject");
       int i = p0.optInt("recoPortal");
       String str = p0.optString("prsid");
       RecoUser recoUser = g.d(p0.optJSONObject("object"));
       if (recoUser != null) {
          RecoUser mUser = recoUser.mUser;
          mUser.mPosition = recoUser.mItemIndex;
          or = PymkLogSender.createFollowClientLog(i, str, mUser, or);
       }
       return or;
    }
    public static final r b(JSONObject p0){
       r or = null;
       Object obj = PatchProxy.applyOneRefs(p0, or, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "jsonObject");
       int i = p0.optInt("recoPortal");
       String str = p0.optString("prsid");
       RecoUser recoUser = g.d(p0.optJSONObject("object"));
       if (recoUser != null) {
          RecoUser mUser = recoUser.mUser;
          mUser.mPosition = recoUser.mItemIndex;
          or = PymkLogSender.createClientLog(i, str, mUser, or);
          a.o(or, "PymkLogSender.createClie¡­Id, recoUser.mUser, null\)");
          or.d = 1;
       }
       return or;
    }
    public static final r c(JSONObject p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       r or = null;
       Object obj = PatchProxy.applyOneRefs(p0, or, og, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "jsonObject");
       int i = p0.optInt("recoPortal");
       String str = p0.optString("prsid");
       String str1 = p0.optString("object");
       Object obj1 = PatchProxy.applyOneRefs(str1, or, og, "5");
       if (obj1 != patchProxyRe) {
       }else if(str1 != null){
          try{
             obj1 = a.a.i(str1, new g0().getType());
          }catch(java.lang.Exception e6){
             if (!SystemUtil.K()) {
                Log.e("RealTimeLoggerUtil", "getUserObject", e6);
             }else {
                throw e6;
             }
          }
          obj1 = or;
       }else {
          goto label_0057 ;
       }
       if (!q.f(obj1)) {
          or = PymkLogSender.createClientLog(i, str, or, or);
          a.o(or, "PymkLogSender.createClie¡­ortal, prsId, null, null\)");
          or.d = 4;
          a.m(obj1);
          int i1 = obj1.size();
          n[] onArray = new n[i1];
          or.f = onArray;
          i = 0;
          a.o(onArray, "clientLog.showUserParams");
          while (i < i1) {
             RecoUser recoUser = obj1.get(i);
             if (recoUser != null) {
                RecoUser mUser = recoUser.mUser;
                mUser.mPosition = recoUser.mItemIndex;
                or.f[i] = PymkLogSender.createRecoUserParams(mUser);
             }
             i = i + 1;
          }
       }
       return or;
    }
    public static final RecoUser d(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return a.a.h(p0.toString(), RecoUser.class);
       }
    }
}
