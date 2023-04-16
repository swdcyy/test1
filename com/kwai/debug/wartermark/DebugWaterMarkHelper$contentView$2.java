package com.kwai.debug.wartermark.DebugWaterMarkHelper$contentView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.debug.wartermark.DebugWaterMarkHelper;
import android.widget.LinearLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;

public final class DebugWaterMarkHelper$contentView$2 extends Lambda implements a	// class@000cfb
{
    public final DebugWaterMarkHelper this$0;

    public void DebugWaterMarkHelper$contentView$2(DebugWaterMarkHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final LinearLayout invoke(){
       LinearLayout obj = PatchProxy.apply(null, this, DebugWaterMarkHelper$contentView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugWaterMarkHelper f = this.this$0.f;
       if (f == null) {
          a.S("rootView");
       }
       obj = new LinearLayout(f.getContext());
       obj.setOrientation(1);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
