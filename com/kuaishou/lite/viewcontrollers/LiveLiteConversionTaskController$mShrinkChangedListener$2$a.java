package com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$mShrinkChangedListener$2$a;
import z1.a;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$mShrinkChangedListener$2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController;
import jl0.c;

public final class LiveLiteConversionTaskController$mShrinkChangedListener$2$a implements a	// class@000948
{
    public final LiveLiteConversionTaskController$mShrinkChangedListener$2 a;

    public void LiveLiteConversionTaskController$mShrinkChangedListener$2$a(LiveLiteConversionTaskController$mShrinkChangedListener$2 p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       LiveLiteConversionTaskController$mShrinkChangedListener$2$a omShrinkChan = LiveLiteConversionTaskController$mShrinkChangedListener$2$a.class;
       if (!PatchProxy.isSupport(omShrinkChan) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, omShrinkChan, "1")) {
          LiveLiteConversionTaskController k = this.a.this$0.k;
          if (k != null) {
             k.e(b);
          }
       }
       return;
    }
}
