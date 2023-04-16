package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import snd.a;

public final class AtlasOrSinglePictureSubViewBinder$c extends AnimatorListenerAdapter	// class@000b38
{
    public final AtlasOrSinglePictureSubViewBinder a;

    public void AtlasOrSinglePictureSubViewBinder$c(AtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       AtlasOrSinglePictureSubViewBinder$c ta = this.a;
       BaseEditorPreviewContainerLayout uBaseEditorP = ta.w.J();
       a.o(uBaseEditorP, "delegate.previewContainer");
       a.a(ta.h, uBaseEditorP);
       this.a.K();
       return;
    }
}
