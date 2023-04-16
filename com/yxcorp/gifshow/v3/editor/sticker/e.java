package com.yxcorp.gifshow.v3.editor.sticker.e;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import itc.g;
import itc.h;
import com.yxcorp.gifshow.v3.editor.sticker.e$a;
import com.yxcorp.gifshow.v3.editor.sticker.e$b;
import com.yxcorp.gifshow.v3.editor.sticker.e$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import java.util.Set;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import itc.f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.robust.PatchProxyResult;
import itc.k3;
import aw9.z;
import java.lang.Boolean;
import im8.f;
import java.lang.Long;
import java.lang.Throwable;
import lnc.i1;
import java.lang.RuntimeException;
import java.lang.Integer;
import wba.b;
import wba.h0;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import s16.a$b;
import s16.a;
import java.util.Arrays;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileRenderViewDrawer;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;
import com.yxcorp.gifshow.widget.adv.model.a;
import java.lang.Double;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.yxcorp.gifshow.v3.editor.sticker.model.b;
import android.widget.AbsoluteLayout;
import ptc.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditWaterMarkStickerDrawer;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileDrawer;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import lwc.h;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.widget.adv.Action$a;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.widget.adv.Action;
import java.util.List;
import wba.g;
import kotlin.jvm.internal.a;
import maa.a;
import com.yxcorp.gifshow.edit.previewer.utils.AssetExt$getFirstSegmentIdentifyByAssetIdentify$1;
import oba.b;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import msd.l;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.AssetSegment;
import java.lang.Number;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.util.PostUtils;
import eba.a;
import com.kuaishou.edit.draft.Sticker$b;
import uld.j;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.StickerResult$b;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import uld.g;
import com.yxcorp.gifshow.widget.adv.c;
import java.lang.Math;
import android.graphics.Rect;
import itc.i;
import java.lang.Runnable;
import ekd.k1;
import ekd.m1;
import itc.o;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;

public abstract class e extends PresenterV2 implements g	// class@001231
{
    public c A;
    public f B;
    public z C;
    public EditorDelegate D;
    public f E;
    public f F;
    public EditDecorationContainerView G;
    public f H;
    public Runnable I;
    public Runnable J;
    public final ExpandFoldHelperView$g K;
    public y L;
    public DecorationContainerView$e M;
    public ExpandFoldHelperView p;
    public int q;
    public Set r;
    public a s;
    public BaseEditorFragment t;
    public PublishSubject u;
    public i v;
    public PublishSubject w;
    public f x;
    public g y;
    public c z;

    public void e(){
       super();
       this.A = PublishSubject.g();
       this.I = new g(this);
       this.J = new h(this);
       this.K = new e$a(this);
       this.L = new e$b(this);
       this.M = new e$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.H = this.v.i();
       this.G.Q(false);
       this.G.d(this.M);
       this.r.add(this.L);
       this.p.setPreActionListener(this.K);
       this.D.C().setOnClickListener(new f(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "20")) {
          return;
       }
       this.D.C().setOnClickListener(objArray);
       this.p.setPreActionListener(objArray);
       this.G.M(this.M);
       this.G.setDelegate(objArray);
       this.G.Q(true);
       return;
    }
    public EditorSdk2V2$AnimatedSubAsset P8(StickerDetailInfo p0){
       int i1;
       long l;
       long l2;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, uoe, "4");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = k3.t(obj1, this.Z8());
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = PatchProxy.applyTwoRefs(obj2, obj1, obj, uoe, "5");
       if (uAnimatedSub != patchProxyRe) {
       }else {
          double d = this.X8(p0);
          if (obj.C.b()) {
             obj.F.set(Boolean.TRUE);
             obj.C.o(d);
          }
          double d1 = (StickerDetailInfo.isInteractiveSticker(p0))? obj.C.q(): obj.Y8(d);
          double d2 = d1;
          int m = f.m;
          int i = (obj1.mStickerType == -2)? 1999: m + 1;
          String str = "sticker-";
          String str1 = "";
          switch (obj1.getRealStickerType((this.Z8() ^ 1))){
              case 0xfffffffc:
              case 0xfffffffd:
                str = "interact_sticker_new-";
             label_00ba :
                i1 = 0;
             label_00bc :
                l = i1;
                m = 1;
                str1 = str;
                str = str1;
                break;
              case 0xfffffffe:
                str = "tag_sticker-";
                goto label_00ba ;
                break;
              case 0xffffffff:
                str = "interact_sticker-";
                goto label_00ba ;
                break;
              case 0:
                if (p0.isStickerNeedDecodeDimension()) {
                   i1.c(new RuntimeException("generateOriginAnimatedSubAsset error normal sticker no width height"));
                }
                try{
                   i1 = Long.parseLong(obj1.mStickerId);
                   str1 = obj2;
                   goto label_00bc ;
                }catch(java.lang.NumberFormatException e0){
                   i1.c(e0);
                }
                str1 = obj2;
                goto label_00ba ;
                break;
              case 1:
                goto label_00ba ;
              case 2:
                try{
                   l2 = Long.parseLong(obj1.mStickerId);
                }catch(java.lang.NumberFormatException e0){
                   i1.c(e0);
                   l2 = 0;
                }
                m = (p0.isSequenceImage())? 3: 4;
                str1 = str;
                l = l2;
                str = obj2;
                break;
              default:
                str = str1;
                goto label_0078 ;
          }
          String str2 = str;
          String str3 = str1;
          double d3 = d2;
          double d4 = d;
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub1 = b.h(0, 0, str2, i, d, d3, b.i(str1, Integer.valueOf(i)), false);
          k3.b(uAnimatedSub1.keyFrames(0).assetTransform());
          long l1 = l;
          if (l1) {
             uAnimatedSub1.setDataId(l1);
          }
          uAnimatedSub1.setFileType(m);
          if (obj1.getRealStickerType((this.Z8() ^ 1)) == 2) {
             k3.e(obj1, uAnimatedSub1);
          }
          Object[] objArray1 = new Object[0];
          a.D().w("StickerEditorPresenter", "generateOriginAnimatedSubAsset startTime:"+d4+",defaultDuration:,mEditableActionLayerCount:"+f.m+d3+",zIndex:"+i+",prefix:"+str3+",stickerFilePath:"+str2+",stickerDetailInfo :"+obj1, objArray1);
          uAnimatedSub = uAnimatedSub1;
       }
       uAnimatedSub.setRenderType(3);
       if (obj1.mStickerType != 1 && !StickerDetailInfo.isInteractiveSticker(p0)) {
          e c = obj.C;
          c.k(a.c(c.i(), uAnimatedSub, f.r));
          obj.C.e();
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerEditorPresenter", "add animatedSubAssets:"+Arrays.toString(obj.C.i())+",stickerFilePath:"+obj2, objArray);
       return uAnimatedSub;
    }
    public void R8(EditStickerBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       if (EditOriginFileRenderViewDrawer.isEditOriginFileRenderViewDrawer(p0)) {
          this.C.j(p0.getRenderView());
       }
       return;
    }
    public void S8(){
    }
    public a V8(StickerDetailInfo p0,EditorSdk2V2$AnimatedSubAsset p1,double p2){
       Object[] obj1;
       String this;
       b obj2;
       EditOriginFileRenderViewDrawer uEditOriginF;
       String str2;
       String str3;
       double d2;
       String str5;
       int i4;
       int i5;
       float i5;
       Object obj = this;
       StickerDetailInfo stickerDetai = p0;
       double d = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), this, e.class, "9");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       double d1 = p1.displayRange().duration();
       int m = f.m;
       int i = 1;
       int i1 = (stickerDetai.mStickerType == -2)? 1999: m + i;
       int i2 = 2;
       String str = "StickerEditorPresenter";
       this = ",zIndex:";
       String str1 = ",startTime:";
       int i3 = 0;
       if (PatchProxy.isSupport(uoe)) {
          obj1 = new Object[]{stickerDetai,Double.valueOf(p2),Double.valueOf(d1),Integer.valueOf(i1),p1};
          obj2 = PatchProxy.apply(obj1, obj, uoe, "10");
          if (obj2 != patchProxyRe) {
             uEditOriginF = obj2;
             str2 = str1;
             str3 = str;
             i2 = i1;
             d2 = d1;
             m = 0;
             str1 = this;
          label_0221 :
             super(Action$Type.DECORATION, i2);
             this.b(uEditOriginF);
             double d3 = p2;
             this.c(d3);
             d1 = d2;
             this.d(d1);
             Action this1 = this.a();
             StringBuilder str4 = "createDefaultRangeDataFromAnimatedSubAsset stickerDetailInfo:"+stickerDetai+str2+d3;
             obj1 = new Object[m];
             a.D().w(str3, str4+",defaultDuration:"+d1+str1+i2+",editStickerBaseDrawer:"+uEditOriginF+",action:"+this1+",mEditableActionLayerCount:"+f.m, obj1);
             return new a(this1);
          }
       }
       Object[] objArray = new Object[i3];
       a.D().w(str, "createEditStickerDrawerFromAnimatedSubAsset stickerDetailInfo:"+stickerDetai+str1+d+",duration:"+d1+this+i1, objArray);
       m = stickerDetai.getRealStickerType((this.Z8() ^ i));
       if (m != -2) {
          if (m != -1) {
             if (m) {
                if (m != i) {
                   if (m != 2) {
                      i1.c(new RuntimeException("createEditStickerDrawerFromAnimatedSubAsset no such StickerType"));
                   }else {
                      str2 = str1;
                      str5 = str;
                      obj2 = new b(p0, k3.s(p0), p1.assetId(), 1);
                      EditOriginFileRenderViewDrawer uEditOriginF1 = new EditOriginFileRenderViewDrawer(p2, d1, i1, v22, (float)stickerDetai.getResourceWidth(i), (float)stickerDetai.getResourceHeight(i), (float)obj.G.getWidth());
                      uEditOriginF = obj2;
                      str1 = this;
                      i2 = i1;
                      d2 = d1;
                   }
                }else {
                   str2 = str1;
                   str5 = str;
                   i5 = i1;
                   d2 = d1;
                   EditWaterMarkStickerDrawer uEditWaterMa = new EditWaterMarkStickerDrawer(p0, p2, d1, i5, (float)obj.G.getWidth());
                   uEditOriginF = m;
                   i2 = i5;
                   str1 = this;
                }
                m = 0;
             }
             str2 = str1;
             str5 = str;
             d2 = d1;
             i4 = i1;
             obj2 = new b(p0, k3.t(stickerDetai, this.Z8()), p1.assetId(), 0);
             m = false;
             uEditOriginF = EditOriginFileDrawer.createOriginFileDrawer((f.E(obj.z.a1()) ^ 0x01), p2, d2, i4, v22, (float)stickerDetai.getResourceWidth(m), (float)stickerDetai.getResourceHeight(m), (float)obj.G.getWidth());
             str1 = this;
             i2 = i4;
          }else {
             str2 = str1;
             str5 = str;
             i4 = i1;
             d2 = d1;
             m = 0;
             int i6 = i4;
             str1 = this;
             i2 = i4;
             EditVoteStickerDrawer uEditVoteSti = new EditVoteStickerDrawer(p2, d2, i6, ((float)obj.C.p(m).b / (float)obj.C.p(m).c), obj.C.b());
          }
       }else {
          str2 = str1;
          str5 = str;
          i2 = i1;
          d2 = d1;
          m = 0;
          str1 = this;
          EditTagStickerElement uEditTagStic = new EditTagStickerElement(new EditTagStickerElementData(""), p2, d1, i2);
       }
       i5 = (f.E(obj.z.a1()))? (int)obj.C.g(): 0;
       i5 = (f.E(obj.z.a1()))? obj.v.l().s0(i5): 0x3f800000;
       uEditOriginF.setEditorScale(i5);
       objArray = new Object[m];
       str3 = str5;
       a.D().w(str3, "createEditStickerDrawerFromAnimatedSubAsset stickerBaseDrawer:"+uEditOriginF, objArray);
       goto label_0221 ;
    }
    public final List W8(){
       String identifier;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, e.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.C.d();
       if (obj.size() == 1) {
          String str = obj.get(0);
          e tz = this.z;
          String str1 = "1";
          String str2 = PatchProxy.applyTwoRefs(str, tz, objArray, g.class, str1);
          if (str2 != patchProxyRe) {
          }else {
             a.p(str, "segmentIdentify");
             if (tz != null) {
                a uoa = tz.o0();
                if (uoa != null) {
                   AssetExt$getFirstSegmentIdentifyByAssetIdentify$1 ogetFirstSeg = new AssetExt$getFirstSegmentIdentifyByAssetIdentify$1(str);
                   Object obj1 = PatchProxy.applyTwoRefs(uoa, ogetFirstSeg, objArray, b.class, str1);
                   if (obj1 != patchProxyRe) {
                      objArray = obj1;
                   }else {
                      a.p(uoa, "$this$getMessage");
                      a.p(ogetFirstSeg, "filter");
                      int i = uoa.p();
                      int i1 = 0;
                      while (i1 < i) {
                         GeneratedMessageLite generatedMes = uoa.y(i1);
                         if (ogetFirstSeg.invoke(generatedMes).booleanValue()) {
                            objArray = generatedMes;
                            break ;
                         }
                         i1 = i1 + 1;
                      }
                   }
                   if (objArray != null && objArray.getAssetSegmentList().size() > 0) {
                      AssetSegment assetSegment = objArray.getAssetSegment(0);
                      a.o(assetSegment, "it.getAssetSegment\(0\)");
                      identifier = assetSegment.getIdentifier();
                   label_0093 :
                      str2 = identifier;
                   }
                }
             }
             identifier = "";
             goto label_0093 ;
          }
          if (str2 != null && !str2.isEmpty()) {
             obj.add(str2);
          }
       }
    label_009f :
       return obj;
    }
    public double X8(StickerDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = (StickerDetailInfo.isInteractiveSticker(p0))? 0: k3.h(null, this.C, this.H);
       return d;
    }
    public abstract double Y8(double p0);
    public boolean Z8(){
       Object obj = PatchProxy.apply(null, this, e.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.E(this.z.a1());
    }
    public final boolean a9(StickerDetailInfo p0,EditStickerBaseDrawer p1){
       Object[] objArray;
       int i1;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       e obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, e.class, "17");
       if (obj3 != PatchProxyResult.class) {
          return obj3.booleanValue();
       }
       int i = 0;
       if ((p1.getDecorationName()).equals(obj1.mStickerId)) {
          objArray = new Object[i];
          a.D().w("StickerEditorPresenter", "replaceSameTypeDrawer replace with same sticker no op stickerName:"+obj1.mStickerName, objArray);
          return true;
       }else {
          boolean b = obj2.canReplace(obj1);
          if (b) {
             if (EditOriginFileDrawer.isEditOriginFileDrawer(p1)) {
                Object obj4 = obj2;
                EditorSdk2V2$AnimatedSubAsset uAnimatedSub = k3.f(p1.getLayerIndex(), obj.C.i());
                if (uAnimatedSub == null) {
                   i1.c(new RuntimeException("replaceSameTypeDrawer currentAnimatedSubAsset is null"));
                   return i;
                }else {
                   try{
                      EditorSdk2UtilsV2.animatedSubAssetReplaceFile(uAnimatedSub, k3.t(obj1, this.Z8()));
                   }catch(java.lang.Exception e0){
                      PostUtils.D("StickerEditorPresenter", "replaceSameTypeDrawer", e0);
                   }
                   obj3 = obj.G;
                   String str = k3.t(obj1, this.Z8());
                   long l = uAnimatedSub.assetId();
                   i1 = (obj1.getRealStickerType((this.Z8() ^ true)) == 2)? 1: 0;
                   b uob = v7;
                   b uob1 = new b(p0, str, l, i1);
                   try{
                      obj4.replace(obj3, uob, obj1);
                      uAnimatedSub.setDataId(Long.valueOf(obj1.mStickerId).longValue());
                   }catch(java.lang.NumberFormatException e0){
                      i1.c(e0);
                   }
                   if (obj1.getRealStickerType((this.Z8() ^ true)) == -0.00f) {
                      k3.e(obj1, uAnimatedSub);
                   }else {
                      uAnimatedSub.setFileType(true);
                   }
                   obj.C.e();
                   double d = 0x3fb999999999999a;
                   if (obj.C.g() - ((p1.getStartTime() + p1.getDuration()) - d) >= 0) {
                      obj.C.o(((p1.getStartTime() + p1.getDuration()) - d));
                      objArray = new Object[0];
                      a.D().w("StickerEditorPresenter", "replaceSameTypeDrawer seek", objArray);
                   }
                   Object[] objArray1 = new Object[0];
                   a.D().w("StickerEditorPresenter", "replaceSameTypeDrawer is EditOriginFileRenderViewDrawer selectDrawer:"+obj2+",editOriginFileDrawer:"+obj4, objArray1);
                }
             }else {
                obj2.replace(obj.G, obj1);
                Object[] objArray2 = new Object[0];
                a.D().w("StickerEditorPresenter", "replaceSameTypeDrawer watermark sticker replace", objArray2);
             }
          }
          obj3 = obj.s;
          int layerIndex = p1.getLayerIndex();
          k3 ok3 = k3.class;
          if (!PatchProxy.isSupport(ok3) || !PatchProxy.applyVoidTwoRefs(obj3, Integer.valueOf(layerIndex), null, ok3, "42")) {
             Sticker$b uob2 = j.c(layerIndex, obj3);
             if (uob2 != null) {
                StickerResult$b uob3 = uob2.getResult().toBuilder();
                uob3.m("");
                uob2.h(uob3);
             }
          }
          objArray = new Object[0];
          a.D().w("StickerEditorPresenter", "replaceSameTypeDrawer canReplace:"+b+",selectDrawer:"+obj2+",stickerDetailInfo:"+obj1, objArray);
          return b;
       }
    }
    public EditStickerBaseDrawer b9(EditStickerBaseDrawer p0){
       a obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(p0.getLayerIndex(), this.H.d);
       if (obj == null) {
          i1.c(new RuntimeException("selectAddedSticker added sticker but can not find it in ui"));
          return null;
       }else {
          this.x.set(obj);
          obj.A(true);
          obj.B(true);
          int i = 0;
          if (this.C.b()) {
             e tH = this.H;
             EditorSdk2V2$VideoEditorProject project = this.C.getProject();
             Object obj1 = this.x.get();
             if (!PatchProxy.applyVoidThreeRefs(tH, project, obj1, null, k3.class, "27") && (tH.i.j != null && project.trackAssets(i).clippedRange() != null)) {
                double d = project.trackAssets(i).clippedRange().duration();
                if (d - null > 0) {
                   obj1.E(d);
                }
             }
          }
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = k3.f(p0.getLayerIndex(), this.C.i());
          if (uAnimatedSub != null) {
             uAnimatedSub.setRenderType(3);
             k3.b(uAnimatedSub.keyFrames(i).assetTransform());
          }else {
             Object[] objArray1 = new Object[i];
             a.D().w("StickerEditorPresenter", "selectAddedSticker animatedSubAsset is null maybe add watermark or vote sticker", objArray1);
          }
          this.C.e();
          this.w.onNext(new Object());
          this.G.T();
          if (this.y.d(p0)) {
             this.y.f(p0);
          }
          Object[] objArray = new Object[i];
          a.D().w("StickerEditorPresenter", "select zIndex:"+p0.getLayerIndex()+",needSelectedDefaultRangeData:"+obj+",layerCount:"+f.m, objArray);
          return p0;
       }
    }
    public final void c9(Action p0,EditorSdk2V2$AnimatedSubAsset p1,String p2,EditStickerBaseDrawer p3,boolean p4,List p5){
       String str2;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       e uoe = e.class;
       int i = 1;
       int i1 = 3;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,oobject2,Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, obj, uoe, "13")) {
             return;
          }
       }
       h oh = obj.v.l();
       int i2 = (!obj.C.b())? (int)Math.ceil(p0.c()): 0;
       float f = (this.Z8())? oh.p0(i2): oh.r0(i2);
       int i3 = (this.Z8())? 0x3f800000: f;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = b.h(oobject2.generateAnimatedSubAssetCommonData(obj.G.getEditorRect(), obj.C.p(i2), f, this.Z8()), p1, p3.getDecorationFilePath(), p0.l(), p0.c(), p0.d(), b.i(oobject1, Integer.valueOf(p0.l())), false);
       if (!this.Z8()) {
          uAnimatedSub.setOpaque(b.x(uAnimatedSub.opaque(), oh.r0(i2)));
       }
       String str = "unSelectInner save to draft failed";
       String str1 = "StickerEditorPresenter";
       switch (p3.getEditStickerType()){
           case 0:
           case 2:
           case 4:
             str2 = str1;
             uAnimatedSub.setRenderType(i1);
             if (!k3.F(obj.s, p0.k(), uAnimatedSub, p5, p4, i3)) {
                i1.c(new RuntimeException(str));
             }
             k3.b(uAnimatedSub.keyFrames(0).assetTransform());
             break;
           case 1:
           case 5:
           case 6:
           case 3:
             EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = obj.C.i();
             Object obj1 = PatchProxy.applyTwoRefs(uAnimatedSub1, uAnimatedSub, null, k3.class, "33");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.booleanValue();
             }else {
                int len = uAnimatedSub1.length;
                int i4 = 0;
                while (true) {
                   if (i4 < len) {
                      if (uAnimatedSub.assetId() - uAnimatedSub1[i4].assetId()) {
                         i4 = i4 + 1;
                      }
                   }else {
                      i = false;
                   }
                }
             }
             if (!i) {
                uoe = obj.C;
                uoe.k(a.c(uoe.i(), uAnimatedSub, f.r));
                Object[] objArray2 = new Object[0];
                a.D().w(str1, "unSelectInner animatedSubAsset not in project maybe watermark or vote sticker first unselect", objArray2);
             }
             uAnimatedSub.setRenderType(i1);
             str2 = str1;
             if (!k3.F(obj.s, p0.k(), uAnimatedSub, p5, p4, i3)) {
                i1.c(new RuntimeException(str));
             }
             break;
           default:
             str2 = str1;
       }
       obj.C.e();
       k1.o(new i(obj, oobject2));
       Object[] objArray1 = new Object[0];
       a.D().w(str2, "unSelectInner action:"+oobject+",prefix:"+oobject1+",editStickerBaseDrawer:"+oobject2, objArray1);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2eff);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new o());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.r = this.r8("EDITOR_VIEW_LISTENERS");
       this.s = this.r8("STICKER");
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("HIDE_STICKER_LIBRARY_EVENT");
       this.v = this.r8("EDITOR_HELPER_CONTRACT");
       this.w = this.r8("DECORATION_TIMELINE_UPDATE");
       this.x = this.x8("DECORATION_EDITING_ACTION");
       this.y = this.r8("STICKER_DECORATION_DRAWER_FILE_MANAGER");
       this.z = this.r8("WORKSPACE");
       this.B = this.x8("IS_STICKER_LIBRARY_SHOWING");
       this.C = this.r8("DECORATION_PLAYER");
       this.D = this.r8("EDITOR_DELEGATE");
       this.G = this.r8("DECORATION_CONTAINER_VIEW");
       this.E = this.w8("IS_KEYBOARD_SHOWING");
       this.F = this.x8("IS_IN_ADD_SEEKING");
       return;
    }
}
