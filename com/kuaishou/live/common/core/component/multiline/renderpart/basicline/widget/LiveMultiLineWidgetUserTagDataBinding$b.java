package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import j83.b;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import java.lang.Object;
import lu1.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import sz1.e;
import sz1.f;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import f02.c;

public final class LiveMultiLineWidgetUserTagDataBinding$b implements Observer	// class@001557
{
    public final LiveMultiLineWidgetUserTagDataBinding b;
    public final b c;
    public final LiveMediumTextView d;

    public void LiveMultiLineWidgetUserTagDataBinding$b(LiveMultiLineWidgetUserTagDataBinding p0,b p1,LiveMediumTextView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineWidgetUserTagDataBinding$b.class, "1")) {
       }else {
          this.b.b(this.c.e().getValue(), this.d, f.a(this.b.c));
          a.o(p0, "userTagStyle");
          c.e(p0, this.d);
       }
       return;
    }
}
