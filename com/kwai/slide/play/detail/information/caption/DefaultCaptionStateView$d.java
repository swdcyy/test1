package com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView$d;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class DefaultCaptionStateView$d implements Observer	// class@0017d0
{
    public final DefaultCaptionStateView b;

    public void DefaultCaptionStateView$d(DefaultCaptionStateView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultCaptionStateView$d.class, "1")) {
       }else {
          p0 = this.b.e;
          if (p0 == null) {
             a.S("mLabelTextView");
          }
          p0.invalidate();
       }
       return;
    }
}
