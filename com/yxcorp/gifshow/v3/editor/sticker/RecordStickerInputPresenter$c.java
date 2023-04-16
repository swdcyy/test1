package com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class RecordStickerInputPresenter$c implements ValueAnimator$AnimatorUpdateListener	// class@0011fe
{
    public final RecordStickerInputPresenter a;

    public void RecordStickerInputPresenter$c(RecordStickerInputPresenter p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStickerInputPresenter$c.class, "1")) {
          return;
       }
       EditDecorationBaseDrawer uEditDecorat = this.a.V8();
       if (uEditDecorat != null) {
          a.o(p0, "it");
          p0 = p0.getAnimatedValue();
          Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
          uEditDecorat.setMoveX((p0.floatValue() / (float)this.a.P8().getWidth()));
       }
       RecordStickerInputPresenter$c ta = this.a;
       uEditDecorat = ta.V8();
       EditDecorationBaseDrawer uEditDecorat1 = this.a.V8();
       float f = 0;
       Float uFloat = (uEditDecorat1 != null)? Float.valueOf(uEditDecorat1.getMoveX()): f;
       EditDecorationBaseDrawer uEditDecorat2 = this.a.V8();
       if (uEditDecorat2 != null) {
          f = Float.valueOf(uEditDecorat2.getMoveY());
       }
       ta.Z8(uEditDecorat, uFloat, f);
       EditDecorationBaseDrawer uEditDecorat3 = this.a.V8();
       if (uEditDecorat3 != null) {
          uEditDecorat3.update();
       }
       this.a.P8().T();
       return;
    }
}
