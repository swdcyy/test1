package com.facebook.react.uimanager.BaseViewManager$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import com.facebook.react.uimanager.BaseViewManager;
import ze.p0;
import com.facebook.react.uimanager.b$a;
import com.facebook.react.uimanager.b;
import ze.p;

public final class BaseViewManager$b implements ViewTreeObserver$OnPreDrawListener	// class@001313
{
    public final View b;
    public final ReadableArray c;

    public void BaseViewManager$b(View p0,ReadableArray p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, BaseViewManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       p0.b(this.b.getWidth(), this.b.getHeight(), this.c, BaseViewManager.sTransformDecompositionArray);
       b.k(BaseViewManager.sTransformDecompositionArray, BaseViewManager.sMatrixDecompositionContext);
       this.b.setTranslationX(p.c(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.translation[0])));
       this.b.setTranslationY(p.c(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.translation[1])));
       this.b.setRotation(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.rotationDegrees[2]));
       this.b.setRotationX(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.rotationDegrees[0]));
       this.b.setRotationY(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.rotationDegrees[1]));
       this.b.setScaleX(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.scale[0]));
       this.b.setScaleY(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.scale[1]));
       return 0;
    }
}
