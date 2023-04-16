package f4a.v;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import vid.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.plc.model.PlcPreDecideWhiteInfo;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Integer;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import com.yxcorp.gifshow.detail.plc.helper.k;
import msd.a;
import java.lang.Throwable;
import c15.b;
import java.lang.Boolean;
import java.util.Set;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class v	// class@0022ba
{
    public Map a;
    public Set b;
    public PlcPreDecideWhiteInfo c;
    public final Object d;
    public static v e;
    public static SharedPreferences f;

    static {
       v.f = b.c(a.b(), "TUNA_PLC", 4);
    }
    public void v(){
       super();
       this.d = new Object();
       this.a = new ConcurrentHashMap();
       this.b = new HashSet();
    }
    public static v b(){
       v ov = v.class;
       Object obj = PatchProxy.apply(null, null, ov, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (v.e == null) {
          _monitor_enter(ov);
          if (v.e == null) {
             v.e = new v();
          }
          _monitor_exit(ov);
       }
       return v.e;
    }
    public PlcPreDecideWhiteInfo a(){
       v obj = PatchProxy.apply(null, this, v.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k1.g()) {
          this.d();
       }else {
          obj = this.d;
          _monitor_enter(obj);
          this.d();
          _monitor_exit(obj);
       }
       return this.c;
    }
    public PlcEntryStyleInfo c(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       PlcEntryStyleInfo obj = PatchProxy.applyOneRefs(p0, this, ov, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       PlcEntryStyleInfo plcEntryStyl = (p0 == null)? obj: p0.getPlcEntryStyleInfo();
       if (plcEntryStyl == null) {
          return obj;
       }else {
          long plcResponseT = p0.getPlcResponseTime();
          if (plcResponseT - null <= 0) {
             plcResponseT = plcEntryStyl.mCachedTime;
          }
          String photoId = p0.getPhotoId();
          PlcEntryStyleInfo mBizType = plcEntryStyl.mBizType;
          if (PatchProxy.isSupport(ov)) {
             Object obj1 = PatchProxy.applyTwoRefs(photoId, Integer.valueOf(mBizType), this, ov, "8");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
             label_0043 :
                PlcEntryStyleInfo plcEntryStyl1 = this.a.get(photoId);
                if (plcEntryStyl1 != null && plcEntryStyl1.mBizType == mBizType) {
                   obj = plcEntryStyl1;
                }
             }
          }else {
             goto label_0043 ;
          }
          if (obj != null && obj.mCachedTime - plcResponseT > 0) {
             return obj;
          }else {
             return plcEntryStyl;
          }
       }
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       if (this.c == null) {
          try{
             PlcPreDecideWhiteInfo plcPreDecide = a.a.h(v.f.getString("PLC_PRE_DECIDE_WHITE_INFO", ""), PlcPreDecideWhiteInfo.class);
             if (plcPreDecide != null) {
                this.c = plcPreDecide;
             }
          }catch(java.lang.Exception e0){
             b.e(KsLogTunaPlcTag.PLC.appendTag("PlcDataCacheHelper"), k.b, e0);
          }
       }
    }
    public boolean e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.contains(p0);
    }
    public void f(PlcEntryStyleInfo p0,PlcEntryStyleInfo p1){
       p1 = p1.mEventTrackData;
       if (p1 != null) {
          p0 = p0.mEventTrackData;
          if (p0 != null) {
             PlcEntryStyleInfo$EventTrackData mAdEventTrac = p1.mAdEventTrackData;
             if (mAdEventTrac != null) {
                PlcEntryStyleInfo$EventTrackData mAdEventTrac1 = p0.mAdEventTrackData;
                if (mAdEventTrac1 != null) {
                   mAdEventTrac.mTrafficSource = mAdEventTrac1.mTrafficSource;
                }
             }
          }
       }
       return;
    }
    public void g(String p0,PlcEntryStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "7")) {
          return;
       }
       Gson a = a.a;
       this.a.put(p0, a.h(a.q(p1), PlcEntryStyleInfo.class));
       return;
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "10")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "6")) {
          return;
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          g.a(v.f.edit().putString(p0, p1));
       }
       return;
    }
}
