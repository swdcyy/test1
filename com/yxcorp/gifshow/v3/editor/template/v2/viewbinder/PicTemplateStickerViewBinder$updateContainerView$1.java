package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$updateContainerView$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import snd.a;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.graphics.Rect;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.view.ViewGroup;
import android.view.View;
import wnd.d;

public final class PicTemplateStickerViewBinder$updateContainerView$1 extends Lambda implements a	// class@00139e
{
    public final PicTemplateStickerViewBinder this$0;

    public void PicTemplateStickerViewBinder$updateContainerView$1(PicTemplateStickerViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ViewGroup viewGroup;
       ViewGroup viewGroup1;
       if (PatchProxy.applyVoid(null, this, PicTemplateStickerViewBinder$updateContainerView$1.class, "1")) {
          return;
       }
       PicTemplateStickerViewBinder$updateContainerView$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       View obj = PatchProxy.apply(null, tthis$0, PicTemplateStickerViewBinder.class, "14");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.g(tthis$0.g.getShowingDelegate(), tthis$0.l) ^ 0x01;
       if (b) {
          return;
       }else {
          tthis$0 = this.this$0;
          BaseEditorPreviewContainerLayout uBaseEditorP = tthis$0.G().J();
          a.o(uBaseEditorP, "editorDelegate.previewContainer");
          a.a(tthis$0.g, uBaseEditorP);
          this.this$0.g.e0();
          List decorationDr = this.this$0.g.getDecorationDrawerList();
          a.o(decorationDr, "mContainerView.decorationDrawerList");
          Iterator iterator = decorationDr.iterator();
          while (iterator.hasNext()) {
             Rect rect = iterator.next();
             a.o(rect, "element");
             int i = 0;
             rect.setAdditionOffsetY(i);
             rect.mEditRect = new Rect(i, i, this.this$0.g.getWidth(), this.this$0.g.getHeight());
             rect.update();
             if (rect.isShowing()) {
                PicTemplateStickerViewBinder$updateContainerView$1 tthis$01 = this.this$0;
                Objects.requireNonNull(tthis$01);
                PicTemplateStickerViewBinder obj1 = PatchProxy.apply(null, tthis$01, PicTemplateStickerViewBinder.class, "12");
                if (obj1 != PatchProxyResult.class) {
                   viewGroup = obj1;
                }else {
                   obj1 = tthis$01.j;
                   a.o(obj1, "mPictureRV");
                   if (obj1.getChildCount() > 0) {
                      obj = tthis$01.j.getChildAt(i);
                      Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
                      viewGroup1 = obj.findViewById(R.id.text_fake_view_container);
                   }else {
                      viewGroup1 = null;
                   }
                   viewGroup = viewGroup1;
                }
                d.e(rect, viewGroup, this.this$0.J(), false, 8, null);
             }
          }
          return;
       }
    }
}
