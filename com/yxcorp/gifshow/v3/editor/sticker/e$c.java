package com.yxcorp.gifshow.v3.editor.sticker.e$c;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import itc.x2;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import aw9.z;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import itc.k3;
import java.lang.Integer;
import java.lang.Number;
import ekd.j;
import wba.b;
import s16.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileRenderViewDrawer;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import com.yxcorp.gifshow.widget.adv.model.a;
import uld.j;
import com.yxcorp.gifshow.edit.draft.model.c;
import itc.r3;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import uld.g;
import im8.f;
import android.view.MotionEvent;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.Action;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import itc.j;
import java.lang.Runnable;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.widget.adv.c;
import zv9.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.widget.AbsoluteLayout;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.i;

public class e$c extends DecorationContainerView$e	// class@00122e
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "6")) {
       }else {
          super.b(p0);
          x2.f(p0.getDecorationName());
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "10")) {
       }else {
          super.c(p0);
          this.a.u.onNext(Boolean.TRUE);
          this.a.C.pause();
       }
       return;
    }
    public void d(BaseDrawer p0,Object p1){
       Object[] obj;
       int i;
       a uoa;
       Object[] objArray;
       int i1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$c.class, "5")) {
       }else {
          super.d(p0, p1);
          p1 = this.a;
          Objects.requireNonNull(p1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoidOneRefs(p0, p1, e.class, "14")) {
             int layerIndex = p0.getLayerIndex();
             EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = p1.C.i();
             if (k3.f(layerIndex, p1.C.i()) != null) {
                e c = p1.C;
                k3 ok3 = k3.class;
                if (PatchProxy.isSupport(ok3)) {
                   obj = PatchProxy.applyTwoRefs(Integer.valueOf(layerIndex), uAnimatedSub, null, ok3, "29");
                   if (obj != patchProxyRe) {
                      i = obj.intValue();
                   }else if(!j.h(uAnimatedSub)){
                      i = uAnimatedSub.length;
                      uoa = null;
                      int i2 = 0;
                      while (i2 < i && b.o(uAnimatedSub[i2].opaque()) != layerIndex) {
                         int i3 = uoa + 1;
                         if (i3 == uAnimatedSub.length) {
                            i3 = -1;
                         }
                         i2 = i2 + 1;
                      }
                      i = uoa;
                   }else {
                      i = -1;
                   }
                }else {
                   goto label_005e ;
                }
                uoa = a.class;
                if (PatchProxy.isSupport(uoa)) {
                   objArray = PatchProxy.applyTwoRefs(uAnimatedSub, Integer.valueOf(i), null, uoa, "6");
                   if (objArray != patchProxyRe) {
                   label_00a6 :
                      c.k(objArray);
                      p1.C.e();
                      obj = new Object[0];
                      a.D().w("StickerEditorPresenter", "delete deleted AnimatedSubAsset not exist£¬maybe first selected decorationDrawer:"+p0, obj);
                   }
                }
                if (uAnimatedSub == null) {
                   uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[0];
                }
                EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = new EditorSdk2V2$AnimatedSubAsset[(uAnimatedSub.length - 1)];
                objArray = a.g(uAnimatedSub, uAnimatedSub1, i);
                goto label_00a6 ;
             }
             if (EditOriginFileRenderViewDrawer.isEditOriginFileRenderViewDrawer(p0)) {
                p1.C.f(p0.getRenderView());
             }
             a uoa1 = j.b(layerIndex, p1.H.d);
             p1.H.d.remove(uoa1);
             p1.w.onNext(new Object());
             List list = p1.s.z();
             r3 or3 = r3.class;
             if (PatchProxy.isSupport(or3)) {
                Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(layerIndex), list, null, or3, "6");
                if (obj1 != patchProxyRe) {
                   i1 = obj1.intValue();
                }else {
                label_0112 :
                   i1 = 0;
                   while (true) {
                      if (i1 < list.size()) {
                         if (layerIndex != list.get(i1).getResult().getZIndex()) {
                            i1 = i1 + 1;
                         }
                      }else {
                         i1 = -1;
                      }
                   }
                }
             }else {
                goto label_0112 ;
             }
             if (i1 != -1) {
                p1.s.V(i1);
             }
             if (p1.y.d(p0)) {
                p1.y.f(p0);
             }
             p1.x.set(null);
             String decorationNa = p0.getDecorationName();
             if (!PatchProxy.applyVoidOneRefs(decorationNa, null, x2.class, "6")) {
                x2.e(decorationNa, "drop_sticker");
             }
             Object[] objArray1 = new Object[0];
             a.D().w("StickerEditorPresenter", "delete zIndex:"+layerIndex+",defaultRangeData:"+uoa1+",mEditableActionLayerCount:"+f.m+",stickerIndex:"+i1, objArray1);
          }
       }
       return;
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "2")) {
       }else {
          super.h(p0);
          this.a.b9(p0);
          this.a.C.pause();
          if (EditStickerBaseDrawer.isTagSticker(p0) || EditStickerBaseDrawer.isVoteSticker(p0)) {
             this.a.u.onNext(Boolean.TRUE);
          }
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "9")) {
       }else {
          super.i(p0);
          this.a.u.onNext(Boolean.TRUE);
          this.a.C.pause();
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$c.class, "1")) {
       }else {
          super.k(p0, p1);
          if (this.a.B.get().booleanValue()) {
             this.a.u.onNext(Boolean.TRUE);
          }else {
             e e = this.a.E;
             if (e == null || !e.get().booleanValue()) {
                this.a.G.R();
             }
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       String str;
       float f;
       Object[] objArray;
       double d;
       Object obj = this;
       e$c obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e$c.class, "4")) {
       }else {
          super.l(obj1);
          if (!EditStickerBaseDrawer.isTagSticker(obj1) || !(obj1.getContent()).isEmpty()) {
             obj1 = obj.a;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoid(null, obj1, e.class, "11")) {
                Object obj2 = obj1.x.get().d();
                obj2.g(k3.h(obj2, obj1.C, obj1.H));
                EditDecorationBaseDrawer uEditDecorat = obj2.k();
                EditorSdk2V2$AnimatedSubAsset uAnimatedSub = obj2.j(obj1.C.i());
                if (EditStickerBaseDrawer.isVoteSticker(uEditDecorat)) {
                   str = "interact_sticker-";
                }else if(EditStickerBaseDrawer.isTagSticker(uEditDecorat)){
                   if (TextUtils.x(uEditDecorat.getDecorationFilePath())) {
                      uEditDecorat.setNeedReGenerateFile(true);
                   }
                   str = "tag_sticker-";
                }else {
                   str = "sticker-";
                }
                String str1 = str;
                if (uEditDecorat.isNeedReGenerateFile()) {
                   j oj = new j(obj1, uEditDecorat, obj2, uAnimatedSub, str1, obj1.W8());
                   uEditDecorat.setAfterFileGeneratedRunnable(v15);
                   int i = (obj1.z.a1() == Workspace$Type.ATLAS || obj1.z.a1() == Workspace$Type.LONG_PICTURE)? (int)obj2.c(): 0;
                   if (obj1.Z8()) {
                      f = 0x3f800000;
                   }else {
                      e g = obj1.G;
                      e c = obj1.C;
                      if (PatchProxy.isSupport(a.class)) {
                         Object obj3 = PatchProxy.applyThreeRefs(g, c, Integer.valueOf(i), null, a.class, "4");
                         if (obj3 != PatchProxyResult.class) {
                            d = obj3.doubleValue();
                         }else if(g == null || c == null){
                            d = 0x3ff0000000000000;
                         }else {
                            d = (double)((float)c.p(i).b / (float)g.getWidth());
                         }
                      }else {
                         goto label_00f0 ;
                      }
                      f = (float)d;
                   }
                   uEditDecorat.generateDecorationBitmap(f, obj1.v.l().p0(i), obj1.Z8());
                   obj1.y.a(uEditDecorat);
                   uEditDecorat.setNeedReGenerateFile(false);
                   objArray = new Object[false];
                   a.D().w("StickerEditorPresenter", "unSelect need generate new file", objArray);
                }else {
                   obj1.c9(obj2, uAnimatedSub, str1, uEditDecorat, 0, obj1.W8());
                   objArray = new Object[false];
                   a.D().w("StickerEditorPresenter", "unSelect do not need generate new file", objArray);
                }
                a uoa = obj1.x.get();
                uoa.B(false);
                uoa.A(true);
                obj1.w.onNext(new Object());
                obj1.x.set(null);
             }
          }
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "8")) {
       }else {
          super.p(p0);
          this.a.u.onNext(Boolean.TRUE);
          this.a.C.pause();
       }
       return;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "3")) {
       }else {
          super.v(p0);
          if (EditStickerBaseDrawer.isTagSticker(p0) || EditStickerBaseDrawer.isVoteSticker(p0)) {
             this.a.u.onNext(Boolean.TRUE);
          }
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "7")) {
       }else {
          super.x(p0);
          x2.f(p0.getDecorationName());
       }
       return;
    }
}
