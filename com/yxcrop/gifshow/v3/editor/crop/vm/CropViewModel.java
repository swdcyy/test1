package com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel;
import voc.y;
import androidx.lifecycle.ViewModel;
import uwc.b;
import t36.f;
import qld.a;
import k2b.e0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.HashMap;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel$a;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel$b;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel$mOpenPanelFinished$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.Pair;
import pld.b;
import pld.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import rld.b;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import lnc.d1$a;
import rld.e;
import rwc.i;
import voc.t;
import android.util.LruCache;
import lnc.d1;
import t45.d;
import brd.z;
import qld.g;
import erd.a;
import qld.h;
import java.util.List;
import erd.g;
import voc.x;
import nld.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import pld.a$a;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Transform;
import android.graphics.RectF;
import com.yxcrop.gifshow.v3.editor.crop.data.ratio.CropRatioType;
import di0.b;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.kuaishou.kotlin.livedata.ListHolder;
import trd.u;
import com.kuaishou.edit.draft.AssetSegment;
import vba.g;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import rwc.a;
import android.graphics.Bitmap;
import vba.e;
import vba.d;
import java.util.Collection;
import rld.d;
import tkd.b;
import tkd.d;
import pca.c0;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import java.lang.RuntimeException;
import k2b.s;
import java.lang.Number;
import tld.a;
import java.lang.Enum;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Throwable;
import lnc.i1;
import com.yxcrop.gifshow.v3.editor.crop.data.ui.CropAction;
import wba.z;
import qr4.e$g;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.e$h;
import kotlin.collections.CollectionsKt__CollectionsKt;
import w46.b;
import java.util.Arrays;
import java.util.Set;
import java.util.Map$Entry;
import java.util.Map;
import nld.b;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.PictureCoverParam;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel$c;
import t36.f$a;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel$d;

public final class CropViewModel extends ViewModel implements y	// class@000a25
{
    public MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final ArrayList e;
    public final ArrayList f;
    public List g;
    public final HashMap h;
    public int i;
    public boolean j;
    public boolean k;
    public final Observer l;
    public final CropViewModel$b m;
    public final p n;
    public final b o;
    public final f p;
    public final a q;
    public final f r;
    public final e0 s;

    public void CropViewModel(b p0,f p1,a p2,f p3,e0 p4){
       a.p(p0, "editPicturesViewModel");
       a.p(p1, "pictureReorderListeners");
       a.p(p2, "cropAssetRepo");
       a.p(p3, "cropActionListeners");
       a.p(p4, "previewFragment");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
       this.e = new ArrayList();
       this.f = new ArrayList();
       this.h = new HashMap();
       this.i = -1;
       CropViewModel$a uoa = new CropViewModel$a(this);
       this.l = uoa;
       this.m = new CropViewModel$b(this);
       this.n = s.c(new CropViewModel$mOpenPanelFinished$2(this));
       p2.f().observeForever(uoa);
    }
    public static void A0(CropViewModel p0,boolean p1,int p2,Object p3){
       b a;
       boolean b;
       int i = 1;
       if (p2 & i) {
          p1 = true;
       }
       Objects.requireNonNull(p0);
       CropViewModel uCropViewMod = CropViewModel.class;
       if (!PatchProxy.isSupport(uCropViewMod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), p0, uCropViewMod, "14")) {
          Pair value = p0.c.getValue();
          if (value != null) {
             int i1 = value.getFirst().a().e() ^ i;
             Object[] objArray = new Object[0];
             a.D().w("CropViewModel", "showResetButton:"+p0.i+'-'+value.getFirst().a()+'-'+i1, objArray);
             value = p0.d.getValue();
             if (value == null || (value.getFirst().booleanValue() != i && i1)) {
                a = b.a;
                i = p0.i;
                b = p0.t0();
                Objects.requireNonNull(a);
                b uob = b.class;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Boolean.valueOf(b), a, uob, "3")) {
                   u1.u0(6, a.a("RESET_CROP", i, b), null);
                }
             }
             p0.d.setValue(new Pair(Boolean.valueOf(i1), Boolean.valueOf(p1)));
          }
       }
       return;
    }
    public final a0 C0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.apply(null, this, CropViewModel.class, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.e.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          obj.add(e.a(iterator.next(), i1));
          i1 = i1 + 1;
       }
       String str = this.e.get(this.i).b().g();
       t ot = t.a();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidOneRefs(str, ot, t.class, "5")) {
          ot.a.remove(str);
       }
       CropViewModel tq = this.q;
       Objects.requireNonNull(tq);
       a0 uoa0 = PatchProxy.applyOneRefs(obj, tq, a.class, "15");
       if (uoa0 != patchProxyRe) {
       }else {
          a.p(obj, "cropImageDataList");
          Object[] objArray = new Object[i];
          a.D().w("CropAssetRepo", "waitAllTaskComplete", objArray);
          uoa0 = tq.a.h().G(d.a).m(new g(tq)).r(new h(tq, obj));
          a.o(uoa0, "mCropTaskManager.waitAll¡­e doOnSuccess\"\)\n        }");
       }
       return uoa0;
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
    public final b o0(int p0,a p1){
       i obj2;
       Object obj = this;
       int i = p0;
       Object obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CropViewModel uCropViewMod = CropViewModel.class;
       if (PatchProxy.isSupport(uCropViewMod)) {
          obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), obj1, obj, uCropViewMod, "32");
          if (obj2 != patchProxyRe) {
             return obj2;
          }
       }
       uCropViewMod = obj.g;
       if (uCropViewMod == null) {
          a.S("mEditorPictureList");
       }
       obj2 = uCropViewMod.get(i);
       a$a g = a.g;
       Size size = obj2.i();
       Objects.requireNonNull(g);
       a uoa = PatchProxy.applyTwoRefs(obj1, size, g, a$a.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          a.p(obj1, "cropDraftData");
          a.p(size, "originImageSize");
          double d = (double)360.00f;
          Transform transform = p1.a().getTransform();
          String str = "cropDraftData.cropOptions.transform";
          a.o(transform, str);
          double d1 = (d - transform.getRotate()) % d;
          Size b = (!p1.a().getWidth())? size.b: p1.a().getWidth();
          Size c = (!p1.a().getHeight())? size.c: p1.a().getHeight();
          Transform transform1 = p1.a().getTransform();
          a.o(transform1, str);
          Transform transform2 = p1.a().getTransform();
          a.o(transform2, str);
          Transform transform3 = p1.a().getTransform();
          a.o(transform3, str);
          Transform transform4 = p1.a().getTransform();
          a.o(transform4, str);
          a uoa1 = new a((float)d1, 0xbf800000, new RectF((float)transform1.getPositionX(), (float)transform2.getPositionY(), (float)(transform3.getPositionX() + (((double)b * 0x3ff0000000000000) / (double)size.b)), (float)(transform4.getPositionY() + (((double)c * 0x3ff0000000000000) / (double)size.c))), obj1.c, obj1.d);
       }
       uoa.f(obj.s0(i, uoa.b()));
       return new b(uoa, obj2);
    }
    public void o4(){
       x.h(this);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, CropViewModel.class, "36")) {
          return;
       }
       super.onCleared();
       this.q.f().removeObserver(this.l);
       return;
    }
    public void onRestart(){
       x.i(this);
    }
    public final List p0(boolean p0){
       ArrayList obj1;
       List list1;
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1;
       int len;
       int i;
       double d;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CropViewModel uCropViewMod = CropViewModel.class;
       if (PatchProxy.isSupport(uCropViewMod)) {
          obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, uCropViewMod, "5");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = new ArrayList();
       ListHolder value = obj.o.v0().getValue();
       List list = (value != null)? value.c(): null;
       if (list != null) {
          if (p0) {
             ListHolder value1 = obj.o.v0().getValue();
             if (value1 != null) {
                list1 = value1.c();
                if (list1 == null) {
                }
             }else {
             }
          }else {
             list1 = obj.o.J0(0);
          }
          ArrayList uArrayList = new ArrayList(u.Y(list1, 10));
          Iterator iterator = list1.iterator();
          while (iterator.hasNext()) {
             i oi = i.a(iterator.next(), null, null, null, null, false, false, null, 0, null, 511, null);
             oi.k(e.a());
             oi.f().n(e.a());
             uArrayList.add(oi);
          }
          obj1.addAll(uArrayList);
          if (d.a.b()) {
             iterator = obj1.iterator();
             while (iterator.hasNext()) {
                i oi1 = iterator.next();
                AssetSegment uAssetSegmen = oi1.c();
                EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = PatchProxy.applyOneRefs(uAssetSegmen, obj, uCropViewMod, "35");
                if (uAnimatedSub != patchProxyRe) {
                }else {
                   len = 0x11255bab;
                   b uob = d.a(len);
                   a.o(uob, "PluginManager.get\(EncodeExtPlugin::class.java\)");
                   if (uob.isAvailable()) {
                      uAnimatedSub1 = d.a(len).z4(obj.q.d(uAssetSegmen));
                      a.o(uAnimatedSub1, "PluginManager.get\(Encode¡­ForPicture\(assetSegment\)\)");
                   }else {
                      uAnimatedSub1 = obj.q.d(uAssetSegmen);
                   }
                   uAnimatedSub = uAnimatedSub1;
                }
                oi1.k(uAnimatedSub);
                uAnimatedSub1 = oi1.b();
                len = uAnimatedSub1.length;
                for (i = 0; i < len; i = i + 1) {
                   object oobject = uAnimatedSub1[i];
                   CropOptions cropOptions = oi1.c().getCropOptions();
                   a.o(cropOptions, "it.assetSegment.cropOptions");
                   Transform transform = cropOptions.getTransform();
                   a.o(transform, "it.assetSegment.cropOptions.transform");
                   d = oobject.keyFrames(0).assetTransform().rotate() + transform.getRotate();
                   oobject.keyFrames(0).assetTransform().setRotate(d);
                   d.m(oi1.c(), oobject.keyFrames(0).assetTransform(), oi1.d(), oi1.i());
                }
                oi1.f().n(oi1.b());
             }
          }
          return obj1;
       }else {
          throw new RuntimeException("mEditorPictureList is null");
       }
    }
    public final MutableLiveData q0(){
       return this.c;
    }
    public final int r0(){
       return this.i;
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, CropViewModel.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CropViewModel", "discardEditChanges", objArray);
       this.j = false;
       this.q.c(0);
       s.h("CANCEL_CROP");
       return;
    }
    public final float s0(int p0,CropRatioType p1){
       float ratio;
       CropViewModel uCropViewMod = CropViewModel.class;
       if (PatchProxy.isSupport(uCropViewMod)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uCropViewMod, "30");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       int i = a.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             ratio = p1.getRatio();
          }else {
             CropViewModel tg = this.g;
             if (tg == null) {
                a.S("mEditorPictureList");
             }
             i oi = tg.get(p0);
             ratio = ((float)oi.i().b * 0x3f800000) / (float)oi.i().c;
          }
       }else {
          ratio = 0xbf800000;
       }
       return ratio;
    }
    public final boolean t0(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CropViewModel obj = PatchProxy.apply(objArray, this, CropViewModel.class, "26");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.q;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.f.a1() == Workspace$Type.SINGLE_PICTURE){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final void u0(){
       if (PatchProxy.applyVoid(null, this, CropViewModel.class, "9")) {
          return;
       }
       if (this.k != null) {
          Object[] objArray = new Object[0];
          a.D().w("CropViewModel", "onCropAnimationEnd:"+this.i, objArray);
          this.k = false;
       }
       return;
    }
    public final void v0(int p0){
       CropViewModel uCropViewMod = CropViewModel.class;
       if (PatchProxy.isSupport(uCropViewMod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCropViewMod, "11")) {
          return;
       }
       if (this.e.size() <= 0) {
          i1.c(new RuntimeException("onPositionChanged init failed position:"+p0));
          return;
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("CropViewModel", "onPositionChanged:"+p0, objArray);
          this.k = i;
          if (this.i != -1) {
             Pair value = this.c.getValue();
             if (value != null) {
                this.z0(this.i, value.getFirst());
             }
          }
          this.i = p0;
          Object obj = this.e.get(p0);
          a.o(obj, "mCropUIDataList[position]");
          this.c.setValue(new Pair(obj, CropAction.POSITION_CHANGE));
          return;
       }
    }
    public final void w0(){
       b a;
       CropViewModel uCropViewMod = CropViewModel.class;
       if (PatchProxy.applyVoid(null, this, uCropViewMod, "12")) {
          return;
       }
       if (this.k != null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CropViewModel", "onRotate:"+this.i, objArray);
       boolean b = true;
       this.k = b;
       Pair value = this.c.getValue();
       if (value != null) {
          value.getFirst().a().a = ((value.getFirst().a().d() - (float)90) + 360.00f) % 360.00f;
          value.getFirst().a().d = b;
          this.c.setValue(new Pair(value.getFirst(), CropAction.ROTATE));
          CropRatioType uCropRatioTy = value.getFirst().a().b();
          CropRatioType uCropRatioTy1 = PatchProxy.applyOneRefs(uCropRatioTy, this, uCropViewMod, "31");
          if (uCropRatioTy1 != PatchProxyResult.class) {
          }else {
             int i = a.b[uCropRatioTy.ordinal()];
             if (i != b) {
                if (i != 2) {
                   if (i != 3) {
                      if (i == 4) {
                         uCropRatioTy = CropRatioType.RATIO_16_9;
                      }
                   }else {
                      uCropRatioTy = CropRatioType.RATIO_3_4;
                   }
                }else {
                   uCropRatioTy = CropRatioType.RATIO_4_3;
                }
             }else {
                uCropRatioTy = CropRatioType.RATIO_9_16;
             }
             uCropRatioTy1 = uCropRatioTy;
          }
          value.getFirst().a().g(uCropRatioTy1);
          value.getFirst().a().f(this.s0(this.i, uCropRatioTy1));
       }
       a = b.a;
       CropViewModel ts = this.s;
       CropViewModel ti = this.i;
       boolean b1 = this.t0();
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(ts, Integer.valueOf(ti), Boolean.valueOf(b1), a, b.class, "2")) {
          a.p(ts, "page");
          a.b(ts, "ROTATE", ti, b1);
       }
       return;
    }
    public final void x0(Bitmap p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropViewModel.class, "28")) {
          return;
       }
       a.p(p0, "bitmap");
       if (this.j != null) {
          CropViewModel tq = this.q;
          CropViewModel ti = this.i;
          Objects.requireNonNull(tq);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             str = PatchProxy.applyOneRefs(Integer.valueOf(ti), tq, uoa, "22");
             if (str != PatchProxyResult.class) {
             label_0044 :
                t.a().c(str, p0);
             }
          }
          str = z.f(z.y(tq.f).get(ti));
          goto label_0044 ;
       }
       return;
    }
    public void x9(){
       x.b(this);
    }
    public final void y0(ArrayList p0){
       Iterator iterator1;
       int i;
       Object obj1;
       int i1;
       Object[] objArray;
       int len;
       String str1;
       Object[] objArray1;
       VideoContext videoContext;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropViewModel.class, "21")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       e$g obj = null;
       boolean b = true;
       a uoa = null;
       while (iterator.hasNext()) {
          b uob = iterator.next();
          obj = PatchProxy.applyOneRefs(uob, obj, e.class, "1");
          if (obj != patchProxyRe) {
          }else {
             a.p(uob, "$this$getCropMetaInfo");
             obj = new e$g();
             String str = 0x3f800000;
             if (!uob.a().c().width() - str && !uob.a().c().height() - str) {
                b = false;
             }
             obj.d = b;
             obj.c = uob.a().d;
             obj.b = d.a.c(uob.a().b());
             float f = (float)uob.b().i().b * uob.a().c().width();
             obj.e = (int)f;
             f = (float)uob.b().i().c * uob.a().c().height();
             obj.f = (int)f;
          }
          uArrayList.add(obj);
       }
       CropViewModel tq = this.q;
       Objects.requireNonNull(tq);
       a uoa1 = a.class;
       if (!PatchProxy.applyVoidOneRefs(uArrayList, tq, uoa1, "17")) {
          a.p(uArrayList, "cropMetaList");
          e$h oh = PatchProxy.apply(obj, tq, uoa1, "18");
          if (oh != patchProxyRe) {
          }else {
             VideoContext videoContext1 = tq.f.d1();
             a.o(videoContext1, "workspaceDraft.videoContext");
             oh = videoContext1.F().d.A;
             if (oh != null) {
                len = (!oh.length)? 1: 0;
                if (!len && oh.length == z.B(tq.f)) {
                }
             }
          label_00ff :
             len = z.A(Workspace$Type.LONG_PICTURE, tq.f);
             oh = new e$g[len];
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                oh[i2] = new e$g();
             }
          }
       }
       return;
    }
    public void yd(){
       ArrayList obj1;
       b obj2;
       Iterator iterator;
       String obj3;
       CropViewModel tq;
       Iterator iterator1;
       a uoa = a.class;
       CropViewModel uCropViewMod = CropViewModel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCropViewMod, "17")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("CropViewModel", "saveEditorChanges", objArray1);
       this.j = true;
       if (!PatchProxy.applyVoid(objArray, this, uCropViewMod, "18")) {
          HashMap hashMap = new HashMap();
          iterator = this.e.iterator();
          while (iterator.hasNext()) {
             obj2 = iterator.next();
             obj3 = obj2.b().c().getIdentifier();
             a.o(obj3, "it.editorPictureData.assetSegment.identifier");
             hashMap.put(obj3, obj2.a().b());
          }
          tq = this.q;
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidOneRefs(hashMap, tq, uoa, "14")) {
             a.p(hashMap, "map");
             iterator1 = hashMap.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                Object key = uEntry.getKey();
                tq.b.put(key, uEntry.getValue());
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uCropViewMod, "19")) {
          obj1 = new ArrayList();
          iterator = this.e.iterator();
          int i4 = 0;
          while (iterator.hasNext()) {
             obj3 = iterator.next();
             int i5 = i4 + 1;
             if (i4 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj3.a().e() && !this.f.get(i4).a().e()) {
                obj1.add(Integer.valueOf(i4));
             }
             i4 = i5;
          }
          if (obj1.isEmpty() ^ true) {
             tq = this.q;
             Objects.requireNonNull(tq);
             if (!PatchProxy.applyVoidOneRefs(obj1, tq, uoa, "16")) {
                a.p(obj1, "resetList");
                iterator1 = obj1.iterator();
                while (iterator1.hasNext()) {
                   tq.k(new Pair(Integer.valueOf(iterator1.next().intValue()), b.a()));
                }
             }
          }
       }
       this.y0(this.e);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = PatchProxy.apply(objArray, this, uCropViewMod, "20");
       if (obj != patchProxyRe) {
          i = obj.booleanValue();
       }else {
          uCropViewMod = this.q;
          Objects.requireNonNull(uCropViewMod);
          Object[] objArray2 = PatchProxy.apply(objArray, uCropViewMod, uoa, "27");
          if (objArray2 != patchProxyRe) {
          }else {
             uoa = uCropViewMod.f.s0();
             if (uoa != null) {
                Cover uCover = uoa.v();
                if (uCover != null) {
                   PictureCoverParam pictureCover = uCover.getPictureCoverParam();
                   if (pictureCover != null) {
                      objArray = pictureCover.getIndexesList();
                   }
                }
             }
             objArray2 = objArray;
          }
          if (objArray2 != null) {
             obj = this.e.iterator();
             int i1 = 0;
             while (obj.hasNext()) {
                obj1 = obj.next();
                int i2 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                obj2 = this.f.get(i1);
                a.o(obj2, "mOriginalCropUIDataList[index]");
                if (objArray2.contains(Integer.valueOf(i1))) {
                   if (!obj2.a().d() - obj1.a().d()) {
                      int i3 = a.g(obj2.a().c(), obj1.a().c()) ^ true;
                      if (!i3) {
                      label_01df :
                         i1 = i2;
                      }
                   }
                   objArray = new Object[i];
                   a.D().w("CropViewModel", "cover "+i1+" cropped", objArray);
                   i = true;
                   break ;
                }
             }
          }
       }
       if (i) {
          this.r.s0(CropViewModel$c.a);
       }
       this.r.s0(new CropViewModel$d(this));
       this.q.c(true);
       s.h("ENSURE_CROP");
       return;
    }
    public final void z0(int p0,b p1){
       CropViewModel uCropViewMod = CropViewModel.class;
       if (PatchProxy.isSupport(uCropViewMod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uCropViewMod, "33")) {
          return;
       }
       Object obj = this.f.get(p0);
       a.o(obj, "mOriginalCropUIDataList[index]");
       if (!obj.a().d() - p1.a().d() && a.g(obj.a().c(), p1.a().c())) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CropViewModel", "position "+p0+" add to crop task", objArray);
       uCropViewMod = this.q;
       d1$a uoa = e.a(p1, p0);
       Objects.requireNonNull(uCropViewMod);
       if (!PatchProxy.applyVoidOneRefs(uoa, uCropViewMod, a.class, "11")) {
          a.p(uoa, "cropImageData");
          uCropViewMod.a.a(uoa);
       }
       return;
    }
    public void z2(){
       x.c(this);
    }
}
