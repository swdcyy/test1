package com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$Status;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import boc.b;
import java.lang.Boolean;
import u80.e;
import q87.c;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.FontCategory;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$c;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$a;
import java.lang.Enum;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kuaishan.logic.j0;
import io.reactivex.g;
import t45.d;
import brd.z;
import x80.t0;
import erd.a;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDependency;
import java.util.Map;
import com.yxcorp.gifshow.util.resource.FontCategory$b;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDependency$DependencyInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import lnc.g7;
import boc.e;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.util.resource.p;
import com.kwai.plugin.dva.Dva;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$b;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;

public class KSResourceDownloader	// class@0019f8
{
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public static final KSResourceDownloader g;

    static {
       KSResourceDownloader.g = new KSResourceDownloader();
    }
    public void KSResourceDownloader(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.d = new ConcurrentHashMap();
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap();
    }
    public static KSResourceDownloader d(){
       return KSResourceDownloader.g;
    }
    public void a(KSTemplateDetailInfo p0,KSResourceDownloader$Status p1,float p2){
       if (PatchProxy.isSupport(KSResourceDownloader.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, KSResourceDownloader.class, "13")) {
          return;
       }
       this.b(p0, null, true, p1, p2);
       return;
    }
    public void b(KSTemplateDetailInfo p0,b p1,boolean p2,KSResourceDownloader$Status p3,float p4){
       Object[] objArray1;
       String str;
       Object[] objArray2;
       KSResourceDownloader kSResourceDo = KSResourceDownloader.class;
       int i = 3;
       int i1 = 1;
       if (PatchProxy.isSupport(kSResourceDo)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, kSResourceDo, "10")) {
             return;
          }
       }
       if (p1 == null && !p2) {
          objArray1 = new Object[0];
          e.D().s("KSResourceDownloader", "onReceive: baseCategory is null", objArray1);
          return;
       }else if(!p1 instanceof MagicModel && (!p1 instanceof FontCategory && !p2)){
          objArray1 = new Object[0];
          e.D().s("KSResourceDownloader", "onReceive: not ycnn model", objArray1);
          return;
       }else {
          ConcurrentHashMap uConcurrentH = this.d.get(p0.mTemplateId);
          if (uConcurrentH == null) {
             objArray1 = new Object[0];
             e.D().t("KSResourceDownloader", "onReceive: taskProgress is null", objArray1);
             return;
          }else if(p2){
             str = "libs";
          }else {
             str = p1.getResourceName();
          }
          KSResourceDownloader$c uoc = this.e.get(p0.mTemplateId);
          int i2 = KSResourceDownloader$a.a[p3.ordinal()];
          if (i2 != i1) {
             if (i2 != 2) {
                if (i2 == i) {
                   uConcurrentH.put(str, Float.valueOf(p4));
                   float f = 0;
                   Iterator iterator = uConcurrentH.entrySet().iterator();
                   while (iterator.hasNext()) {
                      f = f + iterator.next().getValue().floatValue();
                   }
                   f = f / (float)uConcurrentH.size();
                   objArray2 = new Object[0];
                   e.D().s("KSResourceDownloader", "DOWNLOADING id: "+str+", progress: "+f, objArray2);
                   if (uoc != null) {
                      uoc.a(f);
                   }
                }
             }else if(uoc != null){
                uoc.onFailed();
             }
             this.h(p0, 0);
          }else {
             Object[] objArray3 = new Object[0];
             e.D().s("KSResourceDownloader", "onReceive: SUCCESS "+str, objArray3);
             uConcurrentH.put(str, Float.valueOf(0x3f800000));
             Iterator iterator1 = uConcurrentH.entrySet().iterator();
             while (iterator1.hasNext()) {
                if (iterator1.next().getValue().floatValue() - 0x3f800000) {
                   i1 = 0;
                }
             }
             if (i1) {
                uConcurrentH.clear();
                objArray2 = new Object[0];
                e.D().w("KSResourceDownloader", "onReceive: all download are done", objArray2);
                if (uoc != null) {
                   uoc.a(0x3f800000);
                }
                this.h(p0, 0);
             }
          }
          return;
       }
    }
    public t c(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSResourceDownloader.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSResourceDownloader", "downloadResource\(\) called with: detailInfo = ["+p0.mTemplateId+"]", objArray);
       return t.create(new j0(this, p0)).distinct().subscribeOn(d.c).doFinally(new t0(p0));
    }
    public void e(KSTemplateDetailInfo p0){
       Object[] objArray2;
       ArrayList uArrayList;
       MagicModel magicModel;
       Object[] objArray4;
       int i1;
       KSTemplateDependency kSTemplateDe;
       KSResourceDownloader kSResourceDo = KSResourceDownloader.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kSResourceDo, "6")) {
          return;
       }
       Object[] objArray = 1;
       if (!PatchProxy.applyVoidOneRefs(p0, this, kSResourceDo, "7")) {
          KSTemplateDetailInfo mKSTemplateD = p0.mKSTemplateDependencyList;
          if (q.f(mKSTemplateD)) {
             objArray4 = new Object[0];
             e.D().s("KSResourceDownloader", "initFontResource ksTemplateDependencyList", objArray4);
          }else if(!this.a.isEmpty()){
             ArrayList uArrayList1 = new ArrayList();
             i1 = 0;
             String str = null;
             while (i1 < mKSTemplateD.size()) {
                kSTemplateDe = mKSTemplateD.get(i1);
                if (this.a.containsKey(kSTemplateDe.mId)) {
                   uArrayList1.add(kSTemplateDe);
                }else {
                   str = 1;
                }
                i1 = i1 + 1;
             }
             if (!str) {
                objArray4 = new Object[0];
                e.D().s("KSResourceDownloader", "initFontResource, data is ready", objArray4);
             }else {
                mKSTemplateD.removeAll(uArrayList1);
             }
          }
          Map map = FontCategory.parseFontIdCache();
          i1 = 0;
          while (i1 < mKSTemplateD.size()) {
             KSTemplateDependency kSTemplateDe1 = mKSTemplateD.get(i1);
             kSTemplateDe = kSTemplateDe1.mDependencyInfo;
             FontCategory$b uob = new FontCategory$b();
             String fontResDir = FontCategory.getFontResDir();
             if (!TextUtils.x(kSTemplateDe.mHash+kSTemplateDe.mExt)) {
                uob.a = new File(fontResDir, kSTemplateDe.mHash+kSTemplateDe.mExt).getAbsolutePath();
                uob.d = kSTemplateDe1.mId;
                uob.c = false;
                uob.e = kSTemplateDe.mHash+kSTemplateDe.mExt;
                uob.f = map.get(kSTemplateDe1.mId);
                uob.b = kSTemplateDe.mUrlList;
                this.a.put(kSTemplateDe1.mId, new FontCategory(uob));
             }
             i1 = i1 + 1;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, kSResourceDo, "8")) {
          CopyOnWriteArrayList uCopyOnWrite1 = this.b.get(p0.mTemplateId);
          if (uCopyOnWrite1 != null && uCopyOnWrite1.size() > 0) {
             objArray2 = new Object[0];
             e.D().s("KSResourceDownloader", "initMagicModel:  clear data", objArray2);
             uCopyOnWrite1.clear();
          }
          boolean b = g7.r(p0.mTemplateId, null);
          KSTemplateDetailInfo mMagicModelN = p0.mMagicModelNameList;
          if (mMagicModelN == null && !b) {
             objArray = new Object[0];
             e.D().s("KSResourceDownloader", "initMagicModel: data is empty", objArray);
          }else if(mMagicModelN == null){
             uArrayList = new ArrayList();
          }else {
             uArrayList = new ArrayList(p0.mMagicModelNameList);
          }
          if (b) {
             Iterator iterator = uArrayList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (TextUtils.n(iterator.next(), e.c.mResource)) {
                      magicModel = 1;
                   }
                }else {
                   magicModel = null;
                }
                Iterator iterator1 = uArrayList.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (!TextUtils.n(iterator1.next(), e.l.mResource)) {
                         continue ;
                      }
                   }else {
                      objArray = null;
                   }
                   if (!magicModel) {
                      uArrayList.add(e.c.mResource);
                   }
                   if (objArray == null) {
                      uArrayList.add(e.l.mResource);
                   }
                }
             }
          }
          List list = MagicEmojiResourceHelper.w(uArrayList);
          if (list != null) {
             if (uCopyOnWrite1 == null) {
                uCopyOnWrite1 = new CopyOnWriteArrayList();
             }
             Object[] objArray3 = new Object[0];
             e.D().s("KSResourceDownloader", "initMagicModel: magicModelList size = "+list.size(), objArray3);
             this.f(list, "initMagicModel: magicModelList has null element, templateId: "+p0.mTemplateId);
             uCopyOnWrite1.addAll(list);
             this.f(list, "initMagicModel: mMagicModelList has null element, templateId: "+p0.mTemplateId);
             this.b.put(p0.mTemplateId, uCopyOnWrite1);
          }else {
             objArray = new Object[0];
             e.D().s("KSResourceDownloader", "initMagicModel: magicModelList is empty", objArray);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, kSResourceDo, "9")) {
          CopyOnWriteArrayList uCopyOnWrite = this.c.get(p0.mTemplateId);
          if (uCopyOnWrite != null && uCopyOnWrite.size() > 0) {
             objArray = new Object[0];
             e.D().s("KSResourceDownloader", "initLibs: clear data ", objArray);
             uCopyOnWrite.clear();
          }
          if (p0.mDependencyLibs == null) {
             Object[] objArray1 = new Object[0];
             e.D().s("KSResourceDownloader", "initLibs:  data is empty", objArray1);
          }else if(uCopyOnWrite == null){
             uCopyOnWrite = new CopyOnWriteArrayList();
          }
          for (int i = 0; i < p0.mDependencyLibs.size(); i = i + 1) {
             objArray2 = new Object[0];
             e.D().s("KSResourceDownloader", "initLibs: libName = "+p0.mDependencyLibs.get(i), objArray2);
             uCopyOnWrite.add(p0.mDependencyLibs.get(i));
          }
          this.c.put(p0.mTemplateId, uCopyOnWrite);
       }
       return;
    }
    public void f(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSResourceDownloader.class, "1")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if (iterator.next() == null) {
             Object[] objArray = new Object[0];
             e.D().t("KSResourceDownloader", p1, objArray);
             break ;
          }
       }
       return;
    }
    public boolean g(KSTemplateDetailInfo p0){
       Iterator iterator;
       Object[] objArray;
       CopyOnWriteArrayList obj = PatchProxy.applyOneRefs(p0, this, KSResourceDownloader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.get(p0.mTemplateId);
       boolean b = true;
       int i = 0;
       if (obj != null && !obj.isEmpty()) {
          iterator = obj.iterator();
          while (true) {
             if (iterator.hasNext()) {
                b uob = iterator.next();
                if (uob != null && !p.h(uob)) {
                   objArray = new Object[i];
                   e.D().s("KSResourceDownloader", "need download magicModel", objArray);
                   return b;
                }
             }
          }
       }
       KSTemplateDetailInfo mKSTemplateD = p0.mKSTemplateDependencyList;
       if (mKSTemplateD != null && !mKSTemplateD.isEmpty()) {
          iterator = this.a.values().iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().isNeedDownload()) {
                   objArray = new Object[i];
                   e.D().s("KSResourceDownloader", "need download fontCategory", objArray);
                   return b;
                }else {
                   continue ;
                }
             }
          }
       }
       CopyOnWriteArrayList uCopyOnWrite = this.c.get(p0.mTemplateId);
       if (uCopyOnWrite != null && !uCopyOnWrite.isEmpty()) {
          Iterator iterator1 = uCopyOnWrite.iterator();
          while (iterator1.hasNext()) {
             if (!Dva.instance().isLoaded(iterator1.next())) {
                objArray = new Object[i];
                e.D().s("KSResourceDownloader", "need download so files", objArray);
                return b;
             }else {
                continue ;
             }
          }
       }
       objArray = new Object[i];
       e.D().s("KSResourceDownloader", "not needDownloadResource", objArray);
       return i;
    }
    public final void h(KSTemplateDetailInfo p0,boolean p1){
       KSResourceDownloader kSResourceDo = KSResourceDownloader.class;
       if (PatchProxy.isSupport(kSResourceDo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, kSResourceDo, "4")) {
          return;
       }
       e uoe = e.D();
       StringBuilder str = "removeDownloadListener: templateId: ";
       String str1 = (p0 == null)? "null": p0.mTemplateId;
       Object[] objArray = new Object[0];
       uoe.s("KSResourceDownloader", str+str1+", removeAll: "+p1, objArray);
       if (p1) {
          this.d.clear();
          Iterator iterator = this.f.values().iterator();
          while (iterator.hasNext()) {
             n.w(iterator.next());
          }
          this.f.clear();
          this.e.clear();
       }else if(p0 != null){
          this.d.remove(p0.mTemplateId);
          this.e.remove(p0.mTemplateId);
          KSResourceDownloader$b uob = this.f.remove(p0.mTemplateId);
          if (uob != null) {
             n.w(uob);
          }
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, KSResourceDownloader.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSResourceDownloader", "stopDownload\(\) called", objArray);
       KSResourceDownloader g = KSResourceDownloader.g;
       g.c.clear();
       g.b.clear();
       g.h(null, true);
       return;
    }
}
