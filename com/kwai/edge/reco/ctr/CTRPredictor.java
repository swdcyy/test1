package com.kwai.edge.reco.ctr.CTRPredictor;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import com.kwai.edge.reco.ctr.CTRPredictor$config$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import qj5.e;
import com.kwai.edge.reco.ctr.CTRPredictor$handler$2;
import com.kwai.edge.reco.ctr.CTRPredictor$inferRunnable$2;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.k2;
import k2b.u1;
import kotlin.jvm.internal.a;
import com.kwai.edge.reco.ctr.CTRPredictor$handler$2$a;
import m56.f;
import android.os.Handler;
import m56.g;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.util.Collection;
import com.yxcorp.utility.Log;
import kotlin.collections.ArraysKt___ArraysKt;
import qj5.b;
import com.kwai.edge.reco.ctr.model.CTRTriggerCustomValue;
import android.os.Message;
import java.lang.StringBuilder;
import msd.l;

public final class CTRPredictor	// class@000d41
{
    public static String a;
    public static Map b;
    public static Map c;
    public static Map d;
    public static String e;
    public static long f;
    public static boolean g;
    public static final ConcurrentHashMap h;
    public static final ConcurrentHashMap i;
    public static final ConcurrentHashMap j;
    public static final ConcurrentHashMap k;
    public static final ConcurrentHashMap l;
    public static boolean m;
    public static boolean n;
    public static final SharedPreferences o;
    public static String p;
    public static boolean q;
    public static final p r;
    public static CopyOnWriteArrayList s;
    public static final p t;
    public static final p u;
    public static final CTRPredictor v;

    static {
       CTRPredictor uCTRPredicto = new CTRPredictor();
       CTRPredictor.v = uCTRPredicto;
       CTRPredictor.b = new LinkedHashMap();
       CTRPredictor.c = new LinkedHashMap();
       CTRPredictor.d = new LinkedHashMap();
       CTRPredictor.e = "";
       CTRPredictor.g = true;
       CTRPredictor.h = new ConcurrentHashMap();
       CTRPredictor.i = new ConcurrentHashMap();
       CTRPredictor.j = new ConcurrentHashMap();
       CTRPredictor.k = new ConcurrentHashMap();
       CTRPredictor.l = new ConcurrentHashMap();
       CTRPredictor.o = b.c("CTRPredictorLaunch", 0);
       CTRPredictor.r = s.c(CTRPredictor$config$2.INSTANCE);
       CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
       Iterator iterator = uCTRPredicto.l().d().c().iterator();
       while (iterator.hasNext()) {
          uCopyOnWrite.add(iterator.next().a());
       }
       CTRPredictor.s = uCopyOnWrite;
       CTRPredictor.t = s.c(CTRPredictor$handler$2.INSTANCE);
       CTRPredictor.u = s.c(CTRPredictor$inferRunnable$2.INSTANCE);
    }
    public void CTRPredictor(){
       super();
    }
    public static final CopyOnWriteArrayList a(CTRPredictor p0){
       return CTRPredictor.s;
    }
    public static final String b(CTRPredictor p0){
       return CTRPredictor.a;
    }
    public static final ConcurrentHashMap c(CTRPredictor p0){
       return CTRPredictor.i;
    }
    public static final String d(CTRPredictor p0){
       return CTRPredictor.p;
    }
    public static final Map e(CTRPredictor p0){
       return CTRPredictor.c;
    }
    public static final Map f(CTRPredictor p0){
       return CTRPredictor.b;
    }
    public static final SharedPreferences g(CTRPredictor p0){
       return CTRPredictor.o;
    }
    public static final ConcurrentHashMap h(CTRPredictor p0){
       return CTRPredictor.h;
    }
    public static final Map i(CTRPredictor p0){
       return CTRPredictor.d;
    }
    public static final void j(CTRPredictor p0,String p1){
       CTRPredictor.a = p1;
    }
    public static final void k(CTRPredictor p0,boolean p1){
       CTRPredictor.m = p1;
    }
    public final CtrPredictionRuntimeConfig l(){
       Object obj = PatchProxy.apply(null, this, CTRPredictor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CTRPredictor.r.getValue();
    }
    public final String m(){
       k2 obj = PatchProxy.apply(null, this, CTRPredictor.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.j();
       if (obj != null) {
          obj = obj.d;
          if (obj != null) {
          label_001d :
             a.o(obj, "Logger.getCurrentPage\(\)?.mPage2 ?: \"UNKNOWN2\"");
             return obj;
          }
       }
       String str = "UNKNOWN2";
       goto label_001d ;
    }
    public final long n(){
       return CTRPredictor.f;
    }
    public final CTRPredictor$handler$2$a o(){
       Object obj = PatchProxy.apply(null, this, CTRPredictor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CTRPredictor.t.getValue();
    }
    public final void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CTRPredictor.class, "26")) {
          return;
       }
       a.p(p0, "e");
       this.o().removeMessages(2022);
       CTRPredictor.a = null;
       CTRPredictor.g = false;
       CTRPredictor.m = true;
       return;
    }
    public final void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CTRPredictor.class, "27")) {
          return;
       }
       a.p(p0, "e");
       CTRPredictor.g = true;
       return;
    }
    public final boolean p(){
       return CTRPredictor.n;
    }
    public final boolean q(String p0,String p1){
       boolean b;
       k2 obj = PatchProxy.applyTwoRefs(p0, p1, this, CTRPredictor.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!a.g(CTRPredictor.e, p1)) {
          if (TextUtils.x(CTRPredictor.e)) {
             obj = u1.j();
             obj = (obj != null)? obj.d: null;
             if (a.g(obj, p1)) {
             label_0033 :
                if (a.g(p0, p1)) {
                   b = true;
                label_003c :
                   return b;
                }
             }
          }
       }else {
          goto label_0033 ;
       }
       b = false;
       goto label_003c ;
    }
    public final void r(int p0){
       CTRPredictor uCTRPredicto = CTRPredictor.class;
       if (PatchProxy.isSupport(uCTRPredicto) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCTRPredicto, "15")) {
          return;
       }
       CopyOnWriteArrayList s = CTRPredictor.s;
       boolean b = (s == null || s.isEmpty())? true: false;
       if (b) {
          Log.g("CTRPredictor", "candidatePages is null or empty");
          return;
       }else if(!CTRPredictor.g){
          Log.g("CTRPredictor", "isForeGround is false");
          return;
       }else if(!this.l().d().b().contains(CTRPredictor.e)){
          Log.g("CTRPredictor", "allPageWhiteList do not contain currentPageName");
          return;
       }else if(this.l().d().d() && !ArraysKt___ArraysKt.N7(new int[3]{1,6,9}, p0)){
          return;
       }else {
          this.o().sendMessage(Message.obtain(this.o(), 2022, new b("PageCtrPredictionInfer", new CTRTriggerCustomValue(p0, CTRPredictor.s))));
          Log.g("CTRPredictor", "postInfer with lastEvent:"+p0);
          return;
       }
    }
    public final void s(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CTRPredictor.class, "13")) {
          return;
       }
       a.p(p0, "scheme");
       a.p(p1, "provider");
       CTRPredictor.h.put(p0, p1);
       return;
    }
    public final void t(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CTRPredictor.class, "16")) {
          return;
       }
       a.p(p0, "page");
       a.p(p1, "resultHandler");
       CTRPredictor.j.put(p0, p1);
       return;
    }
    public final void u(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CTRPredictor.class, "23")) {
          return;
       }
       if (CTRPredictor.s.contains(p0)) {
          CTRPredictor.s.remove(p0);
          Log.g("CTRPredictor", "targetPage -- "+p0+" has been loaded");
       }
       return;
    }
}
