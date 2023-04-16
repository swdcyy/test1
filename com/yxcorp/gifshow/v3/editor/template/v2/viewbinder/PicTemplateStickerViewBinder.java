package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder;
import ci0.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import buc.i;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$mPreviewViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$mPictureViewModel$2;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$b;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$c;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import uwc.b;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Map;
import qsc.e;
import t36.f;
import com.yxcorp.gifshow.decoration.widget.f$a;
import lnc.a1;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.kwai.robust.PatchProxyResult;
import lwc.h;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$updateContainerView$1;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsoluteLayout;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.ViewTreeObserver;
import guc.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class PicTemplateStickerViewBinder extends a	// class@00139f
{
    public final EditDecorationContainerViewV2 g;
    public final p h;
    public final p i;
    public final ViewPagerRecyclerView j;
    public final Observer k;
    public final PicTemplateStickerViewBinder$c l;
    public final e m;
    public EditDecorationContainerView$b n;
    public final BaseEditorFragment o;
    public final i p;
    public final EditorDelegate q;

    public void PicTemplateStickerViewBinder(BaseEditorFragment p0,i p1,View p2,EditorDelegate p3){
       View view;
       a.p(p0, "fragment");
       a.p(p1, "svm");
       a.p(p2, "view");
       a.p(p3, "editorDelegate");
       super(p0, p1, p2);
       this.o = p0;
       this.p = p1;
       this.q = p3;
       view = p3.q().requireView().findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "editorDelegate.previewFr¡­t_decoration_editor_view\)");
       this.g = view;
       this.h = s.c(new PicTemplateStickerViewBinder$mPreviewViewModel$2(this));
       this.i = s.c(new PicTemplateStickerViewBinder$mPictureViewModel$2(this));
       this.j = p3.q().requireView().findViewById(0x7f0a3096);
       this.k = new PicTemplateStickerViewBinder$b(this);
       this.l = new PicTemplateStickerViewBinder$c(this);
       this.m = new PicTemplateStickerViewBinder$a(this);
    }
    public void B(){
       PicTemplateStickerViewBinder picTemplateS = PicTemplateStickerViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, picTemplateS, "3")) {
          return;
       }
       super.B();
       if (!this.J() && !PatchProxy.applyVoid(objArray, this, picTemplateS, "15")) {
          objArray = new Object[0];
          a.D().w("PicTemplateStickerViewBinder", "enablePicTemplateStickerGesture: ", objArray);
          List decorationDr = this.g.getDecorationDrawerList();
          if (decorationDr != null) {
             Iterator iterator = decorationDr.iterator();
             while (iterator.hasNext()) {
                EditDecorationBaseDrawer uEditDecorat = iterator.next();
                if (uEditDecorat instanceof NewEditStickerBaseDrawer && uEditDecorat.isPicTemplateSticker()) {
                   uEditDecorat.enableAction(0x1000000);
                }
             }
          }
       }
       this.n = this.g.getShowingDelegate();
       this.g.setDelegate(this.l);
       this.H().s0().observe(this.o, this.k);
       f.o0(this.m, this.q.u(), e.class);
       return;
    }
    public void C(){
       PicTemplateStickerViewBinder picTemplateS = PicTemplateStickerViewBinder.class;
       if (PatchProxy.applyVoid(null, this, picTemplateS, "4")) {
          return;
       }
       super.C();
       if (!this.J() && !PatchProxy.applyVoid(null, this, picTemplateS, "16")) {
          Object[] objArray = new Object[false];
          a.D().w("PicTemplateStickerViewBinder", "disablePicTemplateStickerGesture: ", objArray);
          List decorationDr = this.g.getDecorationDrawerList();
          if (decorationDr != null) {
             Iterator iterator = decorationDr.iterator();
             while (iterator.hasNext()) {
                EditDecorationBaseDrawer uEditDecorat = iterator.next();
                if (uEditDecorat instanceof NewEditStickerBaseDrawer && uEditDecorat.isPicTemplateSticker()) {
                   uEditDecorat.disableAction(0x1000000);
                }
             }
          }
       }
       this.g.setDelegate(this.n);
       this.H().s0().removeObserver(this.k);
       f.t0(this.m, this.q.u(), e.class);
       if (!PatchProxy.applyVoid(null, this, picTemplateS, "5")) {
          f$a uoa = new f$a();
          uoa.b(true);
          uoa.a(false);
          uoa.c(a1.p(R.string.arg_RES_7f105058));
          uoa.d(false);
          this.g.X(uoa, null);
       }
       return;
    }
    public final EditorDelegate G(){
       return this.q;
    }
    public final b H(){
       Object obj = PatchProxy.apply(null, this, PicTemplateStickerViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final h I(){
       Object obj = PatchProxy.apply(null, this, PicTemplateStickerViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final boolean J(){
       Object obj = PatchProxy.apply(null, this, PicTemplateStickerViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q.getType() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public final void K(int p0){
       PicTemplateStickerViewBinder picTemplateS = PicTemplateStickerViewBinder.class;
       if (PatchProxy.isSupport(picTemplateS) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, picTemplateS, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PicTemplateStickerViewBinder", "updateContainerView: ", objArray);
       PicTemplateStickerViewBinder$updateContainerView$1 oupdateConta = new PicTemplateStickerViewBinder$updateContainerView$1(this);
       if (!PatchProxy.isSupport(picTemplateS) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), oupdateConta, this, picTemplateS, "11") && p0 >= 0)) {
          Size b = this.I().u0(p0).b;
          Size c = this.I().u0(p0).c;
          if (b > null && c > null) {
             ViewGroup$LayoutParams layoutParams = this.g.getLayoutParams();
             if (layoutParams.height != c || layoutParams.width != b) {
                layoutParams.width = b;
                layoutParams.height = c;
                this.g.setLayoutParams(layoutParams);
             }
             Log.b("PicTemplateStickerViewBinder", "width: "+b+", height: "+c);
             this.g.getViewTreeObserver().addOnGlobalLayoutListener(new j(this, oupdateConta));
          }
       }
       return;
    }
}
