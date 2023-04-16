package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$updateContainerView$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.widget.AbsoluteLayout;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import snd.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.view.ViewGroup;
import wnd.d;

public final class AtlasOrSinglePictureSubViewBinder$updateContainerView$1 extends Lambda implements a	// class@000b41
{
    public final AtlasOrSinglePictureSubViewBinder this$0;

    public void AtlasOrSinglePictureSubViewBinder$updateContainerView$1(AtlasOrSinglePictureSubViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       boolean b;
       List tag;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AtlasOrSinglePictureSubViewBinder$updateContainerView$1.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w(this.this$0.H(), "resizeContainerView: ", objArray1);
       AtlasOrSinglePictureSubViewBinder$updateContainerView$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj = PatchProxy.apply(objArray, tthis$0, AtlasOrSinglePictureSubViewBinder.class, "12");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Object[] objArray2 = new Object[0];
          a.D().w(tthis$0.H(), "isDetach: "+tthis$0.d, objArray2);
          b = tthis$0.d;
       }
       if (b != null) {
          return;
       }else if(this.this$0.J()){
          tag = this.this$0.h.getTag(R.id.new_container_view_pull_animator);
          if (tag instanceof AnimatorSet) {
             objArray = tag;
          }
          if (objArray != null && objArray.isRunning()) {
             objArray.removeListener(this.this$0.u);
             objArray.addListener(this.this$0.u);
          }else {
             tthis$0 = this.this$0;
             BaseEditorPreviewContainerLayout uBaseEditorP = tthis$0.w.J();
             a.o(uBaseEditorP, "delegate.previewContainer");
             a.a(tthis$0.h, uBaseEditorP);
          }
       }
       this.this$0.h.e0();
       tag = this.this$0.h.getDecorationDrawerList();
       a.o(tag, "mContainerView.decorationDrawerList");
       Iterator iterator = tag.iterator();
       while (iterator.hasNext()) {
          Rect rect = iterator.next();
          a.o(rect, "element");
          rect.setAdditionOffsetY(0);
          rect.mEditRect = new Rect(0, 0, this.this$0.h.getWidth(), this.this$0.h.getHeight());
          rect.update();
          if (rect.isShowing()) {
             if (this.this$0.J()) {
                d.e(rect, this.this$0.D(), this.this$0.I(), false, 8, null);
             }else {
                d.b(rect, this.this$0.D(), true, this.this$0.I(), false, 16, null);
             }
          }
       }
       return;
    }
}
