package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$b;
import xsc.c;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sqc.c;
import faa.a;
import q87.c;
import java.lang.Integer;
import java.lang.StringBuilder;
import xsc.b;
import java.util.Objects;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.EnhanceColorFilterResult;
import java.util.ArrayList;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collection;
import java.lang.Number;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.util.PostUtils;
import crd.a;

public final class EnhanceFilterViewModel$b implements c	// class@000f75
{
    public final EnhanceFilterViewModel a;

    public void EnhanceFilterViewModel$b(EnhanceFilterViewModel p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, EnhanceFilterViewModel$b.class, "6")) {
          return;
       }
       EnhanceFilterViewModel$b ta = this.a;
       ta.g = false;
       ta.l.e(false);
       this.a.t0();
       Object[] objArray = new Object[false];
       a.D().w("EnhanceFilterViewModel", "onDiscard", objArray);
       return;
    }
    public void b(int p0,int p1){
       EnhanceFilterViewModel$b uob = EnhanceFilterViewModel$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       this.a.l.l(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("EnhanceFilterViewModel", "onExchangeAssetSegment startIndex:"+p0+", endIndex:"+p1, objArray);
       return;
    }
    public void c(){
       boolean b;
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EnhanceFilterViewModel$b.class, "5")) {
          return;
       }
       b.f(this);
       EnhanceFilterViewModel$b ta = this.a;
       b = false;
       ta.g = b;
       boolean b1 = true;
       ta.l.e(b1);
       this.a.t0();
       ta = this.a;
       EnhanceFilterViewModel l = ta.l;
       boolean b2 = ta.p0();
       Objects.requireNonNull(l);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b2), l, uoc, "23")) {
          if (b2) {
             List list = l.e.z();
             a.o(list, "mEnhanceColorFilterResultDraft.messages");
             Iterator iterator = list.iterator();
             i = 0;
             while (iterator.hasNext()) {
                l.q(iterator.next(), i, b1);
                i = i + b1;
             }
          }else if(l.j()){
             b1 = l.f();
          }
          for (i = 0; i < b1; i = i + 1) {
             l.q(objArray, i, b);
          }
          Object[] objArray1 = new Object[b];
          a.D().w("EnhanceFilterRepo", "saveAllUseEnhancePhotoMeta isOpen:"+b2, objArray1);
       }
       objArray = new Object[b];
       a.D().w("EnhanceFilterViewModel", "onSave", objArray);
       return;
    }
    public void d(int p0,int p1,ArrayList p2){
       Object[] objArray1;
       int this;
       c uoc = c.class;
       if (PatchProxy.isSupport(EnhanceFilterViewModel$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, EnhanceFilterViewModel$b.class, "2")) {
          return;
       }
       String str = "originAssetIndexList";
       a.p(p2, str);
       int i = 0;
       while (i < p1) {
          EnhanceFilterViewModel l = this.a.l;
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoid(null, l, uoc, "10")) {
             l.e.b();
             Object[] objArray = new Object[0];
             a.D().w("EnhanceFilterRepo", "addEnhanceColorFilterResult", objArray);
          }
          i = i + 1;
       }
       if (this.a.p0()) {
          this.a.l.o(true, true, 0);
       }
       EnhanceFilterViewModel l1 = this.a.l;
       Objects.requireNonNull(l1);
       if (!PatchProxy.applyVoidOneRefs(p2, l1, uoc, "11")) {
          a.p(p2, str);
          str = p2.size();
          int i1 = 0;
          while (i1 < str) {
             int i2 = p2.size() - i1;
             i2 = i2 - 1;
             this = 0;
             while (this < i2) {
                int i3 = this + 1;
                Object obj = p2.get(i3);
                a.o(obj, "originAssetIndexList[j + 1]");
                if (a.t(p2.get(this).intValue(), obj.intValue()) > 0) {
                   Object obj1 = p2.get(this);
                   a.o(obj1, "originAssetIndexList[j]");
                   p2.set(this, p2.get(i3));
                   p2.set(i3, Integer.valueOf(obj1.intValue()));
                   l1.l(this, i3);
                }
                this = i3;
             }
             i1 = i1 + 1;
          }
          objArray1 = new Object[0];
          a.D().w("EnhanceFilterRepo", "reorderAssetWithAlbumIdList", objArray1);
       }
       objArray1 = new Object[0];
       a.D().w("EnhanceFilterViewModel", "onAddAssetSegmentList isOpen\(\):"+this.a.p0()+", addedAssetSize:"+p1, objArray1);
       return;
    }
    public void e(int p0,int p1,String p2){
       Object[] objArray1;
       if (PatchProxy.isSupport(EnhanceFilterViewModel$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, EnhanceFilterViewModel$b.class, "3")) {
          return;
       }
       a.p(p2, "deletedAssetIdentifier");
       EnhanceFilterViewModel l = this.a.l;
       Objects.requireNonNull(l);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), l, uoc, "12")) {
          String str = "EnhanceFilterRepo";
          if (l.e.z().size() <= p1) {
             i1.c(new RuntimeException("deleteEnhanceColorFilterAndResult out of boundary"));
             objArray1 = new Object[0];
             a.D().w(str, "deleteEnhanceColorFilterAndResult startDeleteIndex:"+p1, objArray1);
          }else {
             l.e.V(p1);
             if (!l.f.E()) {
                if (p1 >= l.f.p()) {
                   PostUtils.F(str, "delete EnhanceFilter error");
                }else {
                   l.f.V(p1);
                }
             }
             objArray1 = new Object[0];
             a.D().w(str, "deleteEnhanceColorFilterResultList startDeleteIndex:"+p1, objArray1);
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EnhanceFilterViewModel", "onDeleteAssetSegmentList deleteIndex:"+p1, objArray);
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, EnhanceFilterViewModel$b.class, "1")) {
          return;
       }
       b.b(this);
       EnhanceFilterViewModel$b ta = this.a;
       ta.g = true;
       ta.e = false;
       ta.a.dispose();
       this.a.a.d();
       this.a.l.s();
       return;
    }
}
