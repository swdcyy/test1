package com.yxcorp.gifshow.edit.previewer.loaderv2.s;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import taa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Preview;
import wba.e0;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import wba.g0;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.ArrayList;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Integer;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Preview$b;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fba.a;
import haa.a;
import com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import rba.c;
import java.lang.Math;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import wba.n0;
import com.kuaishou.edit.draft.GradientColorOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$PaddingAreaOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$GradientColorOptions;
import android.graphics.Color;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import wba.d;
import java.lang.Float;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import qkd.b;
import com.kwai.video.minecraft.model.nano.Minecraft$PaddingAreaImageOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$BlurOptions;
import pba.g;
import kotlin.jvm.internal.a;
import km6.g;

public class s extends a	// class@001b4b
{
    public int h;
    public g i;

    public void s(){
       super();
       this.h = -1;
    }
    public void c(a$a p0,Object[] p1){
       this.i = p0.g;
    }
    public void d(){
       Size size1;
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "1")) {
          return;
       }
       Workspace$Type aI_CUT = Workspace$Type.AI_CUT;
       if (this.a.a1() != aI_CUT && (this.a.a1() == Workspace$Type.KUAISHAN || (DraftUtils.l(this.a) && !DraftUtils.T(this.a)))) {
          this.h = -1;
       }
       if (this.a.P0() != null && this.a.P0().v() != null) {
          Preview preview = this.a.P0().v();
          boolean b = e0.e(this.a);
          if (p0.a(this.a.T0())) {
             this.h(preview);
             this.b.setProjectOutputWidth(g0.a);
             this.b.setProjectOutputHeight(g0.b);
             this.i(preview);
          }else {
             int i = 1;
             if (this.a.a1() == Workspace$Type.VIDEO || this.a.a1() == Workspace$Type.LONG_VIDEO) {
                this.h(preview);
                this.i(preview);
                e0.o(this.b, i, new ArrayList());
             }else {
                boolean b1 = false;
                if (this.a.a1() != aI_CUT && (this.a.a1() != Workspace$Type.KUAISHAN || (this.a.b1() != Workspace$Type.UNKNOWN || (DraftUtils.l(this.a) && !DraftUtils.T(this.a))))) {
                   Size size = d.h(this.a);
                   Object[] objArray1 = (this.a.P0() == null)? objArray: this.a.P0().v();
                   if (this.a.a1() != aI_CUT) {
                      a obj = PatchProxy.apply(objArray, this, os, "2");
                      if (obj != PatchProxyResult.class) {
                         b1 = obj.booleanValue();
                      }else if(this.a.a1() != Workspace$Type.PHOTO_MOVIE){
                         obj = a.a(this.a);
                         if (obj.v() == null || (TextUtils.x(obj.v().getFeatureId().getExternal()) || TextUtils.n(obj.v().getFeatureId().getExternal(), "-1"))) {
                            i = 0;
                         }
                         b1 = i;
                      }
                      if (!b1 && objArray1 != null) {
                         this.b.setProjectOutputWidth(size.b);
                         this.b.setProjectOutputHeight((int)((float)size.b * ((float)objArray1.getHeight() / (float)objArray1.getWidth())));
                      }
                   }
                label_021f :
                   this.b.setProjectOutputWidth(size.b);
                   this.b.setProjectOutputHeight(size.c);
                }else if(preview != null && (preview.getWidth() > 0 && (preview.getHeight() > 0 && (!DraftUtils.l(this.a) || !DraftUtils.T(this.a))))){
                   this.b.setProjectOutputWidth(preview.getWidth());
                   this.b.setProjectOutputHeight(preview.getHeight());
                   if (b) {
                      e0.o(this.b, i, new ArrayList());
                   }
                }else {
                   int computedWidt = EditorSdk2UtilsV2.getComputedWidth(this.b);
                   int computedHeig = EditorSdk2UtilsV2.getComputedHeight(this.b);
                   if (this.a.a1() == Workspace$Type.PHOTO_MOVIE) {
                      if (b) {
                         size1 = e0.f(i, this.b, new ArrayList());
                         computedHeig = size1.c;
                         size1 = size1.b;
                      }
                      if (!PatchProxy.isSupport(os) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(size1), Integer.valueOf(computedHeig), this, os, "3")) {
                         boolean b2 = this.a.P0().D();
                         if (!b2) {
                            this.a.P0().c0();
                         }
                         Preview$b uob = this.a.P0().k();
                         uob.g(size1);
                         uob.d(computedHeig);
                         uob.build();
                         if (!b2) {
                            this.a.P0().g(b1);
                         }
                      }
                   }
                label_0177 :
                   this.b.setProjectOutputWidth(size1);
                   this.b.setProjectOutputHeight(computedHeig);
                }
             }
          }
       }
       return;
    }
    public int g(){
       return 1;
    }
    public final void h(Preview p0){
       int b;
       s os = s.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, os, "4")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Preview$b obj = PatchProxy.applyOneRefs(p0, this, os, "5");
       int i = 1;
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(p0 == null){
          if (p0.getFrameType() > 0) {
             i = p0.getFrameType();
          }else if(p0.getWidth() > 0 && p0.getHeight() > 0){
             Size size = e0.l(this.d, i, this.b, false, new ArrayList());
             Size size1 = new Size(p0.getWidth(), p0.getHeight());
             p0 = PatchProxy.applyTwoRefs(size, size1, null, e0.class, "1");
             if (p0 != patchProxyRe) {
                i = p0.intValue();
             }else {
                float f = ((float)size1.b * 0x3f800000) / (float)size1.c;
                float[] uofloatArray = new float[]{Math.abs((f - (((float)size.b * 0x3f800000) / (float)size.c))),Math.abs((f - 0x3f100000)),Math.abs((f - 0x3f400000)),Math.abs((f - 0x3f800000)),Math.abs((f - 0x3faaaaab))};
                b = uofloatArray[0];
                int i1 = 1;
                int i2 = 0;
                while (i1 < 5) {
                   if (uofloatArray[i1] - b < 0) {
                      b = uofloatArray[i1];
                      i2 = i1;
                   }
                   i1 = i1 + 1;
                }
                if (b - 0x3c23d70a < 0) {
                   i = i + i2;
                }
             }
          }
       }
       b = this.a.P0().D();
       if (!b) {
          this.a.P0().c0();
       }
       obj = this.a.P0().k();
       obj.b(i);
       obj.build();
       if (!b) {
          this.a.P0().g(false);
       }
       if (e0.e(this.a)) {
          e0.f(i, this.b, new ArrayList());
       }else {
          e0.j(i, this.b, new ArrayList());
       }
       this.h = i;
       return;
    }
    public final void i(Preview p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "6")) {
          return;
       }
       boolean b = false;
       int i = 2;
       if (p0 == null || p0.getPaddingAreaType() <= 0) {
          iterator = this.b.trackAssets().iterator();
          while (iterator.hasNext()) {
             n0.a(iterator.next());
          }
          boolean b1 = this.a.P0().D();
          if (!b1) {
             this.a.P0().c0();
          }
          float f = 0.02f;
          if (p0.a(this.a.T0())) {
             f = 0.10f;
          }
          Preview$b uob = this.a.P0().k();
          uob.e(0x98961d);
          uob.f(i);
          uob.c((double)f);
          if (!b1) {
             this.a.P0().g(b);
          }
          s ti = this.i;
          g og = new g(this);
          _monitor_enter(ti);
          a.p(og, "runnable");
          ti.a.add(og);
          _monitor_exit(ti);
          return;
       }else {
          a tb = this.b;
          a ta = this.a;
          if (!PatchProxy.applyVoidTwoRefs(tb, ta, null, AudioAssetUtils.class, "10")) {
             iterator = tb.trackAssets().iterator();
             while (iterator.hasNext()) {
                EditorSdk2V2$TrackAsset trackAsset = iterator.next();
                n0 on0 = n0.class;
                String str = "11";
                if (!PatchProxy.applyVoidTwoRefs(trackAsset, ta, null, AudioAssetUtils.class, str) && (ta.P0() == null || ta.P0().v() == null)) {
                   continue ;
                }else {
                   Preview preview = ta.P0().v();
                   int paddingAreaT = preview.getPaddingAreaType();
                   if (paddingAreaT != i) {
                      if (paddingAreaT != 3) {
                         if (paddingAreaT != 4) {
                            if (paddingAreaT != 5) {
                               continue ;
                            }else {
                               GradientColorOptions gradientColo = preview.getGradientColorOptions();
                               if (PatchProxy.applyVoidTwoRefs(trackAsset, gradientColo, null, on0, str)) {
                               }else {
                                  Minecraft$PaddingAreaOptions paddingAreaO = new Minecraft$PaddingAreaOptions();
                                  paddingAreaO.setUseCurrentFrame(b);
                                  Minecraft$GradientColorOptions gradientColo1 = new Minecraft$GradientColorOptions();
                                  ArrayList uArrayList = new ArrayList();
                                  Iterator iterator1 = gradientColo.getColorsList().iterator();
                                  while (iterator1.hasNext()) {
                                     uArrayList.add(d.h(Color.parseColor(iterator1.next())));
                                  }
                                  Minecraft$Color[] uColorArray = new Minecraft$Color[b];
                                  gradientColo1.setColors(uArrayList.toArray(uColorArray));
                                  gradientColo1.setStartPosX(gradientColo.getStartPosX());
                                  gradientColo1.setStartPosY(gradientColo.getStartPosY());
                                  Float[] uFloatArray = new Float[b];
                                  gradientColo1.setStops(gradientColo.getStopsList().toArray(uFloatArray));
                                  gradientColo1.setEndPosX(gradientColo.getEndPosX());
                                  gradientColo1.setEndPosY(gradientColo.getEndPosY());
                                  paddingAreaO.setGradientColor(gradientColo1);
                                  trackAsset.setPaddingAreaOptions(paddingAreaO);
                               }
                            }
                         }else {
                            File uFile = DraftFileManager.E().B(preview.getPaddingAreaImagePath(), ta.P0());
                            if (b.S(uFile)) {
                               str = uFile.getAbsolutePath();
                               if (PatchProxy.applyVoidTwoRefs(trackAsset, str, null, on0, "10")) {
                                  continue ;
                               }else {
                                  trackAsset.setPaddingAreaOptions(new Minecraft$PaddingAreaOptions());
                                  trackAsset.paddingAreaOptions().setImage(new Minecraft$PaddingAreaImageOptions());
                                  trackAsset.paddingAreaOptions().image().setPath(str);
                               }
                            }
                         }
                      }else {
                         int i1 = Color.parseColor(preview.getPaddingAreaColor());
                         if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidTwoRefs(trackAsset, Integer.valueOf(i1), null, on0, "9")) {
                            continue ;
                         }else {
                            trackAsset.setPaddingAreaOptions(new Minecraft$PaddingAreaOptions());
                            trackAsset.paddingAreaOptions().setColor(new Minecraft$Color());
                            float f1 = 0x437f0000;
                            float f2 = (float)Color.alpha(i1) / f1;
                            trackAsset.paddingAreaOptions().color().setAlpha(f2);
                            f2 = (float)Color.red(i1) / f1;
                            trackAsset.paddingAreaOptions().color().setRed(f2);
                            f2 = (float)Color.green(i1) / f1;
                            trackAsset.paddingAreaOptions().color().setGreen(f2);
                            float f3 = (float)Color.blue(i1) / f1;
                            trackAsset.paddingAreaOptions().color().setBlue(f3);
                         }
                      }
                   }else {
                      n0.a(trackAsset);
                      trackAsset.paddingAreaOptions().currentFrameBlurOptions().setGaussianBlurRadius(preview.getGaussianBlurRadius());
                   }
                }
             }
          }
          return;
       }
    }
}
