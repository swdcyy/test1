package com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import voc.y;
import androidx.lifecycle.ViewModel;
import uwc.b;
import t36.f;
import atc.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import di0.b;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel$mReorderDataList$1;
import msd.p;
import di0.b$a;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel$b;
import voc.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel$a;
import t36.f$a;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel$c;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qaa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.PictureCoverParam;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import java.lang.Boolean;
import qr4.e$o;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import qr4.i;
import qr4.e$h;
import wba.z;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel$d;
import btc.b;
import k2b.s;
import com.yxcorp.gifshow.util.PictureMemoryUtils;
import java.util.Collection;

public final class ReorderViewModel extends ViewModel implements y	// class@0011bd
{
    public final MediatorLiveData b;
    public final LiveData c;
    public final ArrayList d;
    public boolean e;
    public final b f;
    public boolean g;
    public final ReorderViewModel$b h;
    public final b i;
    public final f j;
    public final f k;
    public final f l;
    public final a m;

    public void ReorderViewModel(b p0,f p1,f p2,f p3,a p4){
       a.p(p0, "previewViewModel");
       a.p(p1, "notifyPictureCropWorkChangedListeners");
       a.p(p2, "pictureReorderListeners");
       a.p(p3, "coverChangeListeners");
       a.p(p4, "reorderAssetRepo");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.b = new MediatorLiveData();
       this.c = new MutableLiveData();
       this.d = new ArrayList();
       this.f = b.a.a(p4.b, new ReorderViewModel$mReorderDataList$1(this));
       this.h = new ReorderViewModel$b(this);
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public final void n(int p0){
       ReorderViewModel reorderViewM = ReorderViewModel.class;
       if (PatchProxy.isSupport(reorderViewM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, reorderViewM, "12")) {
          return;
       }
       this.b.setValue(new AtomicInteger(p0));
       return;
    }
    public final int o0(){
       AtomicInteger obj = PatchProxy.apply(null, this, ReorderViewModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.getValue();
       int i = (obj != null)? obj.get(): 0;
       return i;
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public final MediatorLiveData p0(){
       return this.b;
    }
    public final b q0(){
       return this.f;
    }
    public final int r0(){
       ListHolder obj = PatchProxy.apply(null, this, ReorderViewModel.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f.getValue();
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, ReorderViewModel.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ReorderViewModel", "> discardEditChanges\(\)", objArray);
       this.i.G0(0);
       this.k.s0(ReorderViewModel$a.a);
       this.g = false;
       Object[] objArray1 = new Object[0];
       a.D().w("ReorderViewModel", "discardEditChanges", objArray1);
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       b a;
       int i;
       int i1;
       boolean b;
       List indexesList;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReorderViewModel.class, "15")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("ReorderViewModel", "> saveEditorChanges\(\)", objArray1);
       if (this.g != null) {
          this.l.s0(ReorderViewModel$c.a);
          this.g = false;
       }
       ReorderViewModel tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, uoa, "12")) {
          Cover uCover = a.f(tm.c).v();
          if (uCover != null) {
             PictureCoverParam pictureCover = uCover.getPictureCoverParam();
             if (pictureCover != null) {
                indexesList = pictureCover.getIndexesList();
             label_0051 :
                if (indexesList != null) {
                   VideoContext videoContext1 = tm.c.d1();
                   String str = PatchProxy.applyOneRefs(indexesList, tm, uoa, "13");
                   if (str != PatchProxyResult.class) {
                   }else if(indexesList.isEmpty()){
                      str = "";
                   }else {
                      int i2 = indexesList.size();
                      StringBuilder str1 = "";
                      i1 = 0;
                      while (i1 < i2) {
                         str1 = str1+indexesList.get(i1).intValue();
                         i = i2 - 1;
                         if (i1 != i) {
                            str1 = str1+"_";
                         }
                         i1 = i1 + 1;
                      }
                      str = str1;
                      a.o(str, "stringBuilder.toString\(\)");
                   }
                   videoContext1.C0(str);
                }
             }
          }
          indexesList = objArray;
          goto label_0051 ;
       }
       tm = this.m;
       ReorderViewModel td = this.d;
       ReorderViewModel te = this.e;
       List list = this.i.w0();
       Objects.requireNonNull(tm);
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(td, Boolean.valueOf(te), list, tm, a.class, "11")) {
          a.p(td, "firstEnterReorderAlbumIdList");
          a.p(list, "originPictureSizeList");
          e$o oo = new e$o();
          ArrayList uArrayList = tm.b();
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             uArrayList1.add(iterator.next().getAlbumId());
          }
          iterator = td.iterator();
          i = 0;
          while (iterator.hasNext()) {
             if (!uArrayList1.contains(iterator.next())) {
                i = i + 1;
             }
          }
          iterator = uArrayList1.iterator();
          i1 = 0;
          while (iterator.hasNext()) {
             if (!td.contains(iterator.next())) {
                i1 = i1 + 1;
             }
          }
          b = (i1)? true: false;
          oo.a = b;
          b = (i)? true: false;
          oo.b = b;
          oo.d = i;
          oo.c = i1;
          oo.e = te;
          VideoContext videoContext = tm.c.d1();
          a.o(videoContext, "workspaceDraft.videoContext");
          videoContext.F().d.G = oo;
          z.C(tm.c, list);
          objArray1 = new Object[0];
          a.D().w("ReorderAssetRepo", "savePhotoMeta addPictureNum:"+i1+", deletePictureNum:"+i, objArray1);
       }
       this.k.s0(ReorderViewModel$d.a);
       this.i.G0(true);
       a = b.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, b.class, "4")) {
          s.h("PICTURE_SORT_ENSURE");
       }
       PictureMemoryUtils d = PictureMemoryUtils.d;
       d.d().clear();
       d.d().addAll(this.i.r0());
       Object[] objArray2 = new Object[0];
       a.D().w("ReorderViewModel", "saveEditorChanges", objArray2);
       return;
    }
    public void z2(){
       x.c(this);
    }
}
