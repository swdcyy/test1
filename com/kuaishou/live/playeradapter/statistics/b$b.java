package com.kuaishou.live.playeradapter.statistics.b$b;
import com.kwai.video.waynelive.listeners.LivePlayerQosLogListener;
import com.kuaishou.live.playeradapter.statistics.b;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.activitycontext.ActivityContext;
import java.lang.Boolean;
import java.util.Objects;
import tj3.i;
import tj3.k;
import tj3.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import vc6.a;
import com.kuaishou.live.playeradapter.statistics.c$a;
import com.kuaishou.live.playeradapter.statistics.c;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.framework.player.config.PhotoPlayerConfig;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import tj3.d;
import com.kuaishou.android.model.feed.SearchParams;
import com.kuaishou.android.live.model.LiveFloatingWindowType;
import com.yxcorp.utility.TextUtils;
import tj3.j;
import java.lang.Long;
import org.json.JSONObject;
import tj3.n;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveStreamAdaptiveQosStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.u1;
import java.lang.CharSequence;
import org.json.JSONArray;
import ij3.b;
import ij3.a;
import okhttp3.MultipartBody$Part;
import ojd.e;
import brd.t;
import q21.b0;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import org.json.JSONException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import tj3.o;
import com.yxcorp.utility.SystemUtil;
import t45.d;
import brd.z;
import com.kuaishou.live.playeradapter.statistics.d;
import erd.o;
import tj3.m;
import com.yxcorp.gifshow.log.model.FeedLogCtx;

public class b$b implements LivePlayerQosLogListener	// class@000d5e
{
    public JSONObject a;
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void a(Map p0){
       boolean b;
       boolean b1;
       String str1;
       j oj1;
       j a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, str)) {
          return;
       }
       p0.put("enter_action", Integer.valueOf(this.b.l));
       p0.put("is_visible", Boolean.valueOf(ActivityContext.g().h()));
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, b.class, "31");
       j oj = 2;
       b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(tb.d.k == oj){
          b1 = 1;
       }else {
          b1 = 0;
       }
       p0.put("is_floating_play", Integer.valueOf(b1));
       p0.put("livePolicy", this.b.c.N());
       p0.put("is_follow_now", Boolean.valueOf(this.b.g.isFollowing()));
       a.a(a.a().a());
       p0.put("battery_info.battery_temperature", Integer.valueOf(a.b()));
       c$a uoa = c.a();
       DebugLog.i("LiveLogReporterImpl", "processMemoryInfojavaHeap"+uoa.toString());
       p0.put("totalMemory", String.valueOf(uoa.a));
       p0.put("javaHeapLimit", String.valueOf(uoa.b));
       p0.put("javaHeap", String.valueOf(uoa.c));
       p0.put("live_room_status_on_enter", Integer.valueOf(this.b.c.O()));
       b obj1 = PatchProxy.apply(null, null, PhotoPlayerConfig.class, str);
       int i = (obj1 != patchProxyRe)? obj1.intValue(): a.t().a("abtestExperiment", 1);
       p0.put("experiment_name", Integer.valueOf(i));
       d b2 = this.b.f.b;
       if (b2 != null) {
          p0.put("search_session_id", b2.mSearchSessionId);
       }
       b2 = this.b.f.C;
       if (b2 != null) {
          p0.put("floating_type", b2.mType);
       }
       b2 = this.b.f.a;
       if (b2 != 1) {
          if (b2 != oj) {
             if (b2 != 3) {
                str1 = (b2 != 4)? "STYLE_UNKNOWN": "FOURTH_TAB";
             }else {
                str1 = "LITE";
             }
          }else {
             str1 = "NORMAL";
          }
       }else {
          str1 = "SIMPLE";
       }
       p0.put("live_style", str1);
       p0.put("exp_tag", TextUtils.k(this.b.f.H));
       b$b tb1 = this.b;
       obj1 = tb1.m;
       if (obj1 == null) {
          oj1 = new j();
       }
       b n = tb1.n;
       if (n == null) {
          n = tb1.c.P(b);
       }
       oj = n.a;
       a = oj1.a;
       if (oj - a > 0) {
          p0.put("fullscreen_duration", Long.valueOf((oj - a)));
       }
       oj = n.c;
       a = oj1.c;
       if (oj - a > 0) {
          p0.put("portrait_duration", Long.valueOf((oj - a)));
       }
       oj = n.b;
       j b3 = oj1.b;
       if (oj - b3 > 0) {
          p0.put("landscape_duration", Long.valueOf((oj - b3)));
       }
       b$b tb2 = this.b;
       if (tb2.n != null) {
          tb2.m = null;
          tb2.n = null;
       }else {
          tb2.m = n;
       }
       return;
    }
    public void onLiveAdaptiveQosStat(JSONObject p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, str)) {
          return;
       }
       p0.put("stream_id", TextUtils.k(this.b.g.getLiveStreamId()));
       String str1 = p0.toString();
       d h = this.b.f.h;
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidTwoRefs(str1, Boolean.valueOf(h), null, n.class, str)) {
          ClientStat$LiveStreamAdaptiveQosStatEvent liveStreamAd = new ClientStat$LiveStreamAdaptiveQosStatEvent();
          liveStreamAd.liveAdaptiveQosInfo = str1;
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          statPackage.liveStreamAdaptiveQosStatEvent = liveStreamAd;
          u1.k0(statPackage, h);
       }
       return;
    }
    public void onLogEvent(String p0){
       boolean b;
       JSONObject jSONObject1;
       String str = "LiveLogReporterImpl";
       b$b uob = b$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             p0 = PatchProxy.applyOneRefs(jSONObject, this, uob, "4");
             if (p0 != PatchProxyResult.class) {
                b = p0.booleanValue();
             }else if(jSONObject.has("log_ver") && (jSONObject.has("ak") && (jSONObject.has("dev_model") && (jSONObject.has("platform") && (jSONObject.has("sdk_type") && (jSONObject.has("os_ver") && (jSONObject.has("dev_id") && (jSONObject.has("pkg") && jSONObject.has("sdk_ver"))))))))){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                this.a = jSONObject;
                return;
             }else if(this.a != null){
                try{
                   jSONObject1 = new JSONObject();
                   jSONObject1.put("header", this.a);
                   jSONObject1.put("body", new JSONArray().put(jSONObject));
                }catch(org.json.JSONException e1){
                   DebugLog.e(str, "onLogEventError"+e1);
                }
                DebugLog.i(str, jSONObject1.toString());
                a.a().c(e.b("file", (jSONObject1.toString()).getBytes(), null)).subscribe(b0.b, e.b);
             }
          }catch(org.json.JSONException e5){
             e5.printStackTrace();
          }
       }
    }
    public void onQosStat(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       try{
          HashMap hashMap = new HashMap();
          this.a(hashMap);
          Iterator iterator = this.b.s.iterator();
          while (iterator.hasNext()) {
             o oo = iterator.next();
             if (oo != null) {
                oo.a(hashMap);
             }
          }
          iterator = hashMap.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             p0.put(str, hashMap.get(str));
          }
       }catch(org.json.JSONException e0){
          DebugLog.e("addExtraQosInfoError", e0.toString());
       }
       b f = this.b.f;
       d h = f.h;
       d g = f.G;
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(h), g, null, n.class, "3")) {
          if (SystemUtil.O()) {
             t.just(p0).observeOn(d.c).map(d.b).observeOn(d.a).subscribe(new m(h, g), e.b);
          }else {
             n.a(p0.toString(), h, g);
          }
       }
       return;
    }
}
