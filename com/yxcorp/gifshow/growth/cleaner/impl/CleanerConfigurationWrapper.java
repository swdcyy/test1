package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import java.lang.Object;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$configuration$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$whiteList$2;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipAppList$2;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipSdcardFileList$2;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipPackageFileList$2;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipAbsFileList$2;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipAllFileList$2;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipJudgeCache$2;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerWhiteListItem;
import java.io.File;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$SkipTag;

public final class CleanerConfigurationWrapper	// class@001309
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;

    public void CleanerConfigurationWrapper(){
       super();
       this.a = s.c(CleanerConfigurationWrapper$configuration$2.INSTANCE);
       this.b = s.c(new CleanerConfigurationWrapper$whiteList$2(this));
       this.c = s.c(new CleanerConfigurationWrapper$skipAppList$2(this));
       this.d = s.c(new CleanerConfigurationWrapper$skipSdcardFileList$2(this));
       this.e = s.c(new CleanerConfigurationWrapper$skipPackageFileList$2(this));
       this.f = s.c(new CleanerConfigurationWrapper$skipAbsFileList$2(this));
       this.g = s.c(new CleanerConfigurationWrapper$skipAllFileList$2(this));
       this.h = s.c(new CleanerConfigurationWrapper$skipJudgeCache$2(this));
    }
    public final ArrayList a(){
       Object obj = PatchProxy.apply(null, this, CleanerConfigurationWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final ArrayList b(){
       Object obj = PatchProxy.apply(null, this, CleanerConfigurationWrapper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final CleanerWhiteListItem c(){
       Object obj = PatchProxy.apply(null, this, CleanerConfigurationWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final boolean d(File p0){
       String str;
       CleanerConfigurationWrapper$SkipTag skipTag;
       Object obj = PatchProxy.applyOneRefs(p0, this, CleanerConfigurationWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return true;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p0.getAbsolutePath());
       for (p0 = p0.getParentFile(); p0 != null; p0 = p0.getParentFile()) {
          uArrayList.add(0, p0.getAbsolutePath());
       }
       Iterator iterator = uArrayList.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          int i2 = this.b().size();
          if (i >= 0 && i2 > i) {
             HashMap hashMap = this.b().get(i);
             a.o(hashMap, "if \(level in 0 until ski¡­]\n      else return false");
             if (!i) {
                str = "";
             }else {
                i = i - 1;
                str = uArrayList.get(i);
                a.o(str, "parents[level - 1]");
             }
             HashMap hashMap1 = hashMap.get(str);
             if (hashMap1 != null) {
                skipTag = hashMap1.get(obj1);
                if (skipTag != null) {
                label_008f :
                   a.o(skipTag, "currentLevelMap[currentP\x20\x02eFile\) ?: SkipTag.DEFAULT\x00");
                   if (skipTag == CleanerConfigurationWrapper$SkipTag.SKIP) {
                      return true;
                   }else if(skipTag == CleanerConfigurationWrapper$SkipTag.DEFAULT || skipTag == CleanerConfigurationWrapper$SkipTag.SCAN){
                      break ;
                   }
                }
             }
             skipTag = CleanerConfigurationWrapper$SkipTag.DEFAULT;
             goto label_008f ;
          }else {
             break ;
          }
          i = i1;
       }
    label_00a4 :
       return 0;
    }
}
