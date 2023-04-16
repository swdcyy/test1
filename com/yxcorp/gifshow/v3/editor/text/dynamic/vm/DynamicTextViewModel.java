package com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import androidx.lifecycle.ViewModel;
import di0.b;
import com.kuaishou.kotlin.livedata.ListHolder;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$downloadHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$configRepo$2;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$compositeDisposable$2;
import java.lang.String;
import brd.v;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ypc.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import w46.b;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import nuc.c;
import brd.t;
import t45.d;
import brd.z;
import ruc.b;
import ruc.c;
import erd.g;
import crd.b;
import crd.a;
import d0c.d;
import huc.d;
import d0c.a;
import huc.u;
import ruc.a;
import huc.u$a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$b;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$c;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$d;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$e;
import java.util.Collection;
import ekd.q;
import java.util.Map;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import java.util.ArrayList;

public final class DynamicTextViewModel extends ViewModel	// class@0013ef
{
    public final b a;
    public final p b;
    public final p c;
    public u d;
    public final p e;
    public boolean f;

    public void DynamicTextViewModel(){
       super();
       this.a = new b(null, 1, null);
       this.b = s.c(DynamicTextViewModel$downloadHelper$2.INSTANCE);
       this.c = s.c(DynamicTextViewModel$configRepo$2.INSTANCE);
       this.e = s.c(DynamicTextViewModel$compositeDisposable$2.INSTANCE);
    }
    public static boolean p0(DynamicTextViewModel p0,String p1,boolean p2,v p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       return p0.o0(p1, p2, null);
    }
    public final boolean o0(String p0,boolean p1,v p2){
       a obj;
       int i;
       Object[] objArray3;
       Object[] obj1;
       int this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicTextViewModel uDynamicText = DynamicTextViewModel.class;
       if (PatchProxy.isSupport(uDynamicText)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, DynamicTextViewModel.class, "8");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "textId");
       obj = PatchProxy.applyOneRefs(p0, this, uDynamicText, "11");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          ListHolder value = this.a.getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                Iterator iterator = list.iterator();
                int i1 = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      this = i1 + 1;
                      if (i1 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      if (a.g(obj1.b(), p0)) {
                         i = i1;
                      }else {
                         i1 = this;
                      }
                   }
                }
             }
          }
          obj1 = new Object[0];
          a.D().w("DynamicTextViewModel", "indexOf textId:"+p0, obj1);
          i = -1;
       }
       if (i < 0) {
          Object[] objArray = new Object[0];
          a.D().t("DynamicTextViewModel", "download failed: cannot found textId in configList index:"+i+", textId:"+p0, objArray);
          return 0;
       }else {
          obj = this.a.u(i);
          p0 = ", dynamicData:";
          Object[] objArray1 = new Object[0];
          a.D().w("DynamicTextViewModel", "download textId:"+p0+p0+obj, objArray1);
          if (obj != null) {
             if (!PatchProxy.isSupport(uDynamicText) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), obj, p2, this, DynamicTextViewModel.class, "10")) {
                objArray1 = new Object[0];
                a.D().w("DynamicTextViewModel", "downloadParam index:"+i+p0+obj, objArray1);
                this.r0().c(this.s0().a(obj).subscribeOn(d.c).observeOn(d.a).subscribe(new b(obj, this, p2, i), new c(this, p2, i)));
             }
             if (p1 && (!PatchProxy.isSupport(uDynamicText) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), obj, this, uDynamicText, "9"))) {
                d uod = obj.m();
                Object[] objArray2 = new Object[0];
                a.D().w("DynamicTextViewModel", "downloadFont index:"+i+p0+obj, objArray2);
                if (uod == null || this.d == null) {
                   objArray3 = new Object[0];
                   a.D().w("DynamicTextViewModel", "downloadFont should not download", objArray3);
                }else {
                   Boolean uBoolean = d.c(uod);
                   a.o(uBoolean, "EditTextIdHelper.checkTextFontValid\(fontViewData\)");
                   if (uBoolean.booleanValue()) {
                      objArray3 = new Object[0];
                      a.D().w("DynamicTextViewModel", "downloadFont should not download font is valid", objArray3);
                   }else if(uod.d() == null){
                      objArray3 = new Object[0];
                      a.D().w("DynamicTextViewModel", "downloadFont font id is null", objArray3);
                   }else {
                      DynamicTextViewModel td = this.d;
                      a.m(td);
                      String str = uod.d();
                      a.m(str);
                      Integer integer = td.c0(str);
                      if (integer == null) {
                         objArray3 = new Object[0];
                         a.D().w("DynamicTextViewModel", "downloadFont fontPosition is null", objArray3);
                      }else {
                         DynamicTextViewModel td1 = this.d;
                         a.m(td1);
                         td1.m0(integer.intValue(), new a(this, obj, i));
                      }
                   }
                }
             }
          }
          return true;
       }
    }
    public final void q0(boolean p0,List p1,boolean p2,boolean p3,DynamicTextViewModel$a p4){
       DynamicTextViewModel uDynamicText = DynamicTextViewModel.class;
       int i = 0;
       if (PatchProxy.isSupport(uDynamicText)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uDynamicText, "4")) {
             return;
          }
       }
       a.p(p1, "featureIdList");
       Object[] objArray1 = new Object[i];
       a.D().w("DynamicTextViewModel", "fetchConfigAndPreDownload useNetwork:"+p0+", fontViewModel:"+this.d, objArray1);
       d.s();
       DynamicTextRepo uDynamicText1 = PatchProxy.apply(null, this, uDynamicText, "2");
       if (uDynamicText1 == PatchProxyResult.class) {
          uDynamicText1 = this.c.getValue();
       }
       DynamicTextViewModel$d uod = new DynamicTextViewModel$d(this, p1, p0, p3, p4);
       this.r0().c(uDynamicText1.a(p0, i).flatMap(new DynamicTextViewModel$b(this)).subscribeOn(d.c).map(new DynamicTextViewModel$c(this, p2)).observeOn(d.a).subscribe(v6, new DynamicTextViewModel$e(p4)));
       return;
    }
    public final a r0(){
       Object obj = PatchProxy.apply(null, this, DynamicTextViewModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final DynamicTextDownloadHelper s0(){
       Object obj = PatchProxy.apply(null, this, DynamicTextViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final b t0(){
       return this.a;
    }
    public final u u0(){
       return this.d;
    }
    public final void v0(boolean p0,List p1){
       DynamicTextViewModel uDynamicText = DynamicTextViewModel.class;
       if (PatchProxy.isSupport(uDynamicText) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uDynamicText, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DynamicTextViewModel", "preDownload isDownloadAll:"+p0, objArray);
       if (this.a.getValue() != null) {
          ListHolder value = this.a.getValue();
          List list = (value != null)? value.c(): null;
          if (!q.f(list)) {
          label_0075 :
             value = this.a.getValue();
             if (value != null) {
                list = value.c();
                if (list != null) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      a uoa = iterator.next();
                      String str = uoa.b();
                      a.o(str, "it.textId");
                      if (d.o().containsKey(str)) {
                         Object[] objArray1 = new Object[0];
                         a.D().w("DynamicTextViewModel", "preDownload find textId:"+str, objArray1);
                      }else {
                         a uoa1 = uoa.l();
                         if (p0 || p1.contains(uoa.b())) {
                            DynamicTextParams uDynamicText1 = d.d(uoa1, uoa1.l());
                            Object[] objArray2 = new Object[0];
                            a.D().w("DynamicTextViewModel", "preDownload textParams:"+uDynamicText1+", config:"+uoa1, objArray2);
                            if (uDynamicText1 == null) {
                               DynamicTextViewModel.p0(this, str, false, null, 4, null);
                            }
                         }
                      }
                   }
                }
             }
             return;
          }
       }
       objArray = new Object[0];
       a.D().w("DynamicTextViewModel", "preDownload dynamicListLiveData is not available: "+this.a.getValue(), objArray);
       this.f = true;
       goto label_0075 ;
    }
    public final void w0(){
       if (PatchProxy.applyVoid(null, this, DynamicTextViewModel.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DynamicTextViewModel", "preDownloadAllDynamicTextParams", objArray);
       this.v0(true, new ArrayList());
       return;
    }
}
