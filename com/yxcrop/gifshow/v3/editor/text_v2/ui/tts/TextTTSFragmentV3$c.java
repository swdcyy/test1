package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3$c;
import android.view.animation.Animation$AnimationListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
import android.view.ViewGroup;

public final class TextTTSFragmentV3$c implements Animation$AnimationListener	// class@000b60
{
    public final TextTTSFragmentV3 b;

    public void TextTTSFragmentV3$c(TextTTSFragmentV3 p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTTSFragmentV3$c.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       return;
    }
    public void onAnimationRepeat(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTTSFragmentV3$c.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTTSFragmentV3$c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.b.u1().setAlpha(0x3f800000);
       if (this.b.u1().getParent() != null) {
          ViewParent parent = this.b.u1().getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.setAlpha(0x3f800000);
       }
       return;
    }
}
