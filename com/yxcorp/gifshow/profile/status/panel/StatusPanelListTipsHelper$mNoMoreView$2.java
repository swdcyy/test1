package com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper$mNoMoreView$2;
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
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mkc.b;
import android.view.ViewGroup;
import i2b.a;
import lnc.a1;
import android.widget.TextView;
import java.lang.CharSequence;

public final class StatusPanelListTipsHelper$mNoMoreView$2 extends Lambda implements a	// class@0015ba
{
    public final StatusPanelListTipsHelper this$0;

    public void StatusPanelListTipsHelper$mNoMoreView$2(StatusPanelListTipsHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       f obj = PatchProxy.apply(null, this, StatusPanelListTipsHelper$mNoMoreView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.g;
       a.o(obj, "mFragment");
       View view = a.i(obj.h0(), b.k.a);
       view.setPadding(0, 0, 0, a1.d(R.dimen.arg_RES_7f0702e8));
       View view1 = view.findViewById(R.id.no_more_tv);
       a.o(view1, "findViewById<TextView>\(R.id.no_more_tv\)");
       String str = (this.this$0.p == 2)? a1.p(R.string.arg_RES_7f10397d): a1.p(R.string.arg_RES_7f10397c);
       view1.setText(str);
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
