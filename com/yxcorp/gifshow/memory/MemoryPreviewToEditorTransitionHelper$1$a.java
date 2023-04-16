package com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$1$a;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.ExtensibleRecyclerView;
import com.yxcorp.gifshow.widget.ExtensibleRecyclerView$a;

public final class MemoryPreviewToEditorTransitionHelper$1$a extends AnimatorListenerAdapter	// class@001d3f
{
    public final View a;

    public void MemoryPreviewToEditorTransitionHelper$1$a(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryPreviewToEditorTransitionHelper$1$a.class, "1")) {
          return;
       }
       this.a.x(null);
       return;
    }
}
