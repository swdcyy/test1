package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$a;
import nsd.u;
import java.lang.String;
import am8.a;
import am8.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.o1;
import ztc.i;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import androidx.lifecycle.MutableLiveData;
import ytc.a$b;
import ftd.z1;
import ftd.w;
import ftd.c3;
import ftd.j2;
import ftd.z0;
import kotlin.coroutines.CoroutineContext;
import ftd.k0;
import ftd.l0;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$downLoadInfo$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$c;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$loadData$1;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$loadPicTemplates$1;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import dsd.a;
import trd.u;
import java.util.Objects;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDivider;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.y;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$loadPicTemplates$3$hasItem$1;
import msd.l;
import tb7.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$b;
import ytc.a$c;
import ytc.a$a;
import qrd.l1;

public final class PicTemplateDataRepo	// class@00132f
{
    public final MutableLiveData a;
    public final k0 b;
    public z1 c;
    public final i d;
    public final PicTemplate e;
    public static final ExecutorCoroutineDispatcher f;
    public static final PicTemplateDataRepo$a g;

    static {
       PicTemplateDataRepo.g = new PicTemplateDataRepo$a(null);
       a uoa = d.b("coroutines", 1);
       a.o(uoa, "ElasticExecutorService.g¡­IORITY_USER_RELATED\n    \)");
       PicTemplateDataRepo.f = o1.c(uoa);
    }
    public void PicTemplateDataRepo(i p0,PicTemplate p1){
       a.p(p0, "provider");
       super();
       this.d = p0;
       this.e = null;
       this.a = new MutableLiveData(new a$b());
       this.b = l0.a(c3.c(null, 1, null).plus(z0.g()));
       this.c = this.b();
    }
    public final Object a(PicTemplate p0,c p1){
       PicTemplateDataRepo$downLoadInfo$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataRepo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof PicTemplateDataRepo$downLoadInfo$1) {
          obj = p1;
          PicTemplateDataRepo$downLoadInfo$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             PicTemplateDataRepo$downLoadInfo$1 result = obj.result;
             Object obj1 = b.h();
             PicTemplateDataRepo$downLoadInfo$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Object[] objArray = new Object[0];
                a.D().w("Pic_Template", "downLoadInfo: ", objArray);
                p0.setResourceState(new PicTemplate$b$c(0));
                obj.L$0 = this;
                obj.L$1 = p0;
                obj.label = 1;
                result = this.d.a(p0, obj);
                if (result == obj1) {
                   return obj1;
                }
             }
             if (new File(result).exists()) {
                return result;
             }else {
                throw new FileNotFoundException("file "+result+" not exits");
             }
          }
       }
       obj = new PicTemplateDataRepo$downLoadInfo$1(this, p1);
       goto label_0025 ;
    }
    public final z1 b(){
       PicTemplateDataRepo obj = PatchProxy.apply(null, this, PicTemplateDataRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null && obj.E() == true) {
          return null;
       }
       return a.f(this.b, PicTemplateDataRepo.f, null, new PicTemplateDataRepo$loadData$1(this, null), 2, null);
    }
    public final Object c(c p0){
       PicTemplateDataRepo$loadPicTemplates$1 oloadPicTemp;
       ArrayList uArrayList;
       boolean b;
       ArrayList uArrayList2;
       PicTemplateDataRepo picTemplateD = this;
       c uoc = p0;
       if (uoc instanceof PicTemplateDataRepo$loadPicTemplates$1) {
          oloadPicTemp = uoc;
          PicTemplateDataRepo$loadPicTemplates$1 label = oloadPicTemp.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oloadPicTemp.label = label - i;
          label_001c :
             PicTemplateDataRepo$loadPicTemplates$1 result = oloadPicTemp.result;
             ArrayList obj = b.h();
             PicTemplateDataRepo$loadPicTemplates$1 label1 = oloadPicTemp.label;
             int i1 = 0;
             if (label1 != null) {
                if (label1 == 1) {
                   oloadPicTemp = oloadPicTemp.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Object[] objArray = new Object[i1];
                a.D().w("Pic_Template", "loadPicTemplates\(\) called", objArray);
                picTemplateD.a.postValue(new a$b());
                oloadPicTemp.L$0 = picTemplateD;
                oloadPicTemp.label = 1;
                result = picTemplateD.d.d(oloadPicTemp);
                if (result == obj) {
                   return obj;
                }else {
                   PicTemplateDataRepo picTemplateD1 = picTemplateD;
                }
             }
             obj = new ArrayList();
             Iterator iterator = result.iterator();
             while (iterator.hasNext()) {
                PicTemplateGroupInfo picTemplateG = iterator.next();
                List picTemplateI = picTemplateG.getPicTemplateInfos();
                if (picTemplateI != null) {
                   uArrayList = new ArrayList();
                   Iterator iterator1 = picTemplateI.iterator();
                   while (iterator1.hasNext()) {
                      Object obj1 = iterator1.next();
                      Object obj2 = obj1;
                      b = (!q.f(obj2.getIcon()) && !q.f(obj2.getResource()))? true: false;
                      if (a.a(b).booleanValue()) {
                         uArrayList.add(obj1);
                      }
                   }
                }else {
                   uArrayList = null;
                }
                ArrayList uArrayList1 = uArrayList;
                if (uArrayList1 != null) {
                   uArrayList2 = new ArrayList(u.Y(uArrayList1, 10));
                   Iterator iterator2 = uArrayList1.iterator();
                   while (iterator2.hasNext()) {
                      Object obj3 = iterator2.next();
                      Objects.requireNonNull(oloadPicTemp);
                      PicTemplate picTemplate = PatchProxy.applyTwoRefs(obj3, picTemplateG, oloadPicTemp, PicTemplateDataRepo.class, "2");
                      if (picTemplate != PatchProxyResult.class) {
                      }else {
                         a.p(obj3, "$this$toTemplate");
                         a.p(picTemplateG, "group");
                         picTemplate = new PicTemplate(obj3, picTemplateG, null, 4, null);
                      }
                      uArrayList2.add(picTemplate);
                   }
                }else {
                   uArrayList2 = CollectionsKt__CollectionsKt.E();
                }
                obj.addAll(uArrayList2);
                if (uArrayList1 != null) {
                   int i2 = uArrayList1.isEmpty() ^ 1;
                   if (i2 == 1) {
                      obj.add(new PicTemplateDivider(picTemplateG));
                   }
                }
             }
             if ((obj.isEmpty() ^ 1) && CollectionsKt___CollectionsKt.Y2(obj) instanceof PicTemplateDivider) {
                y.N0(obj);
             }
             PicTemplateDataRepo e = oloadPicTemp.e;
             if (e != null && !a.b(obj, new PicTemplateDataRepo$loadPicTemplates$3$hasItem$1(e))) {
                obj.add(i1, e);
             }
             iterator = obj.iterator();
             while (iterator.hasNext()) {
                PicTemplate picTemplate1 = iterator.next();
                PicResourceHelper b1 = PicResourceHelper.b;
                if (b1.d(picTemplate1.getPicTemplateInfo())) {
                   String str = b1.c(picTemplate1.getPicTemplateInfo());
                   if (str == null) {
                      str = "";
                   }
                   picTemplate1.setFilePath(str);
                   picTemplate1.setResourceState(PicTemplate$b$a.a);
                }else {
                   picTemplate1.setResourceState(PicTemplate$b$b.a);
                }
             }
             if (obj.isEmpty() ^ 1) {
                oloadPicTemp.a.postValue(new a$c(obj));
             }else {
                oloadPicTemp.a.postValue(new a$a());
             }
             return l1.a;
          }
       }
       oloadPicTemp = new PicTemplateDataRepo$loadPicTemplates$1(picTemplateD, uoc);
       goto label_001c ;
    }
}
