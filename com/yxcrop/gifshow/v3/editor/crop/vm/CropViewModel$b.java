package com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel$b;
import xsc.c;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xsc.b;
import faa.a;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Objects;
import qld.a;
import kotlin.jvm.internal.a;
import wba.z;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import kotlin.Pair;
import com.kuaishou.edit.draft.Asset;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import java.util.List;
import java.util.HashMap;
import lnc.k1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import nld.a;
import pld.b;
import java.lang.Integer;

public final class CropViewModel$b implements c	// class@000a21
{
    public final ArrayList a;
    public final CropViewModel b;

    public void CropViewModel$b(CropViewModel p0){
       this.b = p0;
       super();
       this.a = new ArrayList();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, CropViewModel$b.class, "2")) {
          return;
       }
       b.d(this);
       this.a.clear();
       Object[] objArray = new Object[0];
       a.D().w("CropViewModel", "onDiscard", objArray);
       return;
    }
    public void b(int p0,int p1){
       b.e(this, p0, p1);
    }
    public void c(){
       z a;
       int i1;
       String str = "3";
       if (PatchProxy.applyVoid(null, this, CropViewModel$b.class, str)) {
          return;
       }
       Iterator iterator = this.a.iterator();
       RuntimeException runtimeExcep = null;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          CropViewModel q = this.b.q;
          Objects.requireNonNull(q);
          if (PatchProxy.applyVoidOneRefs(str1, q, a.class, str)) {
             continue ;
          }else {
             a.p(str1, "deletedAssetIdentifier");
             a = z.a;
             Asset first = a.b(str1, q.f).getFirst();
             if (first == null) {
                i1.c(new RuntimeException("deleteRatioType deletedAssetIdentifier:"+str1));
             }else {
                Iterator iterator1 = a.d(first).iterator();
                while (iterator1.hasNext()) {
                   q.b.remove(iterator1.next());
                }
                Object[] objArray = new Object[runtimeExcep];
                a.D().w("CropAssetRepo", "deleteRatioType deletedAssetIdentifier:"+str1, objArray);
             }
          }
       }
       CropViewModel$b tb = this.b;
       tb.g = k1.b(tb.p0(runtimeExcep), "mEditorPictureList");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator2 = this.b.q.h().iterator();
       int i = 0;
       while (iterator2.hasNext()) {
          Object obj = iterator2.next();
          i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          uArrayList.add(this.b.o0(i, obj));
          i = i1;
       }
       this.b.y0(uArrayList);
       this.a.clear();
       Object[] objArray1 = new Object[runtimeExcep];
       a.D().w("CropViewModel", "onSave", objArray1);
       return;
    }
    public void d(int p0,int p1,ArrayList p2){
       b.a(this, p0, p1, p2);
    }
    public void e(int p0,int p1,String p2){
       if (PatchProxy.isSupport(CropViewModel$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, CropViewModel$b.class, "1")) {
          return;
       }
       a.p(p2, "deletedAssetIdentifier");
       this.a.add(p2);
       Object[] objArray = new Object[0];
       a.D().w("CropViewModel", "onDeleteAssetSegmentList", objArray);
       return;
    }
    public void onAttach(){
       b.b(this);
    }
}
