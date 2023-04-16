package com.kuaishou.live.core.show.ask.LiveAskTabFragment$c;
import com.yxcorp.gifshow.fragment.f;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.d;
import qvb.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import lnc.a1;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$c$a;
import android.view.View$OnClickListener;

public final class LiveAskTabFragment$c extends f	// class@0009bc
{
    public final i l;

    public void LiveAskTabFragment$c(RefreshLayout p0,d p1,i p2,boolean p3){
       a.p(p0, "refreshLayout");
       a.p(p2, "pageList");
       super(p0, p1, p2, p3);
       this.l = p2;
    }
    public View J0(){
       View obj = PatchProxy.apply(null, this, LiveAskTabFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.H(this.a, R.layout.arg_RES_7f0d09e2);
       obj.setBackgroundColor(a1.a(R.color.arg_RES_7f060cb6));
       TextView textView = obj.findViewById(R.id.description);
       a.o(textView, "emptyTextHint");
       textView.setText(a1.p(R.string.arg_RES_7f101e0d));
       a.o(obj, "emptyView");
       return obj;
    }
    public View n(){
       View obj = PatchProxy.apply(null, this, LiveAskTabFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.H(this.a, R.layout.arg_RES_7f0d09df);
       obj.setBackgroundColor(a1.a(R.color.arg_RES_7f060cb6));
       obj.findViewById(R.id.retry_btn).setOnClickListener(new LiveAskTabFragment$c$a(this));
       a.o(obj, "errorView");
       return obj;
    }
}
