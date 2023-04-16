package com.yxcorp.gifshow.v3.editor.decoration.guideline.GuideLineView$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.decoration.guideline.GuideLineView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;

public final class GuideLineView$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000f11
{
    public final GuideLineView b;

    public void GuideLineView$b(GuideLineView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, GuideLineView$b.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.c();
       return;
    }
}
