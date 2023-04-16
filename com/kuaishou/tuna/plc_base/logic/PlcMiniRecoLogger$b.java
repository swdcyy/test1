package com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger$b;
import o58.a;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import u06.f;
import kotlin.jvm.internal.a;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import com.google.gson.JsonElement;
import java.lang.Boolean;
import ju5.g;

public final class PlcMiniRecoLogger$b implements a	// class@00106e
{
    public QPhoto a;
    public String b;
    public boolean c;

    public void PlcMiniRecoLogger$b(){
       super();
       this.b = "";
    }
    public void a(JSONObject p0,String p1){
       JsonObject jsonObject;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcMiniRecoLogger$b.class, "1")) {
          return;
       }
       StringBuilder str = "log plc mini reco, mini json size:";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.length()): str1;
       str = str+integer+", "+"\nmini json:";
       if (p0 != null) {
          str1 = p0.toString();
       }
       str1 = "PlcMiniRecoLogger";
       TunaPlcLogger.e(str1, str+str1+"\ncallback miniUrl:"+p1+"\nclick miniUrl:"+this.b);
       int b = true;
       this.b(b);
       if (p0 == null || (TextUtils.n(this.b, p1) && this.c == null)) {
          this.c = b;
          f uof = d.a(-1575111559);
          if (uof != null) {
             JSONObject jSONObject = p0.optJSONObject("params");
             long l = 0;
             long l1 = (jSONObject != null)? jSONObject.optLong("use_duration", l): l;
             if (l1 - l <= 0) {
                TunaPlcLogger.f(str1, "cancel log plc mini reco, duration <= 0!");
                return;
             }else {
                String str2 = p0.toString();
                a.o(str2, "jsonObject.toString\(\)");
                jsonObject = a.a.h(str2, JsonObject.class);
                PlcMiniRecoLogger$b ta = this.a;
                if (ta != null) {
                   PlcEntryStyleInfo plcEntryStyl = ta.getPlcEntryStyleInfo();
                   if (plcEntryStyl != null) {
                      plcEntryStyl = plcEntryStyl.mBizType;
                   label_00b1 :
                      PlcMiniRecoLogger$b ta1 = this.a;
                      a.m(ta1);
                      PlcRecoSignalInfo$a uoa = new PlcRecoSignalInfo$a().c(l1);
                      uoa.b(plcEntryStyl);
                      Object obj = PatchProxy.applyOneRefs(jsonObject, uoa, PlcRecoSignalInfo$a.class, "2");
                      if (obj != PatchProxyResult.class) {
                         uoa = obj;
                      }else {
                         uoa.a.mExtra.G("biz_extra", jsonObject);
                      }
                      uoa.d(2);
                      uof.ub(ta1, uoa.a());
                   }
                }
                b = 0;
                goto label_00b1 ;
             }
          }
       }
       return;
    }
    public final void b(boolean p0){
       PlcMiniRecoLogger$b uob = PlcMiniRecoLogger$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       g og = d.a(0x6ea0c3d0);
       if (og != null) {
          if (p0) {
             og.removeMiniAppStatListener(this.b, p0);
          }else {
             og.removeMiniAppStatListener(this, p0);
          }
          TunaPlcLogger.e("PlcMiniRecoLogger", "removeMiniListenerIfNeed");
       }
       return;
    }
}
