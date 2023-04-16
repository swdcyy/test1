package com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder;
import ei0.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$mDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$d;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$b;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import crd.a;
import ktc.b;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import ktc.c;
import com.yxcorp.gifshow.v3.editor.sticker.model.b;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileRenderViewDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import android.widget.AbsoluteLayout;
import ptc.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditWaterMarkStickerDrawer;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.model.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileDrawer;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import java.lang.Number;

public final class StickerElementViewBinder extends a	// class@001237
{
    public EditDecorationContainerView c;
    public AttrAnimProgressFragment d;
    public boolean e;
    public final p f;
    public final StickerElementViewBinder$d g;
    public final Fragment h;
    public final StickerElementViewModel i;
    public final boolean j;

    public void StickerElementViewBinder(Fragment p0,StickerElementViewModel p1,View p2,boolean p3){
       a.p(p0, "fragment");
       a.p(p1, "mStickerViewModel");
       a.p(p2, "rootView");
       super(p2);
       this.h = p0;
       this.i = p1;
       this.j = p3;
       p2 = p2.findViewById(R.id.decoration_editor_view);
       a.o(p2, "rootView.findViewById\(R.id.decoration_editor_view\)");
       this.c = p2;
       this.f = s.c(StickerElementViewBinder$mDisposable$2.INSTANCE);
       this.g = new StickerElementViewBinder$d(this);
       p1.o.observe(p0, new StickerElementViewBinder$a(this));
       p1.q0().observe(p0, new StickerElementViewBinder$b(this));
       p1.j.observe(p0, new StickerElementViewBinder$c(this));
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, StickerElementViewBinder.class, "3")) {
          return;
       }
       this.c.d(this.g);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, StickerElementViewBinder.class, "4")) {
          return;
       }
       this.c.M(this.g);
       this.F().dispose();
       return;
    }
    public final EditStickerBaseDrawer D(b p0,boolean p1){
       EditStickerBaseDrawerData obj2;
       float f;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StickerElementViewBinder stickerEleme = StickerElementViewBinder.class;
       if (PatchProxy.isSupport(stickerEleme)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Boolean.valueOf(p1), obj, stickerEleme, "5");
          if (obj2 != patchProxyRe) {
             return obj2;
          }
       }
       obj2 = p0.b();
       EditOriginFileRenderViewDrawer uEditOriginF = null;
       b c = obj1.c;
       int i = c.b();
       if (i != -2) {
          int i1 = 1;
          if (i != -1) {
             if (i) {
                if (i != i1) {
                   if (i == 2) {
                      b uob = new b(c.a(), obj2.k(), p0.a(), true);
                      EditOriginFileRenderViewDrawer uEditOriginF1 = new EditOriginFileRenderViewDrawer(obj2.m0(), obj2.j0(), obj2.l0(), v15, obj2.A0(), obj2.z0(), (float)obj.c.getWidth());
                   }
                }else {
                   EditWaterMarkStickerDrawer uEditWaterMa = new EditWaterMarkStickerDrawer(c.a(), obj2.m0(), obj2.j0(), obj2.l0(), (float)obj.c.getWidth(), c.d, c.e, c.f);
                }
             }else {
                uEditOriginF = EditOriginFileDrawer.createOriginFileDrawer((i1 ^ obj.j), obj2.m0(), obj2.j0(), obj2.l0(), new a(c.a(), obj2.k(), p0.a()), obj2.A0(), obj2.z0(), (float)obj.c.getWidth());
             }
          }else {
             EditVoteStickerDrawer uEditVoteSti = new EditVoteStickerDrawer(obj1.e, new Pair(obj1.f, obj1.g), obj2.m0(), obj2.j0(), obj2.l0(), obj2.k(), obj1.b, obj2.A0(), obj2.z0(), (obj.j ^ 0x01));
          }
       }else {
          EditTagStickerElement uEditTagStic = new EditTagStickerElement(new EditTagStickerElementData(obj1.h), obj2.m0(), obj2.j0(), obj2.l0());
          uEditOriginF.updateContentDimension(obj2.i(), obj2.f());
       }
       if (p1) {
          obj1 = PatchProxy.applyTwoRefs(obj2, uEditOriginF, obj, stickerEleme, "6");
          if (obj1 != patchProxyRe) {
             f = obj1.floatValue();
          }else {
             f = obj2.A();
             if (uEditOriginF != null) {
                EditStickerBaseDrawerData stickerBaseE = uEditOriginF.getStickerBaseElementData();
                float f1 = (float)0;
                if (stickerBaseE.z0() - f1 > 0 && stickerBaseE.A0() - f1 > 0) {
                   f = ((f * stickerBaseE.A0()) / stickerBaseE.i()) / obj.i.d;
                }
             }
          }
          obj2.b0(f);
       }
       if (uEditOriginF != null) {
          uEditOriginF.updateWithEditStickerBaseDrawData(obj2);
       }
       return uEditOriginF;
    }
    public final EditDecorationContainerView E(){
       return this.c;
    }
    public final a F(){
       Object obj = PatchProxy.apply(null, this, StickerElementViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final StickerElementViewModel G(){
       return this.i;
    }
}
