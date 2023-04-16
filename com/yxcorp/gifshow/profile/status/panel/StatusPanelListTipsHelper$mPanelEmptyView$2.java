package com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper$mPanelEmptyView$2;
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
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;

public final class StatusPanelListTipsHelper$mPanelEmptyView$2 extends Lambda implements a	// class@0015bb
{
    public final StatusPanelListTipsHelper this$0;

    public void StatusPanelListTipsHelper$mPanelEmptyView$2(StatusPanelListTipsHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       View view;
       View obj = PatchProxy.apply(null, this, StatusPanelListTipsHelper$mPanelEmptyView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.i(this.this$0.a, R.layout.arg_RES_7f0d156a);
       String str = "findViewById<View>\(R.id.image_hint\)";
       if (this.this$0.p == 1) {
          view = obj.findViewById(R.id.image_hint);
          a.o(view, str);
          view.setBackground(j.n(obj.getContext(), R.drawable.arg_RES_7f082212, 0x7f060929));
          view = obj.findViewById(R.id.tv_hint);
          a.o(view, "findViewById<TextView>\(R.id.tv_hint\)");
          view.setText(a1.p(R.string.arg_RES_7f103fbd));
       }else {
          view = obj.findViewById(R.id.image_hint);
          a.o(view, str);
          view.setBackground(j.n(obj.getContext(), R.drawable.arg_RES_7f080938, 0x7f060929));
          view = obj.findViewById(R.id.tv_hint);
          a.o(view, "findViewById<TextView>\(R.id.tv_hint\)");
          view.setText(a1.p(R.string.arg_RES_7f103fbe));
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
