package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipJudgeCache$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qrd.p;
import java.util.Iterator;
import java.lang.Iterable;
import java.io.File;
import java.util.HashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$SkipTag;
import java.lang.Comparable;
import xrd.c;

public final class CleanerConfigurationWrapper$skipJudgeCache$2 extends Lambda implements a	// class@001305
{
    public final CleanerConfigurationWrapper this$0;

    public void CleanerConfigurationWrapper$skipJudgeCache$2(CleanerConfigurationWrapper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ArrayList invoke(){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, CleanerConfigurationWrapper$skipJudgeCache$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       CleanerConfigurationWrapper$skipJudgeCache$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       String obj1 = PatchProxy.apply(objArray, tthis$0, CleanerConfigurationWrapper.class, "8");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.g.getValue();
       }
       Iterator iterator = obj1.iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(obj1);
          File parentFile = new File(obj1).getParentFile();
          int i = 0;
          while (parentFile != null) {
             uArrayList.add(i, parentFile.getAbsolutePath());
             parentFile = parentFile.getParentFile();
          }
          int i1 = uArrayList.size();
          while (obj.size() < i1) {
             obj.add(new HashMap());
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             Object obj2 = iterator1.next();
             int i2 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             CleanerConfigurationWrapper$SkipTag obj3 = obj.get(i);
             a.o(obj3, "this[level]");
             if (!i) {
                str = "";
             }else {
                int i3 = i - 1;
                str = uArrayList.get(i3);
                a.o(str, "parents[level - 1]");
             }
             HashMap hashMap = obj3.get(str);
             if (hashMap == null) {
                hashMap = new HashMap();
                obj3.put(str, hashMap);
             }
             a.o(hashMap, "currentLevelMap[currentP¡­rentKey] = it\n          }");
             CleanerConfigurationWrapper$SkipTag sKIP = (i == i1)? CleanerConfigurationWrapper$SkipTag.SKIP: CleanerConfigurationWrapper$SkipTag.SKIP_CHILDREN;
             obj3 = hashMap.get(obj2);
             if (obj3 == null) {
                obj3 = CleanerConfigurationWrapper$SkipTag.DEFAULT;
             }
             a.o(obj3, "judgeMap[judgeFile] ?: SkipTag.DEFAULT");
             hashMap.put(obj2, c.N(sKIP, obj3));
             i = i2;
          }
       }
       return obj;
    }
}
