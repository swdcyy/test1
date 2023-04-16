package com.yxcorp.gifshow.edit.previewer.loaderv2.base.b;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import java.lang.Object;
import java.util.List;
import ekd.q;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qba.d;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import km6.g;
import rba.c;
import tba.b;
import uba.a;
import qba.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import java.lang.NullPointerException;
import java.lang.InstantiationException;
import java.lang.IllegalAccessException;
import java.lang.Exception;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import com.kwai.video.clipkit.mv.EditorSdk2MvFileMissException;
import haa.f;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$DraftFileException;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import qba.c;
import java.lang.Boolean;
import java.lang.System;
import java.util.Collection;
import xf6.g;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Objects;
import rba.b;
import java.util.HashSet;
import java.lang.Enum;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import tba.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d0;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.yxcorp.gifshow.edit.previewer.loaderv2.w;
import com.yxcorp.gifshow.edit.previewer.loaderv2.q;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.previewer.loaderv2.a0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.u;
import com.yxcorp.gifshow.edit.previewer.loaderv2.t;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.IllegalStateException;
import qba.e;
import java.lang.Runnable;
import ekd.k1;

public class b	// class@001b35
{
    public c a;
    public EditorSdk2V2$VideoEditorProject b;
    public d c;
    public g d;
    public b$a e;
    public c f;
    public final List g;
    public final c h;
    public final b i;
    public static final List j;
    public static final List k;

    static {
       Loader karaoke;
       Loader music;
       Loader[] loaderArray = new Loader[]{Loader.TTS,Loader.Audio,karaoke,Loader.Kuaishan,Loader.AiCut,music};
       karaoke = Loader.Karaoke;
       music = Loader.Music;
       b.j = q.a(loaderArray);
       loaderArray = new Loader[]{Loader.TextStickerLyric,karaoke,music};
       b.k = q.a(loaderArray);
    }
    public void b(c p0,d p1){
       super(p0, p1, new EditorSdk2V2$VideoEditorProject());
    }
    public void b(c p0,d p1,EditorSdk2V2$VideoEditorProject p2){
       Loader loader;
       super();
       this.d = new g();
       this.a = p0;
       this.c = p1;
       this.b = p2;
       this.h = new c();
       this.i = new b();
       a uoa = new a();
       ArrayList uArrayList = PatchProxy.apply(null, null, b.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = b.a.iterator();
          while (iterator.hasNext()) {
             loader = iterator.next();
             try{
                Object obj = loader.getLoaderClazz().newInstance();
                if (obj != null) {
                   uArrayList.add(obj);
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.edit.previewer.loaderv2.base.PreviewLoaderV2");
                }
             }catch(java.lang.IllegalAccessException e0){
                e0.printStackTrace();
                goto label_0040 ;
             }catch(java.lang.InstantiationException e0){
                e0.printStackTrace();
                goto label_0040 ;
             }
          }
       }
       this.g = uArrayList;
       uoa.a("loader construct");
       return;
    }
    public final void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       this.e.d = p0;
       if (p0 instanceof EditorSdk2MvFileMissException) {
          f.D().e("WorkspaceLoader", "EditorSdk2MvFileMissException file missing!", p0);
       }else {
          DraftFileManager$DraftFileException uDraftFileEx = new DraftFileManager$DraftFileException(p0);
          PostUtils.D("WorkspaceLoader", "WorkSpaceLoaderV2.Result load failed", uDraftFileEx);
          ExceptionHandler.handleCaughtException(uDraftFileEx);
       }
       return;
    }
    public b$a b(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(b.a(), null, false);
    }
    public b$a c(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(p0, null, true);
    }
    public final b$a d(List p0,c p1,boolean p2){
       ArrayList obj;
       String this;
       b a;
       Object[] objArray1;
       boolean len;
       int i1;
       a b1;
       int len1;
       c uoc = this;
       c uoc1 = p1;
       boolean b = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       System.currentTimeMillis();
       obj = new ArrayList();
       obj.addAll(p0);
       Object[] objArray = PatchProxy.applyOneRefs(obj, uoc, uob, "6");
       String str = "WorkspaceLoader";
       this = null;
       if (objArray != patchProxyRe) {
       }else {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          if (g.c()) {
             Object[] objArray6 = new Object[this];
             f.D().s(str, "project load : "+new String(uoc.b.toByteArray()), objArray6);
          }
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             Loader loader = iterator.next();
             if (uArrayList1.contains(loader)) {
                continue ;
             }else {
                List j = b.j;
                if (j.contains(loader)) {
                   uArrayList1.addAll(j);
                   EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[this];
                   uoc.b.setAudioAssets(uAudioAssetA);
                }else {
                   j = b.k;
                   if (j.contains(loader)) {
                      uArrayList1.addAll(j);
                      EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[this];
                      uoc.b.setAnimatedSubAssets(uAnimatedSub);
                   }else {
                      uArrayList1.add(loader);
                   }
                }
             }
          }
          iterator = uoc.g.iterator();
          while (iterator.hasNext()) {
             a uoa3 = iterator.next();
             Iterator iterator1 = uArrayList1.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (iterator1.next().getLoaderClazz().equals(uoa3.getClass())) {
                      uArrayList.add(uoa3);
                   }
                }else {
                   continue ;
                }
             }
          }
          a[] uoaArray = new a[this];
          objArray = uArrayList.toArray(uoaArray);
       }
       uoc.f = (!uoc1)? new c(): uoc1;
       b$a uoa = new b$a();
       uoc.e = uoa;
       uoa.a = uoc.b;
       a = uoc.a;
       if (a == null || a.E()) {
          objArray1 = new Object[0];
          f.D().t(str, "Workspace item not found.", objArray1);
          return uoc.e;
       }else {
          Workspace$Type type = uoc.a.a1();
          if (type == Workspace$Type.ATLAS || type == Workspace$Type.LONG_PICTURE) {
             objArray1 = new Object[0];
             f.D().t(str, "ATLAS and LONG_PICTURE not supported.", objArray1);
             return uoc.e;
          }else {
             String str1 = "7";
             b uob1 = null;
             b uob2 = 1;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(objArray, Boolean.valueOf(p2), uoc, uob, "8")) {
                if (!PatchProxy.applyVoidOneRefs(objArray, uoc, uob, str1) && uoc.a != null) {
                   a = uoc.b;
                   if (a != null) {
                      int b2 = a.cleanMainTrackMode();
                      if (uoc.a.a1() != Workspace$Type.KUAISHAN && b2) {
                         uoc.b = new EditorSdk2V2$VideoEditorProject();
                      }else {
                         b2 = objArray.length;
                         for (len1 = 0; len1 < b2; len1 = len1 + 1) {
                            objArray[len1].f(uoc.b, uoc.a);
                         }
                      }
                   }
                }
                a = uoc.h;
                Objects.requireNonNull(a);
                String str3 = "4";
                if (!PatchProxy.applyVoid(uob1, a, c.class, str3)) {
                   uoc1 = a.a;
                   len1 = uoc1.length;
                   int i3 = 0;
                   while (i3 < len1) {
                      object oobject2 = uoc1[i3];
                      Objects.requireNonNull(oobject2);
                      if (!PatchProxy.applyVoid(uob1, oobject2, b.class, str3)) {
                         oobject2.b.clear();
                      }
                      i3 = i3 + 1;
                   }
                }
                a = uoc.i;
                String str4 = uoc.a.a1().toString();
                len = (objArray.length == (uoc.g.size() - uob2) && b)? true: false;
                Objects.requireNonNull(a);
                if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(str4, Boolean.valueOf(len), a, b.class, "5")) {
                   a.p(str4, "type");
                   a.a = 0;
                   a.d = "";
                   a.b = len;
                   a.c = uob2;
                   a.e = str4;
                }
             }
             a$a uoa1 = new a$a(uoc.a, uoc.b, uoc.f, uoc.h, uoc.i, uoc.c, uoc.d, uoc.e);
             long l = System.currentTimeMillis();
             f uof = f.D();
             Object[] objArray2 = new Object[this];
             String str2 = "开始加载草稿数据";
             try{
                uof.s("EditCost", str2, objArray2);
                len = objArray.length;
                int i = 0;
                i1 = 0;
                try{
                   while (i < len) {
                      object oobject = objArray[i];
                      long l1 = System.currentTimeMillis();
                      Object[] objArray3 = new Object[this];
                      try{
                         oobject.b(patchProxyRe, objArray3);
                         oobject.e(b);
                      }catch(java.lang.Exception e0){
                         uoc.a(e0);
                      }
                      Object obj1 = objArray;
                      this = str;
                      long l2 = System.currentTimeMillis() - l1;
                      long l3 = (long)i1 + l2;
                      i1 = (int)l3;
                      if (oobject instanceof d0 && (b && (uoc.a.a1() == Workspace$Type.KUAISHAN || (DraftUtils.l(uoc.a) && DraftUtils.T(uoc.a))))) {
                         b1 = oobject.b;
                         uoc.b = b1;
                         patchProxyRe.b = b1;
                         Loader[] loaderArray = new Loader[]{Loader.Kuaishan,Loader.VideoAsset,Loader.PhotoAsset};
                         uoc.e(loaderArray);
                      }else {
                         object oobject1 = 1;
                      }
                      if (oobject instanceof w) {
                         a = uoc.e;
                         a.b = oobject.n;
                         a.c = oobject.o;
                      }
                      if (oobject instanceof q || oobject instanceof d) {
                         b1 = oobject.b;
                         uoc.b = b1;
                         patchProxyRe.b = b1;
                         if (oobject instanceof q) {
                            b e = uoc.e;
                            e.e = oobject.j;
                            e.f = oobject.k;
                            e.g = oobject.l;
                            e.h = oobject.m;
                            e.i = oobject.n;
                            e.m = b1.audioAssets();
                            uoc.e.n = b1.trackAssets();
                            q o = oobject.o;
                            uoc.e.q = o;
                            if (!TextUtils.x(o)) {
                               uoa = uoc.e.i;
                               if (uoa != null) {
                                  if (uoa.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV) {
                                     uoc.e.s = "ae";
                                  }else {
                                     uoc.e.s = "spark";
                                  }
                               }
                            }
                         }else if(!TextUtils.x(oobject.i) && TextUtils.x(uoc.e.q)){
                            a = uoc.e;
                            a.q = oobject.i;
                            a.s = "aicut";
                            if (DraftUtils.L(uoc.a.T0())) {
                               uoc.e.s = "annualalbum";
                            }
                         }
                         if (DraftUtils.K(uoc.a) || DraftUtils.U(uoc.a)) {
                            a = uoc.e;
                            a.e = oobject.j;
                            a.i = oobject.k;
                         }
                      }
                      if (oobject instanceof a0) {
                         uoc.e.j = oobject.i;
                      }
                      if (oobject instanceof u) {
                         uoc.e.l = oobject.i;
                      }
                      if (oobject instanceof t) {
                         t i2 = oobject.i;
                         if (i2 != null) {
                            uoc.b = i2.getProject();
                            patchProxyRe.b = i2.getProject();
                            uoc.e.f = i2.getAE2Project();
                            uoc.e.e = i2.getMVParam();
                         }
                      }
                      l3 = System.currentTimeMillis();
                      l = l3 - l;
                      Object[] objArray4 = new Object[0];
                      f.D().s("EditCost", "加载 "+oobject.getClass().getSimpleName()+" 耗时 "+l, objArray4);
                      i = i + 1;
                      b = p2;
                      str = this;
                      a$a uoa2 = patchProxyRe;
                      objArray = obj1;
                      this = 0;
                   }
                   this = str;
                   uoc.b.setMarginColor(EditorSdk2Utils.createRGBAColor(0, 0, 0, 0));
                   uoc.b.setPaddingColor(EditorSdk2Utils.createRGBAColor(0.13f, 0.13f, 0.13f, 0x3f800000));
                   a = uoc.i;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoid(null, a, b.class, str1)) {
                      if (a.c != null) {
                         a.c = false;
                      }else {
                         throw new IllegalStateException("record not start yet!");
                      }
                   }
                   uoc.h.a();
                   uoc.e.a = uoc.b;
                   uoc.f = null;
                   if (g.c()) {
                      Object[] objArray5 = new Object[0];
                      f.D().s(this, "project load after: "+new String(uoc.b.toByteArray()), objArray5);
                   }
                   objArray = new Object[0];
                   f.D().s("PreviewLoaderV2", "load 加载 "+i1+",audioSize:"+uoc.b.audioAssetsSize()+",trackSize:"+uoc.b.trackAssetsSize()+",animatedSubAssetsSize:"+uoc.b.animatedSubAssetsSize(), objArray);
                   k1.o(new e(uoc));
                   return uoc.e;
                }catch(java.lang.Exception e0){
                }
                uoc.a(e0);
                goto label_0454 ;
             }catch(java.lang.Exception e0){
                i1 = 0;
                goto label_0451 ;
             }
          }
       }
    }
    public final void e(Loader[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.getClass().equals(oobject.getLoaderClazz())) {
                uoa.b = this.b;
             }
          }
          i = i + 1;
       }
       return;
    }
}
