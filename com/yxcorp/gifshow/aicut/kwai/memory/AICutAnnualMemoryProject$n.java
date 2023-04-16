package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$n;
import erd.g;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import java.lang.Object;
import o69.g1;
import elb.s0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import com.kwai.feature.post.api.feature.memory.MemoryStageEvent;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import java.util.List;
import o69.c;
import nsd.u;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import h69.g;
import q87.c;
import kotlin.jvm.internal.a;
import com.kwai.kve.MediaAnalyzeResult;
import kotlin.collections.ArraysKt___ArraysKt;
import fg6.a;
import com.google.gson.Gson;
import java.util.ArrayList;
import elb.p0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.YcnnScenesObject;
import java.util.Collection;
import java.lang.Iterable;
import elb.r0;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.kve.MediaAsset;
import i79.e;
import java.lang.StringBuilder;

public final class AICutAnnualMemoryProject$n implements g	// class@00195e
{
    public final AICutAnnualMemoryProject b;

    public void AICutAnnualMemoryProject$n(AICutAnnualMemoryProject p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Iterator iterator1;
       String str1;
       e obj2;
       List key;
       Object[] objArray2;
       Object obj = this;
       EditorSmartClipResult obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, AICutAnnualMemoryProject$n.class, "1")) {
       }else {
          EditorSmartClipResult uEditorSmart = obj1.d();
          long videoAnalyze = (uEditorSmart != null)? uEditorSmart.getVideoAnalyzeCostTime(): -1;
          long l = videoAnalyze;
          MemorySceneType memorySceneT = obj.b.V0();
          if (memorySceneT == null) {
             memorySceneT = MemorySceneType.AICUT_LOADING;
          }
          MemoryStageEvent memoryStageE = new MemoryStageEvent(memorySceneT, "memorykit", l, null, 0, obj.b.M().size(), false, null, 216, null);
          MemoryLogger.c(videoAnalyze);
          obj1 = obj1.d();
          if (obj1 != null) {
             Map mediaAnalyze = obj1.getMediaAnalyzeResults();
             if (mediaAnalyze != null) {
                Iterator iterator = mediaAnalyze.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   Object[] objArray = new Object[0];
                   g.D().w("AICutAnnualMemoryProject", "observableAnalyze: save sceneResultStringList", objArray);
                   String[] value = uEntry.getValue();
                   a.o(value, "result.value");
                   value = value.getRawSceneStrings();
                   if (value != null) {
                      String str = ArraysKt___ArraysKt.Ib(value);
                      if (str != null) {
                         s0 os0 = a.a.h(str, s0.class);
                         ArrayList uArrayList = new ArrayList();
                         p0 op0 = os0.a();
                         if (op0 != null) {
                            uArrayList.add(op0);
                         }
                         objArray = null;
                         Object[] objArray1 = PatchProxy.apply(objArray, os0, s0.class, "2");
                         if (objArray1 != PatchProxyResult.class) {
                         }else {
                            os0 = os0.mScenesObjects;
                            List list = (os0 != null)? os0.a(): objArray;
                            str1 = (list == null || list.isEmpty())? 1: null;
                            if (str1) {
                               objArray1 = objArray;
                            }else {
                               ArrayList uArrayList1 = new ArrayList();
                               iterator1 = list.iterator();
                               while (iterator1.hasNext()) {
                                  p0 op01 = iterator1.next();
                                  key = op01.c();
                                  key = (key == null || key.isEmpty())? 1: null;
                                  if (key) {
                                     uArrayList1.add(op01);
                                  }else {
                                     Iterator iterator2 = op01.c().iterator();
                                     while (iterator2.hasNext()) {
                                        iterator2.next().f(op01.b());
                                     }
                                     uArrayList1.addAll(op01.c());
                                     continue ;
                                  }
                               }
                               objArray1 = r0.a(uArrayList1);
                            }
                         }
                         if (objArray1 != null) {
                            uArrayList.add(objArray1);
                         }
                         iterator1 = obj.b.M().iterator();
                         while (true) {
                            str1 = "result.key";
                            if (iterator1.hasNext()) {
                               obj2 = iterator1.next();
                               key = uEntry.getKey();
                               a.o(key, str1);
                               if (a.g(obj2.path, key.getFileName())) {
                                  objArray = obj2;
                               }else {
                                  continue ;
                               }
                            }
                            if (objArray != null) {
                               QMedia path = objArray.path;
                               a.o(path, "media.path");
                               obj2 = v14;
                               e uoe = v14;
                               obj2 = new e(objArray.id, objArray.path, objArray.created, "", uArrayList, false, objArray.type);
                               obj.b.c0.put(path, uoe);
                               objArray2 = new Object[0];
                               g.D().w("AICutAnnualMemoryProject", "observableAnalyze: save scene result path="+objArray.path, objArray2);
                            }else {
                               MemoryStageEvent key1 = uEntry.getKey();
                               a.o(key1, str1);
                               objArray2 = new Object[0];
                               g.D().A("AICutAnnualMemoryProject", "observableAnalyze: not found "+key1.getFileName(), objArray2);
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
