package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$c;
import androidx.lifecycle.Observer;
import j83.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sq1.f$e;
import sq1.f;

public final class LiveMultiLineWidgetUserTagDataBinding$c implements Observer	// class@001559
{
    public final b b;

    public void LiveMultiLineWidgetUserTagDataBinding$c(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineWidgetUserTagDataBinding$c.class, "1")) {
       }else {
          this.b.g(f$e.a);
       }
       return;
    }
}
