package com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper$mErrorView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;
import android.view.ViewGroup;
import i2b.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;

public final class StatusPanelListTipsHelper$mErrorView$2 extends Lambda implements a	// class@0015b9
{
    public final StatusPanelListTipsHelper this$0;

    public void StatusPanelListTipsHelper$mErrorView$2(StatusPanelListTipsHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       View obj = PatchProxy.apply(null, this, StatusPanelListTipsHelper$mErrorView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.i(this.this$0.a, R.layout.arg_RES_7f0d156b);
       View view = obj.findViewById(R.id.image_hint);
       a.o(view, "findViewById<View>\(R.id.image_hint\)");
       view.setBackground(j.n(obj.getContext(), R.drawable.arg_RES_7f080937, 0x7f060929));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
