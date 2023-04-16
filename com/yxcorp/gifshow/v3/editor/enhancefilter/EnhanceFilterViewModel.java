package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import androidx.lifecycle.ViewModel;
import sqc.c;
import t36.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$mModelDownloadHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$a;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$b;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$mEnhanceFilterEnable$2;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import sqc.u;
import com.kwai.framework.abtest.f;
import boc.e;
import boc.b;
import java.util.Objects;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import voc.o;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import faa.a;
import q87.c;
import java.lang.StringBuilder;
import sqc.f;
import com.kwai.plugin.dva.Dva;
import com.yxcorp.gifshow.util.AdvEditUtil;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$c;
import java.lang.Runnable;
import t45.c;
import java.util.List;
import wba.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.AssetSegment;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import java.lang.Integer;
import java.util.Collection;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.g;
import sqc.i;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import sqc.l;
import erd.o;
import sqc.o;
import sqc.p;
import sqc.q;
import sqc.r;
import erd.g;
import erd.a;
import crd.b;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$d;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$e;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$f;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$g;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$h;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$i;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$j;

public final class EnhanceFilterViewModel extends ViewModel	// class@000f82
{
    public a a;
    public boolean b;
    public boolean c;
    public final ConcurrentHashMap d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final p h;
    public final EnhanceFilterViewModel$a i;
    public final EnhanceFilterViewModel$b j;
    public final p k;
    public final c l;
    public final f m;
    public final f n;

    public void EnhanceFilterViewModel(c p0,f p1,f p2){
       a.p(p0, "mEnhanceRepo");
       a.p(p1, "pictureReorderListeners");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.a = new a();
       this.d = new ConcurrentHashMap();
       this.h = s.c(EnhanceFilterViewModel$mModelDownloadHelper$2.INSTANCE);
       EnhanceFilterViewModel$a uoa = new EnhanceFilterViewModel$a(this);
       this.i = uoa;
       if (p2 != null) {
          p2.d(uoa);
       }
       this.j = new EnhanceFilterViewModel$b(this);
       this.k = s.c(new EnhanceFilterViewModel$mEnhanceFilterEnable$2(this));
       return;
    }
    public final MutableLiveData o0(){
       Object obj = PatchProxy.apply(null, this, EnhanceFilterViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final boolean p0(){
       u obj = PatchProxy.apply(null, this, EnhanceFilterViewModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o0().getValue();
       boolean b = (obj != null)? obj.b(): false;
       return b;
    }
    public final boolean q0(){
       Object obj = PatchProxy.apply(null, this, EnhanceFilterViewModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.l.j();
    }
    public final boolean r0(){
       boolean b;
       MagicModel obj = PatchProxy.apply(null, this, EnhanceFilterViewModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.a("enableEditorEnhanceFaceDetect")) {
          obj = e.c;
          a.o(obj, "InternalMagicModel.MAGIC_YCNN_LANDMARK");
          if (!obj.f()) {
             b = true;
          label_002c :
             return b;
          }
       }
       b = false;
       goto label_002c ;
    }
    public final void s0(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       EnhanceFilterViewModel uEnhanceFilt = EnhanceFilterViewModel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uEnhanceFilt, "7")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.l.i();
       boolean b = true;
       this.b = b;
       EnhanceFilterViewModel tl = this.l;
       Objects.requireNonNull(tl);
       Object obj = PatchProxy.apply(objArray, tl, uoc, "22");
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(!tl.j() && (long)(EditorSdk2UtilsV2.getTrackAssetHeight(tl.h.f().trackAssets(0)) * EditorSdk2UtilsV2.getTrackAssetWidth(tl.h.f().trackAssets(0))) - 0x7e9000 >= 0){
          b1 = true;
       }else {
          b1 = false;
       }
       if (PatchProxy.isSupport(uEnhanceFilt)) {
          Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), this, uEnhanceFilt, "9");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else if(b1 || a.t().d("useDefaultEnhanceColorFilter", 0)){
             Object[] objArray2 = new Object[0];
             a.D().w("EnhanceFilterViewModel", "initEnhanceFilter: use default lut", objArray2);
             b2 = false;
          }else {
             uEnhanceFilt = this.l;
             Objects.requireNonNull(uEnhanceFilt);
             Object obj2 = PatchProxy.apply(objArray, uEnhanceFilt, uoc, "5");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else if(uEnhanceFilt.g.a1() != Workspace$Type.VIDEO && (!uEnhanceFilt.j() || (uEnhanceFilt.g.T0() != Workspace$Source.REEDIT && (!DraftUtils.n0(uEnhanceFilt.g.T0()) || a.c(uEnhanceFilt.g).p() == b)))){
                b2 = true;
             }else {
                b2 = false;
             }
             this.q0();
          }
       }else {
          goto label_007c ;
       }
       if (!b2) {
          f.c("before start task check use default lut is4K:"+b1);
          Object[] objArray1 = new Object[0];
          a.D().w("EnhanceFilterViewModel", "startTask can not check enhance use default lut is4K:"+b1, objArray1);
          return;
       }else if(Dva.instance().isLoaded("visionengine")){
          AdvEditUtil uAdvEditUtil = AdvEditUtil.class;
          _monitor_enter(uAdvEditUtil);
          _monitor_exit(uAdvEditUtil);
          if (AdvEditUtil.a && !this.r0()) {
             this.c = b;
             this.t0();
          label_0148 :
             return;
          }
       }
       c.a(new EnhanceFilterViewModel$c(this));
       goto label_0148 ;
    }
    public final void t0(){
       String obj;
       boolean b1;
       boolean b2;
       Object[] objArray1;
       int i3;
       boolean b = this;
       EnhanceFilterViewModel uEnhanceFilt = EnhanceFilterViewModel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uEnhanceFilt, "10")) {
          return;
       }
       int i = 0;
       if (b.c == null) {
          objArray = new Object[i];
          a.D().w("EnhanceFilterViewModel", "startTaskInner vision engine not loaded", objArray);
          return;
       }else if(b.e != null){
          objArray = new Object[i];
          a.D().w("EnhanceFilterViewModel", "startTaskInner enhance task real processing", objArray);
          return;
       }else if(b.f != null){
          objArray = new Object[i];
          a.D().w("EnhanceFilterViewModel", "startTaskInner detached", objArray);
          return;
       }else if(b.g != null){
          objArray = new Object[i];
          a.D().w("EnhanceFilterViewModel", "startTaskInner reorder panel open", objArray);
          return;
       }else {
          b.l.i();
          EnhanceFilterViewModel l = b.l;
          Objects.requireNonNull(l);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          c uoc = c.class;
          ArrayList uArrayList = PatchProxy.apply(objArray, l, uoc, "2");
          r or = 1;
          if (uArrayList != patchProxyRe) {
          }else {
             String str2 = "EnhanceFilterRepo";
             if (l.j()) {
                List list = z.x(Workspace$Type.ATLAS, l.g);
                ArrayList uArrayList2 = new ArrayList();
                Object[] objArray2 = new Object[i];
                a.D().w(str2, "getTaskList picture size:"+list.size(), objArray2);
                Iterator iterator2 = list.iterator();
                int i2 = 0;
                while (iterator2.hasNext()) {
                   AssetSegment uAssetSegmen = iterator2.next();
                   if (!l.k(i2) && new File(uAssetSegmen.getFile()).exists()) {
                      String file = uAssetSegmen.getFile();
                      a.o(file, "it.file");
                      EditorSdk2V2$VideoEditorProject videoEditorP = PatchProxy.applyOneRefs(file, l, uoc, "4");
                      if (videoEditorP != patchProxyRe) {
                      }else {
                         videoEditorP = new EditorSdk2V2$VideoEditorProject();
                         EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[or];
                         while (i < or) {
                            EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
                            trackAsset.setAssetPath(file);
                            trackAssetAr[i] = trackAsset;
                            i = i + 1;
                            or = 1;
                         }
                         videoEditorP.setTrackAssets(trackAssetAr);
                      }
                      uArrayList2.add(new g(i2, videoEditorP, objArray));
                   }
                   i2 = i2 + 1;
                   i = 0;
                   or = 1;
                }
                uArrayList = uArrayList2;
             }else {
                uArrayList = new ArrayList();
                if (!l.k(0)) {
                   EditorSdk2V2$VideoEditorProject videoEditorP1 = l.h.f();
                   a.o(videoEditorP1, "mEditorContext.videoEditorProject");
                   a uoa = l.g.o0();
                   if (uoa != null) {
                      Asset uAsset = uoa.v();
                      if (uAsset != null) {
                         objArray = uAsset.getAlbumId();
                      }
                   }
                   i3 = 0;
                   uArrayList.add(new g(i3, videoEditorP1, objArray));
                }else {
                   i3 = 0;
                }
                Object[] objArray3 = new Object[i3];
                a.D().w(str2, "getTaskList video", objArray3);
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             int i1 = b.d.contains(Integer.valueOf(obj.a())) ^ 1;
             if (i1) {
                uArrayList1.add(obj);
             }
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             b.d.put(Integer.valueOf(iterator1.next().a()), Long.valueOf(System.currentTimeMillis()));
          }
          if (uArrayList.isEmpty()) {
             objArray = new Object[0];
             a.D().w("EnhanceFilterViewModel", "startTaskInner enhance taskList is empty", objArray);
             return;
          }else {
             b.e = true;
             obj = "enablePicEnhance3DLutAdr";
             if (a.a().c()) {
                if (!g.c1()) {
                   b1 = f.a(obj);
                }else if(g.c1() == 2){
                   or = 1;
                }else {
                   or = null;
                }
                b1 = or;
             }else {
                b1 = f.a(obj);
             }
             String str = ", processingTaskIndexs:";
             String str1 = "enableEditorEnhanceFaceDetect";
             if (b1) {
                if (!PatchProxy.applyVoidOneRefs(uArrayList, b, uEnhanceFilt, "11")) {
                   b2 = f.a(str1);
                   b.a.c(t.fromCallable(i.b).subscribeOn(d.c).flatMap(new l(b)).flatMap(new o(b, uArrayList, b2)).subscribe(p.b, q.b, new r(b)));
                   objArray1 = new Object[0];
                   a.D().w("EnhanceFilterViewModel", "startTaskInner useFace:"+b2+str+b.d.keySet(), objArray1);
                }
                return;
             }else {
                b2 = f.a(str1);
                b.a.c(t.fromCallable(new EnhanceFilterViewModel$d(uArrayList)).subscribeOn(d.c).flatMap(EnhanceFilterViewModel$e.b).concatMap(new EnhanceFilterViewModel$f(b, b2)).observeOn(d.a).doOnNext(new EnhanceFilterViewModel$g(b, b2)).subscribe(EnhanceFilterViewModel$h.b, EnhanceFilterViewModel$i.b, new EnhanceFilterViewModel$j(b)));
                objArray1 = new Object[0];
                a.D().w("EnhanceFilterViewModel", "startTaskInner useFace:"+b2+str+b.d.keySet(), objArray1);
                return;
             }
          }
       }
    }
}
