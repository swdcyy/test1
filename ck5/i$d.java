package ck5.i$d;
import erd.g;
import java.lang.Object;
import bk5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import ok5.a;
import ck5.i;
import ck5.m;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.emotionsdk.bean.EmotionResponse;
import com.kwai.emotionsdk.core.j;
import hk5.a;
import ik5.b;
import com.kwai.emotionsdk.db.dao.EmotionPackageDao;
import org.greenrobot.greendao.AbstractDao;
import il5.b;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionPackage;
import jl5.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import com.kwai.emotionsdk.util.ActivityContext;
import android.content.Context;
import il5.a;
import android.content.SharedPreferences;
import oe6.o;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;

public final class i$d implements g	// class@0006da
{
    public static final i$d b;

    static {
       i$d.b = new i$d();
    }
    public void i$d(){
       super();
    }
    public void accept(Object p0){
       i a;
       List list;
       int i;
       List list1;
       ArrayList uArrayList;
       int b;
       ArrayList obj2;
       boolean b1;
       Iterator iterator1;
       EmotionPackage obj3;
       Object[] objArray1;
       ArrayList uArrayList2;
       Object obj = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj, this, i$d.class, str)) {
       }else {
          Thread thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          String str1 = "EmotionDataProcessor";
          a.a(str1, "loadData-4, "+thread.getName());
          a = i.a;
          m om = a.b();
          if (om != null) {
             list = om.c();
             if (list != null) {
             label_0048 :
                EmotionResponse mEmotionPack = obj.d().mEmotionPackageList;
                String str2 = "packageLists";
                i = 1;
                if (obj.c() == 2) {
                   a.a(str1, "loadData-5 全量 version "+obj.d().mEmotionVersion);
                   j.e().i();
                   a uoa = a.b();
                   a.o(uoa, "EmotionDbManager.getInstance\(\)");
                   b uob = uoa.a();
                   a.o(uob, "EmotionDbManager.getInstance\(\).daosession");
                   uob.a().deleteAll();
                   a.o(mEmotionPack, str2);
                   a.d(mEmotionPack);
                   b.c("getEmotionCurVersion", obj.d().mEmotionVersion);
                }else if(obj.c() == i){
                   a.o(mEmotionPack, str2);
                   uArrayList = new ArrayList(u.Y(mEmotionPack, 10));
                   Iterator iterator3 = mEmotionPack.iterator();
                   while (iterator3.hasNext()) {
                      uArrayList.add(iterator3.next().mId);
                   }
                   a.a(str1, "loadData-6 部分刷新 ids =  "+uArrayList);
                   i.a.d(mEmotionPack);
                }
                a = i.a;
                m om1 = a.b();
                if (om1 != null) {
                   list1 = om1.c();
                   if (list1 != null) {
                   label_00fa :
                      h oh = h.class;
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      uArrayList = PatchProxy.applyTwoRefs(list, list1, a, i.class, "5");
                      if (uArrayList != patchProxyRe) {
                      }else {
                         Object[] objArray = null;
                         EmotionPackage obj1 = PatchProxy.apply(objArray, objArray, oh, str);
                         Iterator iterator = null;
                         if (obj1 != patchProxyRe) {
                            b = obj1.booleanValue();
                         }else {
                            File uFile = new File(h.h());
                            if (uFile.exists() && uFile.isDirectory()) {
                               File[] uFileArray = uFile.listFiles();
                               if (uFileArray != null && uFileArray.length > 0) {
                                  b = true;
                               }
                            }
                            b = false;
                         }
                         if (b) {
                            obj2 = PatchProxy.apply(objArray, objArray, oh, "2");
                            if (obj2 != patchProxyRe) {
                               b1 = obj2.booleanValue();
                            }else {
                               Context uContext = ActivityContext.d().b();
                               str2 = "isEmojiFileDownloaded";
                               if (PatchProxy.isSupport(a.class)) {
                                  Object obj4 = PatchProxy.applyThreeRefs(uContext, str2, Boolean.TRUE, null, a.class, "7");
                                  if (obj4 != patchProxyRe) {
                                     b1 = obj4.booleanValue();
                                  }
                               }
                               b1 = o.c(uContext, "emotionsdk_kvt", iterator).getBoolean(str2, i);
                            }
                            if (b1) {
                               iterator = 1;
                            }
                         }
                         if (iterator && ((list.isEmpty() ^ i) && (list1.isEmpty() ^ i))) {
                            obj2 = new ArrayList();
                            iterator1 = list1.iterator();
                            while (iterator1.hasNext()) {
                               obj3 = iterator1.next();
                               obj1 = obj3;
                               iterator = list.iterator();
                               while (true) {
                                  if (iterator.hasNext()) {
                                     objArray1 = iterator.next();
                                     if (!a.g(obj1.mId, objArray1.mId)) {
                                        continue ;
                                     }
                                  }else {
                                     objArray1 = objArray;
                                  }
                                  if (objArray1 != null) {
                                     i a1 = i.a;
                                     EmotionPackage mPackageDown = objArray1.mPackageDownloadUrl;
                                     a.o(mPackageDown, "old.mPackageDownloadUrl");
                                     obj1 = obj1.mPackageDownloadUrl;
                                     a.o(obj1, "it.mPackageDownloadUrl");
                                     b = a.g(a1.a(mPackageDown), a1.a(obj1)) ^ i;
                                  }else {
                                     b = 1;
                                  }
                                  if (b) {
                                     obj2.add(obj3);
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                            list1 = obj2;
                         }
                      label_01ef :
                         ArrayList uArrayList1 = new ArrayList();
                         obj2 = new ArrayList();
                         iterator1 = list1.iterator();
                         while (iterator1.hasNext()) {
                            obj3 = iterator1.next().mPackageDownloadUrl;
                            if (obj3 != null) {
                               uArrayList2 = new ArrayList();
                               Iterator iterator2 = obj3.iterator();
                               while (iterator2.hasNext()) {
                                  CDNUrl mUrl = iterator2.next().mUrl;
                                  if (mUrl != null) {
                                     uArrayList2.add(mUrl);
                                  }
                               }
                               uArrayList1.add(uArrayList2);
                            }else {
                               uArrayList2 = objArray;
                            }
                            if (uArrayList2 != null) {
                               obj2.add(uArrayList2);
                            }
                         }
                         a.a(str1, "compareEmojiData urls "+uArrayList1);
                         uArrayList = uArrayList1;
                      }
                      if (!PatchProxy.applyVoidOneRefs(uArrayList, obj, g.class, str)) {
                         a.p(uArrayList, "<set-?>");
                         obj.a = uArrayList;
                      }
                   }
                }
                list1 = CollectionsKt__CollectionsKt.E();
                goto label_00fa ;
             }
          }
          list = CollectionsKt__CollectionsKt.E();
          goto label_0048 ;
       }
       return;
    }
}
