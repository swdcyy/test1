package com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.ExtensibleRecyclerView;
import com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$1$b;
import java.lang.Float;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.widget.ExtensibleRecyclerView$a;
import com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$1$a;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public final class MemoryPreviewToEditorTransitionHelper$1 extends Lambda implements l	// class@001d41
{
    public static final MemoryPreviewToEditorTransitionHelper$1 INSTANCE;

    static {
       MemoryPreviewToEditorTransitionHelper$1.INSTANCE = new MemoryPreviewToEditorTransitionHelper$1();
    }
    public void MemoryPreviewToEditorTransitionHelper$1(){
       super(1);
    }
    public final Animator invoke(View p0){
       ObjectAnimator objectAnimat;
       MemoryPreviewToEditorTransitionHelper$1$b obj = PatchProxy.applyOneRefs(p0, this, MemoryPreviewToEditorTransitionHelper$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       if (p0 instanceof ExtensibleRecyclerView) {
          obj = new MemoryPreviewToEditorTransitionHelper$1$b(Float.TYPE, "alpha");
          objectAnimat = ObjectAnimator.ofFloat(p0, obj, new float[2]{0,0x3f800000});
          p0.x(obj);
          objectAnimat.addListener(new MemoryPreviewToEditorTransitionHelper$1$a(p0));
          a.o(objectAnimat, "animator");
          objectAnimat.setInterpolator(new LinearInterpolator());
          objectAnimat.setStartDelay(200);
          objectAnimat.setDuration(200);
       }else {
          float[] uofloatArray = new float[]{0};
          objectAnimat = ValueAnimator.ofFloat(uofloatArray);
          a.o(objectAnimat, "ValueAnimator.ofFloat\(0f\)");
       }
       return objectAnimat;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
