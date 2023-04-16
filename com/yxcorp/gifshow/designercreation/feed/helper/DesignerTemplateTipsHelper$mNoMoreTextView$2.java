package com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$mNoMoreTextView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;

public final class DesignerTemplateTipsHelper$mNoMoreTextView$2 extends Lambda implements a	// class@0012de
{
    public final DesignerTemplateTipsHelper this$0;

    public void DesignerTemplateTipsHelper$mNoMoreTextView$2(DesignerTemplateTipsHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextView invoke(){
       View obj = PatchProxy.apply(null, this, DesignerTemplateTipsHelper$mNoMoreTextView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.A().findViewById(R.id.no_more_tv);
       a.o(obj, "mNoMoreView.findViewById\(R.id.no_more_tv\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
