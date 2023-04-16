package com.tachikoma.core.component.f;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;
import com.tachikoma.core.component.e;
import android.view.ScaleGestureDetector;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wo8.h;
import sp8.b$a;

public class f extends ScaleGestureDetector$SimpleOnScaleGestureListener	// class@000d6e
{
    public final e a;

    public void f(e p0){
       this.a = p0;
       super();
    }
    public boolean onScale(ScaleGestureDetector p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.dispatchEvent("pinch", new h(this, p0.getScaleFactor()));
       return true;
    }
}
