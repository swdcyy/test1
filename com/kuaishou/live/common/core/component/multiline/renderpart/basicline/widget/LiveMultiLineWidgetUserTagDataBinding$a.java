package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import j83.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sz1.e;
import sz1.f;
import java.lang.CharSequence;
import android.widget.TextView;
import sq1.f$e;
import sq1.f;

public final class LiveMultiLineWidgetUserTagDataBinding$a implements Observer	// class@001556
{
    public final LiveMultiLineWidgetUserTagDataBinding b;
    public final LiveMediumTextView c;
    public final b d;

    public void LiveMultiLineWidgetUserTagDataBinding$a(LiveMultiLineWidgetUserTagDataBinding p0,LiveMediumTextView p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineWidgetUserTagDataBinding$a.class, "1")) {
       }else {
          LiveMultiLineWidgetUserTagDataBinding$a tb = this.b;
          tb.b(p0, this.c, f.a(tb.c));
          tb = this.c;
          if (p0 == null) {
             p0 = "";
          }
          tb.setText(p0);
          this.d.g(f$e.a);
       }
       return;
    }
}
