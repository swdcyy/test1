package com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$a;
import gka.c;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.q;
import java.lang.Throwable;
import java.lang.String;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.retrofit.model.KwaiException;

public class LiveCustomerServiceSizeFragment$a extends c	// class@001671
{
    public final LiveCustomerServiceSizeFragment m;

    public void LiveCustomerServiceSizeFragment$a(LiveCustomerServiceSizeFragment p0,RefreshLayout p1,q p2,int p3){
       this.m = p0;
       super(p1, p2, p3);
    }
    public KwaiEmptyStateView$a e(Throwable p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveCustomerServiceSizeFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.e(p0, p1);
       if (p0 instanceof KwaiException) {
          uoa.k(R.drawable.arg_RES_7f080ebf);
       }
       return uoa;
    }
}
