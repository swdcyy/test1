package ck5.i$b;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.e0;
import kotlin.jvm.internal.a;
import ck5.i;
import java.util.Objects;
import brd.a0;
import il5.b;
import ak5.j;
import ak5.a;
import bk5.h;
import bk5.h$a;
import z1.k;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;
import java.util.Collection;
import ok5.a;
import com.kwai.emotionsdk.bean.EmotionResponse;
import bk5.g;
import java.lang.Thread;
import com.kwai.emotionsdk.core.j;
import ck5.j;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.emotionsdk.bean.EmotionRealTimeUpdateConfig;
import java.lang.Integer;
import com.kwai.emotionsdk.bean.EmotionPackage;
import ck5.m;
import java.util.Collections;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gson.Gson;
import ck5.k;

public final class i$b implements o	// class@0006d8
{
    public static final i$b b;

    static {
       i$b.b = new i$b();
    }
    public void i$b(){
       super();
    }
    public Object apply(Object p0){
       int i;
       h a;
       boolean b;
       Object obj2;
       a j;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i obj = PatchProxy.applyOneRefs(p0, this, i$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          obj = i.a;
          Objects.requireNonNull(obj);
          i oi = i.class;
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, oi, "3");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             i = b.a("getEmotionCurVersion");
             j oj = j.o();
             a.o(oj, "KwaiEmotionManager.getInstance\(\)");
             a uoa = oj.i();
             a.o(uoa, "KwaiEmotionManager.getInstance\(\).config");
             Objects.requireNonNull(uoa);
             h oh = PatchProxy.apply(null, uoa, a.class, "2");
             if (oh != patchProxyRe) {
             }else {
                j = uoa.j;
                if (j == null) {
                   a = h.d.a();
                }else if(j.get() == null){
                   a = h.d.a();
                }else {
                   a = uoa.j.get();
                }
                oh = a;
             }
             a.o(oh, "KwaiEmotionManager.getIn…nce\(\).config.updateConfig");
             a = oh.a;
             int i1 = 0;
             int i2 = 1;
             b = (p0.isEmpty() || a > i)? true: false;
             oh = oh.b;
             if (oh == null) {
                List list1 = CollectionsKt__CollectionsKt.E();
             }
             a.a("EmotionDataProcessor", "tryToLoadDataFromRemote-latestVersion="+a+" curVersion="+i+','+"needGetAll="+b+",realTime "+(oh.isEmpty() ^ i2));
             if (!b && oh.isEmpty()) {
                a.a("EmotionDataProcessor", "tryToLoadDataFromRemote - local data");
                EmotionResponse uEmotionResp = new EmotionResponse();
                uEmotionResp.mEmotionPackageList = p0;
                uEmotionResp.mEmotionVersion = i;
                p0 = a0.B(new g(i1, uEmotionResp));
                a.o(p0, "EmotionResponse\(\).let { …ONE, response\)\)\n        }");
             }else {
                p0 = "Thread.currentThread\(\)";
                if (b) {
                   Thread thread = Thread.currentThread();
                   a.o(thread, p0);
                   a.a("EmotionDataProcessor", "tryToLoadDataFromRemote - 全量 "+thread.getName());
                   p0 = j.e().h("0", null).C(j.b);
                }else {
                   Thread thread1 = Thread.currentThread();
                   a.o(thread1, p0);
                   a.a("EmotionDataProcessor", "tryToLoadDataFromRemote - 部分更新 "+thread1.getName());
                   if (!PatchProxy.applyVoidOneRefs(oh, obj, oi, "4")) {
                      p0 = oh.iterator();
                      while (p0.hasNext()) {
                         EmotionRealTimeUpdateConfig uEmotionReal = p0.next();
                         j oj1 = j.e();
                         i = uEmotionReal.getEmotionPackageType();
                         String emotionPacka = uEmotionReal.getEmotionPackageId();
                         if (emotionPacka == null) {
                            emotionPacka = "";
                         }
                         Objects.requireNonNull(oj1);
                         j oj2 = j.class;
                         if (PatchProxy.isSupport(oj2)) {
                            obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i), emotionPacka, oj1, oj2, "12");
                            if (obj2 != patchProxyRe) {
                            }else {
                            label_018b :
                               m om = oj1.d(i);
                               List list = (om == null)? Collections.emptyList(): om.c();
                               Iterator iterator = list.iterator();
                               do {
                                  if (iterator.hasNext()) {
                                  }else {
                                     obj2 = null;
                                     break ;
                                  }
                                  obj2 = iterator.next();
                               } while (TextUtils.n(emotionPacka, obj2.mId));
                            }
                         }else {
                            goto label_018b ;
                         }
                         if (obj2 != null) {
                            uEmotionReal.setEmotionPackageVersion(obj2.mEmotionPackageVersion);
                         }
                      }
                   }
                   p0 = new LinkedHashMap();
                   p0.put("emotionRefreshPackages", oh);
                   p0 = new Gson().q(p0);
                   a.a("EmotionDataProcessor", "tryToLoadDataFromRemote - 部分更新 emotionPackages"+p0);
                   p0 = j.e().h(null, p0).C(k.b);
                }
                a.o(p0, "when {\n          needGet…\) }\n          }\n        }");
             }
             obj = p0;
          }
       }
       return obj;
    }
}
