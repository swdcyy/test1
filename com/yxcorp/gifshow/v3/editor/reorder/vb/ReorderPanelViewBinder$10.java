package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$10;
import androidx.lifecycle.LifecycleEventObserver;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import swc.c;
import uwc.b;
import java.lang.StringBuilder;
import di0.b;
import zsc.b;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import atc.a;
import com.kuaishou.edit.draft.Asset;
import android.util.Pair;
import java.lang.Boolean;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import dtc.a;
import t36.f$a;
import t36.f;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import kotlin.jvm.internal.Ref$IntRef;
import lnc.r5;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import com.yxcorp.gifshow.model.MultiplePhotosProject$Type;
import com.yxcorp.gifshow.model.MultiplePhotosProject$b;
import com.yxcorp.gifshow.model.MultiplePhotosProject$a;
import java.util.Collection;
import pwc.a;
import swc.f;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import swc.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Asset$Type;
import wba.n0;
import swc.b;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.v3.constructor.i;
import java.lang.Integer;
import dtc.b;
import dtc.c;
import com.kuaishou.edit.draft.Workspace$Type;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.recyclerview.widget.RecyclerView;

public final class ReorderPanelViewBinder$10 implements LifecycleEventObserver	// class@0011ad
{
    public final ReorderPanelViewBinder b;

    public void ReorderPanelViewBinder$10(ReorderPanelViewBinder p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       int b;
       String str2;
       String identifier;
       Pair pair;
       Pair first;
       Iterator iterator1;
       int b1;
       String identifier1;
       String obj3;
       ReorderViewModel reorderViewM1;
       String str4;
       int i1;
       int i2;
       String identifier2;
       Object[] objArray1;
       ListHolder value;
       List list;
       Iterator iterator2;
       int i3;
       int b2;
       ArrayList uArrayList3;
       String str6;
       String str7;
       PatchProxyResult patchProxyRe1;
       ArrayList uArrayList5;
       String str8;
       MultiplePhotosProject multiplePhot1;
       String str9;
       String str10;
       ArrayList uArrayList7;
       String str11;
       Iterator iterator7;
       c uoc1;
       Object[] objArray2;
       ReorderViewModel i6;
       Object[] obj5;
       int b3;
       ReorderPanelViewBinder$10 obj = this;
       ReorderPanelViewBinder$10 obj1 = p0;
       Object[] obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, ReorderPanelViewBinder$10.class, "1")) {
          return;
       }
       a.p(obj1, "source");
       a.p(obj2, "event");
       obj1 = obj.b;
       int i = 0;
       if (obj1.m == null) {
          obj2 = new Object[i];
          a.D().w("ReorderPanelViewBinder", "onStateChanged panel not valid", obj2);
          return;
       }else if(obj2 == Lifecycle$Event.ON_RESUME){
          ReorderPanelViewBinder n = obj1.n;
          if (n != null) {
             ReorderPanelViewBinder q = obj1.q;
             Objects.requireNonNull(q);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             ReorderViewModel reorderViewM = ReorderViewModel.class;
             c uoc = c.class;
             b uob = b.class;
             String str = "4";
             b = true;
             if (!PatchProxy.applyVoidOneRefs(n, q, reorderViewM, str)) {
                Object[] objArray = new Object[i];
                String str1 = "ReorderViewModel";
                a.D().w(str1, "> onAdd\("+n+')', objArray);
                if (n != null) {
                   b uob1 = q.f.u(q.o0());
                   if (uob1 != null) {
                      str2 = uob1.b();
                      if (str2 != null) {
                      label_008a :
                         ArrayList uArrayList = j0.e(n, "album_data_list");
                         if (uArrayList != null) {
                            if (j0.a(n, "album", i)) {
                               q.e = b;
                            }
                            ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
                            Iterator iterator = uArrayList.iterator();
                            while (iterator.hasNext()) {
                               uArrayList1.add(iterator.next().path);
                            }
                            iterator = q.m.b().iterator();
                            while (iterator.hasNext()) {
                               Asset uAsset = iterator.next();
                               if (!uArrayList1.contains(uAsset.getAlbumId())) {
                                  identifier = uAsset.getIdentifier();
                                  String str3 = "asset.identifier";
                                  a.o(identifier, str3);
                                  pair = q.i.E0(identifier);
                                  if (q.g == null) {
                                     first = pair.first;
                                     iterator1 = iterator;
                                     a.o(first, "deleteResult.first");
                                     if (!first.booleanValue()) {
                                        b1 = false;
                                     label_0109 :
                                        q.g = b1;
                                        identifier1 = uAsset.getIdentifier();
                                        a.o(identifier1, str3);
                                        obj3 = PatchProxy.applyOneRefs(identifier1, q, reorderViewM, "6");
                                        if (obj3 != patchProxyRe) {
                                           reorderViewM1 = reorderViewM;
                                           str4 = str2;
                                           i1 = obj3.intValue();
                                        }else {
                                           reorderViewM1 = reorderViewM;
                                           str4 = str2;
                                           objArray1 = new Object[0];
                                           a.D().w(str1, "getIndexFromIdentifier assetIdentifier:"+identifier1, objArray1);
                                           value = q.f.getValue();
                                           if (value != null) {
                                              list = value.c();
                                              if (list != null) {
                                                 iterator2 = list.iterator();
                                                 i3 = -1;
                                                 while (true) {
                                                    if (iterator2.hasNext()) {
                                                       i3 = i3 + 1;
                                                       if (a.g(iterator2.next().b(), identifier1)) {
                                                          i1 = i3;
                                                       }
                                                    }
                                                 }
                                              }
                                           }
                                           i2 = -1;
                                        label_017b :
                                           if (i2 >= 0) {
                                              q.k.s0(new a(pair, i2, uAsset));
                                              identifier2 = uAsset.getIdentifier();
                                              a.o(identifier2, str3);
                                              q.m.a(identifier2);
                                           }else {
                                              i1.c(new RuntimeException("onAdd error deleteIndex out of boundary "+"deleteIndex:"+i2));
                                           }
                                        }
                                        i2 = i1;
                                        goto label_017b ;
                                     }
                                  }else {
                                     iterator1 = iterator;
                                  }
                                  b1 = true;
                                  goto label_0109 ;
                               }else {
                                  reorderViewM1 = reorderViewM;
                                  str4 = str2;
                                  iterator1 = iterator;
                               }
                               iterator = iterator1;
                               reorderViewM = reorderViewM1;
                               str2 = str4;
                               obj3 = 10;
                            }
                            reorderViewM1 = reorderViewM;
                            str4 = str2;
                            ArrayList uArrayList2 = new ArrayList();
                            Iterator iterator3 = uArrayList1.iterator();
                            str2 = "DraftGetUtils.getAssetDr¡­\(workspaceDraft\).messages";
                            identifier = "it";
                            while (iterator3.hasNext()) {
                               identifier2 = iterator3.next();
                               ReorderViewModel m = q.m;
                               a.o(identifier2, identifier);
                               Objects.requireNonNull(m);
                               List obj4 = PatchProxy.applyOneRefs(identifier2, m, a.class, "7");
                               if (obj4 != patchProxyRe) {
                                  b2 = obj4.booleanValue();
                               }else {
                                  a.p(identifier2, "albumId");
                                  obj4 = a.c(m.c).z();
                                  a.o(obj4, str2);
                                  Iterator iterator4 = obj4.iterator();
                                  while (true) {
                                     if (iterator4.hasNext()) {
                                        Asset uAsset1 = iterator4.next();
                                        a.o(uAsset1, "asset");
                                        if (a.g(uAsset1.getAlbumId(), identifier2)) {
                                           b2 = true;
                                        }
                                     }else {
                                        b2 = false;
                                     }
                                  }
                               }
                               if (!b2) {
                                  uArrayList2.add(identifier2);
                               }else {
                                  continue ;
                               }
                            }
                            Ref$IntRef intRef = new Ref$IntRef();
                            intRef.element = 0;
                            identifier1 = "5";
                            String str5 = "EditPicturesRepo";
                            obj3 = "EditPicturesViewModel";
                            if (uArrayList2.isEmpty() ^ 1) {
                               uArrayList3 = new ArrayList();
                               str6 = str1;
                               str7 = str2;
                               MultiplePhotosProject multiplePhot = r5.b().d(j0.f(n, "PHOTOS_CROP_WORK_ID_ONCE_DATA_HUB"));
                               if (multiplePhot != null) {
                                  MultiplePhotosProject$b uob2 = multiplePhot.g(MultiplePhotosProject$Type.ATLAS);
                                  if (uob2 != null) {
                                     uob2 = uob2.mPictures;
                                     if (uob2 != null) {
                                        patchProxyRe1 = patchProxyRe;
                                        ArrayList uArrayList4 = new ArrayList(u.Y(uob2, 10));
                                        Iterator iterator5 = uob2.iterator();
                                        while (iterator5.hasNext()) {
                                           MultiplePhotosProject$a uoa = iterator5.next();
                                           a.o(uoa, identifier);
                                           uArrayList4.add(uoa.a());
                                        }
                                        iterator5 = uArrayList4.iterator();
                                        while (iterator5.hasNext()) {
                                           str2 = iterator5.next();
                                           if (uArrayList2.contains(str2)) {
                                              uArrayList3.add(str2);
                                           }
                                        }
                                        uArrayList5 = new ArrayList(uArrayList2);
                                        uArrayList5.removeAll(uArrayList3);
                                        ArrayList uArrayList6 = new ArrayList();
                                        uArrayList4 = new ArrayList();
                                        str8 = identifier;
                                        uArrayList6.addAll(a.a.i(uArrayList5));
                                        uArrayList4.addAll(uArrayList6);
                                        if (multiplePhot != null) {
                                           a.b(uArrayList6, uArrayList4, multiplePhot);
                                        }
                                        ReorderViewModel i4 = q.i;
                                        pair = new Pair(uArrayList6, uArrayList4);
                                        Objects.requireNonNull(i4);
                                        if (PatchProxy.applyVoidOneRefs(pair, i4, uob, "19")) {
                                           multiplePhot1 = multiplePhot;
                                           str9 = str;
                                           str10 = identifier1;
                                           uArrayList7 = uArrayList1;
                                        }else {
                                           str2 = "sizeList";
                                           a.p(pair, str2);
                                           uArrayList7 = uArrayList1;
                                           str10 = identifier1;
                                           identifier1 = "> appendPictureSize\(";
                                           multiplePhot1 = multiplePhot;
                                           str9 = str;
                                           Object[] objArray4 = new Object[0];
                                           a.D().w(obj3, identifier1+pair+')', objArray4);
                                           uoc1 = i4.x0();
                                           Objects.requireNonNull(uoc1);
                                           str = "appendPictureSize size:";
                                           if (PatchProxy.applyVoidOneRefs(pair, uoc1, uoc, "3")) {
                                              b2 = 0;
                                           }else {
                                              a.p(pair, str2);
                                              objArray = new Object[0];
                                              a.D().w(str5, identifier1+pair+')', objArray);
                                              Pair first2 = pair.first;
                                              a.o(first2, "sizeList.first");
                                              uoc1.d().addAll(first2);
                                              Pair second = pair.second;
                                              a.o(second, "sizeList.second");
                                              uoc1.h().addAll(second);
                                              b2 = 0;
                                              objArray2 = new Object[b2];
                                              a.D().w(str5, str+pair, objArray2);
                                           }
                                           objArray4 = new Object[b2];
                                           a.D().w(obj3, str+pair, objArray4);
                                        }
                                        intRef.element = q.m.c();
                                        Iterator iterator6 = uArrayList2.iterator();
                                        while (iterator6.hasNext()) {
                                           str11 = iterator6.next();
                                           if (!uArrayList3.contains(str11)) {
                                              ReorderViewModel i5 = q.i;
                                              Objects.requireNonNull(i5);
                                              if (!PatchProxy.applyVoidOneRefs(str11, i5, uob, "20")) {
                                                 str2 = "path";
                                                 a.p(str11, str2);
                                                 String str12 = "> appendAsset\(";
                                                 iterator7 = iterator6;
                                                 obj2 = new Object[0];
                                                 a.D().w(obj3, str12+str11+')', obj2);
                                                 uoc1 = i5.x0();
                                                 Objects.requireNonNull(uoc1);
                                                 str = str9;
                                                 if (PatchProxy.applyVoidOneRefs(str11, uoc1, uoc, str)) {
                                                    b = 0;
                                                 }else {
                                                    a.p(str11, str2);
                                                    objArray = new Object[0];
                                                    a.D().w(str5, str12+str11+')', objArray);
                                                    uoc1.x();
                                                    Asset$b uob3 = a.c(uoc1.q()).b();
                                                    uob3.w(Asset$Type.PICTURE);
                                                    uob3.d(str11);
                                                    uob3.m(n0.e(str11));
                                                    uob3.k(a.c(uoc1.q()).Q(str11));
                                                    c.a(new b(str11));
                                                    b = 0;
                                                    objArray2 = new Object[b];
                                                    a.D().w(str5, "appendAsset path:"+str11, objArray2);
                                                 }
                                                 objArray1 = new Object[b];
                                                 a.D().w(obj3, "addAsset path:"+str11, objArray1);
                                              label_04a6 :
                                                 str9 = str;
                                                 iterator6 = iterator7;
                                              }
                                           }
                                           iterator7 = iterator6;
                                           str = str9;
                                           goto label_04a6 ;
                                        }
                                        if (multiplePhot1 != null) {
                                           i6 = q.i;
                                           Objects.requireNonNull(i6);
                                           MultiplePhotosProject multiplePhot2 = multiplePhot1;
                                           if (!PatchProxy.applyVoidOneRefs(multiplePhot2, i6, uob, "21")) {
                                              str11 = "project";
                                              a.p(multiplePhot2, str11);
                                              b = 0;
                                              objArray2 = new Object[b];
                                              a.D().w(obj3, "> appendAllAsset\("+multiplePhot2+')', objArray2);
                                              uoc1 = i6.x0();
                                              Objects.requireNonNull(uoc1);
                                              str = str10;
                                              if (!PatchProxy.applyVoidOneRefs(multiplePhot2, uoc1, uoc, str)) {
                                                 a.p(multiplePhot2, str11);
                                                 objArray1 = new Object[b];
                                                 a.D().w(str5, "> appendAllAsset\(_\)", objArray1);
                                                 uoc1.x();
                                                 i.a(a.c(uoc1.q()), multiplePhot2);
                                                 obj5 = new Object[b];
                                                 a.D().w(str5, "addAll", obj5);
                                              }
                                              obj5 = new Object[b];
                                              a.D().w(obj3, "appendAllAsset", obj5);
                                           }
                                        }
                                        str = str10;
                                     }
                                  }
                               }
                               patchProxyRe1 = patchProxyRe;
                               goto label_02b8 ;
                            }else {
                               patchProxyRe1 = patchProxyRe;
                               str7 = str2;
                               str8 = identifier;
                               str = identifier1;
                               uArrayList7 = uArrayList1;
                               str6 = str1;
                            }
                            i6 = q.i;
                            Objects.requireNonNull(i6);
                            uArrayList3 = uArrayList7;
                            obj5 = PatchProxy.applyOneRefs(uArrayList3, i6, uob, "22");
                            PatchProxyResult patchProxyRe2 = patchProxyRe1;
                            if (obj5 != patchProxyRe2) {
                            }else {
                               str11 = "albumIdList";
                               a.p(uArrayList3, str11);
                               identifier1 = "> reorderAssetWithAlbumIdList\(";
                               Object[] objArray3 = new Object[0];
                               a.D().w(obj3, identifier1+uArrayList3+')', objArray3);
                               uoc1 = i6.x0();
                               Objects.requireNonNull(uoc1);
                               List obj7 = PatchProxy.applyOneRefs(uArrayList3, uoc1, uoc, "11");
                               if (obj7 != patchProxyRe2) {
                                  obj5 = obj7;
                               }else {
                                  a.p(uArrayList3, str11);
                                  objArray1 = new Object[0];
                                  a.D().w(str5, identifier1+uArrayList3+')', objArray1);
                                  uoc1.x();
                                  uArrayList5 = new ArrayList();
                                  obj7 = a.c(uoc1.q()).z();
                                  a.o(obj7, str7);
                                  Iterator iterator8 = obj7.iterator();
                                  while (iterator8.hasNext()) {
                                     Asset uAsset2 = iterator8.next();
                                     a.o(uAsset2, str8);
                                     uArrayList5.add(Integer.valueOf(uArrayList3.indexOf(uAsset2.getAlbumId())));
                                  }
                                  uArrayList3 = new ArrayList(uArrayList5);
                                  int i8 = uArrayList5.size();
                                  int i9 = 0;
                                  b2 = false;
                                  while (i9 < i8) {
                                     b = uArrayList5.size() - i9;
                                     b = b - 1;
                                     b1 = 0;
                                     while (b1 < b) {
                                        int i10 = b1 + 1;
                                        Object obj8 = uArrayList5.get(i10);
                                        a.o(obj8, "reorderedIndexList[j + 1]");
                                        if (a.t(uArrayList5.get(b1).intValue(), obj8.intValue()) > 0) {
                                           Object obj9 = uArrayList5.get(b1);
                                           a.o(obj9, "reorderedIndexList[j]");
                                           uArrayList5.set(b1, uArrayList5.get(i10));
                                           uArrayList5.set(i10, Integer.valueOf(obj9.intValue()));
                                           b2 = (uoc1.C(b1, i10, false, false) || b2)? true: false;
                                        }
                                     label_0647 :
                                        b1 = i10;
                                     }
                                     i9 = i9 + 1;
                                  }
                                  obj5 = new Pair(Boolean.valueOf(b2), uArrayList3);
                               }
                            }
                            if (q.g == null) {
                               Pair first1 = obj5.first;
                               a.o(first1, "reorderResult.first");
                               if (!first1.booleanValue()) {
                                  b3 = false;
                               label_066c :
                                  q.g = b3;
                                  first1 = obj5.second;
                                  if (uArrayList2.isEmpty()) {
                                     q.k.s0(new b(first1));
                                  }else {
                                     q.k.s0(new c(q, intRef, uArrayList2, first1));
                                  }
                                  q.i.U0(Workspace$Type.ATLAS, 3);
                                  q.m.d();
                                  str2 = str4;
                                  if (!PatchProxy.applyVoidOneRefs(str2, q, reorderViewM1, str)) {
                                     value = q.f.getValue();
                                     if (value != null) {
                                        list = value.c();
                                        if (list != null) {
                                           iterator2 = list.iterator();
                                           b3 = 0;
                                           int i7 = 0;
                                           while (iterator2.hasNext()) {
                                              Object obj6 = iterator2.next();
                                              i3 = i7 + 1;
                                              if (i7 < 0) {
                                                 CollectionsKt__CollectionsKt.W();
                                              }
                                              if (a.g(obj6.b(), str2)) {
                                                 b3 = i7;
                                              }
                                              i7 = i3;
                                           }
                                           q.n(b3);
                                        }
                                     }
                                     b3 = 0;
                                     goto label_06dc ;
                                  }
                                  obj2 = new Object[0];
                                  a.D().w(str6, "onAdd", obj2);
                               }
                            }
                            b3 = true;
                            goto label_066c ;
                         }
                      }
                   }
                   str2 = "";
                   goto label_008a ;
                }
             }
             obj = this;
             obj1 = obj.b;
             obj1.n = null;
             obj1.c.invalidateItemDecorations();
             obj1 = obj.b;
             obj1.k = 0;
             obj1.D((obj1.q.q0().v() - 1));
          }
       }
       return;
    }
}
