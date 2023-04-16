package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import jb7.b;
import com.kuaishou.post.story.entrance.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import jb7.a;
import com.kuaishou.post.story.entrance.data.MoodTemplateConfigExtra;
import java.lang.Class;
import kb7.a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$mMoodTemplateDownloadHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import di0.b;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.ArrayList;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import kq4.f;
import com.kuaishou.post.story.entrance.repo.MoodTemplateDownloadHelper;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$a;
import io.reactivex.g;
import java.util.Collection;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$b;
import erd.o;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$c;
import t45.d;
import brd.z;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$d;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$e;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import ekd.q;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import lq4.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import kq4.a;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$f;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import rp4.k$a;
import brd.a0;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$g;
import java.util.Objects;
import java.util.Set;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import java.util.Map$Entry;
import erd.r;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$h;

public final class MoodTemplateRepo extends b	// class@000b50
{
    public final PostTaskManager o;
    public final p p;
    public final b q;
    public b r;
    public b s;
    public final ArrayList t;
    public final b u;
    public final e v;

    public void MoodTemplateRepo(b p0){
       super(p0, null);
    }
    public void MoodTemplateRepo(b p0,e p1){
       a.p(p0, "mResourceManager");
       super(new a("STORY_MOOD_TEMPLATE", 1, MoodTemplateConfigExtra.class), null, 2, null);
       this.u = p0;
       this.v = p1;
       this.o = new PostTaskManager();
       this.p = s.c(MoodTemplateRepo$mMoodTemplateDownloadHelper$2.INSTANCE);
       this.q = new b(null, 1, null);
       this.t = new ArrayList();
    }
    public final void i(MoodTemplateData p0,int p1){
       MoodTemplateRepo moodTemplate = MoodTemplateRepo.class;
       if (PatchProxy.isSupport(moodTemplate) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, moodTemplate, "10")) {
          return;
       }
       int i = 0;
       ListHolder value = this.q.getValue();
       if (value != null) {
          List list = value.c();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                if (a.g(iterator.next().n(), p0.n())) {
                   this.q.y(i, p0, Integer.valueOf(p1));
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public final t j(MoodTemplateData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoodTemplateRepo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.f(), "downloadTemplate "+p0, objArray);
       t ot = t.create(new MoodTemplateRepo$a(this, new f(p0.n(), p0, this.n()), p0));
       a.o(ot, "Observable.create { emit¡­ask, false\)\n      }\n    }");
       return ot;
    }
    public final void k(MoodTemplateRepo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateRepo.class, "12")) {
          return;
       }
       a.p(p0, "moodTemplateRepo");
       Object[] objArray = new Object[0];
       a.D().w(this.f(), "extend", objArray);
       this.t.clear();
       this.t.addAll(p0.t);
       return;
    }
    public final b l(CachePolicy p0,g p1,boolean p2){
       if (PatchProxy.isSupport(MoodTemplateRepo.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, MoodTemplateRepo.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "cachePolicy");
       Object[] objArray = new Object[0];
       a.D().w(this.f(), "fetchAllData cachePolicy:"+p0+", useMemCache:"+p2, objArray);
       if (p2 && this.t.size() > 0) {
          ArrayList uArrayList = new ArrayList(this.t);
          this.q.s(uArrayList, Integer.valueOf(4));
          p1.accept(uArrayList);
          Object[] objArray1 = new Object[0];
          a.D().w(this.f(), "fetchAllData use mem cache and has mem cache", objArray1);
          return null;
       }else {
          Object[] objArray2 = new Object[0];
          a.D().w(this.f(), "fetchAllData cachePolicy:"+p0, objArray2);
          return this.u.a(p0).map(new MoodTemplateRepo$b(this)).flatMap(new MoodTemplateRepo$c(this)).observeOn(d.a).subscribe(new MoodTemplateRepo$d(this, p1), new MoodTemplateRepo$e(this, p1));
       }
    }
    public final b m(){
       return this.q;
    }
    public final MoodTemplateDownloadHelper n(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final void o(Result p0,List p1){
       Object[] objArray;
       String str3;
       String str4;
       String str5;
       MoodTemplateData moodTemplate;
       ArrayList uArrayList;
       Object obj = p1;
       if (PatchProxy.applyVoidTwoRefs(p0, obj, this, MoodTemplateRepo.class, "11")) {
          return;
       }
       List list = p0.a();
       int i = 0;
       if (q.f(list)) {
          objArray = new Object[i];
          a.D().w(this.f(), "groupData data is empty", objArray);
          return;
       }else if(list != null){
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             List detailInfoLi = iterator.next().getDetailInfoList();
             if (detailInfoLi != null) {
                Iterator iterator1 = detailInfoLi.iterator();
                while (iterator1.hasNext()) {
                   MaterialDetailInfo materialDeta = iterator1.next();
                   MoodTemplateConfigExtra extObject = materialDeta.getExtObject();
                   String materialId = materialDeta.getMaterialId();
                   String str = "";
                   String str1 = (materialId != null)? materialId: str;
                   materialId = materialDeta.getMaterialName();
                   String str2 = (materialId != null)? materialId: str;
                   List resourceUrls = materialDeta.getResourceUrls();
                   if (resourceUrls == null) {
                      uArrayList = new ArrayList();
                   }
                   List list1 = resourceUrls;
                   resourceUrls = materialDeta.getIconUrls();
                   if (resourceUrls == null) {
                      uArrayList = new ArrayList();
                   }
                   List list2 = resourceUrls;
                   int i1 = 0;
                   int i2 = 0;
                   int type = (extObject != null)? extObject.getType(): -1;
                   int i3 = (extObject != null)? extObject.getStickerId(): -1;
                   double d = 0;
                   double stickerPerce = (extObject != null)? extObject.getStickerPercentX(): d;
                   if (extObject != null) {
                      d = extObject.getStickerPercentY();
                   }
                   if (extObject != null) {
                      materialId = extObject.getExtra();
                      if (materialId != null) {
                         str3 = materialId;
                      label_00bf :
                         String md5 = materialDeta.getMd5();
                         a uoa = null;
                         materialId = "#80FFFFFF";
                         if (extObject != null) {
                            str = extObject.getStickerColor();
                            if (str != null) {
                               str4 = str;
                            label_00d3 :
                               if (extObject != null) {
                                  str = extObject.getPreviewTextColor();
                                  if (str != null) {
                                     str5 = str;
                                  label_00e0 :
                                     int i4 = (extObject != null)? extObject.getPreviewLayoutType(): 1;
                                     int i5 = (extObject != null)? extObject.getDefaultInputTextColorIndex(): 0;
                                     moodTemplate = v15;
                                     MoodTemplateData moodTemplate1 = new MoodTemplateData(str1, str2, list1, list2, i1, i2, type, i3, stickerPerce, d, str4, str3, uoa, md5, str5, i5, i4, 0, 0, false, 0xe1030, null);
                                     uoa = a.d;
                                     moodTemplate.E(uoa.b(moodTemplate));
                                     moodTemplate.D(uoa.c(moodTemplate));
                                     obj.add(moodTemplate);
                                     Object[] objArray1 = new Object[0];
                                     a.D().w(this.f(), "pluginExtra:"+extObject, objArray1);
                                     moodTemplate = 0;
                                  }
                               }
                               str5 = materialId;
                               goto label_00e0 ;
                            }
                         }
                         str4 = materialId;
                         goto label_00d3 ;
                      }
                   }
                   str3 = str;
                   goto label_00bf ;
                }
             }
             moodTemplate = null;
          }
       }
       objArray = new Object[0];
       a.D().w(this.f(), "groupData", objArray);
       return;
    }
    public final PostTaskManager$PostTaskState p(MoodTemplateData p0,int p1,Bitmap p2){
       if (PatchProxy.isSupport(MoodTemplateRepo.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MoodTemplateRepo.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "moodTemplateData");
       return this.q(p0, p1, p2, null);
    }
    public final PostTaskManager$PostTaskState q(MoodTemplateData p0,int p1,Bitmap p2,PostTaskManager$b p3){
       a obj;
       PostTaskManager$PostTaskState fAILED;
       f uof1;
       if (PatchProxy.isSupport(MoodTemplateRepo.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, MoodTemplateRepo.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "moodTemplateData");
       Object[] objArray = new Object[0];
       a.D().w(this.f(), "downloadMoodRemotePictureTemplate moodTemplateData:"+p0+", stateful:"+p1, objArray);
       int i = 1;
       if (!p0.w()) {
          obj = new a(p0.n(), p0, p2);
       }else if(p0.w() == i){
          uof1 = new f(p0.n(), p0, this.n());
       }else {
          uof1 = null;
       }
       f uof2 = uof1;
       if (obj == null) {
          fAILED = PostTaskManager$PostTaskState.FAILED;
          p0.C(fAILED);
          this.i(p0, p1);
          return fAILED;
       }else {
          MoodTemplateRepo$f uof = new MoodTemplateRepo$f(this, obj, p0, p1, p3);
          this.o.a(v2);
          fAILED = this.o.b(obj);
          p0.C(fAILED);
          if (p0.j() == PostTaskManager$PostTaskState.LOADING) {
             p0.B(i);
          }
          if (p3 != null && fAILED == PostTaskManager$PostTaskState.SUCCESS) {
             p3.a(obj);
          }
          this.i(p0, p1);
          Object[] objArray1 = new Object[0];
          a.D().w(this.f(), "downloadMoodRemotePictureTemplate taskAdded:"+fAILED+", payload:"+p1, objArray1);
          return fAILED;
       }
    }
    public final a0 r(boolean p0){
       MoodTemplateRepo$g obj;
       PostTaskManager postTaskMana = PostTaskManager.class;
       MoodTemplateRepo moodTemplate = MoodTemplateRepo.class;
       if (PatchProxy.isSupport(moodTemplate)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, moodTemplate, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          MoodTemplateRepo to = this.o;
          obj = MoodTemplateRepo$g.b;
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoidOneRefs(obj, to, postTaskMana, "4")) {
             a.p(obj, "predicate");
             Iterator iterator = to.a.entrySet().iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                a.o(obj1, "iterator.next\(\)");
                if (obj.test(obj1.getValue())) {
                   iterator.remove();
                   Iterator iterator1 = to.c.iterator();
                   while (iterator1.hasNext()) {
                      Object value = obj1.getValue();
                      a.o(value, "next.value");
                      iterator1.next().c(value);
                   }
                }
             }
          }
          to = this.o;
          MoodTemplateRepo$h b = MoodTemplateRepo$h.b;
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoidOneRefs(b, to, postTaskMana, "5")) {
             a.p(b, "predicate");
             postTaskMana = to.e;
             if (postTaskMana != null) {
                a.m(postTaskMana);
                if (b.test(postTaskMana)) {
                   PostTaskManager d = to.d;
                   if (d != null) {
                      d.dispose();
                   }
                }
             }
          }
       }
    label_00a2 :
       return this.o.j();
    }
}
