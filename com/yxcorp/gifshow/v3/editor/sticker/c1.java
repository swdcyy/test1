package com.yxcorp.gifshow.v3.editor.sticker.c1;
import com.yxcorp.gifshow.v3.editor.sticker.j0;
import com.yxcorp.gifshow.v3.editor.sticker.c1$a;
import uld.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uld.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.f$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xf6.g;
import xf6.l;
import com.kwai.framework.abtest.f;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.sticker.z0;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import itc.l3;
import com.yxcorp.gifshow.v3.editor.sticker.a1;
import erd.g;
import crd.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import aw9.z;
import wba.b;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import com.yxcorp.gifshow.widget.adv.model.a;
import uld.j;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.Action;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileRenderViewDrawer;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import android.graphics.Rect;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import wba.h0;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import java.lang.Math;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.f;
import java.lang.Double;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.util.Map;

public class c1 extends j0	// class@00121c
{
    public EditDecorationContainerView$b W;

    public void c1(){
       super();
       this.W = new c1$a(this);
       this.U7(new z());
       this.U7(new s());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "1")) {
          return;
       }
       super.E8();
       this.G.setDelegate(this.W);
       e tG = this.G;
       f$a uoa = new f$a();
       Workspace$Type kTV_SONG = Workspace$Type.KTV_SONG;
       boolean b = true;
       boolean b1 = (this.z.a1() != kTV_SONG)? true: false;
       uoa.b(b1);
       String str = (g.o1() && l.c("KEY_STICKER_SAFE_AREA", false))? 1: null;
       if (!str && (!f.a("enableStickerSafeArea") || this.z.a1() == kTV_SONG)) {
          b = false;
       }
       uoa.a(b);
       uoa.c(a1.p(R.string.arg_RES_7f105057));
       uoa.d(false);
       tG.X(uoa, z0.a);
       this.G.e0();
       this.X7(this.t.m().subscribe(new l3(this), a1.b));
       return;
    }
    public void S8(){
       c1 uoc1 = c1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc1, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc1, "3")) {
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = this.C.i();
          int len = uAnimatedSub.length;
          int i = 0;
          while (i < len) {
             object oobject = uAnimatedSub[i];
             a uoa = j.b(b.o(oobject.opaque()), this.H.d);
             if (uoa == null) {
                Object[] objArray1 = new Object[0];
                a.D().w("StickerVideosEditorPresenter", "confirmAndStickerFilePrepared this AnimatedSubAsset not sticker opaque:"+oobject.opaque(), objArray1);
             }else {
                h oh = this.v.l();
                EditStickerBaseDrawer uEditSticker = uoa.d().k();
                if (EditOriginFileRenderViewDrawer.isEditOriginFileRenderViewDrawer(uEditSticker)) {
                   oobject.setOpaque(b.x(oobject.opaque(), oh.r0(0)));
                   oobject.keyFrames(0).setAssetTransform(b.k(uEditSticker.generateAnimatedSubAssetCommonData(this.G.getEditorRect(), this.C.p(0), oh.r0(0), 0)));
                }
                oobject.setRenderType(0);
             }
             i = i + 1;
          }
          this.C.e();
       }
       return;
    }
    public double X8(StickerDetailInfo p0){
       double d1;
       Object obj = PatchProxy.applyOneRefs(p0, this, c1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0;
       if (StickerDetailInfo.isInteractiveSticker(p0)) {
          return d;
       }
       if (this.H.i.o) {
          d = Math.min(this.C.g(), (this.C.q() - (double)this.H.i.o));
       }else {
          d1 = 0x3fb999999999999a;
          if (!PostExperimentUtils.X() || (this.C.q() - d1) - this.C.g() >= 0) {
             d = Math.min(this.C.g(), (this.C.q() - d1));
          }
       }
       if (f.s(this.D.x().f())) {
          d = this.C.g();
       }
       d1 = d;
       EditorSdk2V2$VideoEditorProject videoEditorP = this.D.x().f();
       d = (PostExperimentUtils.X())? this.C.q(): 3.00f;
       return f.j(d1, videoEditorP, d, 0);
    }
    public double Y8(double p0){
       ITimelineView$d obj;
       double d;
       c1 uoc1 = c1.class;
       if (PatchProxy.isSupport(uoc1)) {
          obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, uoc1, "6");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       if (f.s(this.D.x().f())) {
          if (PostExperimentUtils.X()) {
             if (this.C.g() - 0x3fb999999999999a < 0) {
                return this.C.q();
             }else {
                return this.C.g();
             }
          }else {
             return Math.max(Math.min(3.00f, this.C.g()), 0x3fb999999999999a);
          }
       }else {
          obj = this.H.i.o;
          if (obj) {
             d = Math.min((double)obj, (this.C.q() - p0));
             if (PostExperimentUtils.X()) {
                d = Math.max((double)this.H.i.o, (this.C.q() - p0));
             }
             return Math.max(d, 0x3fb999999999999a);
          }else if(PostExperimentUtils.X()){
             d = this.C.q() - p0;
          }else {
             d = Math.min(3.00f, (this.C.q() - p0));
          }
          return Math.max(d, 0x3fb999999999999a);
       }
    }
    public EditStickerBaseDrawer b9(EditStickerBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = super.b9(p0);
       if (p0 != null) {
          this.R8(p0);
       }
       return p0;
    }
    public a e9(StickerDetailInfo p0,EditorSdk2V2$AnimatedSubAsset p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V8(p0, p1, p1.displayRange().start());
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(c1.class, null);
       return objectsByTag;
    }
    public EditStickerBaseDrawer j9(StickerDetailInfo p0,EditorSdk2V2$AnimatedSubAsset p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditStickerBaseDrawer uEditSticker = super.j9(p0, p1);
       if (uEditSticker != null) {
          this.R8(uEditSticker);
       }
       return uEditSticker;
    }
}
