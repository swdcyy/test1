package com.kwai.framework.plugin.feature.KwaiFeatureUpdateManager;
import aj7.a;
import java.lang.Object;
import pkd.a;
import com.kwai.framework.plugin.feature.KwaiFeatureUpdateManager$mFeatureSource$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import qj7.h;
import com.kwai.plugin.dva.repository.store.a;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import qj7.d;
import java.lang.Boolean;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import java.util.Map;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;
import zi7.a;
import com.google.gson.Gson;

public final class KwaiFeatureUpdateManager implements a	// class@000c8d
{
    public final String a;
    public final Object b;
    public FeatureDetails c;
    public final p d;

    public void KwaiFeatureUpdateManager(){
       super();
       this.a = a.e;
       this.b = new Object();
       this.d = s.c(KwaiFeatureUpdateManager$mFeatureSource$2.INSTANCE);
    }
    public static Pair c(KwaiFeatureUpdateManager p0,FeatureDetails p1,FeatureDetails p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return p0.b(p1, p2, p3);
    }
    public FeatureDetails a(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, KwaiFeatureUpdateManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       if (h.b(a.b())) {
          obj = a.c().i(this.f());
          FeatureDetails uFeatureDeta = (obj == null || !obj.length())? 1: null;
          if (!uFeatureDeta) {
             uFeatureDeta = this.i(obj);
             a.c().o(this.f(), "");
             if (uFeatureDeta == null) {
                d.b("local buffer config parse error", new IllegalStateException());
             }else {
                d.c("read config from local buffer config json.");
                a.c().o(this.g(), obj);
                return uFeatureDeta;
             }
          }
       }
       obj = a.c().i(this.g());
       if (obj == null || !obj.length()) {
          str = 1;
       }
       if (!str) {
          FeatureDetails uFeatureDeta1 = this.i(obj);
          if (uFeatureDeta1 == null) {
             d.b("local config pares error", new IllegalStateException());
          }else {
             d.c("read config from local config json.");
             return uFeatureDeta1;
          }
       }
       return objArray;
    }
    public final Pair b(FeatureDetails p0,FeatureDetails p1,boolean p2){
       ArrayList obj;
       if (PatchProxy.isSupport(KwaiFeatureUpdateManager.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, KwaiFeatureUpdateManager.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       List splits = p0.getSplits();
       if (splits != null) {
          if (p1.getSplits() != null) {
             obj = new ArrayList();
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = splits.iterator();
             while (iterator.hasNext()) {
                FeatureInfo uFeatureInfo = iterator.next();
                FeatureInfo uFeatureInfo1 = p1.getNameToSplitMap().get(uFeatureInfo.getSplitName());
                if (uFeatureInfo1 != null) {
                   if (!p2) {
                      int i = a.g(uFeatureInfo1.getVersion(), uFeatureInfo.getVersion()) ^ 0x01;
                      if (i) {
                      label_0076 :
                         uArrayList.add(uFeatureInfo1);
                         if (!p2) {
                            obj.add(uFeatureInfo1);
                         }
                      }
                   }
                   if (p2 && a.g(uFeatureInfo1.getVersion(), uFeatureInfo.getVersion())) {
                      goto label_0076 ;
                   }
                }
             label_007f :
                obj.add(uFeatureInfo);
             }
             return new Pair(uArrayList, obj);
          }else {
             return new Pair(CollectionsKt__CollectionsKt.E(), splits);
          }
       }else {
          return new Pair(CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E());
       }
    }
    public final String d(List p0){
       String str;
       String obj = PatchProxy.applyOneRefs(p0, this, KwaiFeatureUpdateManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          str = "null";
       }else {
          Iterator iterator = p0.iterator();
          obj = "";
          while (iterator.hasNext()) {
             FeatureInfo uFeatureInfo = iterator.next();
             obj = obj+uFeatureInfo.getSplitName()+'-'+uFeatureInfo.getVersion()+',';
          }
          str = obj;
       }
       return str;
    }
    public final a e(){
       Object obj = PatchProxy.apply(null, this, KwaiFeatureUpdateManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final String f(){
       Object obj = PatchProxy.apply(null, this, KwaiFeatureUpdateManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "local_buffer_config_"+this.a;
    }
    public final String g(){
       Object obj = PatchProxy.apply(null, this, KwaiFeatureUpdateManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "local_config_"+this.a;
    }
    public final boolean h(FeatureDetails p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiFeatureUpdateManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       KwaiFeatureUpdateManager tc = this.c;
       boolean b = true;
       if (tc != null) {
          if (KwaiFeatureUpdateManager.c(this, tc, p0, false, 4, null).getFirst().isEmpty()) {
             d.c("mFeaturesToBeUpdated£º no need to update the plugin");
             b = false;
          }
          return b;
       }else {
          FeatureDetails uFeatureDeta = this.e().d();
          if (uFeatureDeta != null) {
             if (KwaiFeatureUpdateManager.c(this, uFeatureDeta, p0, false, 4, null).getFirst().isEmpty()) {
                d.c("mFeatureConfig£º no need to update the plugin");
                b = false;
             }
             return b;
          }else {
             d.c("both mFeaturesToBeUpdated and mFeatureConfig is null.");
             return false;
          }
       }
    }
    public final FeatureDetails i(String p0){
       FeatureDetails uFeatureDeta;
       a obj = PatchProxy.applyOneRefs(p0, this, KwaiFeatureUpdateManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.c();
          a.o(obj, "SPHelper.getInstance\(\)");
          uFeatureDeta = obj.b().h(p0, FeatureDetails.class);
       }catch(java.lang.Exception e3){
          d.b("parseSplitsContentForSplitDetailsGsonBean error", e3);
          uFeatureDeta = null;
       }
       return uFeatureDeta;
    }
}
