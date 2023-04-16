package com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import androidx.lifecycle.ViewModel;
import ltc.a;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import uld.g;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import di0.b;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel$mStickerElementUiDataList$1;
import msd.p;
import di0.b$a;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kuaishou.edit.draft.TimeRange;
import java.util.List;
import wba.h0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import itc.k3;
import java.lang.Integer;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.StringBuilder;
import java.lang.System;
import jw8.q;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import java.util.Objects;
import ktc.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.Sticker$Type;
import ktc.c;
import com.kuaishou.edit.draft.Sticker;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Number;
import nsd.u;

public final class StickerElementViewModel extends ViewModel	// class@00123b
{
    public g a;
    public float b;
    public float c;
    public float d;
    public float e;
    public Size f;
    public Size g;
    public Size h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final b o;
    public final a p;
    public final StickerElementViewModel$a q;

    public void StickerElementViewModel(a p0,StickerElementViewModel$a p1){
       a.p(p0, "mStickerRepo");
       a.p(p1, "layerIndexProvider");
       super();
       this.p = p0;
       this.q = p1;
       this.a = new g(true);
       this.b = 0x3f800000;
       this.c = 0x3f800000;
       this.d = 0x3f800000;
       this.e = 0x3f800000;
       this.i = new MutableLiveData(Boolean.FALSE);
       this.j = new MutableLiveData(new Object());
       this.o = b.a.a(p0.b, new StickerElementViewModel$mStickerElementUiDataList$1(this));
    }
    public static void t0(StickerElementViewModel p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 8;
       }
       p0.s0(p1);
       return;
    }
    public final void o0(StickerDetailInfo p0,TimeRange p1,List p2,h0 p3){
       int this;
       FeatureId uFeatureId;
       String str2;
       Size size;
       a obj3;
       StickerElementViewModel stickerEleme2;
       a uoa;
       StickerDetailInfo stickerDetai;
       Object obj = this;
       Object obj1 = p0;
       object oobject = p1;
       object oobject1 = p2;
       StickerElementViewModel stickerEleme = StickerElementViewModel.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, StickerElementViewModel.class, "5")) {
          return;
       }
       String str = PatchProxy.applyOneRefs(obj1, obj, stickerEleme, "8");
       String str1 = 6;
       StickerElementViewModel stickerEleme1 = 3;
       int i = 5;
       this = 1;
       if (str != patchProxyRe) {
       }else {
          StickerDetailInfo mStickerType1 = obj1.mStickerType;
          if (mStickerType1 != str1 && (mStickerType1 != stickerEleme1 && (mStickerType1 == i || mStickerType1 == this))) {
             str = "";
          }else {
             str = k3.t(obj1, obj.p.b());
             a.o(str, "getStickerFilePathFromSt¡­kerRepo.isPicturesType\(\)\)");
          }
       }
       StickerDetailInfo mStickerId = obj1.mStickerId;
       a.o(mStickerId, "stickerDetailInfo.mStickerId");
       StickerDetailInfo mStickerType = obj1.mStickerType;
       int i1 = -2;
       if (PatchProxy.isSupport(stickerEleme)) {
          a obj2 = PatchProxy.applyTwoRefs(mStickerId, Integer.valueOf(mStickerType), obj, stickerEleme, "7");
          if (obj2 != patchProxyRe) {
             uFeatureId = obj2;
          label_009e :
             int realStickerT = obj1.getRealStickerType((obj.p.b() ^ this));
             int i2 = 0;
             str2 = "6";
             i = -1;
             i1 = 2;
             if (PatchProxy.isSupport(stickerEleme)) {
                size = PatchProxy.applyTwoRefs(Integer.valueOf(realStickerT), obj1, obj, stickerEleme, str2);
                if (size != patchProxyRe) {
                }else {
                label_00c1 :
                   size = new Size(i, i);
                   if (realStickerT) {
                      if (realStickerT == i1) {
                         size = new Size(obj1.getResourceWidth(this), obj1.getResourceHeight(this));
                      }
                   }else {
                      size = new Size(obj1.getResourceWidth(i2), obj1.getResourceHeight(i2));
                   }
                }
             }else {
                goto label_00c1 ;
             }
             int i3 = (obj1.mStickerType == -2)? 1999: obj.q.a();
             stickerEleme = obj.p;
             h0 oh0 = p3.b(StickerTextValueType.Draft);
             Objects.requireNonNull(stickerEleme);
             obj2 = a.class;
             if (PatchProxy.isSupport(obj2)) {
                Object[] objArray = new Object[10];
                objArray[i2] = obj1;
                objArray[this] = oh0;
                objArray[2] = oobject;
                objArray[3] = Integer.valueOf(i3);
                objArray[4] = oobject1;
                objArray[5] = uFeatureId;
                objArray[6] = Integer.valueOf(realStickerT);
                objArray[7] = str;
                objArray[8] = size;
                objArray[9] = Integer.valueOf(4);
                if (PatchProxy.applyVoid(objArray, stickerEleme, obj2, "5")) {
                label_025f :
                   return;
                }
             }else {
                int i4 = -2;
             }
             a.p(obj1, "stickerDetailInfo");
             a.p(oh0, "draftCommonData");
             a.p(oobject, "timeRange");
             a.p(oobject1, "assetIdentifier");
             a.p(uFeatureId, "featureId");
             a.p(str, "previewImageFile");
             a.p(size, "assetSize");
             stickerEleme.f(this);
             if (PatchProxy.isSupport(obj2)) {
                Object[] objArray1 = new Object[9];
                objArray1[0] = obj1;
                objArray1[this] = oh0;
                objArray1[2] = oobject;
                objArray1[3] = Integer.valueOf(i3);
                objArray1[4] = oobject1;
                objArray1[5] = uFeatureId;
                objArray1[6] = Integer.valueOf(realStickerT);
                objArray1[7] = str;
                objArray1[8] = size;
                obj3 = PatchProxy.apply(objArray1, stickerEleme, obj2, str2);
                if (obj3 != patchProxyRe) {
                   stickerEleme2 = stickerEleme;
                   uoa = obj3;
                label_0253 :
                   b.r(stickerEleme2.b, uoa, 0, Integer.valueOf(4), 2, null);
                   goto label_025f ;
                }
             }else {
                Object obj4 = 2;
             }
             obj3 = stickerEleme.a;
             if (obj3 == null) {
                a.S("mStickerDraft");
             }
             GeneratedMessageLite$Builder uBuilder = obj3.b();
             a.o(uBuilder, "mStickerDraft.append\(\)");
             GeneratedMessageLite$Builder uBuilder1 = uBuilder.getResult().toBuilder();
             a.o(uBuilder1, "stickerBuilder.result.toBuilder\(\)");
             stickerEleme2 = stickerEleme;
             uBuilder.i(stickerEleme.g(uBuilder1, oh0, p1, i3, p2, str, size));
             uBuilder.f(uFeatureId);
             uBuilder.a();
             uBuilder.c();
             uBuilder.b();
             if (realStickerT != -2) {
                if (realStickerT != -1) {
                   if (realStickerT) {
                      if (realStickerT != 1) {
                         if (realStickerT == 2) {
                            uBuilder.j(Sticker$Type.DYNAMIC_STICKER);
                         }
                      }else {
                         uBuilder.j(Sticker$Type.NORMAL_STICKER);
                      }
                   }else {
                      uBuilder.j(Sticker$Type.NORMAL_STICKER);
                   }
                }else {
                   uBuilder.j(Sticker$Type.VOTE_STICKER);
                }
             }else {
                uBuilder.j(Sticker$Type.TAG_STICKER);
             }
             String str3 = q.b(uBuilder.getFeatureId());
             a.o(str3, "StickerIds.getStickerNam¡­stickerBuilder.featureId\)");
             String str4 = k3.s(p0);
             a.o(str4, "StickerUtils.getStickerF¡­ilInfo\(stickerDetailInfo\)");
             c uoc = new c(realStickerT, str3, str, obj1.mResourceUrls, obj1.mRelatedClientId, str4);
             GeneratedMessageLite generatedMes = uBuilder.build();
             a.o(generatedMes, "stickerBuilder.build\(\)");
             uoa = new a(generatedMes, uFeatureId);
             goto label_0253 ;
          }
       }
       if (mStickerType != i1) {
          if (mStickerType != this) {
             if (mStickerType != stickerEleme1) {
                if (mStickerType == i) {
                label_0093 :
                   stickerDetai = "TAG_STICKER";
                }
             }else {
                str2 = "sticker_vote_0";
             }
             stickerDetai = mStickerId;
          }else {
             stickerDetai = mStickerId+"-"+System.currentTimeMillis();
          }
       }else {
          goto label_0093 ;
       }
       uFeatureId = q.a(stickerDetai);
       a.o(uFeatureId, "StickerIds.getStickerFea¡­ickerName\(decorationName\)");
       goto label_009e ;
    }
    public final void p0(EditStickerBaseDrawer p0,int p1){
       int i1;
       StickerElementViewModel stickerEleme = StickerElementViewModel.class;
       if (PatchProxy.isSupport(stickerEleme) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, stickerEleme, "10")) {
          return;
       }
       a.p(p0, "editStickerBaseDrawer");
       Object[] objArray = new Object[0];
       a.D().w("StickerElementViewModel", "deleteSticker", objArray);
       String str = "9";
       if (!PatchProxy.applyVoidOneRefs(p0, this, stickerEleme, str)) {
          this.a.f(p0);
       }
       stickerEleme = this.p;
       int layerIndex = p0.getLayerIndex();
       Objects.requireNonNull(stickerEleme);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(layerIndex), Integer.valueOf(p1), stickerEleme, uoa, str)) {
          Object[] objArray1 = new Object[0];
          a.D().w("StickerElementRepo", "deleteStickerElement layerIndex:"+layerIndex, objArray1);
          stickerEleme.f(true);
          int i = stickerEleme.d(layerIndex);
          if (i < 0) {
             i1.c(new RuntimeException("deleteStickerElement error deleteDraftPosition"));
          }else {
             uoa = stickerEleme.a;
             if (uoa == null) {
                a.S("mStickerDraft");
             }
             uoa.V(i);
             i1 = stickerEleme.c(layerIndex);
             stickerEleme.b.w(i1, new Pair(Integer.valueOf(p1), Integer.valueOf(layerIndex)));
             Object[] objArray2 = new Object[0];
             a.D().w("StickerElementRepo", "deleteStickerElement deletePosition:"+i+", deleteDraftDataPosition:"+i1, objArray2);
          }
       }
       return;
    }
    public final MutableLiveData q0(){
       return this.i;
    }
    public final boolean r0(){
       return this.n;
    }
    public final void s0(int p0){
       a a;
       int i;
       Object obj = this;
       StickerElementViewModel stickerEleme = StickerElementViewModel.class;
       if (PatchProxy.isSupport(stickerEleme) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, stickerEleme, "18")) {
          return;
       }
       stickerEleme = obj.p;
       Integer integer = Integer.valueOf(p0);
       Objects.requireNonNull(stickerEleme);
       if (!PatchProxy.applyVoidOneRefs(integer, stickerEleme, a.class, "10")) {
          stickerEleme.f(true);
          ArrayList uArrayList = new ArrayList();
          a = stickerEleme.a;
          if (a == null) {
             a.S("mStickerDraft");
          }
          List list = a.z();
          a.o(list, "mStickerDraft.messages");
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Sticker sticker = iterator.next();
             DraftFileManager uDraftFileMa = DraftFileManager.E();
             a.o(sticker, "it");
             StickerResult result = sticker.getResult();
             String str = "it.result";
             a.o(result, str);
             String previewImage = result.getPreviewImageFile();
             a a1 = stickerEleme.a;
             if (a1 == null) {
                a.S("mStickerDraft");
             }
             File uFile = uDraftFileMa.B(previewImage, a1);
             if (uFile == null) {
                StickerResult result1 = sticker.getResult();
                a.o(result1, str);
                i1.c(new RuntimeException("reload filePath is null stickerResult path = "+result1.getPreviewImageFile()));
             }else {
                c obj1 = PatchProxy.applyOneRefs(sticker, stickerEleme, a.class, "16");
                if (obj1 != PatchProxyResult.class) {
                   i = obj1.intValue();
                }else if(k3.B(sticker)){
                   i = -1;
                }else if(k3.A(sticker)){
                   i = -2;
                }else if(k3.y(sticker)){
                   i = 2;
                }else {
                   i = 0;
                }
                String str1 = q.b(sticker.getFeatureId());
                a.o(str1, "StickerIds.getStickerNam¡­omFeatureId\(it.featureId\)");
                String absolutePath = uFile.getAbsolutePath();
                a.o(absolutePath, "filePath.absolutePath");
                obj1 = new c(i, str1, absolutePath, null, null, null, 56, null);
                uArrayList.add(new a(sticker, v15));
             }
          }
          stickerEleme.b.s(uArrayList, integer);
       }
       return;
    }
    public final void u0(boolean p0){
       this.l = p0;
    }
    public final void v0(boolean p0){
       this.k = p0;
    }
    public final void w0(){
       if (PatchProxy.applyVoid(null, this, StickerElementViewModel.class, "22")) {
          return;
       }
       this.j.setValue(new Object());
       return;
    }
}
