package com.yxcorp.gifshow.v3.mixed.timeline.h;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.mixed.timeline.i;
import java.lang.Object;
import java.lang.Double;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import gwc.e;
import android.view.View;
import java.lang.Runnable;
import hwc.b;

public final class h implements Observer	// class@00156a
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "13")) {
       }else {
          tb.p.requestLayout();
          tb.V8(p0.doubleValue());
          b.a(tb.p, new e(tb));
       }
       return;
    }
}
