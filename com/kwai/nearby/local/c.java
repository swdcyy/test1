package com.kwai.nearby.local.c;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mkc.b;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.gifshow.nearby.common.RealActionEmptyReason;
import java.lang.Enum;
import frb.c;
import vc7.g0;
import android.view.View$OnClickListener;

public class c extends f	// class@000f7e
{

    public void c(RecyclerFragment p0,LocalDelegateType p1,LocalSizerDataProvider p2){
       super(p0);
    }
    public View J0(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.i = a.i(this.a, b.j.a);
       this.a().a(this.i);
       return this.i;
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.k(RealActionEmptyReason.FEED_EMPTY.ordinal());
       obj = KwaiEmptyStateView.e();
       obj.p(new g0(this));
       return obj;
    }
}
