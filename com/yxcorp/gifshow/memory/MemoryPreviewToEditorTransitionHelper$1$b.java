package com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$1$b;
import com.yxcorp.gifshow.widget.ExtensibleRecyclerView$a;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import android.graphics.Canvas;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Number;
import qsd.d;
import android.graphics.RectF;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.lang.Float;

public final class MemoryPreviewToEditorTransitionHelper$1$b extends Property implements ExtensibleRecyclerView$a	// class@001d40
{
    public Integer a;
    public float b;

    public void MemoryPreviewToEditorTransitionHelper$1$b(Class p0,String p1){
       super(p0, p1);
    }
    public void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryPreviewToEditorTransitionHelper$1$b.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       MemoryPreviewToEditorTransitionHelper$1$b ta = this.a;
       if (ta != null) {
          this.a = null;
          p0.restoreToCount(ta.intValue());
       }
       return;
    }
    public void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryPreviewToEditorTransitionHelper$1$b.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       this.a = Integer.valueOf(p0.saveLayerAlpha(null, d.H0((this.b * (float)255)), 31));
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, MemoryPreviewToEditorTransitionHelper$1$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public Object get(Object p0){
       Float uFloat = PatchProxy.applyOneRefs(p0, this, MemoryPreviewToEditorTransitionHelper$1$b.class, "1");
       if (uFloat != PatchProxyResult.class) {
       }else {
          a.p(p0, "view");
          uFloat = Float.valueOf(this.b);
       }
       return uFloat;
    }
    public void set(Object p0,Object p1){
       float f = p1.floatValue();
       if (!PatchProxy.isSupport(MemoryPreviewToEditorTransitionHelper$1$b.class) || !PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(f), this, MemoryPreviewToEditorTransitionHelper$1$b.class, "2")) {
          a.p(p0, "view");
          this.b = f;
          p0.invalidate();
       }
       return;
    }
}
