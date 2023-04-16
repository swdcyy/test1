package com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$2$a;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MemoryPreviewToEditorTransitionHelper$2$a extends AnimatorListenerAdapter	// class@001d42
{
    public final View a;

    public void MemoryPreviewToEditorTransitionHelper$2$a(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryPreviewToEditorTransitionHelper$2$a.class, "1")) {
          return;
       }
       View view = this.a.findViewById(R.id.memory_publish_coin);
       if (view != null) {
          view.setAlpha(0x3f800000);
       }
       return;
    }
}
